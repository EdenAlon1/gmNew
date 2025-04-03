package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnoj implements ipn {
    final /* synthetic */ hkx a;
    final /* synthetic */ hkx b;
    final /* synthetic */ dnor c;
    final /* synthetic */ hkx d;

    public dnoj(hkx hkxVar, hkx hkxVar2, dnor dnorVar, hkx hkxVar3) {
        this.a = hkxVar;
        this.b = hkxVar2;
        this.c = dnorVar;
        this.d = hkxVar3;
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int a(iny inyVar, List list, int i) {
        return ipm.a(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int b(iny inyVar, List list, int i) {
        return ipm.b(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int c(iny inyVar, List list, int i) {
        return ipm.c(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int d(iny inyVar, List list, int i) {
        return ipm.d(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo ei;
        ipqVar.getClass();
        final iqk e = ((ipl) list.get(0)).e(j);
        final iqk e2 = ((ipl) list.get(1)).e(j);
        final int i = dnon.a(this.a) > 0.1f ? e.a : e2.a;
        final hkx hkxVar = this.b;
        final dnor dnorVar = this.c;
        final hkx hkxVar2 = this.a;
        final hkx hkxVar3 = this.d;
        ei = ipqVar.ei(i, dnon.d(hkxVar), ffem.a, new ffji() { // from class: dnog
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                iqj iqjVar = (iqj) obj;
                iqjVar.getClass();
                dnor dnorVar2 = dnor.this;
                final long a = ids.a(dnorVar2 == dnor.c ? 1.0f : 0.0f, 1.0f);
                int i2 = i;
                iqk iqkVar = e;
                int i3 = dnorVar2 == dnor.c ? i2 - iqkVar.a : 0;
                final hkx hkxVar4 = hkxVar2;
                hkx hkxVar5 = hkxVar;
                iqk iqkVar2 = e2;
                iqjVar.g(iqkVar, i3, dnon.d(hkxVar5) - iqkVar.b, 1.0f, new ffji() { // from class: dnoh
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        idd iddVar = (idd) obj2;
                        iddVar.getClass();
                        iddVar.C(a);
                        hkx hkxVar6 = hkxVar4;
                        iddVar.x(Math.max(dnon.a(hkxVar6), 0.0f));
                        iddVar.y(Math.max(dnon.a(hkxVar6), 0.0f));
                        return ffcu.a;
                    }
                });
                int i4 = dnorVar2 == dnor.c ? i2 - iqkVar2.a : 0;
                final hkx hkxVar6 = hkxVar3;
                iqjVar.g(iqkVar2, i4, dnon.d(hkxVar5) - iqkVar2.b, 2.0f, new ffji() { // from class: dnoi
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        idd iddVar = (idd) obj2;
                        iddVar.getClass();
                        iddVar.C(a);
                        hkx hkxVar7 = hkxVar6;
                        iddVar.x(dnon.b(hkxVar7));
                        iddVar.y(dnon.b(hkxVar7));
                        return ffcu.a;
                    }
                });
                return ffcu.a;
            }
        });
        return ei;
    }
}
