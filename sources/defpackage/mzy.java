package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzy {
    private final mzx c;
    private final nac d;
    private final long e;
    private boolean f;
    private long h;
    private boolean k;
    public int a = 0;
    private long g = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private long j = -9223372036854775807L;
    private float l = 1.0f;
    public ltn b = ltn.a;

    public mzy(Context context, mzx mzxVar, long j) {
        this.c = mzxVar;
        this.e = j;
        this.d = new nac(context);
    }

    private final void o(int i) {
        this.a = Math.min(this.a, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0105, code lost:
    
        if (r11 > 100000) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0112, code lost:
    
        if (r29 >= r33) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0119, code lost:
    
        if (r26.f != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0073, code lost:
    
        if (r7.c[defpackage.mys.a(r11 - 1)] == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0259 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, defpackage.mzw r36) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzy.a(long, long, long, long, boolean, mzw):int");
    }

    public final void b() {
        if (this.a == 0) {
            this.a = 1;
        }
    }

    public final void c(boolean z) {
        this.k = z;
        long j = this.e;
        this.j = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
    }

    public final void d() {
        o(0);
    }

    public final void e() {
        o(2);
    }

    public final void f() {
        this.f = true;
        this.h = lvf.u(SystemClock.elapsedRealtime());
        nac nacVar = this.d;
        nacVar.d = true;
        nacVar.b();
        if (nacVar.b != null) {
            nab nabVar = nacVar.c;
            lti.f(nabVar);
            nabVar.c.sendEmptyMessage(2);
            naa naaVar = nacVar.b;
            naaVar.a.registerDisplayListener(naaVar, lvf.C());
            naaVar.b.c(naaVar.a());
        }
        nacVar.e(false);
    }

    public final void g() {
        this.f = false;
        this.j = -9223372036854775807L;
        nac nacVar = this.d;
        nacVar.d = false;
        naa naaVar = nacVar.b;
        if (naaVar != null) {
            naaVar.a.unregisterDisplayListener(naaVar);
            nab nabVar = nacVar.c;
            lti.f(nabVar);
            nabVar.c.sendEmptyMessage(3);
        }
        nacVar.a();
    }

    public final void h() {
        this.d.b();
        this.i = -9223372036854775807L;
        this.g = -9223372036854775807L;
        o(1);
        this.j = -9223372036854775807L;
    }

    public final void i(int i) {
        nac nacVar = this.d;
        if (nacVar.h == i) {
            return;
        }
        nacVar.h = i;
        nacVar.e(true);
    }

    public final void j(float f) {
        nac nacVar = this.d;
        nacVar.f = f;
        myt mytVar = nacVar.a;
        mytVar.a.d();
        mytVar.b.d();
        mytVar.c = false;
        mytVar.d = -9223372036854775807L;
        mytVar.e = 0;
        nacVar.d();
    }

    public final void k(Surface surface) {
        nac nacVar = this.d;
        if (nacVar.e != surface) {
            nacVar.a();
            nacVar.e = surface;
            nacVar.e(true);
        }
        o(1);
    }

    public final void l(float f) {
        lti.a(f > 0.0f);
        if (f == this.l) {
            return;
        }
        this.l = f;
        nac nacVar = this.d;
        nacVar.g = f;
        nacVar.b();
        nacVar.e(false);
    }

    public final boolean m(boolean z) {
        if (!z || this.a != 3) {
            if (this.j == -9223372036854775807L) {
                return false;
            }
            r0 = SystemClock.elapsedRealtime() < this.j;
            return r0;
        }
        this.j = -9223372036854775807L;
        return r0;
    }

    public final boolean n() {
        int i = this.a;
        this.a = 3;
        this.h = lvf.u(SystemClock.elapsedRealtime());
        return i != 3;
    }
}
