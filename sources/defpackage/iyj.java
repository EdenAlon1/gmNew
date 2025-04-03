package defpackage;

import android.content.ClipData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyj {
    private final iyk a;

    public iyj(iyk iykVar) {
        this.a = iykVar;
    }

    public final Object a() {
        ClipData primaryClip = this.a.a.getPrimaryClip();
        if (primaryClip != null) {
            return new jcq(primaryClip);
        }
        return null;
    }

    public final Object b(jcq jcqVar) {
        this.a.a(jcqVar);
        return ffcu.a;
    }
}
