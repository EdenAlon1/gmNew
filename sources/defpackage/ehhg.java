package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehhg {
    static final TimeInterpolator a = egyv.c;
    public static final int b = R.attr.motionDurationLong2;
    public static final int c = R.attr.motionEasingEmphasizedInterpolator;
    public static final int d = R.attr.motionDurationMedium1;
    public static final int e = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] g = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] h = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] i = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] j = {android.R.attr.state_enabled};
    static final int[] k = new int[0];
    public final FloatingActionButton B;
    public ViewTreeObserver.OnPreDrawListener C;
    final ehgv D;
    private final ehiq E;
    public ehow l;
    public ehop m;
    public Drawable n;
    public ehgh o;
    public Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public Animator v;
    public egza w;
    public egza x;
    public int z;
    public float y = 1.0f;
    public int A = 0;
    private final Rect F = new Rect();
    private final RectF G = new RectF();
    private final RectF H = new RectF();
    private final Matrix I = new Matrix();

    public ehhg(FloatingActionButton floatingActionButton, ehgv ehgvVar) {
        this.B = floatingActionButton;
        this.D = ehgvVar;
        ehiq ehiqVar = new ehiq();
        this.E = ehiqVar;
        ehiqVar.a(p(new ehhd(this)));
        ehiqVar.a(p(new ehhc(this)));
        ehiqVar.a(p(new ehhc(this)));
        ehiqVar.a(p(new ehhc(this)));
        ehiqVar.a(p(new ehhe(this)));
        ehiqVar.a(p(new ehhb(this)));
        floatingActionButton.getRotation();
    }

    private static final ValueAnimator p(ehhf ehhfVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(ehhfVar);
        valueAnimator.addUpdateListener(ehhfVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private static final void q(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new ehha());
    }

    public float a() {
        return this.r;
    }

    public final int b() {
        if (this.q) {
            return Math.max((this.u - this.B.b()) / 2, 0);
        }
        return 0;
    }

    public final AnimatorSet c(egza egzaVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.B, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        egzaVar.d("opacity").b(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        egzaVar.d("scale").b(ofFloat2);
        q(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.B, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        egzaVar.d("scale").b(ofFloat3);
        q(ofFloat3);
        arrayList.add(ofFloat3);
        e(f4, this.I);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.B, new egyy(), new ehgy(this), new Matrix(this.I));
        egzaVar.d("iconScale").b(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        egyw.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet d(float f2, float f3, float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.B;
        ofFloat.addUpdateListener(new ehgz(this, floatingActionButton.getAlpha(), f2, floatingActionButton.getScaleX(), f3, floatingActionButton.getScaleY(), this.y, f4, new Matrix(this.I)));
        arrayList.add(ofFloat);
        egyw.a(animatorSet, arrayList);
        FloatingActionButton floatingActionButton2 = this.B;
        animatorSet.setDuration(ehmp.a(floatingActionButton2.getContext(), i2, floatingActionButton2.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(ehjz.a(this.B.getContext(), i3, egyv.b));
        return animatorSet;
    }

    public final void e(float f2, Matrix matrix) {
        matrix.reset();
        if (this.B.getDrawable() == null || this.z == 0) {
            return;
        }
        RectF rectF = this.G;
        RectF rectF2 = this.H;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f3 = this.z;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.z / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public void f(Rect rect) {
        int b2 = b();
        int max = Math.max(b2, (int) Math.ceil(a() + this.t));
        int max2 = Math.max(b2, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g(float f2, float f3, float f4) {
        throw null;
    }

    public final void h(float f2) {
        this.y = f2;
        Matrix matrix = this.I;
        e(f2, matrix);
        this.B.setImageMatrix(matrix);
    }

    public final void i(ehow ehowVar) {
        this.l = ehowVar;
        ehop ehopVar = this.m;
        if (ehopVar != null) {
            ehopVar.fy(ehowVar);
        }
        ehgh ehghVar = this.o;
        if (ehghVar != null) {
            ehghVar.h = ehowVar;
            ehghVar.invalidateSelf();
        }
    }

    public final void j() {
        h(this.y);
    }

    public final void k() {
        Rect rect = this.F;
        f(rect);
        ksw.i(this.p, "Didn't initialize content background");
        if (m()) {
            this.D.a(new InsetDrawable(this.p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.D.a(this.p);
        }
        ehgv ehgvVar = this.D;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        ehgvVar.a.c.set(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = ehgvVar.a;
        int i6 = floatingActionButton.a;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public final void l(float f2) {
        ehop ehopVar = this.m;
        if (ehopVar != null) {
            ehopVar.N(f2);
        }
    }

    public boolean m() {
        return true;
    }

    public final boolean n() {
        return this.B.isLaidOut() && !this.B.isInEditMode();
    }

    final boolean o() {
        return !this.q || this.B.b() >= this.u;
    }
}
