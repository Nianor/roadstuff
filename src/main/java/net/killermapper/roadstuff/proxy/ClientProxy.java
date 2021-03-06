/*
Road Stuff - A Minecraft MODification by KillerMapper - 2015

The MIT License (MIT)

Copyright (c) 2015 KillerMapper

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package net.killermapper.roadstuff.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.killermapper.roadstuff.client.render.RenderAsphaltArrows;
import net.killermapper.roadstuff.client.render.RenderAsphaltCorner;
import net.killermapper.roadstuff.client.render.RenderAsphaltLines;
import net.killermapper.roadstuff.client.render.RenderCone;
import net.killermapper.roadstuff.client.render.RenderReflector;
import net.killermapper.roadstuff.client.render.RenderSlabAsphaltCorner;
import net.killermapper.roadstuff.client.render.RenderSlabAsphaltLine;
import net.killermapper.roadstuff.client.render.RenderTrafficSign;

public class ClientProxy extends CommonProxy
{

    public static int renderAsphaltLinesId, renderAsphaltCornerId, renderAsphaltArrowsId, renderSlabAsphaltLineId, renderConeId, renderSignPostId, renderSlabAsphaltCornerId, renderReflectorId;

    @Override
    public void registerRender()
    {
        renderConeId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(renderConeId, new RenderCone());
        renderAsphaltLinesId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(renderAsphaltLinesId, new RenderAsphaltLines());
        renderAsphaltCornerId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(renderAsphaltCornerId, new RenderAsphaltCorner());
        renderAsphaltArrowsId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(renderAsphaltArrowsId, new RenderAsphaltArrows());
        renderSlabAsphaltLineId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(renderSlabAsphaltLineId, new RenderSlabAsphaltLine());
        renderSlabAsphaltCornerId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(renderSlabAsphaltCornerId, new RenderSlabAsphaltCorner());
        renderSignPostId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(renderSignPostId, new RenderTrafficSign());
        renderReflectorId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(renderReflectorId, new RenderReflector());
    }
}
