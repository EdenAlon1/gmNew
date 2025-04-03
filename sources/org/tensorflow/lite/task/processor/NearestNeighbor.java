package org.tensorflow.lite.task.processor;

import defpackage.fivv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class NearestNeighbor {
    static NearestNeighbor create(byte[] bArr, float f) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.nativeOrder());
        return new fivv(wrap, f);
    }

    public abstract float a();

    public abstract ByteBuffer b();
}
