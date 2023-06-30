package repository

import (
	"database/sql"
	"fmt"
	"go-furrward/internal/entity"
)

type AdopterRepositoryPG struct {
	DB *sql.DB
}

func NewAdopterRepositoryPG(db *sql.DB) *AdopterRepositoryPG {
	return &AdopterRepositoryPG{
		DB: db,
	}
}

func (r *AdopterRepositoryPG) Create(adopter *entity.Adopter) error {

	params := "id, name, email, phone, city, neighborhood, created_at, updated_at"
	values := "$1, $2, $3, $4, $5, $6, $7, $8"
	query := fmt.Sprintf("INSERT INTO adopters (%s) VALUES (%s, NOW(), NOW())", params, values)

	_, err := r.DB.Exec(query,
		adopter.ID,
		adopter.Name,
		adopter.Email,
		adopter.Phone,
		adopter.City,
		adopter.Neighborhood,
		adopter.CreatedAt,
		adopter.UpdatedAt)

	if err != nil {
		return err
	}

	return nil
}

func (r *AdopterRepositoryPG) FindAll() ([]*entity.Adopter, error) {
	rows, err := r.DB.Query("SELECT id, name, email, phone, city, neighborhood, created_at, updated_at FROM adopters")

	if err != nil {
		return nil, err
	}
	defer rows.Close()

	var adopters []*entity.Adopter

	for rows.Next() {
		var adopter entity.Adopter
		err := rows.Scan(&adopter.ID, &adopter.Name, &adopter.Email, &adopter.Phone, &adopter.City, &adopter.Neighborhood, &adopter.CreatedAt, &adopter.UpdatedAt)
		if err != nil {
			return nil, err
		}

		adopters = append(adopters, &adopter)
	}

	return adopters, nil
}
