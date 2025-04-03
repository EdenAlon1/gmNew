package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyil {
    public static final eyjc a;

    static {
        eyib eyibVar = eyib.a;
        a = new eyje();
    }

    public static void A(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eyhg)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eyer.Y(((Long) list.get(i4)).longValue());
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eyhg eyhgVar = (eyhg) list;
        if (!z) {
            while (i2 < eyhgVar.c) {
                eyesVar.a.x(i, eyhgVar.a(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eyhgVar.c; i6++) {
            i5 += eyer.Y(eyhgVar.a(i6));
        }
        eyesVar.a.w(i5);
        while (i2 < eyhgVar.c) {
            eyesVar.a.y(eyhgVar.a(i2));
            i2++;
        }
    }

    public static void B(int i, List list, eyes eyesVar, eyik eyikVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            eyesVar.k(i, list.get(i2), eyikVar);
        }
    }

    public static void C(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eygb)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eygb eygbVar = (eygb) list;
        if (!z) {
            while (i2 < eygbVar.c) {
                eyesVar.a.i(i, eygbVar.d(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eygbVar.c; i6++) {
            eygbVar.d(i6);
            i5 += 4;
        }
        eyesVar.a.w(i5);
        while (i2 < eygbVar.c) {
            eyesVar.a.j(eygbVar.d(i2));
            i2++;
        }
    }

    public static void D(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eyhg)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eyhg eyhgVar = (eyhg) list;
        if (!z) {
            while (i2 < eyhgVar.c) {
                eyesVar.a.k(i, eyhgVar.a(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eyhgVar.c; i6++) {
            eyhgVar.a(i6);
            i5 += 8;
        }
        eyesVar.a.w(i5);
        while (i2 < eyhgVar.c) {
            eyesVar.a.l(eyhgVar.a(i2));
            i2++;
        }
    }

    public static void E(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eygb)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.aj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eyer.P(((Integer) list.get(i4)).intValue());
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.ak(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eygb eygbVar = (eygb) list;
        if (!z) {
            while (i2 < eygbVar.c) {
                eyesVar.a.aj(i, eygbVar.d(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eygbVar.c; i6++) {
            i5 += eyer.P(eygbVar.d(i6));
        }
        eyesVar.a.w(i5);
        while (i2 < eygbVar.c) {
            eyesVar.a.ak(eygbVar.d(i2));
            i2++;
        }
    }

    public static void F(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eyhg)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.al(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eyer.R(((Long) list.get(i4)).longValue());
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.am(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eyhg eyhgVar = (eyhg) list;
        if (!z) {
            while (i2 < eyhgVar.c) {
                eyesVar.a.al(i, eyhgVar.a(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eyhgVar.c; i6++) {
            i5 += eyer.R(eyhgVar.a(i6));
        }
        eyesVar.a.w(i5);
        while (i2 < eyhgVar.c) {
            eyesVar.a.am(eyhgVar.a(i2));
            i2++;
        }
    }

    public static void G(int i, List list, eyes eyesVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eyhb)) {
            while (i2 < list.size()) {
                eyesVar.a.s(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        eyhb eyhbVar = (eyhb) list;
        while (i2 < list.size()) {
            Object c = eyhbVar.c();
            if (c instanceof String) {
                eyesVar.a.s(i, (String) c);
            } else {
                eyesVar.a.az(i, (eyee) c);
            }
            i2++;
        }
    }

    public static void H(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eygb)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.v(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eyer.W(((Integer) list.get(i4)).intValue());
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eygb eygbVar = (eygb) list;
        if (!z) {
            while (i2 < eygbVar.c) {
                eyesVar.a.v(i, eygbVar.d(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eygbVar.c; i6++) {
            i5 += eyer.W(eygbVar.d(i6));
        }
        eyesVar.a.w(i5);
        while (i2 < eygbVar.c) {
            eyesVar.a.w(eygbVar.d(i2));
            i2++;
        }
    }

    public static void I(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eyhg)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eyer.Y(((Long) list.get(i4)).longValue());
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eyhg eyhgVar = (eyhg) list;
        if (!z) {
            while (i2 < eyhgVar.c) {
                eyesVar.a.x(i, eyhgVar.a(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eyhgVar.c; i6++) {
            i5 += eyer.Y(eyhgVar.a(i6));
        }
        eyesVar.a.w(i5);
        while (i2 < eyhgVar.c) {
            eyesVar.a.y(eyhgVar.a(i2));
            i2++;
        }
    }

    static void J(Object obj, Object obj2) {
        eyjd k = eyje.k(obj);
        eyjd k2 = eyje.k(obj2);
        if (!eyjd.a.equals(k2)) {
            if (eyjd.a.equals(k)) {
                k = eyjd.b(k, k2);
            } else if (!k2.equals(eyjd.a)) {
                k.c();
                int i = k.b + k2.b;
                k.d(i);
                System.arraycopy(k2.c, 0, k.c, k.b, k2.b);
                System.arraycopy(k2.d, 0, k.d, k.b, k2.b);
                k.b = i;
            }
        }
        eyje.l(obj, k);
    }

    static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eygb)) {
            int i2 = 0;
            while (i < size) {
                i2 += eyer.G(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        eygb eygbVar = (eygb) list;
        int i3 = 0;
        while (i < size) {
            i3 += eyer.G(eygbVar.d(i));
            i++;
        }
        return i3;
    }

    static int b(List list) {
        return list.size() * 4;
    }

    static int c(List list) {
        return list.size() * 8;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eygb)) {
            int i2 = 0;
            while (i < size) {
                i2 += eyer.G(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        eygb eygbVar = (eygb) list;
        int i3 = 0;
        while (i < size) {
            i3 += eyer.G(eygbVar.d(i));
            i++;
        }
        return i3;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eyhg)) {
            int i2 = 0;
            while (i < size) {
                i2 += eyer.Y(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        eyhg eyhgVar = (eyhg) list;
        int i3 = 0;
        while (i < size) {
            i3 += eyer.Y(eyhgVar.a(i));
            i++;
        }
        return i3;
    }

    static int f(int i, Object obj, eyik eyikVar) {
        return obj instanceof eyha ? eyer.I(i, (eyha) obj) : eyer.U(i) + eyer.M((eyhs) obj, eyikVar);
    }

    static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eygb)) {
            int i2 = 0;
            while (i < size) {
                i2 += eyer.P(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        eygb eygbVar = (eygb) list;
        int i3 = 0;
        while (i < size) {
            i3 += eyer.P(eygbVar.d(i));
            i++;
        }
        return i3;
    }

    static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eyhg)) {
            int i2 = 0;
            while (i < size) {
                i2 += eyer.R(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        eyhg eyhgVar = (eyhg) list;
        int i3 = 0;
        while (i < size) {
            i3 += eyer.R(eyhgVar.a(i));
            i++;
        }
        return i3;
    }

    static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eygb)) {
            int i2 = 0;
            while (i < size) {
                i2 += eyer.W(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        eygb eygbVar = (eygb) list;
        int i3 = 0;
        while (i < size) {
            i3 += eyer.W(eygbVar.d(i));
            i++;
        }
        return i3;
    }

    static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof eyhg)) {
            int i2 = 0;
            while (i < size) {
                i2 += eyer.Y(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        eyhg eyhgVar = (eyhg) list;
        int i3 = 0;
        while (i < size) {
            i3 += eyer.Y(eyhgVar.a(i));
            i++;
        }
        return i3;
    }

    static Object k(Object obj, int i, List list, eygf eygfVar, Object obj2, eyjc eyjcVar) {
        if (eygfVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (eygfVar.a(intValue) == null) {
                    obj2 = m(obj, i, intValue, obj2, eyjcVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int intValue2 = num.intValue();
            if (eygfVar.a(intValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m(obj, i, intValue2, obj2, eyjcVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object l(Object obj, int i, List list, eygg eyggVar, Object obj2, eyjc eyjcVar) {
        if (eyggVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!eyggVar.a(intValue)) {
                    obj2 = m(obj, i, intValue, obj2, eyjcVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int intValue2 = num.intValue();
            if (eyggVar.a(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m(obj, i, intValue2, obj2, eyjcVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object m(Object obj, int i, int i2, Object obj2, eyjc eyjcVar) {
        if (obj2 == null) {
            obj2 = eyjcVar.a(obj);
        }
        eyjcVar.g(obj2, i, i2);
        return obj2;
    }

    static void n(eyfd eyfdVar, Object obj, Object obj2) {
        eyfj a2 = eyfdVar.a(obj2);
        if (a2.i()) {
            return;
        }
        eyfj b = eyfdVar.b(obj);
        int i = a2.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            b.g(a2.b.d(i2));
        }
        Iterator it = a2.b.a().iterator();
        while (it.hasNext()) {
            b.g((Map.Entry) it.next());
        }
    }

    static boolean o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * eyer.ap(i);
    }

    static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * eyer.aq(i);
    }

    public static void r(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eydu)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.ay(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.ax(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        eydu eyduVar = (eydu) list;
        if (!z) {
            while (i2 < eyduVar.c) {
                eyesVar.a.ay(i, eyduVar.g(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eyduVar.c; i6++) {
            eyduVar.g(i6);
            i5++;
        }
        eyesVar.a.w(i5);
        while (i2 < eyduVar.c) {
            eyesVar.a.ax(eyduVar.g(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void s(int i, List list, eyes eyesVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            eyesVar.a.az(i, (eyee) list.get(i2));
        }
    }

    public static void t(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eyet)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.ae(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.af(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        eyet eyetVar = (eyet) list;
        if (!z) {
            while (i2 < eyetVar.d) {
                eyesVar.a.ae(i, eyetVar.d(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eyetVar.d; i6++) {
            eyetVar.d(i6);
            i5 += 8;
        }
        eyesVar.a.w(i5);
        while (i2 < eyetVar.d) {
            eyesVar.a.af(eyetVar.d(i2));
            i2++;
        }
    }

    public static void u(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eygb)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eyer.G(((Integer) list.get(i4)).intValue());
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eygb eygbVar = (eygb) list;
        if (!z) {
            while (i2 < eygbVar.c) {
                eyesVar.a.m(i, eygbVar.d(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eygbVar.c; i6++) {
            i5 += eyer.G(eygbVar.d(i6));
        }
        eyesVar.a.w(i5);
        while (i2 < eygbVar.c) {
            eyesVar.a.n(eygbVar.d(i2));
            i2++;
        }
    }

    public static void v(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eygb)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eygb eygbVar = (eygb) list;
        if (!z) {
            while (i2 < eygbVar.c) {
                eyesVar.a.i(i, eygbVar.d(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eygbVar.c; i6++) {
            eygbVar.d(i6);
            i5 += 4;
        }
        eyesVar.a.w(i5);
        while (i2 < eygbVar.c) {
            eyesVar.a.j(eygbVar.d(i2));
            i2++;
        }
    }

    public static void w(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eyhg)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eyhg eyhgVar = (eyhg) list;
        if (!z) {
            while (i2 < eyhgVar.c) {
                eyesVar.a.k(i, eyhgVar.a(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eyhgVar.c; i6++) {
            eyhgVar.a(i6);
            i5 += 8;
        }
        eyesVar.a.w(i5);
        while (i2 < eyhgVar.c) {
            eyesVar.a.l(eyhgVar.a(i2));
            i2++;
        }
    }

    public static void x(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eyfl)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.ag(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.ah(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        eyfl eyflVar = (eyfl) list;
        if (!z) {
            while (i2 < eyflVar.d) {
                eyesVar.a.ag(i, eyflVar.d(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eyflVar.d; i6++) {
            eyflVar.d(i6);
            i5 += 4;
        }
        eyesVar.a.w(i5);
        while (i2 < eyflVar.d) {
            eyesVar.a.ah(eyflVar.d(i2));
            i2++;
        }
    }

    public static void y(int i, List list, eyes eyesVar, eyik eyikVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            eyesVar.h(i, list.get(i2), eyikVar);
        }
    }

    public static void z(int i, List list, eyes eyesVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eygb)) {
            if (!z) {
                while (i2 < list.size()) {
                    eyesVar.a.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eyesVar.a.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eyer.G(((Integer) list.get(i4)).intValue());
            }
            eyesVar.a.w(i3);
            while (i2 < list.size()) {
                eyesVar.a.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eygb eygbVar = (eygb) list;
        if (!z) {
            while (i2 < eygbVar.c) {
                eyesVar.a.m(i, eygbVar.d(i2));
                i2++;
            }
            return;
        }
        eyesVar.a.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eygbVar.c; i6++) {
            i5 += eyer.G(eygbVar.d(i6));
        }
        eyesVar.a.w(i5);
        while (i2 < eygbVar.c) {
            eyesVar.a.n(eygbVar.d(i2));
            i2++;
        }
    }
}
