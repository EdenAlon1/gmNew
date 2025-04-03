package defpackage;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blf {
    private final bcq a;
    private final Rational b;
    private final blg c;

    public blf(bcq bcqVar, Size size) {
        Rational rational;
        this.a = bcqVar;
        bcqVar.b();
        bcqVar.a();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List m = bcqVar.m(256);
            if (m.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(m, new bhu());
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.b = rational;
        this.c = new blg(bcqVar, rational);
    }

    static Rational a(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z ? bhn.a : bhn.b;
        }
        if (i == 1) {
            return z ? bhn.c : bhn.d;
        }
        avw.c("SupportedOutputSizesCollector", a.h(i, "Undefined target aspect ratio: "));
        return null;
    }

    static List b(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bhn.a);
        arrayList.add(bhn.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                int size2 = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size2) {
                        arrayList.add(rational);
                        break;
                    }
                    boolean a = bhn.a(size, (Rational) arrayList.get(i));
                    i++;
                    if (a) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    static Map d(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = b(list).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (bhn.a(size, rational)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    static void e(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            } else {
                arrayList.add(0, size3);
            }
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static List f(boy boyVar, List list, Size size, Rational rational) {
        Map d = d(list);
        Rational a = a(boyVar.a.b, rational == null || rational.getNumerator() >= rational.getDenominator());
        ArrayList arrayList = new ArrayList(d.keySet());
        Collections.sort(arrayList, new bhm(a, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            Rational rational2 = (Rational) arrayList.get(i);
            linkedHashMap.put(rational2, (List) d.get(rational2));
        }
        if (size != null) {
            int a2 = blz.a(size);
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (blz.a(size3) <= a2) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        boz bozVar = boyVar.b;
        if (bozVar != null) {
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it2.next());
                if (!list3.isEmpty()) {
                    int i2 = bozVar.c;
                    Integer valueOf = Integer.valueOf(i2);
                    if (!bozVar.equals(boz.a)) {
                        Size size4 = bozVar.b;
                        valueOf.getClass();
                        if (i2 == 0) {
                            boolean contains = list3.contains(size4);
                            list3.clear();
                            if (contains) {
                                list3.add(size4);
                            }
                        } else if (i2 == 1) {
                            e(list3, size4, true);
                        } else if (i2 == 2) {
                            e(list3, size4, false);
                        } else if (i2 != 3) {
                            g(list3, size4, false);
                        } else {
                            g(list3, size4, true);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            for (Size size5 : (List) it3.next()) {
                if (!arrayList3.contains(size5)) {
                    arrayList3.add(size5);
                }
            }
        }
        box boxVar = boyVar.c;
        return arrayList3;
    }

    private static void g(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public final List c(bhh bhhVar) {
        Size[] sizeArr;
        int i;
        bet betVar = (bet) bhhVar;
        List H = betVar.H();
        if (H != null) {
            return H;
        }
        boy L = betVar.L();
        List<Pair> M = betVar.M();
        int a = bhhVar.a();
        Rational rational = null;
        if (M != null) {
            for (Pair pair : M) {
                if (((Integer) pair.first).intValue() == a) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        List asList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (asList == null) {
            asList = this.a.m(a);
        }
        ArrayList arrayList = new ArrayList(asList);
        Collections.sort(arrayList, new bhu(true));
        if (arrayList.isEmpty()) {
            avw.f("SupportedOutputSizesCollector", a.f(a, "The retrieved supported resolutions from camera info internal is empty. Format is ", "."));
        }
        int i2 = 0;
        if (L != null) {
            Size J = betVar.J();
            betVar.B(0);
            if (!bhhVar.y()) {
                bhhVar.a();
            }
            return f(betVar.D(), arrayList, J, this.b);
        }
        blg blgVar = this.c;
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new bhu(true));
        ArrayList arrayList3 = new ArrayList();
        Size J2 = betVar.J();
        Size size = (Size) arrayList2.get(0);
        if (J2 == null || blz.a(size) < blz.a(J2)) {
            J2 = size;
        }
        Size a2 = blgVar.a(betVar);
        Size size2 = blz.c;
        int a3 = blz.a(blz.c);
        if (blz.a(J2) < a3) {
            size2 = blz.a;
        } else if (a2 != null && blz.a(a2) < a3) {
            size2 = a2;
        }
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Size size4 = (Size) arrayList2.get(i3);
            if (blz.a(size4) <= blz.a(J2) && blz.a(size4) >= blz.a(size2) && !arrayList3.contains(size4)) {
                arrayList3.add(size4);
            }
        }
        if (arrayList3.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + J2 + "\ninitial size list: " + arrayList2);
        }
        if (betVar.E()) {
            rational = a(betVar.A(), blgVar.b);
        } else {
            Size a4 = blgVar.a(betVar);
            if (a4 != null) {
                Iterator it = b(arrayList3).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        rational = new Rational(a4.getWidth(), a4.getHeight());
                        break;
                    }
                    Rational rational2 = (Rational) it.next();
                    if (bhn.a(a4, rational2)) {
                        rational = rational2;
                        break;
                    }
                }
            }
        }
        if (a2 == null) {
            a2 = betVar.I();
        }
        ArrayList arrayList4 = new ArrayList();
        new HashMap();
        if (rational == null) {
            arrayList4.addAll(arrayList3);
            if (a2 != null) {
                e(arrayList4, a2, true);
                return arrayList4;
            }
        } else {
            Map d = d(arrayList3);
            if (a2 != null) {
                Iterator it2 = d.keySet().iterator();
                while (it2.hasNext()) {
                    e((List) d.get((Rational) it2.next()), a2, true);
                }
            }
            ArrayList arrayList5 = new ArrayList(d.keySet());
            Collections.sort(arrayList5, new bhm(rational, blgVar.a));
            int size5 = arrayList5.size();
            while (i2 < size5) {
                Iterator it3 = ((List) d.get((Rational) arrayList5.get(i2))).iterator();
                while (true) {
                    i = i2 + 1;
                    if (it3.hasNext()) {
                        Size size6 = (Size) it3.next();
                        if (!arrayList4.contains(size6)) {
                            arrayList4.add(size6);
                        }
                    }
                }
                i2 = i;
            }
        }
        return arrayList4;
    }
}
