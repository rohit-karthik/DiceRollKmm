//
//  NumberGenerator.swift
//  iosApp
//
//  Created by Rohit Karthik on 4/30/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import SwiftUI
import shared

extension String {
    func isInt() -> Bool {
        return Int(self) != nil
    }
}

struct NumberGenerator: View {
    @State var toShow = false
    @State var minValue = ""
    @State var maxValue = ""
    @State var message = "One of your values is not numeric"
    @State var resultVal = "0"
    
    func checkNumeric() {
        print(toShow)
        if (!minValue.isInt() || !maxValue.isInt()) {
            message = "One of your values is not numeric"
            toShow = true
            return
        }
        
        let intMin = Int32(minValue)!
        let intMax = Int32(maxValue)!
        
        if (intMax <= intMin) {
            message = "Your max is less than your min!"
            toShow = true
            return
        }
        
        resultVal = String(GenerateNumber().generateRandomNumber(
            min: Int32(minValue)!,
            max: Int32(maxValue)!
        ))
    }
    
    var body: some View {
        VStack {
            Text("Random Number Generator")
                .font(.system(size: 36))
                .multilineTextAlignment(.center)
                .padding();
            Text(resultVal)
                .font(.system(size: 80))
                .padding();
            HStack {
                TextField("Min Value", text: $minValue)
                    .textFieldStyle(.roundedBorder)
                    .keyboardType(.numberPad);
                TextField("Max Value", text: $maxValue)
                    .textFieldStyle(.roundedBorder)
                    .keyboardType(.numberPad);
            }
            .padding()
            Button("Generate Number") {
                checkNumeric()
            }
            .padding()
        }
        .alert(isPresented: $toShow) {
            Alert(title: Text(message))
        }
        .navigationBarTitle(
            Text("Random Number Generator"),
            displayMode: .inline
        )
    }
}

struct NumberGenerator_Previews: PreviewProvider {
    static var previews: some View {
        NumberGenerator()
    }
}
