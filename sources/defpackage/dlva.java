package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlva {
    public static final void a(final String str, final List list, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        list.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1455226064);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            c = dix.c(hvi.e, dix.a(0, b, 6, 0), false, true, false);
            hvi c2 = dlsj.c(eba.d(c, 16.0f));
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c2);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            eqd eqdVar = gft.c(b).a;
            hvi b3 = eao.b(dek.c(hxo.a(hvi.e, eqdVar), 1.0f, gft.a(b).s, eqdVar), 2);
            ipn a3 = dyo.a(dxu.c, hum.j, b, 0);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b, b3);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b4, iss.c);
            b(str, list, b, i2 & 14);
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlux
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i6 = i;
                    dlva.a(str2, list, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, final List list, hfd hfdVar, final int i) {
        hfd hfdVar2;
        int i2;
        boolean z;
        long j;
        hvi a;
        Object next;
        hfm hfmVar;
        Object obj;
        hfd hfdVar3;
        boolean z2;
        boolean z3;
        hvi b;
        hvi d;
        boolean z4;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-567634903);
        int i4 = 2;
        int i5 = 4;
        boolean z5 = true;
        int i6 = i3 == 0 ? (true != b2.D(str) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i6 |= true != b2.F(list) ? 16 : 32;
        }
        if ((i6 & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            if (list.isEmpty()) {
                hio L = b2.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dluy
                        @Override // defpackage.ffjm
                        public final Object a(Object obj2, Object obj3) {
                            ((Integer) obj3).intValue();
                            String str2 = str;
                            int i7 = i;
                            dlva.b(str2, list, (hfd) obj2, hip.a(i7 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            ListIterator listIterator = list.listIterator();
            Object next2 = listIterator.next();
            boolean z6 = false;
            boolean z7 = true;
            boolean z8 = false;
            while (listIterator.hasNext()) {
                b2.v(-553582186);
                if (next2 instanceof dlto) {
                    dlus dlusVar = ((dlto) next2).a;
                    if (dlusVar == dlus.n) {
                        hfdVar2 = b2;
                        i2 = i5;
                        z8 = z5;
                        z = z8;
                    } else if (dlusVar == dlus.o) {
                        hfdVar2 = b2;
                        i2 = i5;
                        z = z5;
                        z8 = z6 ? 1 : 0;
                        z4 = z8;
                        next2 = listIterator.next();
                        ((hfm) hfdVar2).Z();
                        b2 = hfdVar2;
                        z5 = z;
                        z6 = z4;
                        i5 = i2;
                        i4 = 2;
                    } else if (dlusVar == dlus.p) {
                        b2.v(2060359752);
                        if (!z7) {
                            long j2 = gft.a(b2).s;
                            d = ebs.d(hvi.e, 1.0f);
                            dwgw.a(d, 1.0f, j2, b2, 54, 0);
                        }
                        hfm hfmVar2 = (hfm) b2;
                        hfmVar2.Z();
                        hve hveVar = hvi.e;
                        if (z8) {
                            b2.v(-553070004);
                            j = gft.a(b2).F;
                            hfmVar2.Z();
                        } else {
                            b2.v(-552988939);
                            j = gft.a(b2).p;
                            hfmVar2.Z();
                        }
                        a = dee.a(hveVar, j, idb.a);
                        hvi a2 = eao.a(a, i4);
                        dxi dxiVar = dxu.a;
                        int i7 = huo.a;
                        ipn a3 = ebm.a(dxiVar, hum.m, b2, z6 ? 1 : 0);
                        int a4 = hey.a(b2);
                        hqb ai = hfmVar2.ai();
                        hvi b3 = huz.b(b2, a2);
                        int i8 = ist.a;
                        ffix ffixVar = iss.a;
                        b2.x();
                        if (hfmVar2.z) {
                            b2.j(ffixVar);
                        } else {
                            b2.z();
                        }
                        hlc.b(b2, a3, iss.e);
                        hlc.b(b2, ai, iss.d);
                        ffjm ffjmVar = iss.f;
                        if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a4))) {
                            Integer valueOf = Integer.valueOf(a4);
                            hfmVar2.ad(valueOf);
                            b2.h(valueOf, ffjmVar);
                        }
                        hlc.b(b2, b3, iss.c);
                        b2.v(1156102120);
                        boolean z9 = z5;
                        while (true) {
                            b2.v(1479429401);
                            next = listIterator.next();
                            dlto dltoVar = next instanceof dlto ? (dlto) next : null;
                            dlus dlusVar2 = dltoVar != null ? dltoVar.a : null;
                            if (dlusVar2 == dlus.p || dlusVar2 == dlus.o) {
                                break;
                            }
                            if (dlusVar2 != dlus.q) {
                                hfmVar2.Z();
                                hfmVar = hfmVar2;
                                obj = next;
                                hfdVar3 = b2;
                                i2 = i5;
                                z2 = z5;
                                z3 = z6;
                            } else {
                                b2.v(1156109307);
                                if (!z9) {
                                    long j3 = gft.a(b2).s;
                                    b = ebs.b(hvi.e, 1.0f);
                                    dwgw.b(ebs.o(b, 1.0f), j3, b2, 54);
                                }
                                hfmVar2.Z();
                                int nextIndex = listIterator.nextIndex();
                                while (nextIndex < list.size()) {
                                    dltq dltqVar = (dltq) list.get(nextIndex);
                                    dlto dltoVar2 = (dlto) next;
                                    if (dltqVar.b() >= dltoVar2.c && dltqVar.a() > dltoVar2.c) {
                                        break;
                                    } else {
                                        nextIndex++;
                                    }
                                }
                                dlto dltoVar3 = (dlto) next;
                                String substring = str.substring(dltoVar3.b, dltoVar3.c);
                                substring.getClass();
                                fflb fflbVar = new fflb();
                                List<dltq> subList = list.subList(listIterator.nextIndex(), nextIndex);
                                ArrayList arrayList = new ArrayList(ffdx.n(subList, 10));
                                for (dltq dltqVar2 : subList) {
                                    dltq dltqVar3 = (dltq) next;
                                    arrayList.add(dltqVar2.c(dltqVar2.b() - dltqVar3.b(), dltqVar2.a() - dltqVar3.b()));
                                }
                                fflbVar.a = arrayList;
                                if (z8 && substring.length() > 0) {
                                    fflbVar.a = ffdx.am((Collection) fflbVar.a);
                                    ((List) fflbVar.a).add(new dlto(dlus.d, 0, substring.length(), (ffji) null, 24));
                                }
                                hvi d2 = eba.d(ebs.o(hvi.e, 100.0f), 8.0f);
                                ipn a5 = dyc.a(hum.a, z6);
                                int a6 = hey.a(b2);
                                hqb ai2 = hfmVar2.ai();
                                hvi b4 = huz.b(b2, d2);
                                ffix ffixVar2 = iss.a;
                                b2.x();
                                if (hfmVar2.z) {
                                    b2.j(ffixVar2);
                                } else {
                                    b2.z();
                                }
                                hlc.b(b2, a5, iss.e);
                                hlc.b(b2, ai2, iss.d);
                                ffjm ffjmVar2 = iss.f;
                                if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a6))) {
                                    Integer valueOf2 = Integer.valueOf(a6);
                                    hfmVar2.ad(valueOf2);
                                    b2.h(valueOf2, ffjmVar2);
                                }
                                hlc.b(b2, b4, iss.c);
                                b2.v(-1050949297);
                                if (substring.length() <= 0 && ((Collection) fflbVar.a).isEmpty()) {
                                    hfmVar = hfmVar2;
                                    obj = next;
                                    hfdVar3 = b2;
                                    i2 = i5;
                                    z2 = true;
                                    z3 = false;
                                } else {
                                    hfmVar = hfmVar2;
                                    hfdVar3 = b2;
                                    z2 = true;
                                    z3 = false;
                                    obj = next;
                                    i2 = i5;
                                    dlur.e(new dluu(substring, (List) fflbVar.a, i5), null, 0L, null, null, 0L, null, false, null, hfdVar3, 12582912, 382);
                                }
                                hfmVar.Z();
                                hfdVar3.n();
                                hfmVar.Z();
                                z9 = z3;
                            }
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            hfmVar2 = hfmVar;
                            b2 = hfdVar3;
                            z5 = z2;
                            z6 = z3;
                            i5 = i2;
                        }
                        hfmVar = hfmVar2;
                        obj = next;
                        hfdVar3 = b2;
                        i2 = i5;
                        z2 = z5;
                        z3 = z6;
                        hfmVar.Z();
                        hfmVar.Z();
                        hfdVar3.n();
                        hfmVar.Z();
                        b2 = hfdVar3;
                        z5 = z2;
                        z7 = z3;
                        z6 = z7;
                        next2 = obj;
                        i5 = i2;
                        i4 = 2;
                    } else {
                        hfdVar2 = b2;
                        i2 = i5;
                        z = z5;
                    }
                    z4 = z6 ? 1 : 0;
                    next2 = listIterator.next();
                    ((hfm) hfdVar2).Z();
                    b2 = hfdVar2;
                    z5 = z;
                    z6 = z4;
                    i5 = i2;
                    i4 = 2;
                } else {
                    next2 = listIterator.next();
                    ((hfm) b2).Z();
                }
            }
        }
        hio L2 = b2.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dluz
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    int i9 = i;
                    dlva.b(str2, list, (hfd) obj2, hip.a(i9 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
