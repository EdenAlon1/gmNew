package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbj {
    public final Context a;
    public final ffhd b;
    public MediaExtractor c;
    public MediaCodec d;

    public dpbj(Context context, ffhd ffhdVar) {
        context.getClass();
        ffhdVar.getClass();
        this.a = context;
        this.b = ffhdVar;
    }

    public final boolean a() {
        return (this.c == null || this.d == null) ? false : true;
    }
}
