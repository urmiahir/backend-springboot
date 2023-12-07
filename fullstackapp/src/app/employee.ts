export class Employee {
    subscribe(arg0: (data: any) => void): typeof Employee | undefined {
      throw new Error('Method not implemented.');
    }

    id: number | undefined;
    emailId!: String;
    firstName!: String;
    lastName!: String;
    


}
