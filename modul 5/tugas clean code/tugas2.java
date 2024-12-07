fill(80, 204, 55);
rect(100, 0, 200, 400);

var draw = function () {
    var totalCircles = 6; 
    for (var circleIndex = totalCircles; circleIndex > 1; circleIndex--) {
        var radius = circleIndex * 7;

        if (mouseX > 100 && mouseX < 300) {
            fill(255, 255, 255);
        } else {
            fill(80, 204, 55); 
        }

        ellipse(mouseX, mouseY, radius, radius);
    }
};
