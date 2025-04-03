package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class neu extends AbstractC0191new {
    public long a;
    public long[] b;
    public long[] c;

    public neu() {
        super(new nck());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }

    private static Double d(luv luvVar) {
        return Double.valueOf(Double.longBitsToDouble(luvVar.q()));
    }

    private static Object e(luv luvVar, int i) {
        if (i == 0) {
            return d(luvVar);
        }
        if (i == 1) {
            return Boolean.valueOf(luvVar.j() == 1);
        }
        if (i == 2) {
            return f(luvVar);
        }
        if (i != 3) {
            if (i == 8) {
                return g(luvVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) d(luvVar).doubleValue());
                luvVar.L(2);
                return date;
            }
            int m = luvVar.m();
            ArrayList arrayList = new ArrayList(m);
            for (int i2 = 0; i2 < m; i2++) {
                Object e = e(luvVar, luvVar.j());
                if (e != null) {
                    arrayList.add(e);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String f = f(luvVar);
            int j = luvVar.j();
            if (j == 9) {
                return hashMap;
            }
            Object e2 = e(luvVar, j);
            if (e2 != null) {
                hashMap.put(f, e2);
            }
        }
    }

    private static String f(luv luvVar) {
        int n = luvVar.n();
        int i = luvVar.b;
        luvVar.L(n);
        return new String(luvVar.a, i, n);
    }

    private static HashMap g(luv luvVar) {
        int m = luvVar.m();
        HashMap hashMap = new HashMap(m);
        for (int i = 0; i < m; i++) {
            String f = f(luvVar);
            Object e = e(luvVar, luvVar.j());
            if (e != null) {
                hashMap.put(f, e);
            }
        }
        return hashMap;
    }

    @Override // defpackage.AbstractC0191new
    protected final boolean a(luv luvVar) {
        return true;
    }

    @Override // defpackage.AbstractC0191new
    protected final boolean b(luv luvVar, long j) {
        if (luvVar.j() == 2 && "onMetaData".equals(f(luvVar)) && luvVar.b() != 0 && luvVar.j() == 8) {
            HashMap g = g(luvVar);
            Object obj = g.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > eobe.a) {
                    this.a = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = g.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.b = new long[size];
                    this.c = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.b = new long[0];
                            this.c = new long[0];
                            break;
                        }
                        this.b[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.c[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }
}
