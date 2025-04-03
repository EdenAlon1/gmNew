package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jcf extends ffkk implements ffji {
    final /* synthetic */ jch a;
    final /* synthetic */ Choreographer.FrameCallback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcf(jch jchVar, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.a = jchVar;
        this.b = frameCallback;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.a.removeFrameCallback(this.b);
        return ffcu.a;
    }
}
