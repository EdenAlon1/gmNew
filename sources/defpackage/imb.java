package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imb extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ imc b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imb(imc imcVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = imcVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.t(0L, null, this);
    }
}
