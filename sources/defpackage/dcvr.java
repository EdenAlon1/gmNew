package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcvr {
    public final Context a;
    public final cqoh b;
    public final Vibrator c;
    public final LottieAnimationView d;
    public Rect e;
    public final eeqb j;
    public long f = Long.MAX_VALUE;
    public int h = R.fraction.invisible_progress;
    public int i = R.fraction.invisible_progress;
    public boolean g = false;

    public dcvr(Context context, cqoh cqohVar, Vibrator vibrator, LottieAnimationView lottieAnimationView, eeqb eeqbVar) {
        this.a = context;
        this.b = cqohVar;
        this.c = vibrator;
        this.d = lottieAnimationView;
        this.j = eeqbVar;
        lottieAnimationView.c.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dcvq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VibrationEffect createOneShot;
                Rect rect;
                dcvr dcvrVar = dcvr.this;
                if (dcvrVar.i == R.fraction.large_progress) {
                    if (Math.abs(dcvrVar.d.a() - dcvrVar.f(R.fraction.large_progress)) <= dcvrVar.a.getResources().getFraction(R.fraction.half_frame_progress, 1, 1)) {
                        int integer = dcvrVar.a.getResources().getInteger(R.integer.haptic_duration_ms);
                        Vibrator vibrator2 = dcvrVar.c;
                        createOneShot = VibrationEffect.createOneShot(integer, -1);
                        vibrator2.vibrate(createOneShot);
                        if (dcvrVar.g || (rect = dcvrVar.e) == null) {
                            return;
                        }
                        dcvrVar.j.a(rect.left, dcvrVar.e.top, dcvrVar.e.width(), dcvrVar.e.height());
                        dcvrVar.g = true;
                    }
                }
            }
        });
    }

    public final void a() {
        if (this.h == this.i) {
            return;
        }
        float a = this.d.a();
        float f = f(this.i);
        this.d.n(f < a ? -1.0f : 1.0f);
        this.d.c.q(f < a ? a : f);
        LottieAnimationView lottieAnimationView = this.d;
        if (f < a) {
            a = f;
        }
        lottieAnimationView.j(a);
        this.d.e();
    }

    public final void b() {
        if (this.g) {
            this.j.a(0, 0, 0, 0);
            this.g = false;
        }
    }

    public final void c(boolean z, float f, float f2) {
        if (this.b.f().toEpochMilli() < this.f) {
            return;
        }
        this.h = this.i;
        this.i = R.fraction.invisible_progress;
        if (z && this.g && e(f, f2)) {
            this.i = R.fraction.delete_progress;
        }
        b();
        a();
        this.f = Long.MAX_VALUE;
    }

    public final void d() {
        this.f = this.b.f().toEpochMilli() + this.a.getResources().getInteger(R.integer.animation_delay_ms);
        if (this.i != R.fraction.invisible_progress) {
            this.d.j(f(R.fraction.invisible_progress));
            this.d.k(f(R.fraction.invisible_progress));
            this.h = R.fraction.invisible_progress;
            this.i = R.fraction.invisible_progress;
        }
    }

    public final boolean e(float f, float f2) {
        Rect rect = this.e;
        if (rect == null) {
            return false;
        }
        return rect.contains((int) f, (int) f2);
    }

    public final float f(int i) {
        return this.a.getResources().getFraction(i, 1, 1);
    }
}
