// code here
import eu.mihosoft.vrl.v3d.ChamferedCube


CSG cube = new ChamferedCube(
	200,// X 
	100, // Y
	50, // Z
	15 // Chamfer length
	).toCSG()

CSG cubeSmall = cube
		.scalex(3)
		.scaley(3)
		.scalez(3)

return cubeSmall