package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jce extends ffkk implements ffji {
    final /* synthetic */ jcc a;
    final /* synthetic */ Choreographer.FrameCallback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jce(jcc jccVar, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.a = jccVar;
        this.b = frameCallback;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jcc jccVar = this.a;
        Object obj2 = jccVar.e;
        Choreographer.FrameCallback frameCallback = this.b;
        synchronized (obj2) {
            jccVar.f.remove(frameCallback);
        }
        return ffcu.a;
    }
}
