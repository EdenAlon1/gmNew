package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dent extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ deny c;
    final /* synthetic */ cvjl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dent(deny denyVar, cvjl cvjlVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = denyVar;
        this.d = cvjlVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dent dentVar = new dent(this.c, this.d, (ffgu) obj3);
        dentVar.a = (dekh) obj;
        dentVar.b = (cjtw) obj2;
        return dentVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof deke;
        Object obj3 = this.b;
        if (z || (obj2 instanceof dekf)) {
            return null;
        }
        if (!(obj2 instanceof dekg)) {
            throw new ffcd();
        }
        final deny denyVar = this.c;
        final eisx a = ((dekg) obj2).a.a();
        final cvjl cvjlVar = this.d;
        int ordinal = cvjlVar.ordinal();
        if (ordinal != 3 && ordinal != 4) {
            return null;
        }
        final cjtw cjtwVar = (cjtw) obj3;
        return new ffix() { // from class: deni
            @Override // defpackage.ffix
            public final Object invoke() {
                deny denyVar2 = deny.this;
                axol.k(denyVar2.k, null, new denv(denyVar2, a, cvjlVar, cjtwVar, null), 3);
                return ffcu.a;
            }
        };
    }
}
