package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldy {
    private static final ThreadLocal j = new ThreadLocal();
    public final cpn a = new cpn();
    final ArrayList b = new ArrayList();
    public final lds c = new lds(this);
    public final Runnable d = new Runnable() { // from class: ldr
        @Override // java.lang.Runnable
        public final void run() {
            lds ldsVar = ldy.this.c;
            ldsVar.a.e = SystemClock.uptimeMillis();
            ldy ldyVar = ldsVar.a;
            long j2 = ldyVar.e;
            long uptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < ldyVar.b.size(); i++) {
                ldt ldtVar = (ldt) ldyVar.b.get(i);
                if (ldtVar != null) {
                    Long l = (Long) ldyVar.a.get(ldtVar);
                    if (l != null) {
                        if (l.longValue() < uptimeMillis) {
                            ldyVar.a.remove(ldtVar);
                        }
                    }
                    ldtVar.a(j2);
                }
            }
            if (ldyVar.f) {
                int size = ldyVar.b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (ldyVar.b.get(size) == null) {
                        ldyVar.b.remove(size);
                    }
                }
                if (ldyVar.b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                    ldv ldvVar = ldyVar.i;
                    ValueAnimator.unregisterDurationScaleChangeListener(ldvVar.a);
                    ldvVar.a = null;
                }
                ldyVar.f = false;
            }
            if (ldsVar.a.b.size() > 0) {
                ldy ldyVar2 = ldsVar.a;
                ldyVar2.h.a(ldyVar2.d);
            }
        }
    };
    long e = 0;
    public boolean f = false;
    public float g = 1.0f;
    public final ldx h;
    public ldv i;

    public ldy(ldx ldxVar) {
        this.h = ldxVar;
    }

    static ldy a() {
        ThreadLocal threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new ldy(new ldx()));
        }
        return (ldy) threadLocal.get();
    }

    final boolean b() {
        return Thread.currentThread() == this.h.a.getThread();
    }
}
