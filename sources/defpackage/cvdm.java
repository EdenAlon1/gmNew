package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvdm extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cvdp c;
    int d;
    cvdp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdm(cvdp cvdpVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = cvdpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
