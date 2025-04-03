package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.car.app.model.Alert;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import defpackage.akb$$ExternalSyntheticApiModelOutline0;
import defpackage.cmz;
import defpackage.cnw;
import defpackage.cok;
import defpackage.ffbx;
import defpackage.ffcd;
import defpackage.ffce;
import defpackage.ffcu;
import defpackage.ffdx;
import defpackage.ffhd;
import defpackage.ffix;
import defpackage.ffji;
import defpackage.ffkj;
import defpackage.ffkm;
import defpackage.ffkx;
import defpackage.fflb;
import defpackage.ffsl;
import defpackage.hgk;
import defpackage.hho;
import defpackage.hic;
import defpackage.hji;
import defpackage.hkg;
import defpackage.hkx;
import defpackage.hla;
import defpackage.hne;
import defpackage.hqg;
import defpackage.hrv;
import defpackage.hvd;
import defpackage.hvh;
import defpackage.hvi;
import defpackage.hvq;
import defpackage.hvu;
import defpackage.hvx;
import defpackage.hwc;
import defpackage.hwe;
import defpackage.hwf;
import defpackage.hwl;
import defpackage.hwq;
import defpackage.hwu;
import defpackage.hyh;
import defpackage.hyn;
import defpackage.hyu;
import defpackage.hyv;
import defpackage.hzb;
import defpackage.hzv;
import defpackage.hzw;
import defpackage.iac;
import defpackage.iam;
import defpackage.iau;
import defpackage.iaw;
import defpackage.ibu;
import defpackage.icm;
import defpackage.icz;
import defpackage.iir;
import defpackage.iit;
import defpackage.iiv;
import defpackage.ija;
import defpackage.ije;
import defpackage.ike;
import defpackage.ikf;
import defpackage.ikq;
import defpackage.ikx;
import defpackage.ikz;
import defpackage.ila;
import defpackage.iml;
import defpackage.imm;
import defpackage.imn;
import defpackage.ioc;
import defpackage.iod;
import defpackage.iqs;
import defpackage.irq;
import defpackage.isx;
import defpackage.isz;
import defpackage.itl;
import defpackage.iui;
import defpackage.iul;
import defpackage.iup;
import defpackage.ive;
import defpackage.ivf;
import defpackage.ivp;
import defpackage.ivu;
import defpackage.iwu;
import defpackage.iwx;
import defpackage.ixh;
import defpackage.iyi;
import defpackage.iyj;
import defpackage.iyk;
import defpackage.iyp;
import defpackage.iyq;
import defpackage.iys;
import defpackage.iyt;
import defpackage.iyu;
import defpackage.iyv;
import defpackage.iyw;
import defpackage.iyx;
import defpackage.iyy;
import defpackage.iyz;
import defpackage.izb;
import defpackage.izc;
import defpackage.izf;
import defpackage.izg;
import defpackage.izi;
import defpackage.izj;
import defpackage.izk;
import defpackage.izl;
import defpackage.izm;
import defpackage.izo;
import defpackage.izr;
import defpackage.jae;
import defpackage.jao;
import defpackage.jap;
import defpackage.jaq;
import defpackage.jas;
import defpackage.jat;
import defpackage.jau;
import defpackage.jav;
import defpackage.jbo;
import defpackage.jbu;
import defpackage.jbw;
import defpackage.jcj;
import defpackage.jck;
import defpackage.jcl;
import defpackage.jcm;
import defpackage.jcn;
import defpackage.jco;
import defpackage.jdt;
import defpackage.jea;
import defpackage.jeb;
import defpackage.jec;
import defpackage.jee;
import defpackage.jer;
import defpackage.jev;
import defpackage.jey;
import defpackage.jfb;
import defpackage.jft;
import defpackage.jfu;
import defpackage.jgi;
import defpackage.jgm;
import defpackage.jgo;
import defpackage.jip;
import defpackage.jiv;
import defpackage.jiw;
import defpackage.jix;
import defpackage.jiy;
import defpackage.jiz;
import defpackage.jja;
import defpackage.jjb;
import defpackage.jjg;
import defpackage.jjl;
import defpackage.jjn;
import defpackage.jjo;
import defpackage.jjp;
import defpackage.jjw;
import defpackage.jjx;
import defpackage.jjy;
import defpackage.jkm;
import defpackage.jku;
import defpackage.jky;
import defpackage.jlm;
import defpackage.jse;
import defpackage.jsl;
import defpackage.jvw;
import defpackage.jwf;
import defpackage.jzh;
import defpackage.jzk;
import defpackage.jzn;
import defpackage.kaa;
import defpackage.kac;
import defpackage.kad;
import defpackage.kah;
import defpackage.kau;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.ljv;
import defpackage.lkk;
import defpackage.lkr;
import defpackage.lmz;
import defpackage.owz;
import defpackage.oxa;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements iwx, ike, ljv {
    public static Class a;
    public static Method b;
    public final float[] A;
    public boolean B;
    public final hho C;
    public ffji D;
    public final jvw E;
    public final iir F;
    public final iiv G;
    public final irq H;
    public MotionEvent I;
    public long J;
    public final jgo K;
    public final izl L;
    public boolean M;
    public final jiy N;
    public int O;
    public final jdt P;
    public final jbo Q;
    public final jbw R;
    public final izg S;
    public final iaw T;
    private long U;
    private final boolean V;
    private final hho W;
    private final ViewTreeObserver.OnTouchModeChangeListener aA;
    private final jwf aB;
    private final AtomicReference aC;
    private final hho aD;
    private int aE;
    private final hho aF;
    private final cok aG;
    private final Runnable aH;
    private final ffix aI;
    private final jcm aJ;
    private boolean aK;
    private final jjg aa;
    private final EmptySemanticsElement ab;
    private final AndroidComposeView$bringIntoViewNode$1 ac;
    private boolean ad;
    private final hvi ae;
    private final hvi af;
    private final ibu ag;
    private final List ah;
    private List ai;
    private boolean aj;
    private boolean ak;
    private final ikf al;
    private final ila am;
    private boolean an;
    private jck ao;
    private jzk ap;
    private boolean aq;
    private long ar;
    private final int[] as;
    private final float[] at;
    private long au;
    private boolean av;
    private long aw;
    private final hkx ax;
    private final ViewTreeObserver.OnGlobalLayoutListener ay;
    private final ViewTreeObserver.OnScrollChangedListener az;
    public final iul c;
    public final hyv d;
    public ffhd e;
    public final AndroidDragAndDropManager f;
    public final jey g;
    public final jgi h;
    public final iui i;
    public final cnw j;
    public final jky k;
    public final jjy l;
    public final jae m;
    public final hwu n;
    public final iyi o;
    public final hwf p;
    public ffji q;
    public final hvu r;
    public final hvx s;
    public final iyk t;
    public final iyj u;
    public final ixh v;
    public boolean w;
    public jea x;
    public final ivf y;
    public final float[] z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1, hvi] */
    public AndroidComposeView(Context context, ffhd ffhdVar) {
        super(context);
        this.U = 9205357640488583168L;
        this.V = true;
        Object[] objArr = 0;
        this.c = new iul(0 == true ? 1 : 0);
        this.W = new hic(jzh.a(context), hji.a);
        jjg jjgVar = new jjg();
        this.aa = jjgVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(jjgVar);
        this.ab = emptySemanticsElement;
        ?? r2 = new ivp<jcl>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // defpackage.ivp
            public final /* bridge */ /* synthetic */ hvh d() {
                return new jcl(AndroidComposeView.this);
            }

            @Override // defpackage.ivp
            public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
                ((jcl) hvhVar).a = AndroidComposeView.this;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return AndroidComposeView.this.hashCode();
            }
        };
        this.ac = r2;
        FocusOwnerImpl focusOwnerImpl = new FocusOwnerImpl(new iyv(this), new iyw(this), new iyx(this), new iyy(this), new iyz(this), new ffkm(this) { // from class: iza
            @Override // defpackage.ffkm, defpackage.ffmu
            public final Object a() {
                return ((AndroidComposeView) this.g).n();
            }
        });
        this.d = focusOwnerImpl;
        this.e = ffhdVar;
        AndroidDragAndDropManager androidDragAndDropManager = new AndroidDragAndDropManager();
        this.f = androidDragAndDropManager;
        this.g = new jey();
        hvi a2 = ija.a(hvi.e, new izf(this));
        this.ae = a2;
        RotaryInputElement rotaryInputElement = new RotaryInputElement(izm.a);
        this.af = rotaryInputElement;
        this.ag = new ibu();
        jcj jcjVar = new jcj(ViewConfiguration.get(context));
        this.h = jcjVar;
        iui iuiVar = new iui(false, 3, 0 == true ? 1 : 0);
        iuiVar.j(iqs.a);
        iuiVar.ah(m());
        iuiVar.ai(jcjVar);
        iuiVar.k(hvd.a(emptySemanticsElement, rotaryInputElement).a(a2).a(focusOwnerImpl.e).a(androidDragAndDropManager.c).a(r2));
        this.i = iuiVar;
        cnw cnwVar = cmz.a;
        cnw cnwVar2 = new cnw((byte[]) null);
        this.j = cnwVar2;
        jky jkyVar = new jky(null);
        this.k = jkyVar;
        jjy jjyVar = new jjy(iuiVar, jjgVar, cnwVar2);
        this.l = jjyVar;
        jae jaeVar = new jae(this);
        this.m = jaeVar;
        hwu hwuVar = new hwu(this, new iyt(this));
        this.n = hwuVar;
        this.o = new iyi(context);
        this.T = new iaw(this);
        hwf hwfVar = new hwf();
        this.p = hwfVar;
        this.ah = new ArrayList();
        this.al = new ikf();
        this.am = new ila(iuiVar);
        this.q = iys.a;
        this.r = new hvu(this, hwfVar);
        AutofillManager m144m = akb$$ExternalSyntheticApiModelOutline0.m144m(context.getSystemService(akb$$ExternalSyntheticApiModelOutline0.m148m()));
        if (m144m == null) {
            imn.a("Autofill service could not be located.");
            throw new ffbx();
        }
        this.s = new hvx(new hwl(m144m), jjyVar, this, jkyVar, context.getPackageName());
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        iyk iykVar = new iyk((ClipboardManager) systemService);
        this.t = iykVar;
        this.u = new iyj(iykVar);
        this.v = new ixh(new izo(this));
        this.y = new ivf(iuiVar);
        this.ar = 9223372034707292159L;
        this.as = new int[]{0, 0};
        float[] e = icm.e();
        this.at = e;
        this.z = icm.e();
        this.A = icm.e();
        this.au = -1L;
        this.aw = 9187343241974906880L;
        this.B = true;
        this.C = new hic(null, hla.a);
        izr izrVar = new izr(this);
        hqg hqgVar = hkg.a;
        this.ax = new hgk(izrVar, null);
        this.ay = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: iyl
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.this.M();
            }
        };
        this.az = new ViewTreeObserver.OnScrollChangedListener() { // from class: iym
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.this.M();
            }
        };
        this.aA = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: iyn
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.this.G.a(true != z ? 2 : 1);
            }
        };
        jwf jwfVar = new jwf(this, this);
        this.aB = jwfVar;
        jvw jvwVar = new jvw(jwfVar);
        this.E = jvwVar;
        this.aC = new AtomicReference(null);
        this.P = new jdt(jvwVar);
        this.Q = new jbo();
        this.aD = new hic(jsl.a(context), hji.a);
        this.aE = af(context.getResources().getConfiguration());
        kah c = hyn.c(context.getResources().getConfiguration().getLayoutDirection());
        this.aF = new hic(c == null ? kah.a : c, hla.a);
        this.F = new iit(this);
        this.G = new iiv(true != isInTouchMode() ? 2 : 1);
        this.H = new irq(this);
        this.R = new jbw(this);
        this.K = new jgo();
        this.aG = new cok((byte[]) (objArr == true ? 1 : 0));
        this.L = new izl(this);
        this.aH = new Runnable() { // from class: iyo
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.M = false;
                MotionEvent motionEvent = androidComposeView.I;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.B(motionEvent);
            }
        };
        this.aI = new izk(this);
        this.aJ = Build.VERSION.SDK_INT < 29 ? new jcn(e) : new jco();
        addOnAttachStateChangeListener(hwuVar);
        setWillNotDraw(false);
        setFocusable(true);
        jau.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        kvo.p(this, jaeVar);
        setOnDragListener(androidDragAndDropManager);
        iuiVar.J(this);
        if (Build.VERSION.SDK_INT >= 29) {
            jap.a.a(this);
        }
        this.N = Build.VERSION.SDK_INT >= 31 ? new jiy() : null;
        this.S = new izg(this);
    }

    private final int U(MotionEvent motionEvent) {
        int actionMasked;
        removeCallbacks(this.L);
        try {
            this.au = AnimationUtils.currentAnimationTimeMillis();
            aa();
            long a2 = icm.a(this.z, (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX()) << 32));
            this.aw = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (a2 >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (a2 & 4294967295L))) & 4294967295L);
            boolean z = true;
            this.av = true;
            r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.I;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && ag(motionEvent, motionEvent2)) {
                    if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                        if (motionEvent2.getActionMasked() != 10 && z2) {
                            L(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                    this.am.b();
                }
                int toolType = motionEvent.getToolType(0);
                if (!z2 && toolType == 3 && actionMasked2 != 3 && actionMasked2 != 9 && ad(motionEvent)) {
                    L(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.I;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.I;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.al.b(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.I;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.I;
                        float y = motionEvent6 != null ? motionEvent6.getY() : Float.NaN;
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (x == x2 && y == y2) {
                            z = false;
                        }
                        MotionEvent motionEvent7 = this.I;
                        long eventTime = motionEvent7 != null ? motionEvent7.getEventTime() : -1L;
                        long eventTime2 = motionEvent.getEventTime();
                        if (z || eventTime != eventTime2) {
                            if (pointerId >= 0) {
                                this.al.b(pointerId);
                            }
                            this.am.a.a();
                        }
                    }
                }
                this.I = MotionEvent.obtainNoHistory(motionEvent);
                return B(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.av = false;
        }
    }

    private final View V(int i, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (ffkj.e(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View V = V(i, viewGroup.getChildAt(i2));
            if (V != null) {
                return V;
            }
        }
        return null;
    }

    private final void W(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).t();
            } else if (childAt instanceof ViewGroup) {
                W((ViewGroup) childAt);
            }
        }
    }

    private final void X() {
        if (this.ak) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.ak = false;
        }
    }

    private final void Y(iui iuiVar) {
        iuiVar.R();
        hne s = iuiVar.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            Y((iui) objArr[i2]);
        }
    }

    private final void Z(iui iuiVar) {
        this.y.j(iuiVar, false);
        hne s = iuiVar.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            Z((iui) objArr[i2]);
        }
    }

    private final void aa() {
        this.aJ.a(this, this.z);
        jev.a(this.z, this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ab(iui iuiVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (iuiVar != null) {
            while (iuiVar != null && iuiVar.aE() == 1) {
                if (!this.aq) {
                    iui u = iuiVar.u();
                    if (u == null) {
                        break;
                    }
                    long j = u.y().d;
                    if (jzk.k(j) && jzk.j(j)) {
                        break;
                    }
                }
                iuiVar = iuiVar.u();
            }
            if (iuiVar == this.i) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final void ac() {
        hho hhoVar = this.g.a;
    }

    private final boolean ad(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= 0.0f && x <= ((float) getWidth()) && y >= 0.0f && y <= ((float) getHeight());
    }

    private final boolean ae(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.I) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private static final int af(Configuration configuration) {
        int i;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i = configuration.fontWeightAdjustment;
        return i;
    }

    private static final boolean ag(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private static final boolean ah(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !jfb.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private static final long ai(int i, int i2) {
        return i2 | (i << 32);
    }

    private static final long aj(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return ai(0, size);
        }
        if (mode == 0) {
            return ai(0, Alert.DURATION_SHOW_INDEFINITELY);
        }
        if (mode == 1073741824) {
            return ai(size, size);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.iwx
    public final void A() {
        this.ak = true;
    }

    public final int B(MotionEvent motionEvent) {
        if (this.aK) {
            this.aK = false;
            jey.c(motionEvent.getMetaState());
        }
        ikx a2 = this.al.a(motionEvent, this);
        if (a2 == null) {
            this.am.b();
            return 0;
        }
        List list = a2.a;
        int size = list.size() - 1;
        Object obj = null;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj2 = list.get(size);
                if (((ikz) obj2).e) {
                    obj = obj2;
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        ikz ikzVar = (ikz) obj;
        if (ikzVar != null) {
            this.U = ikzVar.d;
        }
        int a3 = this.am.a(a2, this, ad(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (a3 & 1) != 0) {
            return a3;
        }
        this.al.b(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return a3;
    }

    public final View C(int i) {
        jeb jebVar = jee.a;
        jee a2 = jec.a();
        View view = this;
        while (view != null) {
            View rootView = getRootView();
            rootView.getClass();
            view = a2.a((ViewGroup) rootView, view, i);
            if (view != null) {
                if (!ffkj.e(view, this)) {
                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                        if (parent == this) {
                            break;
                        }
                    }
                }
                return view;
            }
        }
        return null;
    }

    public final iam D() {
        if (isFocused()) {
            return this.d.c();
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return hyn.b(findFocus, this);
    }

    public final iyq E() {
        return (iyq) this.ax.a();
    }

    public final jck F() {
        if (this.ao == null) {
            jck jckVar = new jck(getContext());
            this.ao = jckVar;
            addView(jckVar);
            requestLayout();
        }
        jck jckVar2 = this.ao;
        jckVar2.getClass();
        return jckVar2;
    }

    public final void G(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int b2;
        if (ffkj.e(str, this.m.y)) {
            int b3 = this.m.w.b(i);
            if (b3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, b3);
                return;
            }
            return;
        }
        if (!ffkj.e(str, this.m.z) || (b2 = this.m.x.b(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, b2);
    }

    public final void H(iwu iwuVar, boolean z) {
        if (!z) {
            if (this.aj) {
                return;
            }
            this.ah.remove(iwuVar);
            List list = this.ai;
            if (list != null) {
                list.remove(iwuVar);
                return;
            }
            return;
        }
        if (!this.aj) {
            this.ah.add(iwuVar);
            return;
        }
        List list2 = this.ai;
        if (list2 == null) {
            list2 = new ArrayList();
            this.ai = list2;
        }
        list2.add(iwuVar);
    }

    public final void I() {
        if (isFocused()) {
            super.clearFocus();
        } else if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    public final void J() {
        if (this.av) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.au) {
            this.au = currentAnimationTimeMillis;
            aa();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.as);
            int[] iArr = this.as;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.as;
            float f3 = iArr2[0];
            float f4 = iArr2[1];
            this.aw = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f2 - f4) & 4294967295L);
        }
    }

    public final void K() {
        this.an = true;
    }

    public final void L(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        int i3 = 1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
        }
        int i6 = 0;
        while (i6 < pointerCount) {
            int i7 = ((i2 < 0 || i6 < i2) ? 0 : i3) + i6;
            motionEvent.getPointerProperties(i7, pointerPropertiesArr[i6]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
            motionEvent.getPointerCoords(i7, pointerCoords);
            long h = h((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(pointerCoords.x) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (h >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (h & 4294967295L));
            i6++;
            i3 = 1;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        ikx a2 = this.al.a(obtain, this);
        a2.getClass();
        this.am.a(a2, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            r12 = this;
            int[] r0 = r12.as
            r12.getLocationOnScreen(r0)
            long r0 = r12.ar
            int r2 = defpackage.kaa.a(r0)
            int r0 = defpackage.kaa.b(r0)
            int[] r1 = r12.as
            r3 = 0
            r4 = r1[r3]
            r5 = 1
            if (r2 != r4) goto L23
            r6 = r1[r5]
            if (r0 != r6) goto L23
            long r6 = r12.au
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L45
        L23:
            r1 = r1[r5]
            long r6 = (long) r4
            long r8 = (long) r1
            r1 = 32
            long r6 = r6 << r1
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r6 = r6 | r8
            r12.ar = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r1) goto L45
            if (r0 == r1) goto L45
            iui r0 = r12.i
            iun r0 = r0.y
            ivm r0 = r0.o
            r0.u()
            r0 = r5
            goto L46
        L45:
            r0 = r3
        L46:
            r12.J()
            jky r1 = r12.k
            long r6 = r12.ar
            long r8 = r12.aw
            long r8 = defpackage.kab.c(r8)
            float[] r2 = r12.z
            int r4 = defpackage.jkz.a(r2)
            r4 = r4 & 2
            if (r4 == 0) goto L5e
            r2 = 0
        L5e:
            jlb r4 = r1.b
            long r10 = r4.c
            boolean r10 = defpackage.kaa.f(r8, r10)
            if (r10 != 0) goto L6c
            r4.c = r8
            r8 = r5
            goto L6d
        L6c:
            r8 = r3
        L6d:
            long r9 = r4.d
            boolean r9 = defpackage.kaa.f(r6, r9)
            if (r9 != 0) goto L78
            r4.d = r6
            r8 = r5
        L78:
            if (r2 == 0) goto L7c
        L7a:
            r3 = r5
            goto L83
        L7c:
            if (r8 != 0) goto L7a
            boolean r2 = r1.c
            if (r2 == 0) goto L83
            goto L7a
        L83:
            r1.c = r3
            ivf r1 = r12.y
            r1.b(r0)
            jky r0 = r12.k
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.M():void");
    }

    public final boolean P(int i) {
        jck jckVar;
        if (hyh.b(i, 7) || hyh.b(i, 8) || !hasFocus() || (jckVar = this.ao) == null) {
            return false;
        }
        Integer d = hyn.d(i);
        if (d == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int intValue = d.intValue();
        View rootView = getRootView();
        rootView.getClass();
        ViewGroup viewGroup = (ViewGroup) rootView;
        View findFocus = viewGroup.findFocus();
        if (findFocus == null) {
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        jeb jebVar = jee.a;
        View a2 = jec.a().a(viewGroup, findFocus, intValue);
        if (!hzb.a(i) || !jckVar.hasFocus()) {
            iam D = D();
            r5 = D != null ? icz.a(D) : null;
            if (a2 != null && r5 != null) {
                viewGroup.offsetDescendantRectToMyCoords(this, r5);
                viewGroup.offsetRectIntoDescendantCoords(a2, r5);
            }
        }
        if (a2 == null || a2 == findFocus) {
            return false;
        }
        View focusedChild = jckVar.getFocusedChild();
        ViewParent parent = a2.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent != null) {
            return hyn.e(a2, Integer.valueOf(intValue), r5);
        }
        return false;
    }

    public final boolean Q(hyh hyhVar, iam iamVar) {
        Integer d;
        if (isFocused() || hasFocus()) {
            return true;
        }
        int i = 130;
        if (hyhVar != null && (d = hyn.d(hyhVar.a)) != null) {
            i = d.intValue();
        }
        return super.requestFocus(i, iamVar != null ? icz.a(iamVar) : null);
    }

    public final void R(iwu iwuVar) {
        if (this.x != null) {
            Method method = jgm.a;
        }
        jgo jgoVar = this.K;
        jgoVar.a();
        jgoVar.a.n(new WeakReference(iwuVar, jgoVar.b));
        this.ah.remove(iwuVar);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        boolean isText2;
        boolean isDate2;
        boolean isList2;
        boolean isToggle2;
        jjn B;
        ffji ffjiVar;
        CharSequence textValue2;
        hvx hvxVar = this.s;
        if (hvxVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue m145m = akb$$ExternalSyntheticApiModelOutline0.m145m(sparseArray.get(keyAt));
                isText2 = m145m.isText();
                if (isText2) {
                    jjp jjpVar = (jjp) hvxVar.a.b.a(keyAt);
                    if (jjpVar != null && (B = jjpVar.B()) != null) {
                        jku jkuVar = jjl.a;
                        jjb jjbVar = (jjb) jjo.a(B, jjl.g);
                        if (jjbVar != null && (ffjiVar = (ffji) jjbVar.b) != null) {
                            textValue2 = m145m.getTextValue();
                        }
                    }
                } else {
                    isDate2 = m145m.isDate();
                    if (isDate2) {
                        Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else {
                        isList2 = m145m.isList();
                        if (isList2) {
                            Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                        } else {
                            isToggle2 = m145m.isToggle();
                            if (isToggle2) {
                                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                            }
                        }
                    }
                }
            }
        }
        hvu hvuVar = this.r;
        if (hvuVar == null || hvuVar.b.a.isEmpty()) {
            return;
        }
        int size2 = sparseArray.size();
        for (int i2 = 0; i2 < size2; i2++) {
            int keyAt2 = sparseArray.keyAt(i2);
            AutofillValue m145m2 = akb$$ExternalSyntheticApiModelOutline0.m145m(sparseArray.get(keyAt2));
            isText = m145m2.isText();
            if (isText) {
                hwf hwfVar = hvuVar.b;
                textValue = m145m2.getTextValue();
                textValue.toString();
                if (((hwe) hwfVar.a.get(Integer.valueOf(keyAt2))) != null) {
                    throw null;
                }
            } else {
                isDate = m145m2.isDate();
                if (isDate) {
                    throw new ffce("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                isList = m145m2.isList();
                if (isList) {
                    throw new ffce("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                isToggle = m145m2.isToggle();
                if (isToggle) {
                    throw new ffce("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.m.B(false, i, this.U);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.m.B(true, i, this.U);
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        this.w = iyp.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            Y(this.i);
        }
        r(true);
        hrv.c();
        this.aj = true;
        ibu ibuVar = this.ag;
        iau iauVar = ibuVar.a;
        Canvas canvas2 = iauVar.a;
        iauVar.a = canvas;
        this.i.N(iauVar, null);
        ibuVar.a.a = canvas2;
        if (!this.ah.isEmpty()) {
            int size = this.ah.size();
            for (int i = 0; i < size; i++) {
                ((iwu) this.ah.get(i)).j();
            }
        }
        if (jgm.d) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.ah.clear();
        this.aj = false;
        List list = this.ai;
        if (list != null) {
            this.ah.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        float scaledVerticalScrollFactor;
        float scaledHorizontalScrollFactor;
        iml imlVar;
        int size;
        ivu ivuVar;
        hvh hvhVar;
        ivu ivuVar2;
        if (this.M) {
            removeCallbacks(this.aH);
            if (motionEvent.getActionMasked() == 8) {
                this.M = false;
            } else {
                this.aH.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (ah(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (U(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        getContext();
        scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        getContext();
        scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        imm immVar = new imm(scaledVerticalScrollFactor * f, f * scaledHorizontalScrollFactor, motionEvent.getEventTime(), motionEvent.getDeviceId());
        hyv hyvVar = this.d;
        izc izcVar = new izc(this, motionEvent);
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) hyvVar;
        if (focusOwnerImpl.c.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode i = focusOwnerImpl.i();
        if (i != null) {
            if (!i.p.z) {
                imn.c("visitAncestors called on an unattached node");
            }
            hvh hvhVar2 = i.p;
            iui d = isx.d(i);
            loop0: while (true) {
                if (d == null) {
                    hvhVar = null;
                    break;
                }
                if ((d.x.e.r & 16384) != 0) {
                    while (hvhVar2 != null) {
                        if ((hvhVar2.q & 16384) != 0) {
                            hne hneVar = null;
                            hvhVar = hvhVar2;
                            while (hvhVar != null) {
                                if (hvhVar instanceof iml) {
                                    break loop0;
                                }
                                if ((hvhVar.q & 16384) != 0 && (hvhVar instanceof isz)) {
                                    int i2 = 0;
                                    for (hvh hvhVar3 = ((isz) hvhVar).n; hvhVar3 != null; hvhVar3 = hvhVar3.t) {
                                        if ((hvhVar3.q & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                hvhVar = hvhVar3;
                                            } else {
                                                if (hneVar == null) {
                                                    hneVar = new hne(new hvh[16]);
                                                }
                                                if (hvhVar != null) {
                                                    hneVar.n(hvhVar);
                                                }
                                                hneVar.n(hvhVar3);
                                                hvhVar = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                hvhVar = isx.a(hneVar);
                            }
                        }
                        hvhVar2 = hvhVar2.s;
                    }
                }
                d = d.u();
                hvhVar2 = (d == null || (ivuVar2 = d.x) == null) ? null : ivuVar2.d;
            }
            imlVar = (iml) hvhVar;
        } else {
            imlVar = null;
        }
        if (imlVar != null) {
            if (!imlVar.p.z) {
                imn.c("visitAncestors called on an unattached node");
            }
            hvh hvhVar4 = imlVar.p.s;
            iui d2 = isx.d(imlVar);
            ArrayList arrayList = null;
            while (d2 != null) {
                if ((d2.x.e.r & 16384) != 0) {
                    while (hvhVar4 != null) {
                        if ((hvhVar4.q & 16384) != 0) {
                            hvh hvhVar5 = hvhVar4;
                            hne hneVar2 = null;
                            while (hvhVar5 != null) {
                                if (hvhVar5 instanceof iml) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(hvhVar5);
                                } else if ((hvhVar5.q & 16384) != 0 && (hvhVar5 instanceof isz)) {
                                    int i3 = 0;
                                    for (hvh hvhVar6 = ((isz) hvhVar5).n; hvhVar6 != null; hvhVar6 = hvhVar6.t) {
                                        if ((hvhVar6.q & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                hvhVar5 = hvhVar6;
                                            } else {
                                                if (hneVar2 == null) {
                                                    hneVar2 = new hne(new hvh[16]);
                                                }
                                                if (hvhVar5 != null) {
                                                    hneVar2.n(hvhVar5);
                                                }
                                                hneVar2.n(hvhVar6);
                                                hvhVar5 = null;
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                hvhVar5 = isx.a(hneVar2);
                            }
                        }
                        hvhVar4 = hvhVar4.s;
                    }
                }
                d2 = d2.u();
                hvhVar4 = (d2 == null || (ivuVar = d2.x) == null) ? null : ivuVar.d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            hvh hvhVar7 = imlVar.p;
            hne hneVar3 = null;
            while (hvhVar7 != null) {
                if (hvhVar7 instanceof iml) {
                } else if ((hvhVar7.q & 16384) != 0 && (hvhVar7 instanceof isz)) {
                    int i5 = 0;
                    for (hvh hvhVar8 = ((isz) hvhVar7).n; hvhVar8 != null; hvhVar8 = hvhVar8.t) {
                        if ((hvhVar8.q & 16384) != 0) {
                            i5++;
                            if (i5 == 1) {
                                hvhVar7 = hvhVar8;
                            } else {
                                if (hneVar3 == null) {
                                    hneVar3 = new hne(new hvh[16]);
                                }
                                if (hvhVar7 != null) {
                                    hneVar3.n(hvhVar7);
                                }
                                hneVar3.n(hvhVar8);
                                hvhVar7 = null;
                            }
                        }
                    }
                    if (i5 != 1) {
                    }
                }
                hvhVar7 = isx.a(hneVar3);
            }
            if (((Boolean) izcVar.invoke()).booleanValue()) {
                return true;
            }
            hvh hvhVar9 = imlVar.p;
            hne hneVar4 = null;
            while (hvhVar9 != null) {
                if (hvhVar9 instanceof iml) {
                    ((iml) hvhVar9).a(immVar);
                } else if ((hvhVar9.q & 16384) != 0 && (hvhVar9 instanceof isz)) {
                    int i6 = 0;
                    for (hvh hvhVar10 = ((isz) hvhVar9).n; hvhVar10 != null; hvhVar10 = hvhVar10.t) {
                        if ((hvhVar10.q & 16384) != 0) {
                            i6++;
                            if (i6 == 1) {
                                hvhVar9 = hvhVar10;
                            } else {
                                if (hneVar4 == null) {
                                    hneVar4 = new hne(new hvh[16]);
                                }
                                if (hvhVar9 != null) {
                                    hneVar4.n(hvhVar9);
                                }
                                hneVar4.n(hvhVar10);
                                hvhVar9 = null;
                            }
                        }
                    }
                    if (i6 != 1) {
                    }
                }
                hvhVar9 = isx.a(hneVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((iml) arrayList.get(i7)).a(immVar);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.M) {
            removeCallbacks(this.aH);
            this.aH.run();
        }
        if (!ah(motionEvent) && isAttachedToWindow()) {
            jae jaeVar = this.m;
            if (jaeVar.E()) {
                int action = motionEvent.getAction();
                int i = Integer.MIN_VALUE;
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    jaeVar.b.r(true);
                    itl itlVar = new itl();
                    iui iuiVar = jaeVar.b.i;
                    long floatToRawIntBits = Float.floatToRawIntBits(x);
                    long floatToRawIntBits2 = Float.floatToRawIntBits(y);
                    ffix ffixVar = iui.b;
                    iuiVar.au((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), itlVar, true);
                    int e = ffdx.e(itlVar);
                    while (true) {
                        if (e < 0) {
                            break;
                        }
                        iui d = isx.d(itlVar.get(e));
                        if (((kbs) jaeVar.b.F().b.get(d)) != null) {
                            break;
                        }
                        if (d.x.j(8)) {
                            int m = jaeVar.m(d.d);
                            jjw b2 = jjx.b(d, false);
                            if (jfu.g(b2)) {
                                jjn e2 = b2.e();
                                jku jkuVar = jkm.a;
                                if (!e2.f(jkm.y)) {
                                    i = m;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        e--;
                    }
                    jaeVar.b.F().dispatchGenericMotionEvent(motionEvent);
                    jaeVar.A(i);
                } else if (action == 10) {
                    if (jaeVar.c != Integer.MIN_VALUE) {
                        jaeVar.A(Integer.MIN_VALUE);
                    } else {
                        jaeVar.b.F().dispatchGenericMotionEvent(motionEvent);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && ad(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.I;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.I = MotionEvent.obtainNoHistory(motionEvent);
                    this.M = true;
                    postDelayed(this.aH, 8L);
                    return false;
                }
            } else if (!ae(motionEvent)) {
                return false;
            }
            if ((U(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return this.d.f(keyEvent, new iyu(this, keyEvent));
        }
        jey.c(keyEvent.getMetaState());
        return this.d.f(keyEvent, hyu.a) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v11, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v12, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v13, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [hvh] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [hvh] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [hne] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [hne] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        ije ijeVar;
        int size;
        ivu ivuVar;
        isz iszVar;
        ivu ivuVar2;
        if (isFocused()) {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.d;
            if (focusOwnerImpl.c.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                FocusTargetNode a2 = hzw.a(focusOwnerImpl.b);
                if (a2 != null) {
                    if (!a2.p.z) {
                        imn.c("visitAncestors called on an unattached node");
                    }
                    hvh hvhVar = a2.p;
                    iui d = isx.d(a2);
                    loop0: while (true) {
                        if (d == null) {
                            iszVar = 0;
                            break;
                        }
                        if ((d.x.e.r & 131072) != 0) {
                            while (hvhVar != null) {
                                if ((hvhVar.q & 131072) != 0) {
                                    ?? r9 = 0;
                                    iszVar = hvhVar;
                                    while (iszVar != 0) {
                                        if (iszVar instanceof ije) {
                                            break loop0;
                                        }
                                        if ((iszVar.q & 131072) != 0 && (iszVar instanceof isz)) {
                                            hvh hvhVar2 = iszVar.n;
                                            int i = 0;
                                            iszVar = iszVar;
                                            r9 = r9;
                                            while (hvhVar2 != null) {
                                                if ((hvhVar2.q & 131072) != 0) {
                                                    i++;
                                                    r9 = r9;
                                                    if (i == 1) {
                                                        iszVar = hvhVar2;
                                                    } else {
                                                        if (r9 == 0) {
                                                            r9 = new hne(new hvh[16]);
                                                        }
                                                        if (iszVar != 0) {
                                                            r9.n(iszVar);
                                                        }
                                                        r9.n(hvhVar2);
                                                        iszVar = 0;
                                                    }
                                                }
                                                hvhVar2 = hvhVar2.t;
                                                iszVar = iszVar;
                                                r9 = r9;
                                            }
                                            if (i != 1) {
                                            }
                                        }
                                        iszVar = isx.a(r9);
                                    }
                                }
                                hvhVar = hvhVar.s;
                            }
                        }
                        d = d.u();
                        hvhVar = (d == null || (ivuVar2 = d.x) == null) ? null : ivuVar2.d;
                    }
                    ijeVar = (ije) iszVar;
                } else {
                    ijeVar = null;
                }
                if (ijeVar != null) {
                    if (!ijeVar.C().z) {
                        imn.c("visitAncestors called on an unattached node");
                    }
                    hvh hvhVar3 = ijeVar.C().s;
                    iui d2 = isx.d(ijeVar);
                    ArrayList arrayList = null;
                    while (d2 != null) {
                        if ((d2.x.e.r & 131072) != 0) {
                            while (hvhVar3 != null) {
                                if ((hvhVar3.q & 131072) != 0) {
                                    hvh hvhVar4 = hvhVar3;
                                    hne hneVar = null;
                                    while (hvhVar4 != null) {
                                        if (hvhVar4 instanceof ije) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(hvhVar4);
                                        } else if ((hvhVar4.q & 131072) != 0 && (hvhVar4 instanceof isz)) {
                                            int i2 = 0;
                                            for (hvh hvhVar5 = ((isz) hvhVar4).n; hvhVar5 != null; hvhVar5 = hvhVar5.t) {
                                                if ((hvhVar5.q & 131072) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        hvhVar4 = hvhVar5;
                                                    } else {
                                                        if (hneVar == null) {
                                                            hneVar = new hne(new hvh[16]);
                                                        }
                                                        if (hvhVar4 != null) {
                                                            hneVar.n(hvhVar4);
                                                        }
                                                        hneVar.n(hvhVar5);
                                                        hvhVar4 = null;
                                                    }
                                                }
                                            }
                                            if (i2 != 1) {
                                            }
                                        }
                                        hvhVar4 = isx.a(hneVar);
                                    }
                                }
                                hvhVar3 = hvhVar3.s;
                            }
                        }
                        d2 = d2.u();
                        hvhVar3 = (d2 == null || (ivuVar = d2.x) == null) ? null : ivuVar.d;
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            if (((ije) arrayList.get(size)).b()) {
                                break;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size = i3;
                        }
                    }
                    isz C = ijeVar.C();
                    ?? r3 = 0;
                    while (true) {
                        if (C == 0) {
                            isz C2 = ijeVar.C();
                            ?? r32 = 0;
                            while (true) {
                                if (C2 != 0) {
                                    if (C2 instanceof ije) {
                                        if (((ije) C2).a()) {
                                            break;
                                        }
                                    } else if ((C2.q & 131072) != 0 && (C2 instanceof isz)) {
                                        hvh hvhVar6 = C2.n;
                                        int i4 = 0;
                                        C2 = C2;
                                        r32 = r32;
                                        while (hvhVar6 != null) {
                                            if ((hvhVar6.q & 131072) != 0) {
                                                i4++;
                                                r32 = r32;
                                                if (i4 == 1) {
                                                    C2 = hvhVar6;
                                                } else {
                                                    if (r32 == 0) {
                                                        r32 = new hne(new hvh[16]);
                                                    }
                                                    if (C2 != 0) {
                                                        r32.n(C2);
                                                    }
                                                    r32.n(hvhVar6);
                                                    C2 = 0;
                                                }
                                            }
                                            hvhVar6 = hvhVar6.t;
                                            C2 = C2;
                                            r32 = r32;
                                        }
                                        if (i4 != 1) {
                                        }
                                    }
                                    C2 = isx.a(r32);
                                } else if (arrayList != null) {
                                    int size2 = arrayList.size();
                                    for (int i5 = 0; i5 < size2; i5++) {
                                        if (((ije) arrayList.get(i5)).a()) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (C instanceof ije) {
                                if (((ije) C).b()) {
                                    break;
                                }
                            } else if ((C.q & 131072) != 0 && (C instanceof isz)) {
                                hvh hvhVar7 = C.n;
                                int i6 = 0;
                                C = C;
                                r3 = r3;
                                while (hvhVar7 != null) {
                                    if ((hvhVar7.q & 131072) != 0) {
                                        i6++;
                                        r3 = r3;
                                        if (i6 == 1) {
                                            C = hvhVar7;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new hne(new hvh[16]);
                                            }
                                            if (C != 0) {
                                                r3.n(C);
                                            }
                                            r3.n(hvhVar7);
                                            C = 0;
                                        }
                                    }
                                    hvhVar7 = hvhVar7.t;
                                    C = C;
                                    r3 = r3;
                                }
                                if (i6 != 1) {
                                }
                            }
                            C = isx.a(r3);
                        }
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            jao.a.a(viewStructure, this);
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.M) {
            removeCallbacks(this.aH);
            MotionEvent motionEvent2 = this.I;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || ag(motionEvent, motionEvent2)) {
                this.aH.run();
            } else {
                this.M = false;
            }
        }
        if (ah(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !ae(motionEvent))) {
            return false;
        }
        int U = U(motionEvent);
        if ((U & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (U & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return V(i, this);
            }
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        iam b2;
        if (view == null || this.y.c) {
            return super.focusSearch(view, i);
        }
        jeb jebVar = jee.a;
        View a2 = jec.a().a(this, view, i);
        if (view == this) {
            b2 = this.d.c();
            if (b2 == null) {
                b2 = hyn.b(view, this);
            }
        } else {
            b2 = hyn.b(view, this);
        }
        hyh a3 = hyn.a(i);
        int i2 = a3 != null ? a3.a : 6;
        fflb fflbVar = new fflb();
        if (this.d.d(i2, b2, new izb(fflbVar)) != null) {
            Object obj = fflbVar.a;
            if (obj != null) {
                if (a2 != null) {
                    if (hzb.a(i2)) {
                        return super.focusSearch(view, i);
                    }
                    if (!iac.c(hzw.c((FocusTargetNode) obj), hyn.b(a2, this), b2, i2)) {
                    }
                }
                return this;
            }
            if (a2 != null) {
            }
            return a2;
        }
        return view;
    }

    @Override // defpackage.ike
    public final void g(float[] fArr) {
        J();
        icm.d(fArr, this.z);
        jav.b(fArr, Float.intBitsToFloat((int) (this.aw >> 32)), Float.intBitsToFloat((int) (this.aw & 4294967295L)), this.at);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        ffcu ffcuVar;
        iam D = D();
        if (D != null) {
            rect.left = Math.round(D.b);
            rect.top = Math.round(D.c);
            rect.right = Math.round(D.d);
            rect.bottom = Math.round(D.e);
            ffcuVar = ffcu.a;
        } else {
            ffcuVar = null;
        }
        if (ffcuVar == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.ilr
    public final long h(long j) {
        J();
        long a2 = icm.a(this.z, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (a2 >> 32)) + Float.intBitsToFloat((int) (this.aw >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (a2 & 4294967295L)) + Float.intBitsToFloat((int) (this.aw & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @Override // defpackage.ilr
    public final long i(long j) {
        J();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.aw >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.aw & 4294967295L));
        return icm.a(this.A, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    @Override // defpackage.iwx
    public final hyv j() {
        return this.d;
    }

    @Override // defpackage.iwx
    public final ixh k() {
        return this.v;
    }

    @Override // defpackage.iwx
    public final jse l() {
        return (jse) this.aD.a();
    }

    @Override // defpackage.iwx
    public final jzn m() {
        return (jzn) this.W.a();
    }

    @Override // defpackage.iwx
    public final kah n() {
        return (kah) this.aF.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.iwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.ffjm r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.izp
            if (r0 == 0) goto L13
            r0 = r6
            izp r0 = (defpackage.izp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            izp r0 = new izp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            defpackage.ffci.b(r6)
            goto L42
        L2f:
            defpackage.ffci.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.aC
            izq r2 = new izq
            r2.<init>(r4)
            r0.c = r3
            java.lang.Object r5 = defpackage.hvq.b(r6, r2, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            ffbx r5 = new ffbx
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.o(ffjm, ffgu):java.lang.Object");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        lkk P;
        lkr lkrVar;
        super.onAttachedToWindow();
        this.g.a(hasWindowFocus());
        ac();
        Z(this.i);
        Y(this.i);
        this.v.a.d();
        hvu hvuVar = this.r;
        if (hvuVar != null) {
            hvuVar.c.registerCallback(hwc.a);
        }
        lkr a2 = lmz.a(this);
        owz a3 = oxa.a(this);
        iyq E = E();
        if (E == null || (a2 != null && a3 != null && (a2 != (lkrVar = E.a) || a3 != lkrVar))) {
            if (a2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (E != null && (P = E.a.P()) != null) {
                P.d(this);
            }
            a2.P().c(this);
            iyq iyqVar = new iyq(a2, a3);
            this.C.b(iyqVar);
            ffji ffjiVar = this.D;
            if (ffjiVar != null) {
                ffjiVar.invoke(iyqVar);
            }
            this.D = null;
        }
        this.G.a(true != isInTouchMode() ? 2 : 1);
        iyq E2 = E();
        lkk P2 = E2 != null ? E2.a.P() : null;
        if (P2 == null) {
            imn.a("No lifecycle owner exists");
            throw new ffbx();
        }
        P2.c(this);
        P2.c(this.n);
        getViewTreeObserver().addOnGlobalLayoutListener(this.ay);
        getViewTreeObserver().addOnScrollChangedListener(this.az);
        getViewTreeObserver().addOnTouchModeChangeListener(this.aA);
        if (Build.VERSION.SDK_INT >= 31) {
            jas.a.b(this);
        }
        hvx hvxVar = this.s;
        if (hvxVar != null) {
            ((FocusOwnerImpl) this.d).f.h(hvxVar);
            this.l.c.h(hvxVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        jbu jbuVar = (jbu) hvq.a(this.aC);
        if (jbuVar == null) {
            return this.aB.b;
        }
        jer jerVar = (jer) hvq.a(jbuVar.d);
        return (jerVar == null || jerVar.e) ? false : true;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.W.b(jzh.a(getContext()));
        ac();
        if (af(configuration) != this.aE) {
            this.aE = af(configuration);
            this.aD.b(jsl.a(getContext()));
        }
        this.q.invoke(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r3.b != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c0 A[Catch: all -> 0x0407, TryCatch #0 {, blocks: (B:94:0x0199, B:98:0x019f, B:100:0x01c1, B:103:0x0200, B:105:0x020c, B:106:0x024a, B:109:0x02a4, B:111:0x02aa, B:113:0x02b2, B:115:0x02c0, B:116:0x02c6, B:118:0x02ce, B:120:0x02d6, B:121:0x02f6, B:123:0x02fa, B:124:0x02dd, B:126:0x02e3, B:127:0x02ea, B:129:0x02f0, B:130:0x0300, B:132:0x0319, B:134:0x0322, B:136:0x032a, B:137:0x038c, B:139:0x0392, B:140:0x0399, B:142:0x03e0, B:143:0x03eb, B:146:0x03e6, B:147:0x0389, B:148:0x0254, B:150:0x025a, B:151:0x0261, B:154:0x0269, B:157:0x0271, B:160:0x027b, B:163:0x0285, B:166:0x028f, B:169:0x029a, B:172:0x03f7, B:173:0x03fe, B:174:0x0212, B:175:0x0221, B:177:0x0227, B:179:0x0233, B:181:0x01c8, B:184:0x01d0, B:187:0x01d8, B:190:0x01e0, B:193:0x01e8, B:196:0x01f0, B:199:0x01f8, B:202:0x03ff, B:203:0x0406), top: B:93:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ce A[Catch: all -> 0x0407, TryCatch #0 {, blocks: (B:94:0x0199, B:98:0x019f, B:100:0x01c1, B:103:0x0200, B:105:0x020c, B:106:0x024a, B:109:0x02a4, B:111:0x02aa, B:113:0x02b2, B:115:0x02c0, B:116:0x02c6, B:118:0x02ce, B:120:0x02d6, B:121:0x02f6, B:123:0x02fa, B:124:0x02dd, B:126:0x02e3, B:127:0x02ea, B:129:0x02f0, B:130:0x0300, B:132:0x0319, B:134:0x0322, B:136:0x032a, B:137:0x038c, B:139:0x0392, B:140:0x0399, B:142:0x03e0, B:143:0x03eb, B:146:0x03e6, B:147:0x0389, B:148:0x0254, B:150:0x025a, B:151:0x0261, B:154:0x0269, B:157:0x0271, B:160:0x027b, B:163:0x0285, B:166:0x028f, B:169:0x029a, B:172:0x03f7, B:173:0x03fe, B:174:0x0212, B:175:0x0221, B:177:0x0227, B:179:0x0233, B:181:0x01c8, B:184:0x01d0, B:187:0x01d8, B:190:0x01e0, B:193:0x01e8, B:196:0x01f0, B:199:0x01f8, B:202:0x03ff, B:203:0x0406), top: B:93:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0319 A[Catch: all -> 0x0407, TryCatch #0 {, blocks: (B:94:0x0199, B:98:0x019f, B:100:0x01c1, B:103:0x0200, B:105:0x020c, B:106:0x024a, B:109:0x02a4, B:111:0x02aa, B:113:0x02b2, B:115:0x02c0, B:116:0x02c6, B:118:0x02ce, B:120:0x02d6, B:121:0x02f6, B:123:0x02fa, B:124:0x02dd, B:126:0x02e3, B:127:0x02ea, B:129:0x02f0, B:130:0x0300, B:132:0x0319, B:134:0x0322, B:136:0x032a, B:137:0x038c, B:139:0x0392, B:140:0x0399, B:142:0x03e0, B:143:0x03eb, B:146:0x03e6, B:147:0x0389, B:148:0x0254, B:150:0x025a, B:151:0x0261, B:154:0x0269, B:157:0x0271, B:160:0x027b, B:163:0x0285, B:166:0x028f, B:169:0x029a, B:172:0x03f7, B:173:0x03fe, B:174:0x0212, B:175:0x0221, B:177:0x0227, B:179:0x0233, B:181:0x01c8, B:184:0x01d0, B:187:0x01d8, B:190:0x01e0, B:193:0x01e8, B:196:0x01f0, B:199:0x01f8, B:202:0x03ff, B:203:0x0406), top: B:93:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0392 A[Catch: all -> 0x0407, TryCatch #0 {, blocks: (B:94:0x0199, B:98:0x019f, B:100:0x01c1, B:103:0x0200, B:105:0x020c, B:106:0x024a, B:109:0x02a4, B:111:0x02aa, B:113:0x02b2, B:115:0x02c0, B:116:0x02c6, B:118:0x02ce, B:120:0x02d6, B:121:0x02f6, B:123:0x02fa, B:124:0x02dd, B:126:0x02e3, B:127:0x02ea, B:129:0x02f0, B:130:0x0300, B:132:0x0319, B:134:0x0322, B:136:0x032a, B:137:0x038c, B:139:0x0392, B:140:0x0399, B:142:0x03e0, B:143:0x03eb, B:146:0x03e6, B:147:0x0389, B:148:0x0254, B:150:0x025a, B:151:0x0261, B:154:0x0269, B:157:0x0271, B:160:0x027b, B:163:0x0285, B:166:0x028f, B:169:0x029a, B:172:0x03f7, B:173:0x03fe, B:174:0x0212, B:175:0x0221, B:177:0x0227, B:179:0x0233, B:181:0x01c8, B:184:0x01d0, B:187:0x01d8, B:190:0x01e0, B:193:0x01e8, B:196:0x01f0, B:199:0x01f8, B:202:0x03ff, B:203:0x0406), top: B:93:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e0 A[Catch: all -> 0x0407, TryCatch #0 {, blocks: (B:94:0x0199, B:98:0x019f, B:100:0x01c1, B:103:0x0200, B:105:0x020c, B:106:0x024a, B:109:0x02a4, B:111:0x02aa, B:113:0x02b2, B:115:0x02c0, B:116:0x02c6, B:118:0x02ce, B:120:0x02d6, B:121:0x02f6, B:123:0x02fa, B:124:0x02dd, B:126:0x02e3, B:127:0x02ea, B:129:0x02f0, B:130:0x0300, B:132:0x0319, B:134:0x0322, B:136:0x032a, B:137:0x038c, B:139:0x0392, B:140:0x0399, B:142:0x03e0, B:143:0x03eb, B:146:0x03e6, B:147:0x0389, B:148:0x0254, B:150:0x025a, B:151:0x0261, B:154:0x0269, B:157:0x0271, B:160:0x027b, B:163:0x0285, B:166:0x028f, B:169:0x029a, B:172:0x03f7, B:173:0x03fe, B:174:0x0212, B:175:0x0221, B:177:0x0227, B:179:0x0233, B:181:0x01c8, B:184:0x01d0, B:187:0x01d8, B:190:0x01e0, B:193:0x01e8, B:196:0x01f0, B:199:0x01f8, B:202:0x03ff, B:203:0x0406), top: B:93:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e6 A[Catch: all -> 0x0407, TryCatch #0 {, blocks: (B:94:0x0199, B:98:0x019f, B:100:0x01c1, B:103:0x0200, B:105:0x020c, B:106:0x024a, B:109:0x02a4, B:111:0x02aa, B:113:0x02b2, B:115:0x02c0, B:116:0x02c6, B:118:0x02ce, B:120:0x02d6, B:121:0x02f6, B:123:0x02fa, B:124:0x02dd, B:126:0x02e3, B:127:0x02ea, B:129:0x02f0, B:130:0x0300, B:132:0x0319, B:134:0x0322, B:136:0x032a, B:137:0x038c, B:139:0x0392, B:140:0x0399, B:142:0x03e0, B:143:0x03eb, B:146:0x03e6, B:147:0x0389, B:148:0x0254, B:150:0x025a, B:151:0x0261, B:154:0x0269, B:157:0x0271, B:160:0x027b, B:163:0x0285, B:166:0x028f, B:169:0x029a, B:172:0x03f7, B:173:0x03fe, B:174:0x0212, B:175:0x0221, B:177:0x0227, B:179:0x0233, B:181:0x01c8, B:184:0x01d0, B:187:0x01d8, B:190:0x01e0, B:193:0x01e8, B:196:0x01f0, B:199:0x01f8, B:202:0x03ff, B:203:0x0406), top: B:93:0x0199 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r26) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        jjw jjwVar;
        AutofillId autofillId;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j : jArr) {
            hwu hwuVar = this.n;
            jft jftVar = (jft) hwuVar.g().a((int) j);
            if (jftVar != null && (jjwVar = jftVar.a) != null) {
                AndroidComposeView androidComposeView = hwuVar.a;
                int i = jjwVar.e;
                autofillId = androidComposeView.getAutofillId();
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(autofillId, i);
                jku jkuVar = jkm.a;
                List list = (List) jjo.a(jjwVar.c, jkm.z);
                if (list != null) {
                    forText = TranslationRequestValue.forText(new jlm(kau.d(list, "\n", null, 62)));
                    builder.setValue("android:text", forText);
                    build = builder.build();
                    consumer.o(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ixh ixhVar = this.v;
        ixhVar.a.e();
        ixhVar.a.a();
        iyq E = E();
        lkk P = E != null ? E.a.P() : null;
        if (P == null) {
            imn.a("No lifecycle owner exists");
            throw new ffbx();
        }
        P.d(this.n);
        P.d(this);
        hvu hvuVar = this.r;
        if (hvuVar != null) {
            hvuVar.c.unregisterCallback(hwc.a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.ay);
        getViewTreeObserver().removeOnScrollChangedListener(this.az);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.aA);
        if (Build.VERSION.SDK_INT >= 31) {
            jas.a.a(this);
        }
        hvx hvxVar = this.s;
        if (hvxVar != null) {
            this.l.c.g(hvxVar);
            ((FocusOwnerImpl) this.d).f.g(hvxVar);
        }
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        hzv.b(((FocusOwnerImpl) this.d).b, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.au = 0L;
        this.y.i(this.aI);
        this.ap = null;
        M();
        if (this.ao != null) {
            F().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0054, code lost:
    
        if (defpackage.jzk.g(r3.a, r9) == false) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onMeasure(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r7.a.g(defpackage.jkm.q) == false) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        ikq ikqVar;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (ikqVar = this.S.b) == null) ? super.onResolvePointerIcon(motionEvent, i) : jat.b(getContext(), ikqVar);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.V) {
            kah c = hyn.c(i);
            if (c == null) {
                c = kah.a;
            }
            this.aF.b(c);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        jiy jiyVar;
        if (Build.VERSION.SDK_INT >= 31 && (jiyVar = this.N) != null) {
            jjy jjyVar = this.l;
            ffhd ffhdVar = this.e;
            hne hneVar = new hne(new jiz[16]);
            jja.b(jjyVar.a(), 0, new jiv(hneVar));
            final ffji[] ffjiVarArr = {jiw.a, jix.a};
            hneVar.j(new Comparator() { // from class: ffgi
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    for (int i = 0; i < 2; i++) {
                        ffji ffjiVar = ffjiVarArr[i];
                        int a2 = ffgh.a((Comparable) ffjiVar.invoke(obj), (Comparable) ffjiVar.invoke(obj2));
                        if (a2 != 0) {
                            return a2;
                        }
                    }
                    return 0;
                }
            });
            int i = hneVar.b;
            jiz jizVar = (jiz) (i == 0 ? null : hneVar.a[i - 1]);
            if (jizVar != null) {
                jip jipVar = new jip(jizVar.a, jizVar.c, ffsl.b(ffhdVar), jiyVar, this);
                ioc iocVar = jizVar.d;
                kac kacVar = jizVar.c;
                iam d = iod.d(iocVar);
                long d2 = kacVar.d();
                ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, icz.b(kad.b(d)), new Point(kaa.a(d2), kaa.b(d2)), jipVar);
                scrollCaptureTarget.setScrollBounds(icz.b(jizVar.c));
                consumer.o(scrollCaptureTarget);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(final LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        final hwu hwuVar = this.n;
        if (ffkj.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            hwq.a(hwuVar, longSparseArray);
        } else {
            hwuVar.a.post(new Runnable() { // from class: hwp
                @Override // java.lang.Runnable
                public final void run() {
                    hwq.a(hwu.this, longSparseArray);
                }
            });
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean a2;
        this.g.a(z);
        this.aK = true;
        super.onWindowFocusChanged(z);
        if (!z || this.w == (a2 = iyp.a())) {
            return;
        }
        this.w = a2;
        Y(this.i);
    }

    @Override // defpackage.iwx
    public final void p(iui iuiVar, boolean z) {
        this.y.e(iuiVar, z);
    }

    @Override // defpackage.iwx
    public final void q() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.O == 0) {
                jaq.a.a(this, true);
            }
            this.O++;
        }
    }

    @Override // defpackage.iwx
    public final void r(boolean z) {
        ffix ffixVar;
        if (this.y.h() || this.y.e.a.b != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    ffixVar = this.aI;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                ffixVar = null;
            }
            if (this.y.i(ffixVar)) {
                requestLayout();
            }
            this.y.b(false);
            X();
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        iam iamVar;
        View C;
        if (isFocused()) {
            return true;
        }
        if (this.ad) {
            return false;
        }
        boolean z = ((FocusOwnerImpl) this.d).d.a;
        hyh a2 = hyn.a(i);
        int i2 = a2 != null ? a2.a : 7;
        if (hasFocus() && P(i2)) {
            return true;
        }
        ffkx ffkxVar = new ffkx();
        hyv hyvVar = this.d;
        if (rect != null) {
            iamVar = icz.d(rect);
        } else {
            rect = null;
            iamVar = null;
        }
        Boolean d = hyvVar.d(i2, iamVar, new izj(ffkxVar, i2));
        if (d == null) {
            return false;
        }
        if (d.booleanValue()) {
            return true;
        }
        if (ffkxVar.a) {
            return false;
        }
        if ((rect != null && !hasFocus() && ffkj.e(this.d.d(i2, null, new izi(i2)), true)) || (C = C(i)) == null || C == this) {
            return true;
        }
        this.ad = true;
        boolean requestFocus = C.requestFocus(i);
        this.ad = false;
        return requestFocus;
    }

    @Override // defpackage.iwx
    public final void s(iui iuiVar, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ivf ivfVar = this.y;
            if (!iuiVar.D) {
                if (ffkj.e(iuiVar, ivfVar.a)) {
                    imn.b("measureAndLayout called on root");
                }
                if (!ivfVar.a.e()) {
                    imn.b("performMeasureAndLayout called with unattached root");
                }
                if (!ivfVar.a.g()) {
                    imn.b("performMeasureAndLayout called with unplaced root");
                }
                if (ivfVar.c) {
                    imn.b("performMeasureAndLayout called during measure layout");
                }
                if (ivfVar.h != null) {
                    ivfVar.c = true;
                    ivfVar.d = false;
                    try {
                        ivfVar.b.e(iuiVar);
                        if ((ivf.l(iuiVar, new jzk(j)) || iuiVar.am()) && ffkj.e(iuiVar.D(), true)) {
                            iuiVar.U();
                        }
                        ivfVar.d(iuiVar);
                        ivf.m(iuiVar, new jzk(j));
                        if (iuiVar.al() && iuiVar.g()) {
                            iuiVar.ac();
                            ivfVar.e.b(iuiVar);
                        }
                        ivfVar.c();
                        ivfVar.c = false;
                        ivfVar.d = false;
                        iup iupVar = ivfVar.i;
                    } finally {
                    }
                }
                ivfVar.a();
            }
            if (!this.y.h()) {
                this.y.b(false);
                X();
            }
            this.k.a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7 A[Catch: all -> 0x0177, TryCatch #0 {all -> 0x0177, blocks: (B:21:0x0058, B:23:0x0072, B:26:0x0088, B:28:0x0098, B:30:0x00a2, B:32:0x00a8, B:34:0x00b8, B:42:0x00ca, B:44:0x00df, B:46:0x00e7, B:49:0x00fa, B:65:0x011d, B:67:0x0138, B:69:0x013e, B:71:0x014b, B:73:0x0143, B:81:0x0157), top: B:20:0x0058 }] */
    @Override // defpackage.iwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.t():void");
    }

    @Override // defpackage.iwx
    public final void u(iui iuiVar) {
        jae jaeVar = this.m;
        jaeVar.t = true;
        if (jaeVar.D()) {
            jaeVar.u(iuiVar);
        }
        hwu hwuVar = this.n;
        hwuVar.b = true;
        if (hwuVar.n()) {
            hwuVar.j();
        }
    }

    @Override // defpackage.iwx
    public final void v(iui iuiVar, boolean z, boolean z2, boolean z3) {
        iui u;
        iui u2;
        if (!z) {
            if (this.y.j(iuiVar, z2) && z3) {
                ab(iuiVar);
                return;
            }
            return;
        }
        ivf ivfVar = this.y;
        if (iuiVar.k == null) {
            imn.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int aD = iuiVar.aD();
        int i = aD - 1;
        if (aD == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return;
            }
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new ffcd();
                }
                if (!iuiVar.an() || z2) {
                    iuiVar.W();
                    iuiVar.X();
                    if (iuiVar.D) {
                        return;
                    }
                    if ((ffkj.e(iuiVar.D(), true) || ivf.o(iuiVar)) && ((u = iuiVar.u()) == null || !u.an())) {
                        ivfVar.b.a(iuiVar, true);
                    } else if ((iuiVar.g() || ivf.n(iuiVar)) && ((u2 = iuiVar.u()) == null || !u2.ao())) {
                        ivfVar.b.a(iuiVar, false);
                    }
                    if (ivfVar.d || !z3) {
                        return;
                    }
                    ab(iuiVar);
                    return;
                }
                return;
            }
        }
        ivfVar.g.n(new ive(iuiVar, true, z2));
        iup iupVar = ivfVar.i;
    }

    @Override // defpackage.iwx
    public final void w(iui iuiVar, boolean z, boolean z2) {
        if (!z) {
            ivf ivfVar = this.y;
            int aD = iuiVar.aD();
            int i = aD - 1;
            if (aD == 0) {
                throw null;
            }
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                iup iupVar = ivfVar.i;
                return;
            }
            if (i != 4) {
                throw new ffcd();
            }
            if (!z2 && iuiVar.g() == iuiVar.ap() && (iuiVar.ao() || iuiVar.al())) {
                iup iupVar2 = ivfVar.i;
                return;
            }
            iuiVar.V();
            if (iuiVar.D || !iuiVar.ap()) {
                return;
            }
            iui u = iuiVar.u();
            if ((u == null || !u.al()) && (u == null || !u.ao())) {
                ivfVar.b.a(iuiVar, false);
            }
            if (ivfVar.d) {
                return;
            }
            ab(null);
            return;
        }
        ivf ivfVar2 = this.y;
        int aD2 = iuiVar.aD();
        int i2 = aD2 - 1;
        if (aD2 == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new ffcd();
                        }
                    }
                }
            }
            iup iupVar3 = ivfVar2.i;
            return;
        }
        if ((iuiVar.an() || iuiVar.am()) && !z2) {
            iup iupVar4 = ivfVar2.i;
            return;
        }
        iuiVar.y.e();
        iuiVar.V();
        if (iuiVar.D) {
            return;
        }
        iui u2 = iuiVar.u();
        if (ffkj.e(iuiVar.D(), true) && ((u2 == null || !u2.an()) && (u2 == null || !u2.am()))) {
            ivfVar2.b.a(iuiVar, true);
        } else if (iuiVar.g() && ((u2 == null || !u2.al()) && (u2 == null || !u2.ao()))) {
            ivfVar2.b.a(iuiVar, false);
        }
        if (ivfVar2.d) {
            return;
        }
        ab(null);
    }

    @Override // defpackage.iwx
    public final void x() {
        jae jaeVar = this.m;
        jaeVar.t = true;
        if (jaeVar.D() && !jaeVar.C) {
            jaeVar.C = true;
            jaeVar.h.post(jaeVar.D);
        }
        hwu hwuVar = this.n;
        hwuVar.b = true;
        if (!hwuVar.n() || hwuVar.f) {
            return;
        }
        hwuVar.f = true;
        hwuVar.c.post(hwuVar.g);
    }

    @Override // defpackage.iwx
    public final void y(ffix ffixVar) {
        if (this.aG.n(ffixVar)) {
            return;
        }
        this.aG.h(ffixVar);
    }

    @Override // defpackage.iwx
    public final void z(iui iuiVar) {
        this.y.e.b(iuiVar);
        ab(null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addView(view, -1, generateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }
}
