package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvdn extends ffhr {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ cvdp d;
    int e;
    cvdp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdn(cvdp cvdpVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = cvdpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, null, this);
    }
}
