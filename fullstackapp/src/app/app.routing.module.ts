import { Component, NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { EmployeeListComponent } from "./employee-list/employee-list.component";
import { CreateEmployeeComponent } from "./create-employee/create-employee.component";
import { UpdateEmployeeComponent } from "./update-employee/update-employee.component";
import { EmployeeDetailsComponent } from "./employee-details/employee-details.component";
import { AboutusComponent } from "./aboutus/aboutus.component";

//this is for routing path also have to mention routing link into the html to change the page app.component.html
const routes: Routes = [
{path: 'employees', component: EmployeeListComponent},
{path: 'create-employee', component:CreateEmployeeComponent},
{path: 'update-employee/:id', component: UpdateEmployeeComponent},
{path: '', redirectTo:'employees', pathMatch:'full'},
{path :'employee-details/:id', component: EmployeeDetailsComponent},
{path:'aboutus', component:AboutusComponent},
//{path:'aboutus/contact', component:AboutusComponent}


];
@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{

}