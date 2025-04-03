package com.google.mediapipe.framework;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class AndroidPacketCreator extends PacketCreator {
    public AndroidPacketCreator(Graph graph) {
        super(graph);
    }

    public native long nativeCreateRgbaImage(long j, Bitmap bitmap);
}
