package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckab extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ckac b;
    int c;
    awui d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckab(ckac ckacVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ckacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object l = this.b.l(null, 0, this);
        return l == ffhh.a ? l : new ffch(l);
    }
}
