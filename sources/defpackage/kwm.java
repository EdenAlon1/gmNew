package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwm implements View.OnApplyWindowInsetsListener {
    final kwi a;
    private kxh b;

    public kwm(View view, kwi kwiVar) {
        kxh kxhVar;
        this.a = kwiVar;
        int[] iArr = kvo.a;
        kxh a = kve.a(view);
        if (a != null) {
            kxhVar = (Build.VERSION.SDK_INT >= 34 ? new kwv(a) : Build.VERSION.SDK_INT >= 30 ? new kwu(a) : Build.VERSION.SDK_INT >= 29 ? new kwt(a) : new kws(a)).a();
        } else {
            kxhVar = null;
        }
        this.b = kxhVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = kxh.p(windowInsets, view);
            return kwn.a(view, windowInsets);
        }
        kxh p = kxh.p(windowInsets, view);
        if (this.b == null) {
            int[] iArr = kvo.a;
            this.b = kve.a(view);
        }
        if (this.b == null) {
            this.b = p;
            return kwn.a(view, windowInsets);
        }
        kwi b = kwn.b(view);
        if (b != null && Objects.equals(b.b, p)) {
            return kwn.a(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        kxh kxhVar = this.b;
        for (int i = 1; i <= 512; i += i) {
            kpt f = p.f(i);
            kpt f2 = kxhVar.f(i);
            int i2 = f.b;
            int i3 = f2.b;
            boolean z = i2 > i3 || f.c > f2.c || f.d > f2.d || f.e > f2.e;
            if (z != (i2 < i3 || f.c < f2.c || f.d < f2.d || f.e < f2.e)) {
                if (z) {
                    iArr2[0] = iArr2[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
        }
        int i4 = iArr2[0];
        int i5 = iArr3[0];
        int i6 = i4 | i5;
        if (i6 == 0) {
            this.b = p;
            return kwn.a(view, windowInsets);
        }
        kxh kxhVar2 = this.b;
        kwr kwrVar = new kwr(i6, (i4 & 8) != 0 ? kwn.a : (i5 & 8) != 0 ? kwn.b : (i4 & 519) != 0 ? kwn.c : (i5 & 519) != 0 ? kwn.d : null, (i6 & 8) != 0 ? 160L : 250L);
        kwrVar.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(kwrVar.b());
        kpt f3 = p.f(i6);
        kpt f4 = kxhVar2.f(i6);
        kwh kwhVar = new kwh(kpt.d(Math.min(f3.b, f4.b), Math.min(f3.c, f4.c), Math.min(f3.d, f4.d), Math.min(f3.e, f4.e)), kpt.d(Math.max(f3.b, f4.b), Math.max(f3.c, f4.c), Math.max(f3.d, f4.d), Math.max(f3.e, f4.e)));
        kwn.d(view, kwrVar, p, false);
        duration.addUpdateListener(new kwj(kwrVar, p, kxhVar2, i6, view));
        duration.addListener(new kwk(kwrVar, view));
        kug.b(view, new kwl(view, kwrVar, kwhVar, duration));
        this.b = p;
        return kwn.a(view, windowInsets);
    }
}
