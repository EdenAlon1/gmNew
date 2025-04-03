package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrl extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ jrm c;
    int d;
    jrm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrl(jrm jrmVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = jrmVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
