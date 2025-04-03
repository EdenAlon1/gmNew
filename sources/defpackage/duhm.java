package defpackage;

import android.content.Context;
import android.support.rastermill.FrameSequenceDrawable;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhm extends rhm {
    @Override // defpackage.rhm
    public final void d(Context context, qpt qptVar, qqk qqkVar) {
        qqkVar.i(InputStream.class, FrameSequenceDrawable.class, new duhn(qqkVar.b(), qptVar.a, qptVar.d));
        qqkVar.i(ByteBuffer.class, FrameSequenceDrawable.class, new duhl(qqkVar.b(), qptVar.a, qptVar.d));
    }
}
