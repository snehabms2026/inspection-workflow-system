# Inspection Workflow Management System

A backend system built using Java Spring Boot to manage workflow-based state transitions with REST APIs.

# Features
- REST APIs for creating and managing inspections
- Controlled state transitions (PENDING → APPROVED / REJECTED)
- Layered architecture (Controller → Service → Repository)
- Data persistence using JPA

# Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- REST APIs

## API Endpoints

# Create Inspection
POST /api/inspections

#Update Status
PUT /api/inspections/{id}/status?status=APPROVED

# Get All Inspections
GET /api/inspections

# Architecture
- Controller Layer → Handles HTTP requests
- Service Layer → Business logic & validation
- Repository Layer → Database operations

## Status
Core backend structure implemented
