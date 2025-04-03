package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aquc extends ffhv implements ffjm {
    final /* synthetic */ alyx a;
    final /* synthetic */ aque b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aquc(alyx alyxVar, aque aqueVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = alyxVar;
        this.b = aqueVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aquc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        enip a = ((azpo) this.b.e.b()).a(this.b.a).a();
        if (a.isEmpty()) {
            return false;
        }
        int i = true != this.a.g ? 0 : 3;
        csmz csmzVar = (csmz) this.b.d.a();
        a.getClass();
        Object J = ffdx.J(a);
        J.getClass();
        csod d = csmzVar.d(i, ((Number) J).intValue());
        d.getClass();
        return Boolean.valueOf(d == csod.AVAILABLE);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aquc(this.a, this.b, ffguVar);
    }
}
