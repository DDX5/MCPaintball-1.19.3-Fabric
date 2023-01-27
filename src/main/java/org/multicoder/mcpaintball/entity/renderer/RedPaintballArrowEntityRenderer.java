package org.multicoder.mcpaintball.entity.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class RedPaintballArrowEntityRenderer extends ProjectileEntityRenderer
{
    public static final Identifier TEXTURE = new Identifier("mcpaintball:textures/entity/projectiles/red_paintball.png");
    public RedPaintballArrowEntityRenderer(EntityRendererFactory.Context context)
    {
        super(context);
    }

    @Override
    public Identifier getTexture(Entity entity) {
        return TEXTURE;
    }

}
