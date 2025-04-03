package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kim extends kih {
    public kim(kie kieVar) {
        super(kieVar, 1);
    }

    @Override // defpackage.kia, defpackage.khs, defpackage.kib
    public final void e() {
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            khs b = this.al.b(arrayList.get(i));
            if (b.N != null) {
                b.ak = 5;
            } else {
                b.ak = 6;
            }
            b.k();
            if (b.P != null) {
                b.ak = 7;
            } else {
                b.ak = 8;
            }
            b.k();
            if (b.J != null) {
                b.ak = 1;
            } else {
                b.ak = 2;
            }
            b.k();
            if (b.L != null) {
                b.ak = 3;
            } else {
                b.ak = 4;
            }
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
                Object obj2 = this.N;
                if (obj2 != null) {
                    b2.t(obj2);
                    b2.o(this.l);
                    b2.p(this.r);
                } else {
                    Object obj3 = this.O;
                    if (obj3 != null) {
                        b2.s(obj3);
                        b2.o(this.l);
                        b2.p(this.r);
                    } else {
                        Object obj4 = this.J;
                        if (obj4 != null) {
                            b2.t(obj4);
                            b2.o(this.j);
                            b2.p(this.p);
                        } else {
                            Object obj5 = this.K;
                            if (obj5 != null) {
                                b2.s(obj5);
                                b2.o(this.j);
                                b2.p(this.p);
                            } else {
                                String obj6 = b2.a.toString();
                                b2.t(kie.c);
                                b2.w(Float.valueOf(D(obj6)));
                                b2.q(Float.valueOf(C(obj6)));
                            }
                        }
                    }
                }
                khsVar2 = b2;
            }
            if (khsVar != null) {
                String obj7 = khsVar.a.toString();
                String obj8 = b2.a.toString();
                khsVar.m(b2.a);
                khsVar.w(Float.valueOf(B(obj7)));
                khsVar.q(Float.valueOf(A(obj7)));
                b2.s(khsVar.a);
                b2.w(Float.valueOf(D(obj8)));
                b2.q(Float.valueOf(C(obj8)));
            }
            float E = E(obj.toString());
            if (E != -1.0f) {
                b2.f = E;
            }
            i2++;
            khsVar = b2;
        }
        if (khsVar != null) {
            Object obj9 = this.P;
            if (obj9 != null) {
                khsVar.m(obj9);
                khsVar.o(this.m);
                khsVar.p(this.s);
            } else {
                Object obj10 = this.Q;
                if (obj10 != null) {
                    khsVar.l(obj10);
                    khsVar.o(this.m);
                    khsVar.p(this.s);
                } else {
                    Object obj11 = this.L;
                    if (obj11 != null) {
                        khsVar.m(obj11);
                        khsVar.o(this.k);
                        khsVar.p(this.q);
                    } else {
                        Object obj12 = this.M;
                        if (obj12 != null) {
                            khsVar.l(obj12);
                            khsVar.o(this.k);
                            khsVar.p(this.q);
                        } else {
                            String obj13 = khsVar.a.toString();
                            khsVar.l(kie.c);
                            khsVar.w(Float.valueOf(B(obj13)));
                            khsVar.q(Float.valueOf(A(obj13)));
                        }
                    }
                }
            }
        }
        if (khsVar2 == null) {
            return;
        }
        float f = this.ao;
        if (f != 0.5f) {
            khsVar2.h = f;
        }
        kic kicVar = kic.SPREAD;
        int ordinal = this.as.ordinal();
        if (ordinal == 0) {
            khsVar2.d = 0;
        } else if (ordinal == 1) {
            khsVar2.d = 1;
        } else {
            if (ordinal != 2) {
                return;
            }
            khsVar2.d = 2;
        }
    }
}
