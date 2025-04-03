package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcd {
    public static final boolean a(MediaCodec.BufferInfo bufferInfo) {
        bufferInfo.getClass();
        return (bufferInfo.flags & 2) != 0;
    }

    public static final boolean b(MediaCodec.BufferInfo bufferInfo) {
        bufferInfo.getClass();
        return (bufferInfo.flags & 4) != 0;
    }
}
