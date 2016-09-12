<?xml version="1.0" encoding="UTF-8"?>
<core:ApogySystem xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bindings="ca.gc.asc_csa.apogy.common.topology.bindings" xmlns:core="ca.gc.asc_csa.apogy.core" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:emf="ca.gc.asc_csa.apogy.common.emf" xmlns:topology="ca.gc.asc_csa.apogy.common.topology" xmlns:vehicle="ca.gc.asc_csa.apogy.addons.vehicle" xmi:id="__7WE0CZkEea6vrHg0QgYmg" name="PolarSysRoverPlatformApogySystem">
  <interfaceClass href="org.eclipse.polarsys.rover.client#//PolarSysRoverPlatformClient"/>
  <typeApiAdapterClass href="org.eclipse.polarsys.rover.client.apogy#//PolarSysRoverPlatformApogySystemApiAdapter"/>
  <topologyRoot xmi:id="__7Wr4CZkEea6vrHg0QgYmg">
    <originNode xsi:type="topology:AggregateGroupNode" xmi:id="__7XS8CZkEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_ROOT">
      <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_YbyfUCZmEea6vrHg0QgYmg" parent="__7XS8CZkEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_ORIGIN">
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_GgEWECZlEea6vrHg0QgYmg" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_BODY_CAD_TRANSFORM">
          <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_WSwLsCZlEea6vrHg0QgYmg" parent="_GgEWECZlEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_BODY_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/body.obj"/>
          <position xmi:id="_0sP5sCZlEea6vrHg0QgYmg"/>
          <rotationMatrix xmi:id="_0sOEgCZlEea6vrHg0QgYmg" m00="6.123233995736766E-17" m01="-1.0" m10="6.123233995736766E-17" m11="3.749399456654644E-33" m12="1.0" m20="-1.0" m21="-6.123233995736766E-17" m22="6.123233995736766E-17"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_iXZpUCZlEea6vrHg0QgYmg" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_LEFT_WHEEL_TRANSFORM">
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_8reIICZnEea6vrHg0QgYmg" parent="_iXZpUCZlEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_LEFT_WHEEL_JOINT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_ZCuuECZnEea6vrHg0QgYmg" parent="_8reIICZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_LEFT_WHEEL_CAD_TRANSFORM">
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_LKRwgCZnEea6vrHg0QgYmg" parent="_ZCuuECZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj"/>
              <position xmi:id="_ZCv8MSZnEea6vrHg0QgYmg"/>
              <rotationMatrix xmi:id="_ZCv8MCZnEea6vrHg0QgYmg" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_8jVZYCcjEeaBOPEjK4BfZA" parent="_8reIICZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_LEFT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_uV3OECcjEeaBOPEjK4BfZA" parent="_8jVZYCcjEeaBOPEjK4BfZA" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_LEFT_PHYSICAL_WHEEL" radius="0.025" length="0.01">
                <physicalProperties xmi:id="_GlLKcCjUEeauz5YsIjVF-A">
                  <inertiaMatrix xmi:id="_HGuYUCjUEeauz5YsIjVF-A"/>
                  <centerOfMassLocation xmi:id="_HnN2QCjUEeauz5YsIjVF-A"/>
                </physicalProperties>
              </aggregatedChildren>
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
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="__g7SUiZnEea6vrHg0QgYmg" parent="__g7SUSZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj"/>
              <position xmi:id="__g7SUyZnEea6vrHg0QgYmg"/>
              <rotationMatrix xmi:id="__g7SVCZnEea6vrHg0QgYmg" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_LDblwCckEeaBOPEjK4BfZA" parent="__g7SUCZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_FRONT_RIGHT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_LDblwSckEeaBOPEjK4BfZA" parent="_LDblwCckEeaBOPEjK4BfZA" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_RIGHT_PHYSICAL_WHEEL" radius="0.025" length="0.01">
                <physicalProperties xmi:id="_I0IVUCjUEeauz5YsIjVF-A">
                  <inertiaMatrix xmi:id="_JWTOQCjUEeauz5YsIjVF-A"/>
                  <centerOfMassLocation xmi:id="_J57fwCjUEeauz5YsIjVF-A"/>
                </physicalProperties>
              </aggregatedChildren>
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
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_wLeyUSZnEea6vrHg0QgYmg" parent="_wLeyUCZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj"/>
              <position xmi:id="_wLeyUiZnEea6vrHg0QgYmg"/>
              <rotationMatrix xmi:id="_wLeyUyZnEea6vrHg0QgYmg" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_P10WsCckEeaBOPEjK4BfZA" parent="_JZsuQCZoEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_LEFT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_P10WsSckEeaBOPEjK4BfZA" parent="_P10WsCckEeaBOPEjK4BfZA" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_RIGHT_PHYSICAL_WHEEL" radius="0.025" length="0.01">
                <physicalProperties xmi:id="_Lhn2UCjUEeauz5YsIjVF-A">
                  <inertiaMatrix xmi:id="_MFFvwCjUEeauz5YsIjVF-A"/>
                  <centerOfMassLocation xmi:id="_Mh7cwCjUEeauz5YsIjVF-A"/>
                </physicalProperties>
              </aggregatedChildren>
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
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_wX1zUSZnEea6vrHg0QgYmg" parent="_wX1zUCZnEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj"/>
              <position xmi:id="_wX1zUiZnEea6vrHg0QgYmg"/>
              <rotationMatrix xmi:id="_wX1zUyZnEea6vrHg0QgYmg" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_TGjusCckEeaBOPEjK4BfZA" parent="_Nyq5oCZoEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_AFT_RIGHT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_TGjusSckEeaBOPEjK4BfZA" parent="_TGjusCckEeaBOPEjK4BfZA" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_AFT_RIGHT_PHYSICAL_WHEEL" radius="0.025" length="0.01">
                <physicalProperties xmi:id="_OmiY0CjUEeauz5YsIjVF-A">
                  <inertiaMatrix xmi:id="_PTF80CjUEeauz5YsIjVF-A"/>
                  <centerOfMassLocation xmi:id="_PsWKUCjUEeauz5YsIjVF-A"/>
                </physicalProperties>
              </aggregatedChildren>
              <position xmi:id="_TGjusickEeaBOPEjK4BfZA" y="0.005"/>
              <rotationMatrix xmi:id="_TGjusyckEeaBOPEjK4BfZA"/>
            </aggregatedChildren>
            <position xmi:id="_NyrgsSZoEea6vrHg0QgYmg"/>
            <rotationMatrix xmi:id="_NyrgsCZoEea6vrHg0QgYmg"/>
          </aggregatedChildren>
          <position xmi:id="_0sfxUCZlEea6vrHg0QgYmg" x="-0.05" y="-0.05" z="-0.025"/>
          <rotationMatrix xmi:id="_0sfKQCZlEea6vrHg0QgYmg" m00="-1.0" m01="-1.2246467991473532E-16" m10="1.2246467991473532E-16" m11="-1.0"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_8g3MgHapEeaOR8pJvbpKEw" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_CENTER_LEFT_WHEEL_TRANSFORM">
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_8g3MgXapEeaOR8pJvbpKEw" parent="_8g3MgHapEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_CENTER_LEFT_WHEEL_JOINT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_8g3MgnapEeaOR8pJvbpKEw" parent="_8g3MgXapEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_CENTER_LEFT_WHEEL_CAD_TRANSFORM">
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_8g3Mg3apEeaOR8pJvbpKEw" parent="_8g3MgnapEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj"/>
              <position xmi:id="_8g3MhHapEeaOR8pJvbpKEw"/>
              <rotationMatrix xmi:id="_8g3MhXapEeaOR8pJvbpKEw" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_8g3MhnapEeaOR8pJvbpKEw" parent="_8g3MgXapEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_CENTER_LEFT_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_8g3Mh3apEeaOR8pJvbpKEw" parent="_8g3MhnapEeaOR8pJvbpKEw" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_LEFT_PHYSICAL_WHEEL" radius="0.025" length="0.01">
                <physicalProperties xmi:id="_8g3MiHapEeaOR8pJvbpKEw">
                  <inertiaMatrix xmi:id="_8g3MiXapEeaOR8pJvbpKEw"/>
                  <centerOfMassLocation xmi:id="_8g3MinapEeaOR8pJvbpKEw"/>
                </physicalProperties>
              </aggregatedChildren>
              <position xmi:id="_8g3Mi3apEeaOR8pJvbpKEw" y="0.005"/>
              <rotationMatrix xmi:id="_8g3MjHapEeaOR8pJvbpKEw"/>
            </aggregatedChildren>
            <position xmi:id="_8g3MjXapEeaOR8pJvbpKEw"/>
            <rotationMatrix xmi:id="_8g3MjnapEeaOR8pJvbpKEw"/>
          </aggregatedChildren>
          <position xmi:id="_8g3Mj3apEeaOR8pJvbpKEw" y="0.05" z="-0.025"/>
          <rotationMatrix xmi:id="_8g3MkHapEeaOR8pJvbpKEw"/>
        </aggregatedChildren>
        <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_A0iBIHaqEeaOR8pJvbpKEw" parent="_YbyfUCZmEea6vrHg0QgYmg" nodeId="POLARSYS_ROVER_CENTER_RIGHT_WHEEL_TRANSFORM">
          <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_A0iBIXaqEeaOR8pJvbpKEw" parent="_A0iBIHaqEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_CENTER_RIGHT_WHEEL_JOINT">
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_A0iBInaqEeaOR8pJvbpKEw" parent="_A0iBIXaqEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_CENTER_RIGHT_WHEEL_CAD_TRANSFORM">
              <aggregatedChildren xsi:type="topology:URLNode" xmi:id="_A0iBI3aqEeaOR8pJvbpKEw" parent="_A0iBInaqEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_WHEEL_CAD" url="platform:/plugin/org.eclipse.polarsys.rover.client.apogy/cads/wheel.obj"/>
              <position xmi:id="_A0iBJHaqEeaOR8pJvbpKEw"/>
              <rotationMatrix xmi:id="_A0iBJXaqEeaOR8pJvbpKEw" m11="6.123233995736766E-17" m12="-1.0" m21="1.0" m22="6.123233995736766E-17"/>
            </aggregatedChildren>
            <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_A0iBJnaqEeaOR8pJvbpKEw" parent="_A0iBIXaqEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_FRONT_CENTER_PHYSICAL_WHEEL_TRANSFORM">
              <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_A0iBJ3aqEeaOR8pJvbpKEw" parent="_A0iBJnaqEeaOR8pJvbpKEw" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_RIGHT_PHYSICAL_WHEEL" radius="0.025" length="0.01">
                <physicalProperties xmi:id="_A0iBKHaqEeaOR8pJvbpKEw">
                  <inertiaMatrix xmi:id="_A0iBKXaqEeaOR8pJvbpKEw"/>
                  <centerOfMassLocation xmi:id="_A0iBKnaqEeaOR8pJvbpKEw"/>
                </physicalProperties>
              </aggregatedChildren>
              <aggregatedChildren xsi:type="topology:TransformNode" xmi:id="_FGKOYHaqEeaOR8pJvbpKEw" parent="_A0iBJnaqEeaOR8pJvbpKEw" nodeId="POLARSYS_ROVER_CENTER_RIGHT_PHYSICAL_WHEEL_TRANSFORM">
                <aggregatedChildren xsi:type="vehicle:Wheel" xmi:id="_FGKOYXaqEeaOR8pJvbpKEw" parent="_FGKOYHaqEeaOR8pJvbpKEw" description="Physical wheel used with the pose corrector." nodeId="POLARSYS_ROVER_FRONT_RIGHT_PHYSICAL_WHEEL" radius="0.025" length="0.01">
                  <physicalProperties xmi:id="_FGKOYnaqEeaOR8pJvbpKEw">
                    <inertiaMatrix xmi:id="_FGKOY3aqEeaOR8pJvbpKEw"/>
                    <centerOfMassLocation xmi:id="_FGKOZHaqEeaOR8pJvbpKEw"/>
                  </physicalProperties>
                </aggregatedChildren>
                <position xmi:id="_FGKOZXaqEeaOR8pJvbpKEw" y="0.005"/>
                <rotationMatrix xmi:id="_FGKOZnaqEeaOR8pJvbpKEw"/>
              </aggregatedChildren>
              <position xmi:id="_A0iBK3aqEeaOR8pJvbpKEw" y="0.005"/>
              <rotationMatrix xmi:id="_A0iBLHaqEeaOR8pJvbpKEw"/>
            </aggregatedChildren>
            <position xmi:id="_A0iBLXaqEeaOR8pJvbpKEw"/>
            <rotationMatrix xmi:id="_A0iBLnaqEeaOR8pJvbpKEw"/>
          </aggregatedChildren>
          <position xmi:id="_A0iBL3aqEeaOR8pJvbpKEw" y="-0.05" z="-0.025"/>
          <rotationMatrix xmi:id="_A0iBMHaqEeaOR8pJvbpKEw" m00="-1.0" m01="-1.2246467991473532E-16" m10="1.2246467991473532E-16" m11="-1.0"/>
        </aggregatedChildren>
        <position xmi:id="_Yb1ioSZmEea6vrHg0QgYmg"/>
        <rotationMatrix xmi:id="_Yb1ioCZmEea6vrHg0QgYmg"/>
      </aggregatedChildren>
    </originNode>
  </topologyRoot>
  <bindingSet xmi:id="__7X6ACZkEea6vrHg0QgYmg">
    <featureRootsList xmi:id="__8svsCZkEea6vrHg0QgYmg">
      <featureRoots xmi:id="_QmHD4CjUEeauz5YsIjVF-A">
        <children xsi:type="emf:TreeFeatureNode" xmi:id="_VtGL0CjUEeauz5YsIjVF-A">
          <structuralFeature xsi:type="ecore:EAttribute" href="org.eclipse.polarsys.rover.client#//PolarSysRoverPlatformClient/rightWheelPosition"/>
        </children>
        <children xsi:type="emf:TreeFeatureNode" xmi:id="_WFDY0CjUEeauz5YsIjVF-A">
          <structuralFeature xsi:type="ecore:EAttribute" href="org.eclipse.polarsys.rover.client#//PolarSysRoverPlatformClient/leftWheelPosition"/>
        </children>
        <sourceClass href="org.eclipse.polarsys.rover.client#//PolarSysRoverPlatformClient"/>
      </featureRoots>
    </featureRootsList>
    <bindingsList xmi:id="__8svsSZkEea6vrHg0QgYmg">
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_bTl6QCjUEeauz5YsIjVF-A" description="Front Left Wheel Rotation Position" name="Front_Left_Wheel_Rot" featureNode="_WFDY0CjUEeauz5YsIjVF-A" rotationNode="_8reIICZnEea6vrHg0QgYmg" rotationAxis="Y_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_jGVd0CjUEeauz5YsIjVF-A" description="Front Right Wheel Rotation Position" name="Front_Right_Wheel_Rot" featureNode="_VtGL0CjUEeauz5YsIjVF-A" rotationNode="__g7SUCZnEea6vrHg0QgYmg" rotationAxis="MINUS_Y_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_qmT2YCjUEeauz5YsIjVF-A" description="Rear Left Wheel Rotation Position" name="Rear_Left_Wheel_Rot" featureNode="_WFDY0CjUEeauz5YsIjVF-A" rotationNode="_JZsuQCZoEea6vrHg0QgYmg" rotationAxis="Y_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_wIAkYCjUEeauz5YsIjVF-A" description="Rear Right Wheel Rotation Position" name="Rear_Right_Wheel_Rot" featureNode="_VtGL0CjUEeauz5YsIjVF-A" rotationNode="_Nyq5oCZoEea6vrHg0QgYmg" rotationAxis="MINUS_Y_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_SW2BUHaqEeaOR8pJvbpKEw" name="Center_Left_Wheel_Rot" featureNode="_WFDY0CjUEeauz5YsIjVF-A" rotationNode="_8g3MgXapEeaOR8pJvbpKEw" rotationAxis="Y_AXIS"/>
      <bindings xsi:type="bindings:RotationBinding" xmi:id="_WELOsHaqEeaOR8pJvbpKEw" name="Center_Right_Wheel_Rot" featureNode="_VtGL0CjUEeauz5YsIjVF-A" rotationNode="_A0iBIXaqEeaOR8pJvbpKEw" rotationAxis="MINUS_Y_AXIS"/>
    </bindingsList>
  </bindingSet>
  <connectionPointsList xmi:id="__7X6ASZkEea6vrHg0QgYmg">
    <connectionPoints xmi:id="_7o3mMCZoEea6vrHg0QgYmg" name="ORIGIN" node="_YbyfUCZmEea6vrHg0QgYmg"/>
  </connectionPointsList>
</core:ApogySystem>
