package usecase

import (
	"go-furrward/internal/entity"
	"time"
)

type ListAdoptersOutputDto struct {
	Id           string    `json:"id"`
	Name         string    `json:"name"`
	Email        string    `json:"email"`
	Phone        string    `json:"phone"`
	City         string    `json:"city"`
	Neighborhood string    `json:"neighborhood"`
	CreatedAt    time.Time `json:"createdAt"`
	UpdatedAt    time.Time `json:"updatedAt"`
}

type ListAdoptersUseCase struct {
	AdopterRepository entity.AdopterRepository
}

func NewListAdoptersUseCase(adopterRepository entity.AdopterRepository) *ListAdoptersUseCase {
	return &ListAdoptersUseCase{
		AdopterRepository: adopterRepository,
	}
}

func (u *ListAdoptersUseCase) Execute() ([]*ListAdoptersOutputDto, error) {
	adopters, err := u.AdopterRepository.FindAll()
	if err != nil {
		return nil, err
	}

	var adoptersOutput []*ListAdoptersOutputDto
	for _, adopter := range adopters {
		createdAt := time.Unix(adopter.CreatedAt, 0)
		updatedAt := time.Unix(adopter.UpdatedAt, 0)

		adoptersOutput = append(adoptersOutput, &ListAdoptersOutputDto{
			Id:           adopter.ID,
			Name:         adopter.Name,
			Email:        adopter.Email,
			Phone:        adopter.Phone,
			City:         adopter.City,
			Neighborhood: adopter.Neighborhood,
			CreatedAt:    createdAt,
			UpdatedAt:    updatedAt,
		})
	}

	return adoptersOutput, nil
}
