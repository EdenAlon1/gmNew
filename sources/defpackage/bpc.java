package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpc {
    private static final double e = Math.sqrt(2.3703703703703702d);
    public final Rational a;
    public final Rational b;
    public final Set c;
    public final bcq d;
    private final Size f;
    private final blf g;
    private final Map h;

    public bpc(bct bctVar, Set set) {
        Rational rational;
        bbb bbbVar = (bbb) bctVar;
        Size i = bix.i(bbbVar.b.f());
        bba bbaVar = bbbVar.a;
        blf blfVar = new blf(bbaVar, i);
        this.h = new HashMap();
        this.f = i;
        Rational rational2 = ((double) i.getWidth()) / ((double) i.getHeight()) > e ? bhn.c : bhn.a;
        avw.a("ResolutionsMerger", a.k(rational2, i, "The closer aspect ratio to the sensor size (", ") is ", "."));
        this.a = rational2;
        if (rational2.equals(bhn.a)) {
            rational = bhn.c;
        } else {
            if (!rational2.equals(bhn.c)) {
                Objects.toString(rational2);
                throw new IllegalArgumentException("Invalid sensor aspect-ratio: ".concat(String.valueOf(rational2)));
            }
            rational = bhn.a;
        }
        this.b = rational;
        this.d = bbaVar;
        this.c = set;
        this.g = blfVar;
    }

    public static float a(Rational rational, Rational rational2) {
        float floatValue = rational.floatValue();
        float floatValue2 = rational2.floatValue();
        return floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
    }

    static Rect b(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational i = i(size2);
        float width = size.getWidth();
        float height = size.getHeight();
        Rational i2 = i(size);
        if (i.floatValue() == i2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (i.floatValue() > i2.floatValue()) {
                float floatValue = width / i.floatValue();
                float f = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f, width, floatValue + f);
            } else {
                float floatValue2 = i.floatValue() * height;
                float f2 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f2, 0.0f, floatValue2 + f2, height);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    static Rect c(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    static boolean h(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static Rational i(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational j(Size size) {
        return bhn.a(size, bhn.a) ? bhn.a : bhn.a(size, bhn.c) ? bhn.c : i(size);
    }

    private final boolean k(Rational rational, Size size) {
        if (!this.a.equals(rational) && !bhn.a(size, rational)) {
            float floatValue = this.a.floatValue();
            float floatValue2 = rational.floatValue();
            float floatValue3 = j(size).floatValue();
            if (floatValue != floatValue2 && floatValue2 != floatValue3) {
                if (floatValue > floatValue2) {
                    if (floatValue2 < floatValue3) {
                        return true;
                    }
                } else if (floatValue2 > floatValue3) {
                    return true;
                }
            }
        }
        return false;
    }

    final bpa d(bhh bhhVar, Rect rect, int i, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair create;
        if (bix.n(i)) {
            rect = c(rect);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            Size i2 = bix.i(rect);
            Iterator it = e(bhhVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    create = Pair.create(i2, i2);
                    break;
                }
                Size size3 = (Size) it.next();
                Size i3 = bix.i(b(size3, i2));
                if (!h(i3, i2)) {
                    create = Pair.create(size3, i3);
                    break;
                }
            }
            size = (Size) create.first;
            size2 = (Size) create.second;
        } else {
            Size i4 = bix.i(rect);
            List e2 = e(bhhVar);
            Iterator it2 = e2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = e2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = i4;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!h(size, i4)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    if (!k(j(i4), size4) && !h(size4, i4)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = b(i4, size);
            size2 = size;
        }
        bpa bpaVar = new bpa(rect, size2, size);
        if (!z2) {
            return bpaVar;
        }
        Rect rect2 = bpaVar.a;
        Size size5 = bpaVar.b;
        return new bpa(c(rect2), bix.j(size5), bpaVar.c);
    }

    public final List e(bhh bhhVar) {
        Rational rational;
        if (!this.c.contains(bhhVar)) {
            Objects.toString(bhhVar);
            throw new IllegalArgumentException("Invalid child config: ".concat(String.valueOf(bhhVar)));
        }
        if (this.h.containsKey(bhhVar)) {
            List list = (List) this.h.get(bhhVar);
            list.getClass();
            return list;
        }
        List<Size> c = this.g.c(bhhVar);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : c) {
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it.next();
                if (bhn.a(size, rational)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) hashMap.get(rational);
                size2.getClass();
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = i(size);
            }
            arrayList.add(size);
            hashMap.put(rational, size);
        }
        this.h.put(bhhVar, arrayList);
        return arrayList;
    }

    public final List f(List list, boolean z) {
        int i;
        List list2;
        HashMap hashMap = new HashMap();
        hashMap.put(bhn.a, new ArrayList());
        hashMap.put(bhn.c, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(bhn.a);
        arrayList.add(bhn.c);
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                int size2 = arrayList.size();
                while (true) {
                    if (i >= size2) {
                        list2 = null;
                        break;
                    }
                    Rational rational = (Rational) arrayList.get(i);
                    i++;
                    if (bhn.a(size, rational)) {
                        list2 = (List) hashMap.get(rational);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational i2 = i(size);
                    arrayList.add(i2);
                    hashMap.put(i2, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new bpb(i(this.f)));
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        while (i < size3) {
            Rational rational2 = (Rational) arrayList2.get(i);
            if (!rational2.equals(bhn.c) && !rational2.equals(bhn.a)) {
                List list3 = (List) hashMap.get(rational2);
                list3.getClass();
                arrayList3.addAll(g(rational2, list3, z));
            }
            i++;
        }
        return arrayList3;
    }

    public final List g(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (bhn.a(size, rational)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new bhu(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            List<Size> e2 = e((bhh) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : e2) {
                    if (!k(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                e2 = arrayList3;
            }
            if (e2.isEmpty()) {
                return new ArrayList();
            }
            if (e2.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = e2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!h((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (e2.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = e2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (h((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
