package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjeu extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cjfw c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjeu(cjfw cjfwVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = cjfwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
