package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ijx extends ffkk implements ffix {
    final /* synthetic */ ijy a;
    final /* synthetic */ hvh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijx(ijy ijyVar, hvh hvhVar) {
        super(0);
        this.a = ijyVar;
        this.b = hvhVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ikh ikhVar = this.a.b;
        ikhVar.e.c();
        ikhVar.e.h(ikhVar);
        while (true) {
            cok cokVar = ikhVar.e;
            if (!cokVar.p()) {
                return ffcu.a;
            }
            ikh ikhVar2 = (ikh) cokVar.a(cokVar.c - 1);
            int i = 0;
            while (true) {
                hne hneVar = ikhVar2.d;
                if (i < hneVar.b) {
                    hvh hvhVar = this.b;
                    ikg ikgVar = (ikg) hneVar.a[i];
                    if (ffkj.e(ikgVar.a, hvhVar)) {
                        ikhVar2.d.m(ikgVar);
                        ikgVar.a();
                    } else {
                        ikhVar.e.h(ikgVar);
                        i++;
                    }
                }
            }
        }
    }
}
