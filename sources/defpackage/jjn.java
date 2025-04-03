package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjn implements Iterable, jkv, fflg {
    public final cop a;
    public boolean b;
    public boolean c;
    private Map d;

    public jjn() {
        long[] jArr = cpg.a;
        this.a = new cop((byte[]) null);
    }

    public final jjn a() {
        int i;
        jjn jjnVar = new jjn();
        jjnVar.b = this.b;
        jjnVar.c = this.c;
        cop copVar = jjnVar.a;
        cop copVar2 = this.a;
        Object[] objArr = copVar2.b;
        Object[] objArr2 = copVar2.c;
        long[] jArr = copVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            copVar.e(objArr[i5], objArr2[i5]);
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return jjnVar;
    }

    public final Object b(jku jkuVar) {
        Object f = this.a.f(jkuVar);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException(a.i(jkuVar, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final Object c(jku jkuVar, ffix ffixVar) {
        Object f = this.a.f(jkuVar);
        return f == null ? ffixVar.invoke() : f;
    }

    public final void d(jjn jjnVar) {
        int i;
        cop copVar = jjnVar.a;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        jku jkuVar = (jku) obj;
                        Object f = this.a.f(jkuVar);
                        jkuVar.getClass();
                        Object a = jkuVar.b.a(f, obj2);
                        if (a != null) {
                            this.a.e(jkuVar, a);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.jkv
    public final void e(jku jkuVar, Object obj) {
        if (!(obj instanceof jjb) || !f(jkuVar)) {
            this.a.e(jkuVar, obj);
            return;
        }
        Object f = this.a.f(jkuVar);
        f.getClass();
        cop copVar = this.a;
        jjb jjbVar = (jjb) f;
        jjb jjbVar2 = (jjb) obj;
        String str = jjbVar2.a;
        if (str == null) {
            str = jjbVar.a;
        }
        ffbv ffbvVar = jjbVar2.b;
        if (ffbvVar == null) {
            ffbvVar = jjbVar.b;
        }
        copVar.e(jkuVar, new jjb(str, ffbvVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjn)) {
            return false;
        }
        jjn jjnVar = (jjn) obj;
        return ffkj.e(this.a, jjnVar.a) && this.b == jjnVar.b && this.c == jjnVar.c;
    }

    public final boolean f(jku jkuVar) {
        return this.a.h(jkuVar);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + jjm.a(this.b)) * 31) + jjm.a(this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<jku<?>, Object>> iterator() {
        Map map = this.d;
        if (map == null) {
            cns cnsVar = new cns(this.a);
            this.d = cnsVar;
            map = cnsVar;
        }
        return map.entrySet().iterator();
    }

    public final String toString() {
        String str;
        int i;
        StringBuilder sb = new StringBuilder();
        if (this.b) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        cop copVar = this.a;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            sb.append(str);
                            sb.append(((jku) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return jew.a(this) + "{ " + ((Object) sb) + " }";
    }
}
