package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgct extends fgdv implements fgcl, ffxx, fgfd {
    public Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public fgct(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    private final int c() {
        return (int) ((f() + this.h) - this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x005f  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [ffxy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object g(defpackage.fgct r17, defpackage.ffxy r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgct.g(fgct, ffxy, ffgu):java.lang.Object");
    }

    private final int p() {
        return this.h + this.i;
    }

    private final long q() {
        return f() + this.h;
    }

    private final long r() {
        return f() + this.h + this.i;
    }

    private final long s(fgcv fgcvVar) {
        long j = fgcvVar.a;
        if (j >= q() && (this.g > 0 || j > f() || this.i == 0)) {
            return -1L;
        }
        return j;
    }

    private final void t() {
        fgdx[] fgdxVarArr;
        Object[] objArr = this.a;
        objArr.getClass();
        fgcu.b(objArr, f(), null);
        this.h--;
        long f = f() + 1;
        if (this.b < f) {
            this.b = f;
        }
        if (this.c < f) {
            if (this.e != 0 && (fgdxVarArr = this.d) != null) {
                for (fgdx fgdxVar : fgdxVarArr) {
                    if (fgdxVar != null) {
                        fgcv fgcvVar = (fgcv) fgdxVar;
                        long j = fgcvVar.a;
                        if (j >= 0 && j < f) {
                            fgcvVar.a = f;
                        }
                    }
                }
            }
            this.c = f;
        }
        boolean z = ffso.a;
    }

    private final void u(Object obj) {
        int p = p();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = x(null, 0, 2);
        } else {
            int length = objArr.length;
            if (p >= length) {
                objArr = x(objArr, p, length + length);
            }
        }
        fgcu.b(objArr, f() + p, obj);
    }

    private final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        boolean z = ffso.a;
        for (long f = f(); f < min; f++) {
            Object[] objArr = this.a;
            objArr.getClass();
            fgcu.b(objArr, f, null);
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - min);
        this.i = (int) (j4 - j3);
    }

    private final boolean w(Object obj) {
        if (this.e == 0) {
            boolean z = ffso.a;
            if (this.f != 0) {
                u(obj);
                int i = this.h + 1;
                this.h = i;
                if (i > this.f) {
                    t();
                }
                this.c = f() + this.h;
            }
            return true;
        }
        if (this.h >= this.g && this.c <= this.b) {
            int i2 = this.j;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                return false;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    return true;
                }
                throw new ffcd();
            }
        }
        u(obj);
        int i4 = this.h + 1;
        this.h = i4;
        if (i4 > this.g) {
            t();
        }
        if (c() > this.f) {
            v(this.b + 1, this.c, q(), r());
        }
        return true;
    }

    private final Object[] x(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.a = objArr2;
        if (objArr != null) {
            long f = f();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + f;
                fgcu.b(objArr2, j, fgcu.a(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.lang.Object[]] */
    private final ffgu[] y(ffgu[] ffguVarArr) {
        fgdx[] fgdxVarArr;
        fgcv fgcvVar;
        ffgu ffguVar;
        if (this.e != 0 && (fgdxVarArr = this.d) != null) {
            int length = ffguVarArr.length;
            int i = 0;
            ffguVarArr = ffguVarArr;
            while (i < fgdxVarArr.length) {
                fgdx fgdxVar = fgdxVarArr[i];
                if (fgdxVar != null && (ffguVar = (fgcvVar = (fgcv) fgdxVar).b) != null && s(fgcvVar) >= 0) {
                    int length2 = ffguVarArr.length;
                    ffguVarArr = ffguVarArr;
                    if (length >= length2) {
                        ?? copyOf = Arrays.copyOf(ffguVarArr, Math.max(2, length2 + length2));
                        copyOf.getClass();
                        ffguVarArr = copyOf;
                    }
                    ffguVarArr[length] = ffguVar;
                    fgcvVar.b = null;
                    length++;
                }
                i++;
                ffguVarArr = ffguVarArr;
            }
        }
        return ffguVarArr;
    }

    @Override // defpackage.fgcq, defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        return g(this, ffxyVar, ffguVar);
    }

    @Override // defpackage.fgcq
    public final List d() {
        synchronized (this) {
            int c = c();
            if (c == 0) {
                return ffel.a;
            }
            ArrayList arrayList = new ArrayList(c);
            Object[] objArr = this.a;
            objArr.getClass();
            for (int i = 0; i < c; i++) {
                arrayList.add(fgcu.a(objArr, this.b + i));
            }
            return arrayList;
        }
    }

    @Override // defpackage.fgcl
    public final void e() {
        synchronized (this) {
            try {
                try {
                    v(q(), this.c, q(), r());
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final long f() {
        return Math.min(this.c, this.b);
    }

    @Override // defpackage.fgcl, defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        Throwable th;
        ffgu[] y;
        fgcr fgcrVar;
        if (h(obj)) {
            return ffcu.a;
        }
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        ffgu[] ffguVarArr = fgdw.a;
        synchronized (this) {
            try {
                if (w(obj)) {
                    try {
                        ffrhVar.w(ffcu.a);
                        y = y(ffguVarArr);
                        fgcrVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        fgcrVar = new fgcr(this, f() + p(), obj, ffrhVar);
                        u(fgcrVar);
                        this.i++;
                        if (this.g == 0) {
                            ffguVarArr = y(ffguVarArr);
                        }
                        y = ffguVarArr;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (fgcrVar != null) {
                    ffrj.b(ffrhVar, fgcrVar);
                }
                for (ffgu ffguVar2 : y) {
                    if (ffguVar2 != null) {
                        ffguVar2.w(ffcu.a);
                    }
                }
                Object m = ffrhVar.m();
                ffhh ffhhVar = ffhh.a;
                if (m == ffhhVar) {
                    ffguVar.getClass();
                }
                if (m != ffhhVar) {
                    m = ffcu.a;
                }
                return m != ffhhVar ? ffcu.a : m;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // defpackage.fgcl
    public final boolean h(Object obj) {
        int i;
        boolean z;
        ffgu[] ffguVarArr = fgdw.a;
        synchronized (this) {
            if (w(obj)) {
                ffguVarArr = y(ffguVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (ffgu ffguVar : ffguVarArr) {
            if (ffguVar != null) {
                ffguVar.w(ffcu.a);
            }
        }
        return z;
    }

    protected final Object i() {
        Object[] objArr = this.a;
        objArr.getClass();
        return fgcu.a(objArr, (this.b + c()) - 1);
    }

    @Override // defpackage.fgfd
    public final ffxx ib(ffhd ffhdVar, int i, int i2) {
        return fgcu.c(this, ffhdVar, i, i2);
    }

    @Override // defpackage.fgdv
    public final /* synthetic */ fgdx j() {
        return new fgcv();
    }

    public final void k() {
        if (this.g != 0 || this.i > 1) {
            Object[] objArr = this.a;
            objArr.getClass();
            while (this.i > 0 && fgcu.a(objArr, (f() + p()) - 1) == fgcu.a) {
                this.i--;
                fgcu.b(objArr, f() + p(), null);
            }
        }
    }

    public final ffgu[] l(long j) {
        long j2;
        long j3;
        long j4;
        fgdx[] fgdxVarArr;
        boolean z = ffso.a;
        if (j <= this.c) {
            long f = f();
            long j5 = this.h + f;
            if (this.g == 0 && this.i > 0) {
                j5++;
            }
            int i = 0;
            if (this.e != 0 && (fgdxVarArr = this.d) != null) {
                for (fgdx fgdxVar : fgdxVarArr) {
                    if (fgdxVar != null) {
                        long j6 = ((fgcv) fgdxVar).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.c) {
                long q = q();
                int min = this.e > 0 ? Math.min(this.i, this.g - ((int) (q - j5))) : this.i;
                ffgu[] ffguVarArr = fgdw.a;
                long j7 = this.i + q;
                if (min > 0) {
                    ffguVarArr = new ffgu[min];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j4 = 1;
                    long j8 = q;
                    while (true) {
                        if (q >= j7) {
                            j2 = f;
                            j3 = j5;
                            q = j8;
                            break;
                        }
                        Object a = fgcu.a(objArr, q);
                        j2 = f;
                        fgho fghoVar = fgcu.a;
                        if (a != fghoVar) {
                            a.getClass();
                            int i2 = i + 1;
                            fgcr fgcrVar = (fgcr) a;
                            j3 = j5;
                            ffguVarArr[i] = fgcrVar.d;
                            fgcu.b(objArr, q, fghoVar);
                            fgcu.b(objArr, j8, fgcrVar.c);
                            long j9 = j8 + 1;
                            if (i2 >= min) {
                                q = j9;
                                break;
                            }
                            i = i2;
                            j8 = j9;
                        } else {
                            j3 = j5;
                        }
                        q++;
                        f = j2;
                        j5 = j3;
                    }
                } else {
                    j2 = f;
                    j3 = j5;
                    j4 = 1;
                }
                long j10 = q - j2;
                long j11 = this.e == 0 ? q : j3;
                long max = Math.max(this.b, q - Math.min(this.f, (int) j10));
                if (this.g == 0 && max < j7) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (ffkj.e(fgcu.a(objArr2, max), fgcu.a)) {
                        q += j4;
                        max += j4;
                    }
                }
                v(max, j11, q, j7);
                k();
                return ffguVarArr.length == 0 ? ffguVarArr : y(ffguVarArr);
            }
        }
        return fgdw.a;
    }

    @Override // defpackage.fgdv
    public final /* bridge */ /* synthetic */ fgdx[] m() {
        return new fgcv[2];
    }
}
