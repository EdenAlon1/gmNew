package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsep extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dseq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsep(dseq dseqVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dseqVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
