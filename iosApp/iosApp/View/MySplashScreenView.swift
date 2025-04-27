//
//  MySplashScreenView.swift
//  iosApp
//
//  Created by Swapnil on 27/04/25.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI

struct MySplashScreenView: View {
    var body: some View {
        ZStack{
            Image("background")
                .resizable()
                .scaledToFill()
                .edgesIgnoringSafeArea(.all)
            // Your other content on top
            VStack(alignment:.leading) {
                Text("It's Time for a Drink")
                    .font(.title)
                    .fontWeight(.semibold)
                    .foregroundColor(.black)
                    .padding(.top, 58)
                    .padding(.leading,24)
                    .multilineTextAlignment(.center)
                
                Text("The one-stop to find amazing drink mixes for any occasion.")
                    .font(.title3)
                    .foregroundColor(.black.opacity(0.8))
                    .multilineTextAlignment(.leading)
                    .padding(.top, 58)
                    .padding(.horizontal,24)
                
                
                Button(action: {
                                    // Your action when the button is tapped
                                    print("Get Started tapped")
                                }) {
                                    HStack {
                                        Text("Get Started")
                                            .font(.headline)
                                            .foregroundColor(.white)

                                        Image(systemName: "chevron.forward") 
                                            .foregroundColor(.white)
                                            .font(.headline) // Match the text size
                                    }
                                    .padding(.horizontal, 20) // Adjust horizontal padding for icon
                                    .padding(.vertical, 15)
                                    .background(Color("ButtonColor")) // Use a color from your assets or replace with .blue, etc.
                                    .cornerRadius(25) // Add rounded corners
                                }
                                .padding(.leading, 24) // Align the button to the left
                                .padding(.top, 20) // Add some spacing between the second text and the button

               
                Spacer() // Push content to the top
               
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity) // Ensure VStack fills the screen
        }
    }

}

#Preview {
    MySplashScreenView()
}
