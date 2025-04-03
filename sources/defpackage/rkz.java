package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkz {
    private final rku a;
    private boolean b = false;

    public rkz(rku rkuVar) {
        this.a = rkuVar;
    }

    public static List b(rkt rktVar) {
        ArrayList arrayList = new ArrayList();
        while (!rktVar.o()) {
            try {
                arrayList.add((rku) Enum.valueOf(rku.class, rktVar.k(',')));
                if (!rktVar.q()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    public static boolean c(List list, rku rkuVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rku rkuVar2 = (rku) it.next();
            if (rkuVar2 == rku.all || rkuVar2 == rkuVar) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(rkx rkxVar, int i, List list, int i2, rmn rmnVar) {
        rky b = rkxVar.b(i);
        if (!e(b, list, i2, rmnVar)) {
            return false;
        }
        int i3 = b.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return g(rkxVar, i - 1, list, i2);
            }
            int f = f(list, i2, rmnVar);
            if (f <= 0) {
                return false;
            }
            return d(rkxVar, i - 1, list, i2, (rmn) rmnVar.u.n().get(f - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 >= 0) {
            if (g(rkxVar, i - 1, list, i2)) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public static boolean e(rky rkyVar, List list, int i, rmn rmnVar) {
        List list2;
        String str = rkyVar.a;
        if (str != null) {
            if (str.equalsIgnoreCase("G")) {
                if (!(rmnVar instanceof rlo)) {
                    return false;
                }
            } else if (!rkyVar.a.equals(rmnVar.getClass().getSimpleName().toLowerCase(Locale.US))) {
                return false;
            }
        }
        List<rks> list3 = rkyVar.b;
        if (list3 != null) {
            for (rks rksVar : list3) {
                String str2 = rksVar.a;
                if (str2 == "id") {
                    if (!rksVar.b.equals(rmnVar.o)) {
                        return false;
                    }
                } else if (str2 != "class" || (list2 = rmnVar.s) == null || !list2.contains(rksVar.b)) {
                    return false;
                }
            }
        }
        List list4 = rkyVar.c;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((String) it.next()).equals("first-child") || f(list, i, rmnVar) != 0) {
                return false;
            }
        }
        return true;
    }

    private static int f(List list, int i, rmn rmnVar) {
        if (i < 0) {
            return -1;
        }
        Object obj = list.get(i);
        rml rmlVar = rmnVar.u;
        if (obj != rmlVar) {
            return -1;
        }
        Iterator it = rmlVar.n().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((rmp) it.next()) == rmnVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean g(rkx rkxVar, int i, List list, int i2) {
        rky b = rkxVar.b(i);
        rmn rmnVar = (rmn) list.get(i2);
        if (!e(b, list, i2, rmnVar)) {
            return false;
        }
        int i3 = b.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return g(rkxVar, i - 1, list, i2 - 1);
            }
            int f = f(list, i2, rmnVar);
            if (f <= 0) {
                return false;
            }
            return d(rkxVar, i - 1, list, i2, (rmn) rmnVar.u.n().get(f - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 > 0) {
            i2--;
            if (g(rkxVar, i - 1, list, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x024f, code lost:
    
        if (r7 == 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0253, code lost:
    
        if (r11.a != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0255, code lost:
    
        r11.a = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x025c, code lost:
    
        r11.a.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0265, code lost:
    
        if (r19.q() == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0267, code lost:
    
        r3.add(r11);
        r11 = new defpackage.rkx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x026f, code lost:
    
        r7 = r16;
        r8 = 0;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0277, code lost:
    
        r19.b = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x024f A[EDGE_INSN: B:214:0x024f->B:188:0x024f BREAK  A[LOOP:6: B:116:0x012d->B:151:0x012d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0377 A[EDGE_INSN: B:67:0x0377->B:42:0x0377 BREAK  A[LOOP:1: B:22:0x029b->B:44:?, LOOP_LABEL: LOOP:0: B:2:0x0009->B:66:0x0009], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [rky] */
    /* JADX WARN: Type inference failed for: r7v16, types: [rky] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [rky] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rkw a(defpackage.rkt r19) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkz.a(rkt):rkw");
    }
}
