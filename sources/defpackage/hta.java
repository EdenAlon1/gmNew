package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hta {
    public final ffji a;
    public Object b;
    public cog c;
    public int d = -1;
    public final cop e;
    public final cop f;
    public final coq g;
    public final hne h;
    public final hgm i;
    public int j;
    public final cop k;
    public final HashMap l;

    public hta(ffji ffjiVar) {
        this.a = ffjiVar;
        long[] jArr = cpg.a;
        this.e = new cop((byte[]) null);
        this.f = new cop((byte[]) null);
        this.g = new coq((byte[]) null);
        this.h = new hne(new hgl[16]);
        this.i = new hsz(this);
        this.k = new cop((byte[]) null);
        this.l = new HashMap();
    }

    public final void a(Object obj, int i, Object obj2, cog cogVar) {
        int i2;
        if (this.j > 0) {
            return;
        }
        int d = cogVar.d(obj, i);
        if ((obj instanceof hgl) && d != i) {
            hgi f = ((hgl) obj).f();
            this.l.put(obj, f.e);
            cov covVar = f.d;
            cop copVar = this.k;
            hni.b(copVar, obj);
            Object[] objArr = covVar.b;
            long[] jArr = covVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = ~(i3 - length);
                        int i5 = 0;
                        while (true) {
                            i2 = 8 - (i4 >>> 31);
                            if (i5 >= i2) {
                                break;
                            }
                            if ((j & 255) < 128) {
                                htm htmVar = (htm) objArr[(i3 << 3) + i5];
                                if (htmVar instanceof htn) {
                                    ((htn) htmVar).j(2);
                                }
                                hni.a(copVar, htmVar, obj);
                            }
                            j >>= 8;
                            i5++;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (d == -1) {
            if (obj instanceof htn) {
                ((htn) obj).j(2);
            }
            hni.a(this.e, obj, obj2);
        }
    }

    public final void b(Object obj, Object obj2) {
        hni.c(this.e, obj2, obj);
        if (!(obj2 instanceof hgl) || this.e.h(obj2)) {
            return;
        }
        hni.b(this.k, obj2);
        this.l.remove(obj2);
    }

    public final boolean c() {
        return this.f.k();
    }
}
