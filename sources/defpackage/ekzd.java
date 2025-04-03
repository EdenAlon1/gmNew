package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzd {
    public final eldq a;
    private final int[] c;
    private final long[] d;
    private final List e;
    private int b = 4;
    private final Map f = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public ekzd(eldq eldqVar, List list) {
        int a;
        int[] iArr = new int[eldqVar.e.size()];
        this.c = iArr;
        this.d = new long[eldqVar.e.size() + 3];
        Arrays.fill(iArr, -1);
        this.a = eldqVar;
        this.e = list;
        for (ekzx ekzxVar : eldqVar.e) {
            int i = ekzxVar.e;
            Map map = this.f;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                this.f.put(valueOf, new ArrayList());
            }
            if (i != -1 && ekzxVar.m && (a = ekzw.a(ekzxVar.l)) != 0 && a == 2) {
                ekzx ekzxVar2 = (ekzx) eldqVar.e.get(i);
                ((ArrayList) this.f.get(valueOf)).add(new ekzc(ekze.c(ekzxVar2), ekze.b(ekzxVar2)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(ekzx ekzxVar) {
        int i;
        int i2;
        int i3;
        int a;
        int[] iArr = this.c;
        int i4 = ekzxVar.d;
        int i5 = iArr[i4];
        if (i5 != -1) {
            return i5;
        }
        String d = ekze.d(ekzxVar, this.e);
        if (d.equals("Root")) {
            this.c[i4] = 3;
            return 3;
        }
        if (d.equals("Test Root")) {
            this.c[i4] = 2;
            return 2;
        }
        if (ekzxVar.k) {
            this.c[i4] = 1;
            return 1;
        }
        int i6 = ekzxVar.e;
        int i7 = this.c[i6];
        long c = ekze.c(ekzxVar);
        long b = ekze.b(ekzxVar);
        if (i7 == 2 || i7 == 3) {
            i = i6;
            i2 = i4;
            i3 = 1;
        } else {
            if (ekzxVar.m && (a = ekzw.a(ekzxVar.l)) != 0 && a == 2) {
                this.c[i4] = i7;
                return i7;
            }
            ekzx ekzxVar2 = (ekzx) this.a.e.get(i6);
            long c2 = ekze.c(ekzxVar2);
            long b2 = ekze.b(ekzxVar2);
            ekzc ekzcVar = new ekzc(c, b);
            i3 = 1;
            Iterator it = ((List) this.f.get(Integer.valueOf(i6))).iterator();
            while (true) {
                if (it.hasNext()) {
                    ekzc ekzcVar2 = (ekzc) it.next();
                    i = i6;
                    i2 = i4;
                    if (ekzcVar.a >= ekzcVar2.b) {
                        i4 = i2;
                        i6 = i;
                    } else {
                        if (ekzcVar.b > ekzcVar2.a) {
                            break;
                        }
                        i4 = i2;
                        i6 = i;
                    }
                } else {
                    i = i6;
                    i2 = i4;
                    if (b2 >= b && c2 <= c) {
                        this.c[i2] = i7;
                        ((ArrayList) this.f.get(Integer.valueOf(i))).add(new ekzc(c, b));
                        return i7;
                    }
                }
            }
        }
        int i8 = this.c[i] + 1;
        while (true) {
            int i9 = this.b;
            if (i8 >= i9) {
                this.c[i2] = i9;
                this.d[i9] = b;
                this.b = i9 + 1;
                return i9;
            }
            if (i8 != 3 && i8 != 2 && i8 != i3) {
                long[] jArr = this.d;
                if (c > jArr[i8]) {
                    this.c[i2] = i8;
                    jArr[i8] = b;
                    return i8;
                }
            }
            i8++;
            i3 = 1;
        }
    }
}
