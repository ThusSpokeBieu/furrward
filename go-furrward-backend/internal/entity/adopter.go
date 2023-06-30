package entity

import (
	"time"

	"github.com/google/uuid"
)

type AdopterRepository interface {
	Create(adopter *Adopter) error
	FindAll() ([]*Adopter, error)
}

type Adopter struct {
	ID           string
	Name         string
	Email        string
	Phone        string
	City         string
	Neighborhood string
	CreatedAt    int64
	UpdatedAt    int64
}

func NewAdopter(
	name,
	email,
	phone,
	city,
	neighborhood string) *Adopter {
	currentTime := time.Now()
	timestamp := currentTime.Unix()

	return &Adopter{
		ID:           uuid.New().String(),
		Name:         name,
		Email:        email,
		Phone:        phone,
		City:         city,
		Neighborhood: neighborhood,
		CreatedAt:    timestamp,
		UpdatedAt:    timestamp,
	}
}
