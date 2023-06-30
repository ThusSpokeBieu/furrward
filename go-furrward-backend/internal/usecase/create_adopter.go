package usecase

import (
	"go-furrward/internal/entity"
	"time"
)

type CreateAdopterInputDto struct {
	Name         string `json:"name"`
	Email        string `json:"email"`
	Phone        string `json:"phone"`
	City         string `json:"city"`
	Neighborhood string `json:"neighborhood"`
}

type CreateAdopterOutputDto struct {
	Id           string    `json:"id"`
	Name         string    `json:"name"`
	Email        string    `json:"email"`
	Phone        string    `json:"phone"`
	City         string    `json:"city"`
	Neighborhood string    `json:"neighborhood"`
	CreatedAt    time.Time `json:"createdAt"`
	UpdatedAt    time.Time `json:"updatedAt"`
}

type CreateAdopterUseCase struct {
	AdopterRepository entity.AdopterRepository
}

func NewCreateAdopterUseCase(adopterRepository entity.AdopterRepository) *CreateAdopterUseCase {
	return &CreateAdopterUseCase{
		AdopterRepository: adopterRepository,
	}
}

func (c *CreateAdopterUseCase) Execute(input CreateAdopterInputDto) (*CreateAdopterOutputDto, error) {
	adopter := entity.NewAdopter(input.Name, input.Email, input.Phone, input.City, input.Neighborhood)
	err := c.AdopterRepository.Create(adopter)

	if err != nil {
		return nil, err
	}

	createdAt := time.Unix(adopter.CreatedAt, 0)
	updatedAt := time.Unix(adopter.UpdatedAt, 0)

	return &CreateAdopterOutputDto{
		Id:           adopter.ID,
		Name:         adopter.Name,
		Email:        adopter.Email,
		Phone:        adopter.Phone,
		City:         adopter.City,
		Neighborhood: adopter.Neighborhood,
		CreatedAt:    createdAt,
		UpdatedAt:    updatedAt,
	}, nil
}
