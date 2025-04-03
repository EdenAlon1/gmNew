package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import defpackage.a;
import defpackage.cpn;
import defpackage.ktn;
import defpackage.kto;
import defpackage.kty;
import defpackage.ktz;
import defpackage.kul;
import defpackage.kvg;
import defpackage.kvo;
import defpackage.kvt;
import defpackage.kyv;
import defpackage.kzq;
import defpackage.ma;
import defpackage.ql;
import defpackage.qm;
import defpackage.si;
import defpackage.ta;
import defpackage.tn;
import defpackage.ts;
import defpackage.tu;
import defpackage.vd;
import defpackage.ve;
import defpackage.vf;
import defpackage.vg;
import defpackage.vh;
import defpackage.vi;
import defpackage.vj;
import defpackage.vk;
import defpackage.vo;
import defpackage.vq;
import defpackage.vr;
import defpackage.vs;
import defpackage.vt;
import defpackage.vx;
import defpackage.vy;
import defpackage.vz;
import defpackage.wa;
import defpackage.wb;
import defpackage.wc;
import defpackage.wd;
import defpackage.we;
import defpackage.wf;
import defpackage.wh;
import defpackage.wj;
import defpackage.wn;
import defpackage.wo;
import defpackage.wp;
import defpackage.wq;
import defpackage.wr;
import defpackage.wt;
import defpackage.zm;
import defpackage.zn;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements kty {
    public static final /* synthetic */ int ab = 0;
    private static final Class[] ae;
    public static final Interpolator c;
    static final wp d;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public vr E;
    public int F;
    public int G;
    public wa H;
    public final int I;
    public float J;
    public float K;
    public final wq L;
    public tu M;
    public ts N;
    public final wo O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public wt S;
    public final int[] T;
    final List U;
    boolean V;
    ktn W;
    private final int[] aA;
    private ktz aB;
    private final int[] aC;
    private final int[] aD;
    private Runnable aE;
    private boolean aF;
    private int aG;
    private int aH;
    private final kto aI;
    private vs aJ;
    private final vg aK;
    kul aa;
    private final float af;
    private final wh ag;
    private final Rect ah;
    private final ArrayList ai;
    private wb aj;
    private int ak;
    private boolean al;
    private int am;
    private final AccessibilityManager an;
    private int ao;
    private int ap;
    private vo aq;
    private int ar;
    private VelocityTracker as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private final int ax;
    private boolean ay;
    private List az;
    public final wf e;
    public wj f;
    public qm g;
    public si h;
    public final zn i;
    public boolean j;
    public final Runnable k;
    public final Rect l;
    public final RectF m;
    public vk n;
    public vx o;
    public final List p;
    public final ArrayList q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;
    private static final int[] ac = {R.attr.nestedScrollingEnabled};
    private static final float ad = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    public static final boolean b = true;

    static {
        Class cls = Integer.TYPE;
        ae = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new vf();
        d = new wp();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void Q(View view, Rect rect) {
        vy vyVar = (vy) view.getLayoutParams();
        Rect rect2 = vyVar.d;
        rect.set((view.getLeft() - rect2.left) - vyVar.leftMargin, (view.getTop() - rect2.top) - vyVar.topMargin, view.getRight() + rect2.right + vyVar.rightMargin, view.getBottom() + rect2.bottom + vyVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.A;
        float f2 = 0.0f;
        if (edgeEffect == null || kyv.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && kyv.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.C.onRelease();
                } else {
                    float b2 = kyv.b(this.C, width, height);
                    if (kyv.a(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f2 = b2;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.A.onRelease();
            } else {
                float f3 = -kyv.b(this.A, -width, 1.0f - height);
                if (kyv.a(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public static final int aH(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && kyv.a(edgeEffect) != 0.0f) {
            int round = Math.round(((-i2) / 4.0f) * kyv.b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || kyv.a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round((f / 4.0f) * kyv.b(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static final long aI() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    private final int aP(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.B;
        float f2 = 0.0f;
        if (edgeEffect == null || kyv.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && kyv.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.D.onRelease();
                } else {
                    float b2 = kyv.b(this.D, height, 1.0f - width);
                    if (kyv.a(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f2 = b2;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.B.onRelease();
            } else {
                float f3 = -kyv.b(this.B, -height, width);
                if (kyv.a(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private final ktz aQ() {
        if (this.aB == null) {
            this.aB = new ktz(this);
        }
        return this.aB;
    }

    private final kul aR() {
        if (this.aa == null) {
            this.aa = new kul(this);
        }
        return this.aa;
    }

    private final void aS() {
        bb();
        ar(0);
    }

    private final void aT() {
        zm zmVar;
        View o;
        this.O.b(1);
        P(this.O);
        this.O.i = false;
        av();
        this.i.f();
        W();
        aX();
        wr wrVar = null;
        View focusedChild = (this.ay && hasFocus() && this.n != null) ? getFocusedChild() : null;
        if (focusedChild != null && (o = o(focusedChild)) != null) {
            wrVar = k(o);
        }
        if (wrVar == null) {
            ba();
        } else {
            wo woVar = this.O;
            woVar.m = this.n.b ? wrVar.e : -1L;
            woVar.l = this.y ? -1 : wrVar.v() ? wrVar.d : wrVar.fq();
            wo woVar2 = this.O;
            View view = wrVar.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            woVar2.n = id;
        }
        wo woVar3 = this.O;
        woVar3.h = woVar3.j && this.Q;
        this.Q = false;
        this.P = false;
        woVar3.g = woVar3.k;
        woVar3.e = this.n.a();
        aV(this.aA);
        if (this.O.j) {
            int a2 = this.h.a();
            for (int i = 0; i < a2; i++) {
                wr l = l(this.h.d(i));
                if (!l.A() && (!l.t() || this.n.b)) {
                    this.i.e(l, this.E.o(this.O, l, vr.l(l), l.gA()));
                    if (this.O.h && l.y() && !l.v() && !l.A() && !l.t()) {
                        this.i.c(gs(l), l);
                    }
                }
            }
        }
        if (this.O.k) {
            int b2 = this.h.b();
            for (int i2 = 0; i2 < b2; i2++) {
                wr l2 = l(this.h.e(i2));
                if (!l2.A() && l2.d == -1) {
                    l2.d = l2.c;
                }
            }
            wo woVar4 = this.O;
            boolean z = woVar4.f;
            woVar4.f = false;
            this.o.o(this.e, woVar4);
            this.O.f = z;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                wr l3 = l(this.h.d(i3));
                if (!l3.A() && ((zmVar = (zm) this.i.a.get(l3)) == null || (zmVar.b & 4) == 0)) {
                    int l4 = vr.l(l3);
                    boolean q = l3.q(8192);
                    if (!q) {
                        l4 |= 4096;
                    }
                    vq o2 = this.E.o(this.O, l3, l4, l3.gA());
                    if (q) {
                        ac(l3, o2);
                    } else {
                        zn znVar = this.i;
                        zm zmVar2 = (zm) znVar.a.get(l3);
                        if (zmVar2 == null) {
                            cpn cpnVar = znVar.a;
                            zmVar2 = zm.a();
                            cpnVar.put(l3, zmVar2);
                        }
                        zmVar2.b |= 2;
                        zmVar2.c = o2;
                    }
                }
            }
            gD();
        } else {
            gD();
        }
        X();
        aw(false);
        this.O.d = 2;
    }

    private final void aU() {
        av();
        W();
        this.O.b(6);
        this.g.e();
        int a2 = this.n.a();
        wo woVar = this.O;
        woVar.e = a2;
        woVar.c = 0;
        if (this.f != null && this.n.D()) {
            Parcelable parcelable = this.f.a;
            if (parcelable != null) {
                this.o.aa(parcelable);
            }
            this.f = null;
        }
        wo woVar2 = this.O;
        woVar2.g = false;
        this.o.o(this.e, woVar2);
        wo woVar3 = this.O;
        woVar3.f = false;
        woVar3.j = woVar3.j && this.E != null;
        woVar3.d = 4;
        X();
        aw(false);
    }

    private final void aV(int[] iArr) {
        int a2 = this.h.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i3 = 0; i3 < a2; i3++) {
            wr l = l(this.h.d(i3));
            if (!l.A()) {
                int gz = l.gz();
                if (gz < i2) {
                    i2 = gz;
                }
                if (gz > i) {
                    i = gz;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aW(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ar) {
            int i = actionIndex == 0 ? 1 : 0;
            this.ar = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.av = x;
            this.at = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.aw = y;
            this.au = y;
        }
    }

    private final void aX() {
        boolean z;
        if (this.y) {
            this.g.j();
            if (this.z) {
                this.o.y();
            }
        }
        if (bf()) {
            this.g.g();
        } else {
            this.g.e();
        }
        boolean z2 = this.P || this.Q;
        wo woVar = this.O;
        boolean z3 = this.t && this.E != null && ((z = this.y) || z2 || this.o.y) && (!z || this.n.b);
        woVar.j = z3;
        woVar.k = z3 && z2 && !this.y && bf();
    }

    private final void aY() {
        boolean z;
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.D.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private final void aZ(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.l.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof vy) {
            vy vyVar = (vy) layoutParams;
            if (!vyVar.e) {
                Rect rect = vyVar.d;
                this.l.left -= rect.left;
                this.l.right += rect.right;
                this.l.top -= rect.top;
                this.l.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.l);
            offsetRectIntoDescendantCoords(view, this.l);
        } else {
            view2 = null;
        }
        this.o.bp(this, view, this.l, !this.t, view2 == null);
    }

    private final void ba() {
        wo woVar = this.O;
        woVar.m = -1L;
        woVar.l = -1;
        woVar.n = -1;
    }

    private final void bb() {
        VelocityTracker velocityTracker = this.as;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        ax(0);
        aY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bc(int i) {
        boolean af = this.o.af();
        int i2 = af;
        if (this.o.ag()) {
            i2 = (af ? 1 : 0) | 2;
        }
        aO(i2, i);
    }

    private final void bd() {
        wn wnVar;
        this.L.d();
        vx vxVar = this.o;
        if (vxVar == null || (wnVar = vxVar.x) == null) {
            return;
        }
        wnVar.o();
    }

    private final boolean be(MotionEvent motionEvent) {
        ArrayList arrayList = this.ai;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wb wbVar = (wb) this.ai.get(i);
            if (wbVar.j(this, motionEvent) && action != 3) {
                this.aj = wbVar;
                return true;
            }
        }
        return false;
    }

    private final boolean bf() {
        return this.E != null && this.o.cj();
    }

    private final boolean bg(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float a2 = kyv.a(edgeEffect) * i2;
        double log = Math.log((Math.abs(-i) * 0.35f) / (this.af * 0.015f));
        double d2 = ad;
        return ((float) (((double) (this.af * 0.015f)) * Math.exp((d2 / ((-1.0d) + d2)) * log))) < a2;
    }

    private final void bh(Context context, String str, AttributeSet attributeSet, int i) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            if (trim.charAt(0) == '.') {
                trim = String.valueOf(context.getPackageName()).concat(String.valueOf(trim));
            } else if (!trim.contains(".")) {
                trim = RecyclerView.class.getPackage().getName() + '.' + trim;
            }
            try {
                Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(vx.class);
                try {
                    constructor = asSubclass.getConstructor(ae);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(a.l(trim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                ap((vx) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(a.l(trim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(a.l(trim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(a.l(trim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(a.l(trim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(a.l(trim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    public static void gC(wr wrVar) {
        WeakReference weakReference = wrVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == wrVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            wrVar.b = null;
        }
    }

    public static wr l(View view) {
        if (view == null) {
            return null;
        }
        return ((vy) view.getLayoutParams()).c;
    }

    public static RecyclerView m(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView m = m(viewGroup.getChildAt(i));
            if (m != null) {
                return m;
            }
        }
        return null;
    }

    public final void A(String str) {
        if (aF()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(p()));
        }
        if (this.ap > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(p())));
        }
    }

    public final void D() {
        List list = this.az;
        if (list != null) {
            list.clear();
        }
    }

    public final void E(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            z = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            z |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            z |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            z |= this.D.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void G(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = kvo.a;
        setMeasuredDimension(vx.as(i, paddingLeft, getMinimumWidth()), vx.as(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e9, code lost:
    
        if (r17.h.k(getFocusedChild()) != false) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0351  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void I() {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.I():void");
    }

    public final void J(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aQ().i(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void K(int i, int i2) {
        this.ap++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.az;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((wc) this.az.get(size)).a(this, i, i2);
                }
            }
        }
        this.ap--;
    }

    public final void L() {
        if (this.D != null) {
            return;
        }
        EdgeEffect a2 = this.aq.a(this);
        this.D = a2;
        if (this.j) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void M() {
        if (this.A != null) {
            return;
        }
        EdgeEffect a2 = this.aq.a(this);
        this.A = a2;
        if (this.j) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void N() {
        if (this.C != null) {
            return;
        }
        EdgeEffect a2 = this.aq.a(this);
        this.C = a2;
        if (this.j) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void O() {
        if (this.B != null) {
            return;
        }
        EdgeEffect a2 = this.aq.a(this);
        this.B = a2;
        if (this.j) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void P(wo woVar) {
        if (this.F != 2) {
            woVar.o = 0;
            woVar.p = 0;
        } else {
            OverScroller overScroller = this.L.a;
            woVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            woVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void R() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void S() {
        if (this.q.size() == 0) {
            return;
        }
        vx vxVar = this.o;
        if (vxVar != null) {
            vxVar.V("Cannot invalidate item decorations during a scroll or layout");
        }
        U();
        requestLayout();
    }

    public final void T(int i) {
        if (this.o == null) {
            return;
        }
        ar(2);
        this.o.ab(i);
        awakenScrollBars();
    }

    final void U() {
        int b2 = this.h.b();
        for (int i = 0; i < b2; i++) {
            ((vy) this.h.e(i).getLayoutParams()).e = true;
        }
        wf wfVar = this.e;
        int size = wfVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            vy vyVar = (vy) ((wr) wfVar.c.get(i2)).a.getLayoutParams();
            if (vyVar != null) {
                vyVar.e = true;
            }
        }
    }

    public final void V(int i, int i2, boolean z) {
        int i3;
        int b2 = this.h.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= b2) {
                break;
            }
            wr l = l(this.h.e(i4));
            if (l != null && !l.A()) {
                int i5 = l.c;
                if (i5 >= i3) {
                    l.k(-i2, z);
                    this.O.f = true;
                } else if (i5 >= i) {
                    l.f(8);
                    l.k(-i2, z);
                    l.c = i - 1;
                    this.O.f = true;
                }
            }
            i4++;
        }
        wf wfVar = this.e;
        int size = wfVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            wr wrVar = (wr) wfVar.c.get(size);
            if (wrVar != null) {
                int i6 = wrVar.c;
                if (i6 >= i3) {
                    wrVar.k(-i2, z);
                } else if (i6 >= i) {
                    wrVar.f(8);
                    wfVar.k(size);
                }
            }
        }
    }

    public final void W() {
        this.ao++;
    }

    final void X() {
        Y(true);
    }

    public final void Y(boolean z) {
        int i;
        int i2 = this.ao - 1;
        this.ao = i2;
        if (i2 <= 0) {
            this.ao = 0;
            if (z) {
                int i3 = this.am;
                this.am = 0;
                if (i3 != 0 && aE()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.U.size() - 1; size >= 0; size--) {
                    wr wrVar = (wr) this.U.get(size);
                    if (wrVar.a.getParent() == this && !wrVar.A() && (i = wrVar.p) != -1) {
                        wrVar.a.setImportantForAccessibility(i);
                        wrVar.p = -1;
                    }
                }
                this.U.clear();
            }
        }
    }

    public final boolean aA(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aQ().g(i, i2, iArr, iArr2, i3);
    }

    public final boolean aB(int i, int i2) {
        return aC(i, i2, this.I, this.ax);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aC(int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aC(int, int, int, int):boolean");
    }

    public final boolean aD() {
        return !this.t || this.y || this.g.l();
    }

    public final boolean aE() {
        AccessibilityManager accessibilityManager = this.an;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean aF() {
        return this.ao > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0174, code lost:
    
        if (r4 == r27) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean aG(int r22, int r23, int r24, int r25, android.view.MotionEvent r26, int r27) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aG(int, int, int, int, android.view.MotionEvent, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r14 != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aJ(int r13, int r14, int r15, int r16, android.view.MotionEvent r17) {
        /*
            r12 = this;
            vx r0 = r12.o
            if (r0 != 0) goto Lc
            java.lang.String r13 = "RecyclerView"
            java.lang.String r14 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r13, r14)
            return
        Lc:
            boolean r1 = r12.v
            if (r1 == 0) goto L11
            return
        L11:
            int[] r1 = r12.T
            r2 = 0
            r1[r2] = r2
            r3 = 1
            r1[r3] = r2
            boolean r0 = r0.af()
            vx r1 = r12.o
            boolean r1 = r1.ag()
            if (r1 == 0) goto L28
            r4 = r0 | 2
            goto L29
        L28:
            r4 = r0
        L29:
            r5 = 1073741824(0x40000000, float:2.0)
            if (r17 != 0) goto L34
            int r6 = r12.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r5
            goto L38
        L34:
            float r6 = r17.getY()
        L38:
            if (r17 != 0) goto L41
            int r7 = r12.getWidth()
            float r7 = (float) r7
            float r7 = r7 / r5
            goto L45
        L41:
            float r7 = r17.getX()
        L45:
            int r5 = r12.a(r13, r6)
            int r13 = r13 - r5
            int r5 = r12.aP(r14, r7)
            int r14 = r14 - r5
            r12.aO(r4, r3)
            if (r3 == r0) goto L56
            r6 = r2
            goto L57
        L56:
            r6 = r13
        L57:
            if (r3 == r1) goto L5b
            r7 = r2
            goto L5c
        L5b:
            r7 = r14
        L5c:
            int[] r8 = r12.T
            int[] r9 = r12.aC
            r10 = 1
            r5 = r12
            boolean r4 = r5.aA(r6, r7, r8, r9, r10)
            if (r4 == 0) goto L70
            int[] r4 = r12.T
            r6 = r4[r2]
            int r13 = r13 - r6
            r4 = r4[r3]
            int r14 = r14 - r4
        L70:
            if (r3 == r0) goto L74
            r6 = r2
            goto L75
        L74:
            r6 = r13
        L75:
            if (r3 == r1) goto L79
            r7 = r2
            goto L7a
        L79:
            r7 = r14
        L7a:
            r11 = 1
            r5 = r12
            r8 = r15
            r9 = r16
            r10 = r17
            r5.aG(r6, r7, r8, r9, r10, r11)
            tu r15 = r12.M
            if (r15 == 0) goto L91
            if (r13 != 0) goto L8d
            if (r14 == 0) goto L91
            goto L8e
        L8d:
            r2 = r13
        L8e:
            r15.a(r12, r2, r14)
        L91:
            r12.ax(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aJ(int, int, int, int, android.view.MotionEvent):void");
    }

    public final void aK(wr wrVar, int i) {
        if (!aF()) {
            wrVar.a.setImportantForAccessibility(i);
        } else {
            wrVar.p = i;
            this.U.add(wrVar);
        }
    }

    public final void aL() {
        this.s = true;
    }

    public final void aM(int i, int i2, Interpolator interpolator) {
        aN(i, i2, interpolator, false);
    }

    public final void aN(int i, int i2, Interpolator interpolator, boolean z) {
        vx vxVar = this.o;
        if (vxVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != vxVar.af()) {
            i = 0;
        }
        if (true != this.o.ag()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            aO(i3, 1);
        }
        this.L.c(i, i2, Integer.MIN_VALUE, interpolator);
    }

    public final void aO(int i, int i2) {
        aQ().m(i, i2);
    }

    public final void aa() {
        if (this.R || !this.r) {
            return;
        }
        Runnable runnable = this.aE;
        int[] iArr = kvo.a;
        postOnAnimation(runnable);
        this.R = true;
    }

    public final void ab(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int b2 = this.h.b();
        for (int i = 0; i < b2; i++) {
            wr l = l(this.h.e(i));
            if (l != null && !l.A()) {
                l.f(6);
            }
        }
        U();
        wf wfVar = this.e;
        int size = wfVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            wr wrVar = (wr) wfVar.c.get(i2);
            if (wrVar != null) {
                wrVar.f(6);
                wrVar.e(null);
            }
        }
        vk vkVar = wfVar.h.n;
        if (vkVar == null || !vkVar.b) {
            wfVar.j();
        }
    }

    public final void ac(wr wrVar, vq vqVar) {
        wrVar.m(0, 8192);
        if (this.O.h && wrVar.y() && !wrVar.v() && !wrVar.A()) {
            this.i.c(gs(wrVar), wrVar);
        }
        this.i.e(wrVar, vqVar);
    }

    public final void ad() {
        vr vrVar = this.E;
        if (vrVar != null) {
            vrVar.c();
        }
        vx vxVar = this.o;
        if (vxVar != null) {
            vxVar.aZ(this.e);
            this.o.ba(this.e);
        }
        this.e.e();
    }

    public final void ae(vt vtVar) {
        vx vxVar = this.o;
        if (vxVar != null) {
            vxVar.V("Cannot remove item decoration during a scroll  or layout");
        }
        this.q.remove(vtVar);
        if (this.q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        U();
        requestLayout();
    }

    public final void af(int i) {
        int gr = gr();
        if (i >= 0 && i < gr) {
            ae(h(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + gr);
    }

    public final void ag(vz vzVar) {
        List list = this.x;
        if (list == null) {
            return;
        }
        list.remove(vzVar);
    }

    public final void ah(wb wbVar) {
        this.ai.remove(wbVar);
        if (this.aj == wbVar) {
            this.aj = null;
        }
    }

    public final void ai(wc wcVar) {
        List list = this.az;
        if (list != null) {
            list.remove(wcVar);
        }
    }

    public final void aj(int i, int i2, int[] iArr) {
        wr wrVar;
        av();
        W();
        Trace.beginSection("RV Scroll");
        P(this.O);
        int d2 = i != 0 ? this.o.d(i, this.e, this.O) : 0;
        int e = i2 != 0 ? this.o.e(i2, this.e, this.O) : 0;
        Trace.endSection();
        int a2 = this.h.a();
        for (int i3 = 0; i3 < a2; i3++) {
            View d3 = this.h.d(i3);
            wr k = k(d3);
            if (k != null && (wrVar = k.i) != null) {
                int left = d3.getLeft();
                int top = d3.getTop();
                View view = wrVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        X();
        aw(false);
        if (iArr != null) {
            iArr[0] = d2;
            iArr[1] = e;
        }
    }

    public void ak(int i) {
        if (this.v) {
            return;
        }
        ay();
        vx vxVar = this.o;
        if (vxVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            vxVar.ab(i);
            awakenScrollBars();
        }
    }

    public final void al(wt wtVar) {
        this.S = wtVar;
        kvo.p(this, wtVar);
    }

    public void am(vk vkVar) {
        suppressLayout(false);
        vk vkVar2 = this.n;
        if (vkVar2 != null) {
            vkVar2.C(this.ag);
            this.n.h(this);
        }
        ad();
        this.g.j();
        vk vkVar3 = this.n;
        this.n = vkVar;
        if (vkVar != null) {
            vkVar.A(this.ag);
            vkVar.hc(this);
        }
        vx vxVar = this.o;
        if (vxVar != null) {
            vxVar.bC();
        }
        wf wfVar = this.e;
        vk vkVar4 = this.n;
        wfVar.e();
        wfVar.h(vkVar3, true);
        we b2 = wfVar.b();
        if (vkVar3 != null) {
            b2.d();
        }
        if (b2.b == 0) {
            for (int i = 0; i < b2.a.size(); i++) {
                wd wdVar = (wd) b2.a.valueAt(i);
                ArrayList arrayList = wdVar.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kzq.b(((wr) arrayList.get(i2)).a);
                }
                wdVar.a.clear();
            }
        }
        if (vkVar4 != null) {
            b2.c();
        }
        wfVar.f();
        this.O.f = true;
        ab(false);
        requestLayout();
    }

    public final void an(vr vrVar) {
        vr vrVar2 = this.E;
        if (vrVar2 != null) {
            vrVar2.c();
            this.E.k = null;
        }
        this.E = vrVar;
        if (vrVar != null) {
            vrVar.k = this.aJ;
        }
    }

    public final void ao(int i) {
        wf wfVar = this.e;
        wfVar.e = i;
        wfVar.p();
    }

    public void ap(vx vxVar) {
        if (vxVar == this.o) {
            return;
        }
        ay();
        if (this.o != null) {
            vr vrVar = this.E;
            if (vrVar != null) {
                vrVar.c();
            }
            this.o.aZ(this.e);
            this.o.ba(this.e);
            this.e.e();
            if (this.r) {
                this.o.aR(this, this.e);
            }
            this.o.bk(null);
            this.o = null;
        } else {
            this.e.e();
        }
        si siVar = this.h;
        siVar.a.d();
        int size = siVar.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            siVar.e.d((View) siVar.b.get(size));
            siVar.b.remove(size);
        }
        vi viVar = siVar.e;
        int a2 = viVar.a();
        for (int i = 0; i < a2; i++) {
            View c2 = viVar.c(i);
            viVar.a.fj(c2);
            c2.clearAnimation();
        }
        viVar.a.removeAllViews();
        this.o = vxVar;
        if (vxVar != null) {
            if (vxVar.u != null) {
                throw new IllegalArgumentException("LayoutManager " + vxVar + " is already attached to a RecyclerView:" + vxVar.u.p());
            }
            this.o.bk(this);
            if (this.r) {
                this.o.aQ(this);
            }
        }
        this.e.p();
        requestLayout();
    }

    public final void aq(we weVar) {
        wf wfVar = this.e;
        wfVar.g(wfVar.h.n);
        we weVar2 = wfVar.g;
        if (weVar2 != null) {
            weVar2.d();
        }
        wfVar.g = weVar;
        we weVar3 = wfVar.g;
        if (weVar3 != null && wfVar.h.n != null) {
            weVar3.c();
        }
        wfVar.f();
    }

    public final void ar(int i) {
        if (i == this.F) {
            return;
        }
        this.F = i;
        if (i != 2) {
            bd();
        }
        vx vxVar = this.o;
        if (vxVar != null) {
            vxVar.aX(i);
        }
        Z(i);
        List list = this.az;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wc) this.az.get(size)).b(this, i);
            }
        }
    }

    public final void as(int i, int i2) {
        at(i, i2, null);
    }

    public void at(int i, int i2, Interpolator interpolator) {
        aM(i, i2, null);
    }

    public void au(int i) {
        if (this.v) {
            return;
        }
        vx vxVar = this.o;
        if (vxVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            vxVar.ar(this, i);
        }
    }

    public final void av() {
        int i = this.ak + 1;
        this.ak = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void aw(boolean z) {
        int i = this.ak;
        if (i <= 0) {
            this.ak = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.o != null && this.n != null) {
                I();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.ak--;
    }

    public final void ax(int i) {
        aQ().c(i);
    }

    public final void ay() {
        ar(0);
        bd();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof vy) && this.o.t((vy) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        vx vxVar = this.o;
        if (vxVar != null && vxVar.af()) {
            return this.o.C(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        vx vxVar = this.o;
        if (vxVar != null && vxVar.af()) {
            return this.o.D(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        vx vxVar = this.o;
        if (vxVar != null && vxVar.af()) {
            return this.o.E(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        vx vxVar = this.o;
        if (vxVar != null && vxVar.ag()) {
            return this.o.F(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        vx vxVar = this.o;
        if (vxVar != null && vxVar.ag()) {
            return this.o.G(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        vx vxVar = this.o;
        if (vxVar != null && vxVar.ag()) {
            return this.o.H(this.O);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        vx vxVar = this.o;
        int i = 0;
        if (vxVar == null) {
            return false;
        }
        if (vxVar.ag()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    aM(0, measuredHeight, null);
                } else {
                    aM(0, -measuredHeight, null);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean aj = vxVar.aj();
                if (keyCode == 122) {
                    if (aj) {
                        i = this.n.a();
                    }
                } else if (!aj) {
                    i = this.n.a();
                }
                au(i);
                return true;
            }
        } else if (vxVar.af()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    aM(measuredWidth, 0, null);
                } else {
                    aM(-measuredWidth, 0, null);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean aj2 = vxVar.aj();
                if (keyCode2 == 122) {
                    if (aj2) {
                        i = this.n.a();
                    }
                } else if (!aj2) {
                    i = this.n.a();
                }
                au(i);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aQ().d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aQ().e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aQ().f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aQ().h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.q.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((vt) this.q.get(i)).k(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.j) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.E != null && this.q.size() > 0 && this.E.i())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void fi() {
        if (!this.t || this.y) {
            Trace.beginSection("RV FullInvalidate");
            I();
            Trace.endSection();
            return;
        }
        if (this.g.l()) {
            if (!this.g.k(4) || this.g.k(11)) {
                if (this.g.l()) {
                    Trace.beginSection("RV FullInvalidate");
                    I();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            av();
            W();
            this.g.g();
            if (!this.u) {
                int a2 = this.h.a();
                int i = 0;
                while (true) {
                    if (i < a2) {
                        wr l = l(this.h.d(i));
                        if (l != null && !l.A() && l.y()) {
                            I();
                            break;
                        }
                        i++;
                    } else {
                        this.g.d();
                        break;
                    }
                }
            }
            aw(true);
            X();
            Trace.endSection();
        }
    }

    public final void fj(View view) {
        wr l = l(view);
        vk vkVar = this.n;
        if (vkVar != null && l != null) {
            vkVar.j(l);
        }
        List list = this.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((vz) this.x.get(size)).d(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0061, code lost:
    
        if (r3.findNextFocus(r13, r14, true != ((r13.o.aw() == 1) ^ (r15 == 2)) ? 17 : 66) == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r3.findNextFocus(r13, r14, r15 == 2 ? 130 : 33) != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        fi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (o(r14) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        av();
        r13.o.ce(r14, r15, r13.e, r13.O);
        aw(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        if (r13.l.right <= r13.ah.left) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        if (r13.l.left >= r13.ah.right) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
    
        if (r13.l.bottom <= r13.ah.top) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0177, code lost:
    
        if (r13.l.top >= r13.ah.bottom) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0190, code lost:
    
        if (r2 > 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ae, code lost:
    
        if (r10 > 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b1, code lost:
    
        if (r2 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b4, code lost:
    
        if (r10 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c4, code lost:
    
        if ((r10 * r3) >= 0) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0103  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final Rect g(View view) {
        vy vyVar = (vy) view.getLayoutParams();
        if (!vyVar.e) {
            return vyVar.d;
        }
        if (this.O.g && (vyVar.b() || vyVar.c.t())) {
            return vyVar.d;
        }
        Rect rect = vyVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            this.l.set(0, 0, 0, 0);
            ((vt) this.q.get(i)).a(this.l, view, this, this.O);
            rect.left += this.l.left;
            rect.top += this.l.top;
            rect.right += this.l.right;
            rect.bottom += this.l.bottom;
        }
        vyVar.e = false;
        return rect;
    }

    final void gD() {
        int b2 = this.h.b();
        for (int i = 0; i < b2; i++) {
            wr l = l(this.h.e(i));
            if (!l.A()) {
                l.g();
            }
        }
        wf wfVar = this.e;
        int size = wfVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((wr) wfVar.c.get(i2)).g();
        }
        int size2 = wfVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((wr) wfVar.a.get(i3)).g();
        }
        ArrayList arrayList = wfVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((wr) wfVar.b.get(i4)).g();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        vx vxVar = this.o;
        if (vxVar != null) {
            return vxVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(p()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        vx vxVar = this.o;
        if (vxVar != null) {
            return vxVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(p()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.o != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.j;
    }

    public final int go(wr wrVar) {
        if (wrVar.q(524) || !wrVar.s()) {
            return -1;
        }
        qm qmVar = this.g;
        int i = wrVar.c;
        int size = qmVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ql qlVar = (ql) qmVar.a.get(i2);
            int i3 = qlVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = qlVar.b;
                    if (i4 <= i) {
                        int i5 = qlVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = qlVar.b;
                    if (i6 == i) {
                        i = qlVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (qlVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (qlVar.b <= i) {
                i += qlVar.d;
            }
        }
        return i;
    }

    public final int gp(View view) {
        wr l = l(view);
        if (l != null) {
            return l.fq();
        }
        return -1;
    }

    public final int gq(View view) {
        wr l = l(view);
        if (l != null) {
            return l.gz();
        }
        return -1;
    }

    public final int gr() {
        return this.q.size();
    }

    final long gs(wr wrVar) {
        return this.n.b ? wrVar.e : wrVar.c;
    }

    public final vt h(int i) {
        int gr = gr();
        if (i >= 0 && i < gr) {
            return (vt) this.q.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + gr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aQ().j();
    }

    public final wr i(int i) {
        wr wrVar = null;
        if (this.y) {
            return null;
        }
        int b2 = this.h.b();
        for (int i2 = 0; i2 < b2; i2++) {
            wr l = l(this.h.e(i2));
            if (l != null && !l.v() && go(l) == i) {
                if (!this.h.k(l.a)) {
                    return l;
                }
                wrVar = l;
            }
        }
        return wrVar;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aQ().a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wr j(int r6, boolean r7) {
        /*
            r5 = this;
            si r0 = r5.h
            int r0 = r0.b()
            r1 = 0
            r2 = 0
        L8:
            if (r1 >= r0) goto L3a
            si r3 = r5.h
            android.view.View r3 = r3.e(r1)
            wr r3 = l(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 != r6) goto L37
            goto L2a
        L23:
            int r4 = r3.gz()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            si r2 = r5.h
            android.view.View r4 = r3.a
            boolean r2 = r2.k(r4)
            if (r2 == 0) goto L36
            r2 = r3
            goto L37
        L36:
            return r3
        L37:
            int r1 = r1 + 1
            goto L8
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.j(int, boolean):wr");
    }

    public final wr k(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return l(view);
        }
        throw new IllegalArgumentException(a.j(this, view, "View ", " is not a direct child of "));
    }

    public final View n(float f, float f2) {
        int a2 = this.h.a();
        while (true) {
            a2--;
            if (a2 < 0) {
                return null;
            }
            View d2 = this.h.d(a2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f >= d2.getLeft() + translationX && f <= d2.getRight() + translationX && f2 >= d2.getTop() + translationY && f2 <= d2.getBottom() + translationY) {
                return d2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View o(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.o(android.view.View):android.view.View");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ao = 0;
        this.r = true;
        this.t = this.t && !isLayoutRequested();
        this.e.f();
        vx vxVar = this.o;
        if (vxVar != null) {
            vxVar.aQ(this);
        }
        this.R = false;
        if (b) {
            tu tuVar = (tu) tu.a.get();
            this.M = tuVar;
            if (tuVar == null) {
                this.M = new tu();
                int[] iArr = kvo.a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                tu tuVar2 = this.M;
                tuVar2.e = (long) (1.0E9f / f);
                tu.a.set(tuVar2);
            }
            this.M.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        tu tuVar;
        super.onDetachedFromWindow();
        vr vrVar = this.E;
        if (vrVar != null) {
            vrVar.c();
        }
        ay();
        this.r = false;
        vx vxVar = this.o;
        if (vxVar != null) {
            vxVar.aR(this, this.e);
        }
        this.U.clear();
        removeCallbacks(this.aE);
        while (zm.a.a() != null) {
        }
        wf wfVar = this.e;
        for (int i = 0; i < wfVar.c.size(); i++) {
            kzq.b(((wr) wfVar.c.get(i)).a);
        }
        wfVar.g(wfVar.h.n);
        Iterator a2 = new kvt(this).a();
        while (a2.hasNext()) {
            kzq.a((View) a2.next()).a();
        }
        if (!b || (tuVar = this.M) == null) {
            return;
        }
        tuVar.c.remove(this);
        this.M = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((vt) this.q.get(i)).b(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        int i5;
        float f3;
        if (this.o != null && !this.v && motionEvent.getAction() == 8) {
            float f4 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.o.ag()) {
                    i5 = 9;
                    f3 = -motionEvent.getAxisValue(9);
                } else {
                    i5 = 0;
                    f3 = 0.0f;
                }
                if (this.o.af()) {
                    i2 = i5;
                    z = false;
                    z2 = false;
                    i = 10;
                    f4 = f3;
                    f = motionEvent.getAxisValue(10);
                } else {
                    float f5 = f3;
                    f = 0.0f;
                    f4 = f5;
                    i2 = i5;
                    z = false;
                    z2 = false;
                    i = 0;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue = motionEvent.getAxisValue(26);
                if (this.o.ag()) {
                    f2 = -axisValue;
                    i3 = 26;
                    f = 0.0f;
                    i4 = 0;
                } else if (this.o.af()) {
                    f = axisValue;
                    i3 = 0;
                    f2 = 0.0f;
                    i4 = 26;
                } else {
                    i3 = 0;
                    f = 0.0f;
                    f2 = 0.0f;
                    i4 = 0;
                }
                z2 = this.V;
                i2 = i3;
                z = 26;
                i = i4;
                f4 = f2;
            } else {
                z = false;
                z2 = false;
                i = 0;
                i2 = 0;
                f = 0.0f;
            }
            float f6 = f4 * this.K;
            int i6 = (int) (f * this.J);
            int i7 = (int) f6;
            if (z2) {
                OverScroller overScroller = this.L.a;
                aN(i6 + (overScroller.getFinalX() - overScroller.getCurrX()), i7 + (overScroller.getFinalY() - overScroller.getCurrY()), null, true);
                recyclerView = this;
                motionEvent2 = motionEvent;
            } else {
                recyclerView = this;
                motionEvent2 = motionEvent;
                recyclerView.aJ(i6, i7, i, i2, motionEvent2);
            }
            if (z && !z2) {
                recyclerView.W.a(motionEvent2, 26);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b4, code lost:
    
        if (r9.F != 2) goto L90;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        I();
        Trace.endSection();
        this.t = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        vx vxVar = this.o;
        if (vxVar == null) {
            G(i, i2);
            return;
        }
        boolean z = false;
        if (vxVar.ah()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.o.bE(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aF = z;
            if (z || this.n == null) {
                return;
            }
            if (this.O.d == 1) {
                aT();
            }
            this.o.bh(i, i2);
            this.O.i = true;
            aU();
            this.o.bj(i, i2);
            if (this.o.al()) {
                this.o.bh(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.O.i = true;
                aU();
                this.o.bj(i, i2);
            }
            this.aG = getMeasuredWidth();
            this.aH = getMeasuredHeight();
            return;
        }
        if (this.s) {
            this.o.bE(i, i2);
            return;
        }
        if (this.w) {
            av();
            W();
            aX();
            X();
            wo woVar = this.O;
            if (woVar.k) {
                woVar.g = true;
            } else {
                this.g.e();
                this.O.g = false;
            }
            this.w = false;
            aw(false);
        } else if (this.O.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        vk vkVar = this.n;
        if (vkVar != null) {
            this.O.e = vkVar.a();
        } else {
            this.O.e = 0;
        }
        av();
        this.o.bE(i, i2);
        aw(false);
        this.O.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (aF()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof wj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wj wjVar = (wj) parcelable;
        this.f = wjVar;
        super.onRestoreInstanceState(wjVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        wj wjVar = new wj(super.onSaveInstanceState());
        wj wjVar2 = this.f;
        if (wjVar2 != null) {
            wjVar.a = wjVar2.a;
            return wjVar;
        }
        vx vxVar = this.o;
        if (vxVar != null) {
            wjVar.a = vxVar.R();
            return wjVar;
        }
        wjVar.a = null;
        return wjVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        R();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0192, code lost:
    
        if (r15 != 0) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final String p() {
        return " " + super.toString() + ", adapter:" + this.n + ", layout:" + this.o + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        wr l = l(view);
        if (l != null) {
            if (l.x()) {
                l.j();
            } else if (!l.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + l + p());
            }
        }
        view.clearAnimation();
        fj(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.o.bo() && !aF() && view2 != null) {
            aZ(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.o.bp(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.ai.size();
        for (int i = 0; i < size; i++) {
            ((wb) this.ai.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ak != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        vx vxVar = this.o;
        if (vxVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean af = vxVar.af();
        boolean ag = this.o.ag();
        if (!af) {
            if (!ag) {
                return;
            } else {
                ag = true;
            }
        }
        aG(true != af ? 0 : i, true != ag ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!aF()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.am |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.j) {
            R();
        }
        this.j = z;
        super.setClipToPadding(z);
        if (this.t) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aQ().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aQ().l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aQ().b();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            A("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.al = true;
                ay();
                return;
            }
            this.v = false;
            if (this.u && this.o != null && this.n != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void v(wr wrVar) {
        View view = wrVar.a;
        ViewParent parent = view.getParent();
        this.e.o(k(view));
        if (wrVar.x()) {
            this.h.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.h.f(view, -1, true);
            return;
        }
        si siVar = this.h;
        int b2 = siVar.e.b(view);
        if (b2 < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        siVar.a.e(b2);
        siVar.i(view);
    }

    public final void w(vt vtVar) {
        vx vxVar = this.o;
        if (vxVar != null) {
            vxVar.V("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            setWillNotDraw(false);
        }
        this.q.add(vtVar);
        U();
        requestLayout();
    }

    public final void x(vz vzVar) {
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(vzVar);
    }

    public final void y(wb wbVar) {
        this.ai.add(wbVar);
    }

    public final void z(wc wcVar) {
        if (this.az == null) {
            this.az = new ArrayList();
        }
        this.az.add(wcVar);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float scaledHorizontalScrollFactor;
        float scaledVerticalScrollFactor;
        RecyclerView recyclerView = this;
        recyclerView.ag = new wh(recyclerView);
        recyclerView.e = new wf(recyclerView);
        recyclerView.i = new zn();
        recyclerView.k = new vd(recyclerView);
        recyclerView.l = new Rect();
        recyclerView.ah = new Rect();
        recyclerView.m = new RectF();
        recyclerView.p = new ArrayList();
        recyclerView.q = new ArrayList();
        recyclerView.ai = new ArrayList();
        recyclerView.ak = 0;
        recyclerView.y = false;
        recyclerView.z = false;
        recyclerView.ao = 0;
        recyclerView.ap = 0;
        recyclerView.aq = d;
        recyclerView.E = new ta();
        recyclerView.F = 0;
        recyclerView.ar = -1;
        recyclerView.J = Float.MIN_VALUE;
        recyclerView.K = Float.MIN_VALUE;
        recyclerView.ay = true;
        recyclerView.L = new wq(recyclerView);
        recyclerView.N = b ? new ts() : null;
        recyclerView.O = new wo();
        recyclerView.P = false;
        recyclerView.Q = false;
        recyclerView.aJ = new vs(recyclerView);
        recyclerView.R = false;
        recyclerView.aA = new int[2];
        recyclerView.aC = new int[2];
        recyclerView.aD = new int[2];
        recyclerView.T = new int[2];
        recyclerView.U = new ArrayList();
        recyclerView.aE = new ve(recyclerView);
        recyclerView.aG = 0;
        recyclerView.aH = 0;
        recyclerView.aK = new vg(recyclerView);
        vh vhVar = new vh(recyclerView);
        recyclerView.aI = vhVar;
        recyclerView.W = new ktn(recyclerView.getContext(), vhVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.G = viewConfiguration.getScaledTouchSlop();
        scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        recyclerView.J = scaledHorizontalScrollFactor;
        scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        recyclerView.K = scaledVerticalScrollFactor;
        recyclerView.I = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.ax = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.af = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.E.k = recyclerView.aJ;
        recyclerView.g = new qm(new vj(recyclerView));
        recyclerView.h = new si(new vi(recyclerView));
        int[] iArr = kvo.a;
        if (kvg.a(recyclerView) == 0) {
            kvg.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.an = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.al(new wt(recyclerView));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ma.a, i, 0);
        kvo.o(recyclerView, context, ma.a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.j = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = recyclerView.getContext().getResources();
                new tn(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.fastscroll_margin));
                recyclerView = this;
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.p()));
            }
        }
        obtainStyledAttributes.recycle();
        recyclerView.V = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.bh(context, string, attributeSet, i);
        int[] iArr2 = ac;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        kvo.o(recyclerView, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(com.google.android.apps.messaging.R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        vx vxVar = this.o;
        if (vxVar != null) {
            return vxVar.cd(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(p()));
    }

    public void Z(int i) {
    }
}
