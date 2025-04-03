package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kin extends kih {
    public kin(kie kieVar) {
        super(kieVar, 2);
    }

    @Override // defpackage.kia, defpackage.khs, defpackage.kib
    public final void e() {
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            khs b = this.al.b(arrayList.get(i));
            if (b.R != null) {
                b.ak = 9;
            } else {
                b.ak = 10;
            }
            b.k();
            b.ak = 15;
            b.k();
            b.ak = b.U != null ? 12 : 13;
            b.k();
        }
        ArrayList arrayList2 = this.am;
        int size2 = arrayList2.size();
        khs khsVar = null;
        int i2 = 0;
        khs khsVar2 = null;
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            khs b2 = this.al.b(obj);
            if (khsVar2 == null) {
                Object obj2 = this.R;
                if (obj2 != null) {
                    b2.v(obj2);
                    b2.o(this.n);
                    b2.p(this.t);
                } else {
                    Object obj3 = this.S;
                    if (obj3 != null) {
                        b2.u(obj3);
                        b2.o(this.n);
                        b2.p(this.t);
                    } else {
                        String obj4 = b2.a.toString();
                        b2.v(kie.c);
                        b2.w(Float.valueOf(D(obj4)));
                        b2.q(Float.valueOf(C(obj4)));
                    }
                }
                khsVar2 = b2;
            }
            if (khsVar != null) {
                String obj5 = khsVar.a.toString();
                String obj6 = b2.a.toString();
                khsVar.j(b2.a);
                khsVar.w(Float.valueOf(B(obj5)));
                khsVar.q(Float.valueOf(A(obj5)));
                b2.u(khsVar.a);
                b2.w(Float.valueOf(D(obj6)));
                b2.q(Float.valueOf(C(obj6)));
            }
            float E = E(obj.toString());
            if (E != -1.0f) {
                b2.g = E;
            }
            i2++;
            khsVar = b2;
        }
        if (khsVar != null) {
            Object obj7 = this.U;
            if (obj7 != null) {
                khsVar.j(obj7);
                khsVar.o(this.o);
                khsVar.p(this.u);
            } else {
                Object obj8 = this.V;
                if (obj8 != null) {
                    khsVar.i(obj8);
                    khsVar.o(this.o);
                    khsVar.p(this.u);
                } else {
                    String obj9 = khsVar.a.toString();
                    khsVar.i(kie.c);
                    khsVar.w(Float.valueOf(B(obj9)));
                    khsVar.q(Float.valueOf(A(obj9)));
                }
            }
        }
        if (khsVar2 == null) {
            return;
        }
        float f = this.ao;
        if (f != 0.5f) {
            khsVar2.i = f;
        }
        kic kicVar = kic.SPREAD;
        int ordinal = this.as.ordinal();
        if (ordinal == 0) {
            khsVar2.e = 0;
        } else if (ordinal == 1) {
            khsVar2.e = 1;
        } else {
            if (ordinal != 2) {
                return;
            }
            khsVar2.e = 2;
        }
    }
}
