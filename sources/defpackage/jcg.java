package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jcg implements Choreographer.FrameCallback {
    final /* synthetic */ ffrf a;
    final /* synthetic */ ffji b;

    public jcg(ffrf ffrfVar, ffji ffjiVar) {
        this.a = ffrfVar;
        this.b = ffjiVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object a;
        try {
            a = this.b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            a = ffci.a(th);
        }
        this.a.w(a);
    }
}
