package defpackage;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eho implements Runnable, Choreographer.FrameCallback, elx, hjk {
    public static long a;
    private final View b;
    private boolean d;
    private boolean f;
    private long g;
    private final hne c = new hne(new elw[16]);
    private final Choreographer e = Choreographer.getInstance();

    public eho(View view) {
        this.b = view;
        if (a == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            a = (long) (1.0E9f / f);
        }
    }

    @Override // defpackage.elx
    public final void a(elw elwVar) {
        this.c.n(elwVar);
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.g = j;
            this.b.post(this);
        }
    }

    @Override // defpackage.hjk
    public final void h() {
        this.f = false;
        this.b.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // defpackage.hjk
    public final void i() {
        this.f = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.b == 0 || !this.d || !this.f || this.b.getWindowVisibility() != 0) {
            this.d = false;
            return;
        }
        ehn ehnVar = new ehn(Math.max(this.g, TimeUnit.MILLISECONDS.toNanos(this.b.getDrawingTime())) + a);
        boolean z = false;
        while (true) {
            if (this.c.b != 0) {
                if (z) {
                    break;
                }
                if (ehnVar.a() <= 0 || ((elw) this.c.a[0]).c(ehnVar)) {
                    z = true;
                } else {
                    this.c.c(0);
                }
            } else if (!z) {
                this.d = false;
                return;
            }
        }
        this.e.postFrameCallback(this);
    }

    @Override // defpackage.hjk
    public final void g() {
    }
}
