import SwiftUI
import shared

struct ContentView: View {
    @State var imageName = "dice_6"
    
    var body: some View {
        VStack {
            Text("Dice Roll")
                .font(.system(size: 36))
                .padding();
            Image(imageName)
                .resizable()
                .frame(width: 200, height: 234)
            ;
            Button("Roll the Dice") {
                imageName = GenerateDiceRoll().iosDiceRoll()
            }
            .padding()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
