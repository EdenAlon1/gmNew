package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrs extends ffhr {
    Object a;
    Object b;
    int c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ jrw f;
    int g;
    jrw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrs(jrw jrwVar, ffgu ffguVar) {
        super(ffguVar);
        this.f = jrwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
