package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anw {
    public final agj a;
    public final Executor b;
    public final anx c;
    public final llg d;
    final anv e;
    public boolean f = false;
    private final agi g;

    public anw(agj agjVar, apd apdVar, Executor executor) {
        anu anuVar = new anu(this);
        this.g = anuVar;
        this.a = agjVar;
        this.b = executor;
        anv a = a(apdVar);
        this.e = a;
        anx anxVar = new anx(a.a(), a.b());
        this.c = anxVar;
        anxVar.d(1.0f);
        this.d = new llg(blb.e(anxVar));
        agjVar.o(anuVar);
    }

    public static anv a(apd apdVar) {
        return (Build.VERSION.SDK_INT < 30 || d(apdVar) == null) ? new akz(apdVar) : new afn(apdVar);
    }

    private static Range d(apd apdVar) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) apdVar.c(key);
        } catch (AssertionError e) {
            avw.g("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    public final void b(kfb kfbVar, axz axzVar) {
        axz e;
        if (this.f) {
            this.e.g(((bkt) axzVar).a, kfbVar);
            this.a.d();
            return;
        }
        synchronized (this.c) {
            this.c.d(1.0f);
            e = blb.e(this.c);
        }
        c(e);
        kfbVar.c(new atb("Camera is not active."));
    }

    public final void c(axz axzVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.d.m(axzVar);
        } else {
            this.d.j(axzVar);
        }
    }
}
