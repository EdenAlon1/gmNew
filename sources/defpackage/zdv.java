package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdv {
    public final zdx a;
    public final zea b;
    public final ffxx c;

    public zdv(ausa ausaVar, zdx zdxVar, zea zeaVar) {
        ausaVar.getClass();
        this.a = zdxVar;
        this.b = zeaVar;
        this.c = new axqd(new ffix() { // from class: zdu
            @Override // defpackage.ffix
            public final Object invoke() {
                final zdv zdvVar = zdv.this;
                List list = null;
                int i = 14;
                return new zdq("Satellite", ffdx.g(new zdq("Force manual connection toolstone", list, new ffix() { // from class: zdr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zdx zdxVar2 = zdv.this.a;
                        azop azopVar = (azop) zdxVar2.b.c();
                        if (azopVar != null) {
                            zdxVar2.a.d(azopVar.b());
                        }
                        return ffcu.a;
                    }
                }, i), new zdq("Connect to satellite", list, new ffix() { // from class: zds
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zea zeaVar2 = zdv.this.b;
                        axol.k(zeaVar2.a, null, new zdz(zeaVar2, null), 3);
                        return ffcu.a;
                    }
                }, i)), new ffix() { // from class: zdt
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                }, 2);
            }
        });
    }
}
