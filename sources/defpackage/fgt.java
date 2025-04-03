package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fhi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgt(fhi fhiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fhiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!jpm.i(this.b.f().c)) {
                fhi fhiVar = this.b;
                iyj iyjVar = fhiVar.s;
                if (iyjVar != null) {
                    jcq a = dws.a(jvv.a(fhiVar.f()));
                    this.a = 1;
                    if (iyjVar.b(a) == ffhhVar) {
                        return ffhhVar;
                    }
                }
            }
            return ffcu.a;
        }
        fhi fhiVar2 = this.b;
        jlm c = jvv.c(fhiVar2.f(), fhiVar2.f().a().length());
        fhi fhiVar3 = this.b;
        jlm b = c.b(jvv.b(fhiVar3.f(), fhiVar3.f().a().length()));
        int d = jpm.d(this.b.f().c);
        this.b.c.invoke(new jvu(b, jpn.a(d, d)));
        this.b.p(eug.a);
        eyo eyoVar = this.b.a;
        if (eyoVar != null) {
            eyoVar.a();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgt(this.b, ffguVar);
    }
}
