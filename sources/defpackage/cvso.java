package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvso extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ cvsy b;
    final /* synthetic */ cwir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvso(cvsy cvsyVar, cwir cwirVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvsyVar;
        this.c = cwirVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvso) c((cvvc) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final cvvc cvvcVar = (cvvc) this.a;
        cvvcVar.getClass();
        final cwir cwirVar = this.c;
        cwirVar.getClass();
        String l = cvvcVar.a.c().toString();
        final cvuf cvufVar = this.b.e;
        return new cvul(l, new ffix() { // from class: cvue
            @Override // defpackage.ffix
            public final Object invoke() {
                dngx dngpVar;
                dnym b;
                dnym b2;
                cvvc cvvcVar2 = cvvc.this;
                amar amarVar = cvvcVar2.a;
                String d = amarVar.d();
                engw b3 = amarVar.b();
                String l2 = amarVar.c().toString();
                cvuf cvufVar2 = cvufVar;
                cvsa cvsaVar = cvufVar2.a;
                cwir cwirVar2 = cwirVar;
                int i = cvvcVar2.b;
                cwjb cwjbVar = cwirVar2.d;
                tty ttyVar = cvufVar2.b;
                amar amarVar2 = cvvcVar2.a;
                boolean a = cwirVar2.a(amarVar2);
                ffix a2 = cvsaVar.a(amarVar2, i, cwjbVar, false);
                String a3 = ttyVar.a(b3);
                if (cwirVar2.d.e()) {
                    b2 = ((tud) cvufVar2.c.b()).b(amarVar2, false);
                    dngpVar = new dngv(b2, d, a3, a, ffdx.b(cvuf.a(a3, ((enou) b3).c)), a2, new dngq((byte[]) null));
                } else {
                    b = ((tud) cvufVar2.c.b()).b(amarVar2, false);
                    dngpVar = new dngp(b, d, a3, ffdx.b(cvuf.a(a3, ((enou) b3).c)), a2, new dngq((byte[]) null), 8);
                }
                return new cvug(l2, dngpVar, cvvcVar2.a.e());
            }
        });
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvso cvsoVar = new cvso(this.b, this.c, ffguVar);
        cvsoVar.a = obj;
        return cvsoVar;
    }
}
