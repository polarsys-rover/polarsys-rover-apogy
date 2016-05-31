<?xml version="1.0" encoding="UTF-8"?>
<core:ApogySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:core="ca.gc.asc_csa.apogy.core" xmlns:topology="ca.gc.asc_csa.apogy.common.topology" xmlns:vehicle="ca.gc.asc_csa.apogy.addons.vehicle" xmi:id="__7WE0CZkEea6vrHg0QgYmg" name="PolarSysRoverApogySystem">
  <interfaceClass href="org.eclipse.polarsys.rover.client#//PolarSysRoverClient"/>
  <topologyRoot xmi:id="__7Wr4CZkEea6vrHg0QgYmg">
    <originNode xsi:type="topology:AggregateGroupNode" xmi:id="__7XS8CZkEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_ROOT">
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_YbyfUCZmEea6vrHg0QgYmg" parent="__7XS8CZkEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_ORIGIN">
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_GgEWECZlEea6vrHg0QgYmg" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_BODY_CAD_TRANSFORM">
          <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_WSwLsCZlEea6vrHg0QgYmg" parent="_GgEWECZlEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_BODY_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/body.obj" polygonCount="16" vertexCount="30"/>
          <position xmi:id="_0sP5sCZlEea6vrHg0QgYmg"/>
          <rotationMatrix xmi:id="_0sOEgCZlEea6vrHg0QgYmg" m00="6.123233995736766E-17" m01="-1.0" m10="6.123233995736766E-17" m11="3.749399456654644E-33" m12="1.0" m20="-1.0" m21="-6.123233995736766E-17" m22="6.123233995736766E-17"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_iXZpUCZlEea6vrHg0QgYmg" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_LEFT_WHEEL_TRANSFORM">
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_8reIICZnEea6vrHg0QgYmg" parent="_iXZpUCZlEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_LEFT_WHEEL_JOINT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_ZCuuECZnEea6vrHg0QgYmg" parent="_8reIICZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_LEFT_WHEEL_CAD_TRANSFORM">
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_LKRwgCZnEea6vrHg0QgYmg" parent="_ZCuuECZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj" polygonCount="160" vertexCount="282"/>
              <position xmi:id="_ZCv8MSZnEea6vrHg0QgYmg"/>
              <rotationMatrix xmi:id="_ZCv8MCZnEea6vrHg0QgYmg" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_8jVZYCcjEeaBOPEjK4BfZA" parent="_8reIICZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_LEFT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_uV3OECcjEeaBOPEjK4BfZA" parent="_8jVZYCcjEeaBOPEjK4BfZA" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_LEFT_PHYSICAL_WHEEL" radius="0.025" length="0.01"/>
              <position xmi:id="_8jXOkScjEeaBOPEjK4BfZA" y="0.005"/>
              <rotationMatrix xmi:id="_8jXOkCcjEeaBOPEjK4BfZA"/>
            </aggregatedChildren>
            <position xmi:id="_8revMSZnEea6vrHg0QgYmg"/>
            <rotationMatrix xmi:id="_8revMCZnEea6vrHg0QgYmg"/>
          </aggregatedChildren>
          <position xmi:id="_0sZqsSZlEea6vrHg0QgYmg" x="0.05" y="0.05" z="-0.025"/>
          <rotationMatrix xmi:id="_0sZqsCZlEea6vrHg0QgYmg"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_mNxd8CZlEea6vrHg0QgYmg" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_RIGHT_WHEEL_TRANSFORM">
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="__g7SUCZnEea6vrHg0QgYmg" parent="_mNxd8CZlEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_RIGHT_WHEEL_JOINT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="__g7SUSZnEea6vrHg0QgYmg" parent="__g7SUCZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_RIGHT_WHEEL_CAD_TRANSFORM">
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="__g7SUiZnEea6vrHg0QgYmg" parent="__g7SUSZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj" polygonCount="160" vertexCount="282"/>
              <position xmi:id="__g7SUyZnEea6vrHg0QgYmg"/>
              <rotationMatrix xmi:id="__g7SVCZnEea6vrHg0QgYmg" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_LDblwCckEeaBOPEjK4BfZA" parent="__g7SUCZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_RIGHT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_LDblwSckEeaBOPEjK4BfZA" parent="_LDblwCckEeaBOPEjK4BfZA" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_RIGHT_PHYSICAL_WHEEL" radius="0.025" length="0.01"/>
              <position xmi:id="_LDblwickEeaBOPEjK4BfZA" y="0.005"/>
              <rotationMatrix xmi:id="_LDblwyckEeaBOPEjK4BfZA"/>
            </aggregatedChildren>
            <position xmi:id="__g7SVSZnEea6vrHg0QgYmg"/>
            <rotationMatrix xmi:id="__g7SViZnEea6vrHg0QgYmg"/>
          </aggregatedChildren>
          <position xmi:id="_0sa40SZlEea6vrHg0QgYmg" x="0.05" y="-0.05" z="-0.025"/>
          <rotationMatrix xmi:id="_0sa40CZlEea6vrHg0QgYmg" m00="-1.0" m01="-1.2246467991473532E-16" m10="1.2246467991473532E-16" m11="-1.0"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_maIe8CZlEea6vrHg0QgYmg" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_LEFT_WHEEL_TRANSFORM">
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_JZsuQCZoEea6vrHg0QgYmg" parent="_maIe8CZlEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_LEFT_WHEEL_JOINT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_wLeyUCZnEea6vrHg0QgYmg" parent="_JZsuQCZoEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_LEFT_WHEEL_CAD_TRANSFORM">
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_wLeyUSZnEea6vrHg0QgYmg" parent="_wLeyUCZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj" polygonCount="160" vertexCount="282"/>
              <position xmi:id="_wLeyUiZnEea6vrHg0QgYmg"/>
              <rotationMatrix xmi:id="_wLeyUyZnEea6vrHg0QgYmg" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_P10WsCckEeaBOPEjK4BfZA" parent="_JZsuQCZoEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_LEFT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_P10WsSckEeaBOPEjK4BfZA" parent="_P10WsCckEeaBOPEjK4BfZA" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_RIGHT_PHYSICAL_WHEEL" radius="0.025" length="0.01"/>
              <position xmi:id="_P10WsickEeaBOPEjK4BfZA" y="0.005"/>
              <rotationMatrix xmi:id="_P10WsyckEeaBOPEjK4BfZA"/>
            </aggregatedChildren>
            <position xmi:id="_JZtVUSZoEea6vrHg0QgYmg"/>
            <rotationMatrix xmi:id="_JZtVUCZoEea6vrHg0QgYmg"/>
          </aggregatedChildren>
          <position xmi:id="_0sd8ISZlEea6vrHg0QgYmg" x="-0.05" y="0.05" z="-0.025"/>
          <rotationMatrix xmi:id="_0sd8ICZlEea6vrHg0QgYmg"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_miFhECZlEea6vrHg0QgYmg" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_RIGHT_WHEEL_TRANSFORM">
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_Nyq5oCZoEea6vrHg0QgYmg" parent="_miFhECZlEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_RIGHT_WHEEL_JOINT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_wX1zUCZnEea6vrHg0QgYmg" parent="_Nyq5oCZoEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_RIGHT_WHEEL_CAD_TRANSFORM">
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_wX1zUSZnEea6vrHg0QgYmg" parent="_wX1zUCZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj" polygonCount="160" vertexCount="282"/>
              <position xmi:id="_wX1zUiZnEea6vrHg0QgYmg"/>
              <rotationMatrix xmi:id="_wX1zUyZnEea6vrHg0QgYmg" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_TGjusCckEeaBOPEjK4BfZA" parent="_Nyq5oCZoEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_RIGHT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_TGjusSckEeaBOPEjK4BfZA" parent="_TGjusCckEeaBOPEjK4BfZA" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_AFT_RIGHT_PHYSICAL_WHEEL" radius="0.025" length="0.01"/>
              <position xmi:id="_TGjusickEeaBOPEjK4BfZA" y="0.005"/>
              <rotationMatrix xmi:id="_TGjusyckEeaBOPEjK4BfZA"/>
            </aggregatedChildren>
            <position xmi:id="_NyrgsSZoEea6vrHg0QgYmg"/>
            <rotationMatrix xmi:id="_NyrgsCZoEea6vrHg0QgYmg"/>
          </aggregatedChildren>
          <position xmi:id="_0sfxUCZlEea6vrHg0QgYmg" x="-0.05" y="-0.05" z="-0.025"/>
          <rotationMatrix xmi:id="_0sfKQCZlEea6vrHg0QgYmg" m00="-1.0" m01="-1.2246467991473532E-16" m10="1.2246467991473532E-16" m11="-1.0"/>
        </aggregatedChildren>
        <position xmi:id="_Yb1ioSZmEea6vrHg0QgYmg"/>
        <rotationMatrix xmi:id="_Yb1ioCZmEea6vrHg0QgYmg"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="__7X6ACZkEea6vrHg0QgYmg">
    <featureRootsList xmi:id="__8svsCZkEea6vrHg0QgYmg"/>
    <bindingsList xmi:id="__8svsSZkEea6vrHg0QgYmg"/>
  </bindingSet>
  <connectionPointsList xmi:id="__7X6ASZkEea6vrHg0QgYmg">
    <connectionPoints xmi:id="_7o3mMCZoEea6vrHg0QgYmg" name="ORIGIN" node="_YbyfUCZmEea6vrHg0QgYmg"/>
  </connectionPointsList>
</core:ApogySystem>
