package defpackage;

/* loaded from: classes6.dex */
public final class ffya extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ffyb c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffya(ffyb ffybVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ffybVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
