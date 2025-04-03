package defpackage;

/* loaded from: classes5.dex */
public final class emav extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ emaw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emav(emaw emawVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = emawVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}
