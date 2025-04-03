package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aai extends vt implements vz {
    private aad A;
    float c;
    float d;
    float e;
    float f;
    public float g;
    public float h;
    final aac j;
    int k;
    RecyclerView m;
    VelocityTracker o;
    GestureDetector q;
    public Rect r;
    public long s;
    private float u;
    private float v;
    private int x;
    private List y;
    private List z;
    final List a = new ArrayList();
    private final float[] t = new float[2];
    wr b = null;
    int i = -1;
    private int w = 0;
    final List l = new ArrayList();
    final Runnable n = new zw(this);
    View p = null;
    private final wb B = new zx(this);

    public aai(aac aacVar) {
        this.j = aacVar;
    }

    private final void p(float[] fArr) {
        if ((this.k & 12) != 0) {
            fArr[0] = (this.g + this.e) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.k & 3) != 0) {
            fArr[1] = (this.h + this.f) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private final void q() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private static boolean r(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int s(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.e > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null && this.i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.v);
            float xVelocity = this.o.getXVelocity(this.i);
            float yVelocity = this.o.getYVelocity(this.i);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.j.v(this.u) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.m.getWidth();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.e) > width * 0.5f) {
            return i2;
        }
        return 0;
    }

    private final int t(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null && this.i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.v);
            float xVelocity = this.o.getXVelocity(this.i);
            float yVelocity = this.o.getYVelocity(this.i);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.j.v(this.u) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.m.getHeight();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.f) > height * 0.5f) {
            return i2;
        }
        return 0;
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        rect.setEmpty();
    }

    @Override // defpackage.vt
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            p(this.t);
            float[] fArr = this.t;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        aac aacVar = this.j;
        wr wrVar = this.b;
        List list = this.l;
        int i = this.w;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aaf aafVar = (aaf) list.get(i2);
            float f4 = aafVar.d;
            float f5 = aafVar.f;
            if (f4 == f5) {
                aafVar.l = aafVar.h.a.getTranslationX();
            } else {
                aafVar.l = f4 + (aafVar.p * (f5 - f4));
            }
            float f6 = aafVar.e;
            float f7 = aafVar.g;
            if (f6 == f7) {
                aafVar.m = aafVar.h.a.getTranslationY();
            } else {
                aafVar.m = f6 + (aafVar.p * (f7 - f6));
            }
            int save = canvas.save();
            aacVar.h(canvas, recyclerView, aafVar.h, aafVar.l, aafVar.m, aafVar.i, false);
            canvas.restoreToCount(save);
        }
        if (wrVar != null) {
            int save2 = canvas.save();
            aacVar.h(canvas, recyclerView, wrVar, f2, f, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.vz
    public final void d(View view) {
        l(view);
        wr k = this.m.k(view);
        if (k == null) {
            return;
        }
        wr wrVar = this.b;
        if (wrVar != null && k == wrVar) {
            m(null, 0);
            return;
        }
        h(k, false);
        if (this.a.remove(k.a)) {
            this.j.n(k);
        }
    }

    final View e(MotionEvent motionEvent) {
        aaf aafVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        wr wrVar = this.b;
        if (wrVar != null) {
            float f = this.g + this.e;
            float f2 = this.h + this.f;
            View view2 = wrVar.a;
            if (r(view2, x, y, f, f2)) {
                return view2;
            }
        }
        int size = this.l.size();
        do {
            size--;
            if (size < 0) {
                return this.m.n(x, y);
            }
            aafVar = (aaf) this.l.get(size);
            view = aafVar.h.a;
        } while (!r(view, x, y, aafVar.l, aafVar.m));
        return view;
    }

    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.ae(this);
            this.m.ah(this.B);
            this.m.ag(this);
            int size = this.l.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                aaf aafVar = (aaf) this.l.get(0);
                aafVar.a();
                this.j.n(aafVar.h);
            }
            this.l.clear();
            this.p = null;
            q();
            aad aadVar = this.A;
            if (aadVar != null) {
                aadVar.a = false;
                this.A = null;
            }
            if (this.q != null) {
                this.q = null;
            }
        }
        this.m = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.u = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.v = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.x = ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
            this.m.w(this);
            this.m.y(this.B);
            this.m.x(this);
            this.A = new aad(this);
            this.q = new GestureDetector(this.m.getContext(), this.A);
        }
    }

    final void g(int i, MotionEvent motionEvent, int i2) {
        View e;
        if (this.b == null && i == 2 && this.w != 2 && this.j.k()) {
            RecyclerView recyclerView = this.m;
            if (recyclerView.F != 1) {
                vx vxVar = recyclerView.o;
                int i3 = this.i;
                wr wrVar = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(findPointerIndex) - this.c;
                    float y = motionEvent.getY(findPointerIndex) - this.d;
                    float abs = Math.abs(x);
                    float abs2 = Math.abs(y);
                    float f = this.x;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !vxVar.af()) && ((abs2 <= abs || !vxVar.ag()) && (e = e(motionEvent)) != null))) {
                        wrVar = this.m.k(e);
                    }
                }
                if (wrVar != null) {
                    int x2 = this.j.x(this.m, wrVar) >> 8;
                    if ((x2 & PrivateKeyType.INVALID) != 0) {
                        float x3 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f2 = x3 - this.c;
                        float f3 = y2 - this.d;
                        float abs3 = Math.abs(f2);
                        float abs4 = Math.abs(f3);
                        float f4 = this.x;
                        if (abs3 >= f4 || abs4 >= f4) {
                            if (abs3 > abs4) {
                                if (f2 < 0.0f && (x2 & 4) == 0) {
                                    return;
                                }
                                if (f2 > 0.0f && (x2 & 8) == 0) {
                                    return;
                                }
                            } else {
                                if (f3 < 0.0f && (x2 & 1) == 0) {
                                    return;
                                }
                                if (f3 > 0.0f && (x2 & 2) == 0) {
                                    return;
                                }
                            }
                            this.f = 0.0f;
                            this.e = 0.0f;
                            this.i = motionEvent.getPointerId(0);
                            m(wrVar, 1);
                        }
                    }
                }
            }
        }
    }

    final void h(wr wrVar, boolean z) {
        aaf aafVar;
        int size = this.l.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                aafVar = (aaf) this.l.get(size);
            }
        } while (aafVar.h != wrVar);
        aafVar.n |= z;
        if (!aafVar.o) {
            aafVar.a();
        }
        this.l.remove(size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void i(wr wrVar) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.m.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.w == 2) {
            float f = this.g + this.e;
            int i6 = (int) (this.h + this.f);
            int i7 = (int) f;
            if (Math.abs(i6 - wrVar.a.getTop()) >= wrVar.a.getHeight() * 0.5f || Math.abs(i7 - wrVar.a.getLeft()) >= wrVar.a.getWidth() * 0.5f) {
                List list = this.y;
                if (list == null) {
                    this.y = new ArrayList();
                    this.z = new ArrayList();
                } else {
                    list.clear();
                    this.z.clear();
                }
                int round = Math.round(this.g + this.e);
                float f2 = this.h + this.f;
                View view = wrVar.a;
                int round2 = Math.round(f2);
                int width = view.getWidth() + round;
                int height = wrVar.a.getHeight() + round2;
                int i8 = (round + width) / 2;
                int i9 = (round2 + height) / 2;
                vx vxVar = this.m.o;
                int at = vxVar.at();
                int i10 = 0;
                while (i10 < at) {
                    View aH = vxVar.aH(i10);
                    char c2 = c;
                    if (aH != wrVar.a && aH.getBottom() >= round2 && aH.getTop() <= height && aH.getRight() >= round && aH.getLeft() <= width) {
                        wr k = this.m.k(aH);
                        int abs5 = Math.abs(i8 - ((aH.getLeft() + aH.getRight()) / 2));
                        int i11 = abs5 * abs5;
                        int abs6 = Math.abs(i9 - ((aH.getTop() + aH.getBottom()) / 2));
                        int i12 = abs6 * abs6;
                        int size = this.y.size();
                        i = i7;
                        i2 = i6;
                        i3 = round;
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            i4 = i11 + i12;
                            i5 = round2;
                            if (i13 >= size || i4 <= ((Integer) this.z.get(i13)).intValue()) {
                                break;
                            }
                            i14++;
                            i13++;
                            round2 = i5;
                        }
                        this.y.add(i14, k);
                        this.z.add(i14, Integer.valueOf(i4));
                    } else {
                        i = i7;
                        i2 = i6;
                        i3 = round;
                        i5 = round2;
                    }
                    i10++;
                    c = c2;
                    i7 = i;
                    i6 = i2;
                    round = i3;
                    round2 = i5;
                }
                int i15 = i7;
                int i16 = i6;
                List list2 = this.y;
                if (list2.size() != 0) {
                    int width2 = i15 + wrVar.a.getWidth();
                    int height2 = i16 + wrVar.a.getHeight();
                    int left2 = i15 - wrVar.a.getLeft();
                    int top2 = i16 - wrVar.a.getTop();
                    int size2 = list2.size();
                    int i17 = -1;
                    wr wrVar2 = null;
                    for (int i18 = 0; i18 < size2; i18++) {
                        wr wrVar3 = (wr) list2.get(i18);
                        if (left2 > 0 && (right = wrVar3.a.getRight() - width2) < 0 && wrVar3.a.getRight() > wrVar.a.getRight() && (abs4 = Math.abs(right)) > i17) {
                            wrVar2 = wrVar3;
                            i17 = abs4;
                        }
                        if (left2 < 0 && (left = wrVar3.a.getLeft() - i15) > 0 && wrVar3.a.getLeft() < wrVar.a.getLeft() && (abs3 = Math.abs(left)) > i17) {
                            wrVar2 = wrVar3;
                            i17 = abs3;
                        }
                        if (top2 < 0 && (top = wrVar3.a.getTop() - i16) > 0 && wrVar3.a.getTop() < wrVar.a.getTop() && (abs2 = Math.abs(top)) > i17) {
                            wrVar2 = wrVar3;
                            i17 = abs2;
                        }
                        if (top2 > 0 && (bottom = wrVar3.a.getBottom() - height2) < 0 && wrVar3.a.getBottom() > wrVar.a.getBottom() && (abs = Math.abs(bottom)) > i17) {
                            wrVar2 = wrVar3;
                            i17 = abs;
                        }
                    }
                    if (wrVar2 == null) {
                        this.y.clear();
                        this.z.clear();
                        return;
                    }
                    int fq = wrVar2.fq();
                    wrVar.fq();
                    if (this.j.m(this.m, wrVar, wrVar2)) {
                        RecyclerView recyclerView = this.m;
                        vx vxVar2 = recyclerView.o;
                        if (vxVar2 instanceof aah) {
                            ((aah) vxVar2).aq(wrVar.a, wrVar2.a);
                            return;
                        }
                        if (vxVar2.af()) {
                            if (vx.bI(wrVar2.a) <= recyclerView.getPaddingLeft()) {
                                recyclerView.ak(fq);
                            }
                            if (vx.bJ(wrVar2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.ak(fq);
                            }
                        }
                        if (vxVar2.ag()) {
                            if (vx.bK(wrVar2.a) <= recyclerView.getPaddingTop()) {
                                recyclerView.ak(fq);
                            }
                            if (vx.bH(wrVar2.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.ak(fq);
                            }
                        }
                    }
                }
            }
        }
    }

    final void j() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    @Override // defpackage.vt
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            p(this.t);
        }
        wr wrVar = this.b;
        List list = this.l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            aaf aafVar = (aaf) list.get(i);
            int save = canvas.save();
            wr wrVar2 = aafVar.h;
            float f = aafVar.l;
            float f2 = aafVar.m;
            int i2 = aafVar.i;
            canvas.restoreToCount(save);
        }
        if (wrVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            aaf aafVar2 = (aaf) list.get(size);
            if (!aafVar2.o) {
                z = true;
            } else if (!aafVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    final void l(View view) {
        if (view == this.p) {
            this.p = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0091, code lost:
    
        if (r6 <= 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m(defpackage.wr r19, int r20) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aai.m(wr, int):void");
    }

    public final void n(wr wrVar) {
        if (!this.j.j(this.m, wrVar)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (wrVar.a.getParent() != this.m) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        j();
        this.f = 0.0f;
        this.e = 0.0f;
        m(wrVar, 2);
    }

    final void o(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.c;
        this.e = f;
        this.f = y - this.d;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.e = f;
        }
        if ((i & 8) == 0) {
            this.e = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            this.f = Math.max(0.0f, this.f);
        }
        if ((i & 2) == 0) {
            this.f = Math.min(0.0f, this.f);
        }
    }

    @Override // defpackage.vz
    public final void c(View view) {
    }
}
