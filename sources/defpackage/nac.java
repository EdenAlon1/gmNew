package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nac {
    public final myt a = new myt();
    public final naa b;
    public final nab c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    private float p;
    private float q;

    public nac(Context context) {
        DisplayManager displayManager;
        naa naaVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new naa(this, displayManager);
        this.b = naaVar;
        this.c = naaVar != null ? nab.a : null;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.f = -1.0f;
        this.g = 1.0f;
        this.h = 0;
    }

    public final void a() {
        Surface surface;
        if (lvf.a < 30 || (surface = this.e) == null || this.h == Integer.MIN_VALUE || this.q == 0.0f) {
            return;
        }
        this.q = 0.0f;
        mzz.a(surface, 0.0f);
    }

    public final void b() {
        this.k = 0L;
        this.n = -1L;
        this.l = -1L;
    }

    public final void c(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.i = refreshRate;
            this.j = (refreshRate * 80) / 100;
        } else {
            luj.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.i = -9223372036854775807L;
            this.j = -9223372036854775807L;
        }
    }

    public final void d() {
        float f;
        if (lvf.a < 30 || this.e == null) {
            return;
        }
        if (this.a.a()) {
            f = this.a.a() ? (float) (1.0E9d / r0.a.b()) : -1.0f;
        } else {
            f = this.f;
        }
        float f2 = this.p;
        if (f != f2) {
            if (f != -1.0f && f2 != -1.0f) {
                float f3 = 1.0f;
                if (this.a.a()) {
                    myt mytVar = this.a;
                    if ((mytVar.a() ? mytVar.a.b : -9223372036854775807L) >= 5000000000L) {
                        f3 = 0.02f;
                    }
                }
                if (Math.abs(f - this.p) < f3) {
                    return;
                }
            } else if (f == -1.0f && this.a.e < 30) {
                return;
            }
            this.p = f;
            e(false);
        }
    }

    public final void e(boolean z) {
        Surface surface;
        if (lvf.a < 30 || (surface = this.e) == null || this.h == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.p;
            if (f2 != -1.0f) {
                f = this.g * f2;
            }
        }
        if (z || this.q != f) {
            this.q = f;
            mzz.a(surface, f);
        }
    }
}
