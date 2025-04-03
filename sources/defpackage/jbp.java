package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbp extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ jbu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbp(jbu jbuVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = jbuVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
