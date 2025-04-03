package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jru extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ jrw c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jru(jrw jrwVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = jrwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
