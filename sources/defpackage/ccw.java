package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccw implements SurfaceHolder.Callback {
    public Size a;
    public axt b;
    public boolean c = false;
    public boolean d = false;
    final /* synthetic */ ccx e;
    public ccc f;
    private axt g;
    private Size h;

    public ccw(ccx ccxVar) {
        this.e = ccxVar;
    }

    public final void a() {
        if (this.b != null) {
            axt axtVar = this.b;
            Objects.toString(axtVar);
            avw.a("SurfaceViewImpl", "Request canceled: ".concat(String.valueOf(axtVar)));
            this.b.f();
        }
    }

    public final boolean b() {
        Surface surface = this.e.d.getHolder().getSurface();
        if (this.c || this.b == null || !j$.util.Objects.equals(this.a, this.h)) {
            return false;
        }
        avw.a("SurfaceViewImpl", "Surface set on Preview.");
        final ccc cccVar = this.f;
        axt axtVar = this.b;
        axtVar.getClass();
        axtVar.b(surface, koa.e(this.e.d.getContext()), new ksp() { // from class: ccv
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                avw.a("SurfaceViewImpl", "Safe to release surface.");
                ccc cccVar2 = ccc.this;
                if (cccVar2 != null) {
                    cccVar2.a();
                }
            }
        });
        this.c = true;
        this.e.f();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        avw.a("SurfaceViewImpl", a.r(i3, i2, "Surface changed. Size: ", "x"));
        this.h = new Size(i2, i3);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        axt axtVar;
        avw.a("SurfaceViewImpl", "Surface created.");
        if (!this.d || (axtVar = this.g) == null) {
            return;
        }
        axtVar.e();
        this.g = null;
        this.d = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        avw.a("SurfaceViewImpl", "Surface destroyed.");
        if (!this.c) {
            a();
        } else if (this.b != null) {
            axt axtVar = this.b;
            Objects.toString(axtVar);
            avw.a("SurfaceViewImpl", "Surface closed ".concat(String.valueOf(axtVar)));
            this.b.i.d();
        }
        this.d = true;
        axt axtVar2 = this.b;
        if (axtVar2 != null) {
            this.g = axtVar2;
        }
        this.c = false;
        this.b = null;
        this.f = null;
        this.h = null;
        this.a = null;
    }
}
