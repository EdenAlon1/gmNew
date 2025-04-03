package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brn {
    public static final /* synthetic */ int a = 0;
    private static final Map b;
    private static final Map c;
    private final Map d = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(brk.e, Range.create(2160, 4319));
        hashMap.put(brk.d, Range.create(1080, 1439));
        hashMap.put(brk.c, Range.create(720, 1079));
        hashMap.put(brk.b, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        hashMap2.put(0, bhn.a);
        hashMap2.put(1, bhn.c);
    }

    public brn(List list, Map map) {
        Integer num;
        brk brkVar;
        for (brk brkVar2 : b.keySet()) {
            this.d.put(new bqp(brkVar2, -1), new ArrayList());
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                this.d.put(new bqp(brkVar2, ((Integer) it.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List a2 = a((brk) entry.getKey(), -1);
            a2.getClass();
            a2.add((Size) entry.getValue());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            Iterator it3 = b.entrySet().iterator();
            while (true) {
                num = null;
                if (!it3.hasNext()) {
                    brkVar = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    brkVar = (brk) entry2.getKey();
                    break;
                }
            }
            if (brkVar != null) {
                Iterator it4 = c.entrySet().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it4.next();
                    if (bhn.b(size, (Rational) entry3.getValue(), blz.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List a3 = a(brkVar, num.intValue());
                    a3.getClass();
                    a3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.d.entrySet()) {
            Size size2 = (Size) map.get(((brm) entry4.getKey()).b());
            if (size2 != null) {
                final int a4 = blz.a(size2);
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: brl
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int i = brn.a;
                        int a5 = blz.a((Size) obj);
                        int i2 = a4;
                        return Math.abs(a5 - i2) - Math.abs(blz.a((Size) obj2) - i2);
                    }
                });
            }
        }
    }

    public final List a(brk brkVar, int i) {
        return (List) this.d.get(new bqp(brkVar, i));
    }
}
