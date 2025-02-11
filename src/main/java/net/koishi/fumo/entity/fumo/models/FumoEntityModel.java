package net.koishi.fumo.entity.fumo.models;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.koishi.fumo.Fumo;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoEntity;

public class FumoEntityModel<T extends FumoEntity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Fumo.MODID, "fumo_entity"), "main");
	private final ModelPart FumoCollection;
	private final ModelPart Head;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Skirt;
	private final ModelPart Torso;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public FumoEntityModel(ModelPart root) {
		this.FumoCollection = root.getChild("FumoCollection");
		this.Head = this.FumoCollection.getChild("Head");
		this.LeftLeg = this.FumoCollection.getChild("LeftLeg");
		this.RightLeg = this.FumoCollection.getChild("RightLeg");
		this.Skirt = this.FumoCollection.getChild("Skirt");
		this.Torso = this.FumoCollection.getChild("Torso");
		this.LeftArm = this.FumoCollection.getChild("LeftArm");
		this.RightArm = this.FumoCollection.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Fumo = partdefinition.addOrReplaceChild("FumoCollection", CubeListBuilder.create(), PartPose.offset(-5.0F, 23.0F, 2.0F));

		PartDefinition Head = Fumo.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 17).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 1.0F, -2.0F));

		PartDefinition LeftLeg = Fumo.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftLegOver_r1 = LeftLeg.addOrReplaceChild("LeftLegOver_r1", CubeListBuilder.create().texOffs(34, 3).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(42, 39).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition RightLeg = Fumo.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition RightLegOver_r1 = RightLeg.addOrReplaceChild("RightLegOver_r1", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(33, 22).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Skirt = Fumo.addOrReplaceChild("Skirt", CubeListBuilder.create().texOffs(28, 29).addBox(-3.5F, -4.0F, -2.5F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(28, 12).addBox(-3.5F, -4.0F, -2.5F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 1.0F, -2.0F));

		PartDefinition Torso = Fumo.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(21, 39).addBox(-3.0F, -8.0F, -2.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(-3.0F, -8.0F, -2.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 1.0F, -2.0F));

		PartDefinition LeftArm = Fumo.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 6.0F));

		PartDefinition LeftArmOver_r1 = LeftArm.addOrReplaceChild("LeftArmOver_r1", CubeListBuilder.create().texOffs(47, 0).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.1F))
				.texOffs(9, 47).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightArm = Fumo.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-6.0F, -7.0F, 6.0F));

		PartDefinition RightArmOver_r1 = RightArm.addOrReplaceChild("RightArmOver_r1", CubeListBuilder.create().texOffs(42, 46).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.1F))
				.texOffs(0, 47).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}


//	@Override
//	public void setupAnim(Entity FumoModel, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//		return;
//	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		FumoCollection.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {

	}
}