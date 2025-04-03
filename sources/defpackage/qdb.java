package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdb extends Drawable implements Drawable.Callback, Animatable {
    private RectF A;
    private RectF B;
    private Matrix C;
    private Matrix D;
    public qci a;
    public final qlq b;
    public boolean c;
    public boolean d;
    public qhl e;
    public String f;
    public String g;
    public boolean h;
    public qjf i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    private final ArrayList n;
    private final ValueAnimator.AnimatorUpdateListener o;
    private qhk p;
    private boolean q;
    private qdo r;
    private final Matrix s;
    private Bitmap t;
    private Canvas u;
    private Rect v;
    private RectF w;
    private Paint x;
    private Rect y;
    private Rect z;

    public qdb() {
        qlq qlqVar = new qlq();
        this.b = qlqVar;
        this.c = true;
        this.d = false;
        this.m = 1;
        this.n = new ArrayList();
        qcz qczVar = new qcz(this);
        this.o = qczVar;
        this.q = true;
        this.j = PrivateKeyType.INVALID;
        this.r = qdo.AUTOMATIC;
        this.k = false;
        this.s = new Matrix();
        this.l = false;
        qlqVar.addUpdateListener(qczVar);
    }

    private final boolean A() {
        return this.c || this.d;
    }

    private static final void B(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private final void y() {
        qci qciVar = this.a;
        if (qciVar == null) {
            return;
        }
        int i = qkp.a;
        Rect rect = qciVar.i;
        qjf qjfVar = new qjf(this, new qji(Collections.EMPTY_LIST, qciVar, "__container", -1L, 1, -1L, null, Collections.EMPTY_LIST, new qig(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.EMPTY_LIST, 1, null, false, null, null), qciVar.h, qciVar);
        this.i = qjfVar;
        qjfVar.j = this.q;
    }

    private final void z() {
        qci qciVar = this.a;
        if (qciVar == null) {
            return;
        }
        qdo qdoVar = this.r;
        int i = Build.VERSION.SDK_INT;
        boolean z = qciVar.m;
        int i2 = qciVar.n;
        int ordinal = qdoVar.ordinal();
        boolean z2 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z && i < 28) || i2 > 4))) {
            z2 = true;
        }
        this.k = z2;
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.k) {
            m(canvas, this.i);
        } else {
            qjf qjfVar = this.i;
            qci qciVar = this.a;
            if (qjfVar != null && qciVar != null) {
                this.s.reset();
                if (!getBounds().isEmpty()) {
                    this.s.preScale(r2.width() / qciVar.i.width(), r2.height() / qciVar.i.height());
                    this.s.preTranslate(r2.left, r2.top);
                }
                qjfVar.b(canvas, this.s, this.j);
            }
        }
        this.l = false;
        qby.a();
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final qhk f() {
        if (getCallback() == null) {
            return null;
        }
        if (this.p == null) {
            qhk qhkVar = new qhk(getCallback());
            this.p = qhkVar;
            String str = this.g;
            if (str != null) {
                qhkVar.e = str;
            }
        }
        return this.p;
    }

    public final void g(final qhq qhqVar, final Object obj, final qlz qlzVar) {
        qjf qjfVar = this.i;
        if (qjfVar == null) {
            this.n.add(new qda() { // from class: qcs
                @Override // defpackage.qda
                public final void a() {
                    qdb.this.g(qhqVar, obj, qlzVar);
                }
            });
            return;
        }
        if (qhqVar == qhq.a) {
            qjfVar.a(obj, qlzVar);
        } else {
            qhr qhrVar = qhqVar.b;
            if (qhrVar != null) {
                qhrVar.a(obj, qlzVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.i.e(qhqVar, 0, arrayList, new qhq(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((qhq) arrayList.get(i)).b.a(obj, qlzVar);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == qdg.E) {
            t(c());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        qci qciVar = this.a;
        if (qciVar == null) {
            return -1;
        }
        return qciVar.i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        qci qciVar = this.a;
        if (qciVar == null) {
            return -1;
        }
        return qciVar.i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        this.n.clear();
        this.b.cancel();
        if (isVisible()) {
            return;
        }
        this.m = 1;
    }

    public final void i() {
        qlq qlqVar = this.b;
        if (qlqVar.k) {
            qlqVar.cancel();
            if (!isVisible()) {
                this.m = 1;
            }
        }
        this.a = null;
        this.i = null;
        this.e = null;
        qlq qlqVar2 = this.b;
        qlqVar2.j = null;
        qlqVar2.h = -2.14748365E9f;
        qlqVar2.i = 2.14748365E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.l) {
            return;
        }
        this.l = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return w();
    }

    public final void j(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        if (this.a != null) {
            y();
        }
    }

    public final void k() {
        this.n.clear();
        qlq qlqVar = this.b;
        qlqVar.h();
        Iterator it = qlqVar.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(qlqVar);
        }
        if (isVisible()) {
            return;
        }
        this.m = 1;
    }

    public final void l() {
        if (this.i == null) {
            this.n.add(new qda() { // from class: qcv
                @Override // defpackage.qda
                public final void a() {
                    qdb.this.l();
                }
            });
            return;
        }
        z();
        if (A() || e() == 0) {
            if (isVisible()) {
                qlq qlqVar = this.b;
                qlqVar.k = true;
                Set set = qlqVar.a;
                boolean m = qlqVar.m();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(qlqVar, m);
                }
                qlqVar.k((int) (qlqVar.m() ? qlqVar.d() : qlqVar.e()));
                qlqVar.d = 0L;
                qlqVar.g = 0;
                qlqVar.g();
                this.m = 1;
            } else {
                this.m = 2;
            }
        }
        if (A()) {
            return;
        }
        p((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.m = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        if (((android.view.ViewGroup) r3).getClipChildren() == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.graphics.Canvas r9, defpackage.qjf r10) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdb.m(android.graphics.Canvas, qjf):void");
    }

    public final void n() {
        if (this.i == null) {
            this.n.add(new qda() { // from class: qcu
                @Override // defpackage.qda
                public final void a() {
                    qdb.this.n();
                }
            });
            return;
        }
        z();
        if (A() || e() == 0) {
            if (isVisible()) {
                qlq qlqVar = this.b;
                qlqVar.k = true;
                qlqVar.g();
                qlqVar.d = 0L;
                if (qlqVar.m() && qlqVar.f == qlqVar.e()) {
                    qlqVar.k(qlqVar.d());
                } else if (!qlqVar.m() && qlqVar.f == qlqVar.d()) {
                    qlqVar.k(qlqVar.e());
                }
                Iterator it = qlqVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(qlqVar);
                }
                this.m = 1;
            } else {
                this.m = 3;
            }
        }
        if (A()) {
            return;
        }
        p((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.m = 1;
    }

    public final void o(boolean z) {
        if (z != this.q) {
            this.q = z;
            qjf qjfVar = this.i;
            if (qjfVar != null) {
                qjfVar.j = z;
            }
            invalidateSelf();
        }
    }

    public final void p(final int i) {
        if (this.a == null) {
            this.n.add(new qda() { // from class: qcy
                @Override // defpackage.qda
                public final void a() {
                    qdb.this.p(i);
                }
            });
        } else {
            this.b.k(i);
        }
    }

    public final void q(final float f) {
        qci qciVar = this.a;
        if (qciVar == null) {
            this.n.add(new qda() { // from class: qct
                @Override // defpackage.qda
                public final void a() {
                    qdb.this.q(f);
                }
            });
            return;
        }
        qlq qlqVar = this.b;
        float f2 = qciVar.j;
        float f3 = qciVar.k;
        PointF pointF = qlr.a;
        qlqVar.l(qlqVar.h, f2 + (f * (f3 - f2)));
    }

    public final void r(final int i) {
        if (this.a == null) {
            this.n.add(new qda() { // from class: qcr
                @Override // defpackage.qda
                public final void a() {
                    qdb.this.r(i);
                }
            });
        } else {
            this.b.l(i, (int) r0.i);
        }
    }

    public final void s(final float f) {
        qci qciVar = this.a;
        if (qciVar == null) {
            this.n.add(new qda() { // from class: qcw
                @Override // defpackage.qda
                public final void a() {
                    qdb.this.s(f);
                }
            });
            return;
        }
        float f2 = qciVar.j;
        float f3 = qciVar.k;
        PointF pointF = qlr.a;
        r((int) (f2 + (f * (f3 - f2))));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.j = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        qlp.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.m;
            if (i == 2) {
                l();
                return visible;
            }
            if (i == 3) {
                n();
                return visible;
            }
        } else {
            if (this.b.k) {
                k();
                this.m = 3;
                return visible;
            }
            if (isVisible) {
                this.m = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.n.clear();
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.m = 1;
    }

    public final void t(final float f) {
        qci qciVar = this.a;
        if (qciVar == null) {
            this.n.add(new qda() { // from class: qcx
                @Override // defpackage.qda
                public final void a() {
                    qdb.this.t(f);
                }
            });
            return;
        }
        qlq qlqVar = this.b;
        float f2 = qciVar.j;
        float f3 = qciVar.k;
        PointF pointF = qlr.a;
        qlqVar.k(f2 + (f * (f3 - f2)));
        qby.a();
    }

    public final void u(qdo qdoVar) {
        this.r = qdoVar;
        z();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean w() {
        qlq qlqVar = this.b;
        if (qlqVar == null) {
            return false;
        }
        return qlqVar.k;
    }

    public final boolean x(qci qciVar) {
        if (this.a == qciVar) {
            return false;
        }
        this.l = true;
        i();
        this.a = qciVar;
        y();
        qlq qlqVar = this.b;
        qci qciVar2 = qlqVar.j;
        qlqVar.j = qciVar;
        if (qciVar2 == null) {
            qlqVar.l(Math.max(qlqVar.h, qciVar.j), Math.min(qlqVar.i, qciVar.k));
        } else {
            qlqVar.l((int) qciVar.j, (int) qciVar.k);
        }
        float f = qlqVar.f;
        qlqVar.f = 0.0f;
        qlqVar.e = 0.0f;
        qlqVar.k((int) f);
        qlqVar.b();
        t(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.n).iterator();
        while (it.hasNext()) {
            qda qdaVar = (qda) it.next();
            if (qdaVar != null) {
                qdaVar.a();
            }
            it.remove();
        }
        this.n.clear();
        qdm qdmVar = qciVar.a;
        z();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }
}
