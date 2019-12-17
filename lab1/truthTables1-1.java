//Angel Camacho
package cs278Lab1;

public class truthTables1 {

	public static void main(String[] args) {
		
		String str1= "f", str2= "f", str3= "f", str4= "f", str5= "f", str6= "f", str7= "f", str8 = "f";
		

		int Counter = 0;
	
		
		
		for (int row1 = 0; row1 < 2; row1++) {
			
			for(int row2 = 0; row2 < 2; row2++) {
				
				for(int row3 = 0; row3 < 2; row3++) {
					
					for(int row4 = 0; row4 < 2; row4++) {
						
						for(int row5 =0; row5 < 2; row5++) {
							
							for(int row6 = 0; row6 < 2; row6++) {
								
								for(int row7 = 0; row7 < 2; row7++) {
									
									for(int row8 = 0; row8<2 ; row8++) {
										Counter++;
										
										if(row1 == 0 ) {
											str1= "f";
										}
										else str1 = "t";
										
										if(row2 == 0 ) {
											str2 = "f";
										}
										else str2 = "t";
										if(row3 == 0 ) {
											str3 = "f";
										}
										else str3 = "t";
										if(row4 == 0 ) {
											str4 = "f";
										}
										else str4 = "t";
										if(row5 == 0 ) {
											str5 = "f";
										}
										else str5 = "t";
										if(row6 == 0 ) {
											str6 = "f";
										}
										else str6 = "t";
										if(row7 == 0 ) {
											str7 = "f";
										}
										else str7 = "t";
										if(row8 == 0) {
											str8 = "f";
										}
										else str8 = "t";

										System.out.println("Truth Table: " + Counter);
										System.out.println("P Q R  Proposition.");
										System.out.println("F F F    " + str1 );
										System.out.println("F F T    " + str2 );
										System.out.println("F T F    " + str3 );
										System.out.println("F T T    " + str4 );
										System.out.println("T F F    " + str5 );
										System.out.println("T F T    " + str6 );
										System.out.println("T T F    " + str7 );
										System.out.println("T T T    " + str8 );
																			
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
