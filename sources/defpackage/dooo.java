package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dooo {
    public final long a;
    public final List b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;

    public dooo(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.a = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.b = ffdx.g(new ibw(j), new ibw(j2), new ibw(j3), new ibw(j4), new ibw(j5), new ibw(j6), new ibw(j7));
        ffca.a(new ffix() { // from class: doon
            @Override // defpackage.ffix
            public final Object invoke() {
                List list = dooo.this.b;
                float[] fArr = new float[3];
                ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Color.colorToHSV(iby.b(((ibw) it.next()).i), fArr);
                    arrayList.add(Float.valueOf(fArr[0]));
                }
                return ffdx.aw(arrayList);
            }
        });
    }

    public final long a(String str) {
        int hashCode = str.hashCode();
        int size = this.b.size();
        int i = hashCode % size;
        return ((ibw) this.b.get(i + (size & (((i ^ size) & ((-i) | i)) >> 31)))).i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dooo)) {
            return false;
        }
        dooo doooVar = (dooo) obj;
        long j = this.c;
        long j2 = doooVar.c;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.d, doooVar.d) && ffcp.a(this.e, doooVar.e) && ffcp.a(this.a, doooVar.a) && ffcp.a(this.f, doooVar.f) && ffcp.a(this.g, doooVar.g) && ffcp.a(this.h, doooVar.h);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.c);
        long j2 = this.h;
        long j3 = this.g;
        long j4 = this.f;
        long j5 = this.a;
        return (((((((((((a * 31) + ffco.a(this.d)) * 31) + ffco.a(this.e)) * 31) + ffco.a(j5)) * 31) + ffco.a(j4)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }

    public final String toString() {
        long j = this.h;
        long j2 = this.g;
        long j3 = this.f;
        long j4 = this.a;
        long j5 = this.e;
        long j6 = this.d;
        return "AbcMonogramColors(red=" + ibw.g(this.c) + ", yellow=" + ibw.g(j6) + ", purple=" + ibw.g(j5) + ", orange=" + ibw.g(j4) + ", green=" + ibw.g(j3) + ", pink=" + ibw.g(j2) + ", cyan=" + ibw.g(j) + ")";
    }
}
