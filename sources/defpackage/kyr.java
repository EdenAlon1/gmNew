package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kyr implements Runnable {
    final /* synthetic */ kys a;

    public kyr(kys kysVar) {
        this.a = kysVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kys kysVar = this.a;
        if (kysVar.e) {
            if (kysVar.c) {
                kysVar.c = false;
                kyq kyqVar = kysVar.a;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                kyqVar.e = currentAnimationTimeMillis;
                kyqVar.g = -1L;
                kyqVar.f = currentAnimationTimeMillis;
                kyqVar.h = 0.5f;
            }
            kyq kyqVar2 = this.a.a;
            if ((kyqVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > kyqVar2.g + kyqVar2.i) || !this.a.c()) {
                this.a.e = false;
                return;
            }
            kys kysVar2 = this.a;
            if (kysVar2.d) {
                kysVar2.d = false;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                kysVar2.b.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (kyqVar2.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float a = kyqVar2.a(currentAnimationTimeMillis2);
            long j = currentAnimationTimeMillis2 - kyqVar2.f;
            kyqVar2.f = currentAnimationTimeMillis2;
            this.a.d((int) (j * (((-4.0f) * a * a) + (a * 4.0f)) * kyqVar2.d));
            kys kysVar3 = this.a;
            int[] iArr = kvo.a;
            kysVar3.b.postOnAnimation(this);
        }
    }
}
