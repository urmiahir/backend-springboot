import { Injectable } from "@angular/core";
import { Admin } from "../admin";

@Injectable()
export class AboutusService{
    private admin: Admin[] = [
        new Admin('Urmi Bhadarka',123445678,'197 Evergreen Rd APT#10B','Urmi123@gmail.com'),
        new Admin('Marakhi Bhadarka',123445678,'197 Evergreen Rd APT#10B','Urmi123@gmail.com'), 
        new Admin('Prince Bhadarka',123445678,'197 Evergreen Rd APT#10B','Urmi123@gmail.com'),
        new Admin('Urmi Bhadarka',123445678,'197 Evergreen Rd APT#10B','Urmi123@gmail.com'),
    ];





}