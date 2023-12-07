export class Admin{
    name :String='';
    contact:number | undefined;
    emailId:string='';
    address:string='';



    constructor(name :String,contact:number ,emailId:string, address:string){
        this.name=name;
        this.address=address;
        this.contact=contact;
        this.emailId=emailId;
    }

    }