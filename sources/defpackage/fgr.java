package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fhi b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgr(fhi fhiVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fhiVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        if (this.c) {
            int c = jpm.c(this.b.f().c);
            this.b.c.invoke(new jvu(this.b.f().b, jpn.a(c, c)));
            this.b.p(eug.a);
            return ffcu.a;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgr(this.b, this.c, ffguVar);
    }
}
