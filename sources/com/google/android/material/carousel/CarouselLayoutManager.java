package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import defpackage.a;
import defpackage.egyv;
import defpackage.ehcd;
import defpackage.ehcg;
import defpackage.ehch;
import defpackage.ehci;
import defpackage.ehcj;
import defpackage.ehck;
import defpackage.ehcl;
import defpackage.ehcm;
import defpackage.ehcn;
import defpackage.ehcq;
import defpackage.ehcr;
import defpackage.ehcs;
import defpackage.ehct;
import defpackage.ehcv;
import defpackage.ehcw;
import defpackage.kqp;
import defpackage.vx;
import defpackage.vy;
import defpackage.wf;
import defpackage.wm;
import defpackage.wo;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class CarouselLayoutManager extends vx implements ehcd, wm {
    int a;
    int b;
    int c;
    public ehcs d;
    private final ehci e;
    private ehcn f;
    private ehcr g;
    private int h;
    private Map i;
    private ehcm j;
    private final View.OnLayoutChangeListener k;
    private int l;
    private int m;
    private int n;

    public CarouselLayoutManager() {
        ehcv ehcvVar = new ehcv();
        this.e = new ehci();
        this.h = 0;
        this.k = new View.OnLayoutChangeListener() { // from class: ehcf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                final CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                view.post(new Runnable() { // from class: ehce
                    @Override // java.lang.Runnable
                    public final void run() {
                        CarouselLayoutManager.this.I();
                    }
                });
            }
        };
        this.m = -1;
        this.n = 0;
        J(ehcvVar);
        K(0);
    }

    private final float M(float f, float f2) {
        return L() ? f - f2 : f + f2;
    }

    private final float N(float f, float f2) {
        return L() ? f + f2 : f - f2;
    }

    private final float O(float f, ehcj ehcjVar) {
        ehcq ehcqVar = ehcjVar.b;
        ehcq ehcqVar2 = ehcjVar.a;
        float a = egyv.a(ehcqVar2.b, ehcqVar.b, ehcqVar2.a, ehcqVar.a, f);
        if (ehcjVar.b != this.g.b() && ehcjVar.a != this.g.d()) {
            return a;
        }
        ehcq ehcqVar3 = ehcjVar.b;
        return a + ((f - ehcqVar3.a) * (1.0f - ehcqVar3.c));
    }

    private final float P(int i) {
        return M(X() - this.a, this.g.a * i);
    }

    private final float S(View view) {
        RecyclerView.Q(view, new Rect());
        return g() ? r0.centerX() : r0.centerY();
    }

    private static int T(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private final int W() {
        return g() ? this.H : this.I;
    }

    private final int X() {
        return this.j.d();
    }

    private final int ac(int i, ehcr ehcrVar) {
        float f = i;
        if (!L()) {
            return (int) (((f * ehcrVar.a) - ehcrVar.a().a) + (ehcrVar.a / 2.0f));
        }
        float W = W() - ehcrVar.c().a;
        float f2 = ehcrVar.a;
        return (int) ((W - (f * f2)) - (f2 / 2.0f));
    }

    private final int ad(int i, ehcr ehcrVar) {
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (ehcq ehcqVar : ehcrVar.c.subList(ehcrVar.d, ehcrVar.e + 1)) {
            float f = ehcrVar.a;
            float f2 = (i * f) + (f / 2.0f);
            int W = (L() ? (int) ((W() - ehcqVar.a) - f2) : (int) (f2 - ehcqVar.a)) - this.a;
            if (Math.abs(i2) > Math.abs(W)) {
                i2 = W;
            }
        }
        return i2;
    }

    private final int ae(int i, wf wfVar, wo woVar) {
        if (at() != 0 && i != 0) {
            if (this.d == null) {
                bP(wfVar);
            }
            if (av() > ak(this.d).b) {
                int i2 = this.a;
                int T = T(i, i2, this.b, this.c);
                this.a = i2 + T;
                bR(this.d);
                float f = this.g.a / 2.0f;
                float P = P(bv(aH(0)));
                Rect rect = new Rect();
                float f2 = L() ? this.g.c().b : this.g.a().b;
                float f3 = Float.MAX_VALUE;
                for (int i3 = 0; i3 < at(); i3++) {
                    View aH = aH(i3);
                    float M = M(P, f);
                    ehcj ai = ai(this.g.c, M, false);
                    float O = O(M, ai);
                    RecyclerView.Q(aH, rect);
                    bQ(aH, M, ai);
                    this.j.j(aH, rect, f, O);
                    float abs = Math.abs(f2 - O);
                    if (aH != null && abs < f3) {
                        this.m = bv(aH);
                        f3 = abs;
                    }
                    P = M(P, this.g.a);
                }
                bO(wfVar, woVar);
                return T;
            }
        }
        return 0;
    }

    private static ehcj ai(List list, float f, boolean z) {
        float f2 = -3.4028235E38f;
        float f3 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ehcq ehcqVar = (ehcq) list.get(i5);
            float f6 = z ? ehcqVar.b : ehcqVar.a;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f3) {
                i = i5;
                f3 = abs;
            }
            if (f6 > f && abs <= f4) {
                i2 = i5;
                f4 = abs;
            }
            if (f6 <= f5) {
                f5 = f6;
            }
            if (f6 <= f5) {
                i3 = i5;
            }
            if (f6 > f2) {
                f2 = f6;
            }
            if (f6 > f2) {
                i4 = i5;
            }
        }
        if (i == -1) {
            i = i3;
        }
        if (i2 == -1) {
            i2 = i4;
        }
        return new ehcj((ehcq) list.get(i), (ehcq) list.get(i2));
    }

    private final ehcr ak(ehcs ehcsVar) {
        return L() ? ehcsVar.a() : ehcsVar.c();
    }

    private final ehcr ao(int i) {
        ehcr ehcrVar;
        Map map = this.i;
        return (map == null || (ehcrVar = (ehcr) map.get(Integer.valueOf(kqp.b(i, 0, Math.max(0, av() + (-1)))))) == null) ? this.d.a : ehcrVar;
    }

    private final void ap(View view, int i, ehch ehchVar) {
        float f = this.g.a / 2.0f;
        aM(view, i);
        ehcm ehcmVar = this.j;
        float f2 = ehchVar.c;
        ehcmVar.h(view, (int) (f2 - f), (int) (f2 + f));
        bQ(view, ehchVar.b, ehchVar.d);
    }

    private final void aq(wf wfVar, int i, int i2) {
        if (i < 0 || i >= av()) {
            return;
        }
        float P = P(i);
        View c = wfVar.c(i);
        bB(c);
        float M = M(P, this.g.a / 2.0f);
        ehcj ai = ai(this.g.c, M, false);
        ehch ehchVar = new ehch(c, M, O(M, ai), ai);
        ap(ehchVar.a, i2, ehchVar);
    }

    private final void bM(wf wfVar, wo woVar, int i) {
        float P = P(i);
        while (i < woVar.a()) {
            float M = M(P, this.g.a / 2.0f);
            ehcj ai = ai(this.g.c, M, false);
            float O = O(M, ai);
            if (bT(O, ai)) {
                return;
            }
            P = M(P, this.g.a);
            if (!bU(O, ai)) {
                View c = wfVar.c(i);
                bB(c);
                ap(c, -1, new ehch(c, M, O, ai));
            }
            i++;
        }
    }

    private final void bN(wf wfVar, int i) {
        float P = P(i);
        while (i >= 0) {
            float M = M(P, this.g.a / 2.0f);
            ehcj ai = ai(this.g.c, M, false);
            float O = O(M, ai);
            if (bU(O, ai)) {
                return;
            }
            P = N(P, this.g.a);
            if (!bT(O, ai)) {
                View c = wfVar.c(i);
                bB(c);
                ap(c, 0, new ehch(c, M, O, ai));
            }
            i--;
        }
    }

    private final void bO(wf wfVar, wo woVar) {
        while (at() > 0) {
            View aH = aH(0);
            float S = S(aH);
            if (!bU(S, ai(this.g.c, S, true))) {
                break;
            } else {
                bb(aH, wfVar);
            }
        }
        while (at() - 1 >= 0) {
            View aH2 = aH(at() - 1);
            float S2 = S(aH2);
            if (!bT(S2, ai(this.g.c, S2, true))) {
                break;
            } else {
                bb(aH2, wfVar);
            }
        }
        if (at() == 0) {
            bN(wfVar, this.h - 1);
            bM(wfVar, woVar, this.h);
        } else {
            int bv = bv(aH(0));
            int bv2 = bv(aH(at() - 1));
            bN(wfVar, bv - 1);
            bM(wfVar, woVar, bv2 + 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x03c3, code lost:
    
        if (r8 == r11) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0513, code lost:
    
        if (r4 == r10) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x010f, code lost:
    
        if (r14 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bP(defpackage.wf r27) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.bP(wf):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bQ(View view, float f, ehcj ehcjVar) {
        if (view instanceof ehct) {
            ehcq ehcqVar = ehcjVar.a;
            ehcq ehcqVar2 = ehcjVar.b;
            float a = egyv.a(ehcqVar.c, ehcqVar2.c, ehcqVar.a, ehcqVar2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF f2 = this.j.f(height, width, egyv.a(0.0f, height / 2.0f, 0.0f, 1.0f, a), egyv.a(0.0f, width / 2.0f, 0.0f, 1.0f, a));
            float O = O(f, ehcjVar);
            RectF rectF = new RectF(O - (f2.width() / 2.0f), O - (f2.height() / 2.0f), O + (f2.width() / 2.0f), (f2.height() / 2.0f) + O);
            RectF rectF2 = new RectF(r(), w(), s(), l());
            this.j.g(f2, rectF, rectF2);
            this.j.i(f2, rectF, rectF2);
            ((ehct) view).a(f2);
        }
    }

    private final void bR(ehcs ehcsVar) {
        int i = this.c;
        int i2 = this.b;
        if (i <= i2) {
            this.g = ak(ehcsVar);
        } else {
            this.g = ehcsVar.b(this.a, i2, i);
        }
        this.e.a = DesugarCollections.unmodifiableList(this.g.c);
    }

    private final void bS() {
        int av = av();
        int i = this.l;
        if (av == i || this.d == null) {
            return;
        }
        ehcv ehcvVar = (ehcv) this.f;
        if ((i < ehcvVar.e && av() >= ehcvVar.e) || (i >= ehcvVar.e && av() < ehcvVar.e)) {
            I();
        }
        this.l = av;
    }

    private final boolean bT(float f, ehcj ehcjVar) {
        float N = N(f, bV(f, ehcjVar) / 2.0f);
        return L() ? N < 0.0f : N > ((float) W());
    }

    private final boolean bU(float f, ehcj ehcjVar) {
        float M = M(f, bV(f, ehcjVar) / 2.0f);
        return L() ? M > ((float) W()) : M < 0.0f;
    }

    private static final float bV(float f, ehcj ehcjVar) {
        ehcq ehcqVar = ehcjVar.b;
        ehcq ehcqVar2 = ehcjVar.a;
        return egyv.a(ehcqVar2.d, ehcqVar.d, ehcqVar2.b, ehcqVar.b, f);
    }

    @Override // defpackage.vx
    public final void A(int i, int i2) {
        bS();
    }

    @Override // defpackage.vx
    public final int C(wo woVar) {
        if (at() == 0 || this.d == null || av() <= 1) {
            return 0;
        }
        return (int) (this.H * (this.d.a.a / E(woVar)));
    }

    @Override // defpackage.vx
    public final int D(wo woVar) {
        return this.a;
    }

    @Override // defpackage.vx
    public final int E(wo woVar) {
        return this.c - this.b;
    }

    @Override // defpackage.vx
    public final int F(wo woVar) {
        if (at() == 0 || this.d == null || av() <= 1) {
            return 0;
        }
        return (int) (this.I * (this.d.a.a / H(woVar)));
    }

    @Override // defpackage.vx
    public final int G(wo woVar) {
        return this.a;
    }

    @Override // defpackage.vx
    public final int H(wo woVar) {
        return this.c - this.b;
    }

    public final void I() {
        this.d = null;
        be();
    }

    public final void J(ehcn ehcnVar) {
        this.f = ehcnVar;
        I();
    }

    public final void K(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.h(i, "invalid orientation:"));
        }
        V(null);
        ehcm ehcmVar = this.j;
        if (ehcmVar == null || i != ehcmVar.b) {
            this.j = i != 0 ? new ehck(this) : new ehcl(this);
            I();
        }
    }

    public final boolean L() {
        return g() && aw() == 1;
    }

    @Override // defpackage.wm
    public final PointF Q(int i) {
        if (this.d == null) {
            return null;
        }
        float ac = ac(i, ao(i)) - this.a;
        return g() ? new PointF(ac, 0.0f) : new PointF(0.0f, ac);
    }

    @Override // defpackage.vx
    public final void Y(RecyclerView recyclerView, wf wfVar) {
        recyclerView.removeOnLayoutChangeListener(this.k);
    }

    @Override // defpackage.vx
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (at() > 0) {
            accessibilityEvent.setFromIndex(bv(aH(0)));
            accessibilityEvent.setToIndex(bv(aH(at() - 1)));
        }
    }

    @Override // defpackage.ehcd
    public final int a() {
        return this.n;
    }

    @Override // defpackage.vx
    public final void aS(View view, Rect rect) {
        RecyclerView.Q(view, rect);
        float centerY = rect.centerY();
        if (g()) {
            centerY = rect.centerX();
        }
        float bV = bV(centerY, ai(this.g.c, centerY, true));
        float width = g() ? (rect.width() - bV) / 2.0f : 0.0f;
        float height = g() ? 0.0f : (rect.height() - bV) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    @Override // defpackage.vx
    public final void aV(RecyclerView recyclerView) {
        ehcn ehcnVar = this.f;
        Context context = recyclerView.getContext();
        float f = ehcnVar.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        ehcnVar.a = f;
        float f2 = ehcnVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        ehcnVar.b = f2;
        I();
        recyclerView.addOnLayoutChangeListener(this.k);
    }

    @Override // defpackage.vx
    public final void ab(int i) {
        this.m = i;
        if (this.d == null) {
            return;
        }
        this.a = ac(i, ao(i));
        this.h = kqp.b(i, 0, Math.max(0, av() - 1));
        bR(this.d);
        be();
    }

    @Override // defpackage.vx
    public final boolean af() {
        return g();
    }

    @Override // defpackage.vx
    public final boolean ag() {
        return !g();
    }

    @Override // defpackage.vx
    public final boolean ah() {
        return true;
    }

    @Override // defpackage.vx
    public final void ar(RecyclerView recyclerView, int i) {
        ehcg ehcgVar = new ehcg(this, recyclerView.getContext());
        ehcgVar.g = i;
        bl(ehcgVar);
    }

    @Override // defpackage.ehcd
    public final int b() {
        return this.I;
    }

    @Override // defpackage.vx
    public final void bB(View view) {
        if (!(view instanceof ehct)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        vy vyVar = (vy) view.getLayoutParams();
        Rect rect = new Rect();
        aN(view, rect);
        int i = rect.left + rect.right;
        int i2 = rect.top + rect.bottom;
        ehcs ehcsVar = this.d;
        float f = (ehcsVar == null || this.j.b != 0) ? vyVar.width : ehcsVar.a.a;
        ehcs ehcsVar2 = this.d;
        view.measure(au(this.H, this.F, aB() + aC() + vyVar.leftMargin + vyVar.rightMargin + i, (int) f, g()), au(this.I, this.G, aE() + az() + vyVar.topMargin + vyVar.bottomMargin + i2, (int) ((ehcsVar2 == null || this.j.b != 1) ? vyVar.height : ehcsVar2.a.a), ag()));
    }

    @Override // defpackage.vx
    public final boolean bp(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int ad;
        if (this.d == null || (ad = ad(bv(view), ao(bv(view)))) == 0) {
            return false;
        }
        int i = this.a;
        int ad2 = ad(bv(view), this.d.b(i + T(ad, i, r0, r1), this.b, this.c));
        if (g()) {
            recyclerView.scrollBy(ad2, 0);
            return true;
        }
        recyclerView.scrollBy(0, ad2);
        return true;
    }

    @Override // defpackage.ehcd
    public final int c() {
        return this.H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0031, code lost:
    
        if (r9 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003a, code lost:
    
        if (L() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003d, code lost:
    
        if (r9 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0046, code lost:
    
        if (L() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ce(android.view.View r6, int r7, defpackage.wf r8, defpackage.wo r9) {
        /*
            r5 = this;
            int r9 = r5.at()
            r0 = 0
            if (r9 == 0) goto La4
            int r9 = r5.k()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r7 == r2) goto L4a
            r4 = 2
            if (r7 == r4) goto L48
            r4 = 17
            if (r7 == r4) goto L40
            r4 = 33
            if (r7 == r4) goto L3d
            r4 = 66
            if (r7 == r4) goto L34
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L31
            java.lang.String r9 = "Unknown focus request:"
            java.lang.String r7 = defpackage.a.h(r7, r9)
            java.lang.String r9 = "CarouselLayoutManager"
            android.util.Log.d(r9, r7)
        L2f:
            r7 = r1
            goto L4b
        L31:
            if (r9 != r2) goto L2f
            goto L48
        L34:
            if (r9 != 0) goto L2f
            boolean r7 = r5.L()
            if (r7 == 0) goto L48
            goto L4a
        L3d:
            if (r9 != r2) goto L2f
            goto L4a
        L40:
            if (r9 != 0) goto L2f
            boolean r7 = r5.L()
            if (r7 == 0) goto L4a
        L48:
            r7 = r2
            goto L4b
        L4a:
            r7 = r3
        L4b:
            if (r7 != r1) goto L4e
            return r0
        L4e:
            r9 = 0
            if (r7 != r3) goto L75
            int r6 = bv(r6)
            if (r6 != 0) goto L58
            return r0
        L58:
            android.view.View r6 = r5.aH(r9)
            int r6 = bv(r6)
            int r6 = r6 + r3
            r5.aq(r8, r6, r9)
            boolean r6 = r5.L()
            if (r6 == 0) goto L70
            int r6 = r5.at()
            int r9 = r6 + (-1)
        L70:
            android.view.View r6 = r5.aH(r9)
            return r6
        L75:
            int r6 = bv(r6)
            int r7 = r5.av()
            int r7 = r7 + r3
            if (r6 != r7) goto L81
            return r0
        L81:
            int r6 = r5.at()
            int r6 = r6 + r3
            android.view.View r6 = r5.aH(r6)
            int r6 = bv(r6)
            int r6 = r6 + r2
            r5.aq(r8, r6, r3)
            boolean r6 = r5.L()
            if (r6 == 0) goto L99
            goto L9f
        L99:
            int r6 = r5.at()
            int r9 = r6 + (-1)
        L9f:
            android.view.View r6 = r5.aH(r9)
            return r6
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.ce(android.view.View, int, wf, wo):android.view.View");
    }

    @Override // defpackage.vx
    public final int d(int i, wf wfVar, wo woVar) {
        if (g()) {
            return ae(i, wfVar, woVar);
        }
        return 0;
    }

    @Override // defpackage.vx
    public final int e(int i, wf wfVar, wo woVar) {
        if (ag()) {
            return ae(i, wfVar, woVar);
        }
        return 0;
    }

    @Override // defpackage.vx
    public final vy f() {
        return new vy(-2, -2);
    }

    @Override // defpackage.ehcd
    public final boolean g() {
        return this.j.b == 0;
    }

    public final int i(int i) {
        return (int) (this.a - ac(i, ao(i)));
    }

    public final int k() {
        return this.j.b;
    }

    public final int l() {
        return this.j.a();
    }

    @Override // defpackage.vx
    public final void o(wf wfVar, wo woVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (woVar.a() <= 0 || W() <= 0.0f) {
            aZ(wfVar);
            this.h = 0;
            return;
        }
        boolean L = L();
        ehcs ehcsVar = this.d;
        int i6 = 1;
        boolean z2 = ehcsVar == null;
        if (z2 || ehcsVar.a.f != W()) {
            bP(wfVar);
        }
        ehcs ehcsVar2 = this.d;
        boolean L2 = L();
        ehcr a = L2 ? ehcsVar2.a() : ehcsVar2.c();
        float X = X() - N((L2 ? a.c() : a.a()).a, a.a / 2.0f);
        ehcs ehcsVar3 = this.d;
        boolean L3 = L();
        ehcr c = L3 ? ehcsVar3.c() : ehcsVar3.a();
        ehcq a2 = L3 ? c.a() : c.c();
        int i7 = -1;
        int a3 = (int) (((((woVar.a() - 1) * c.a) * (true != L3 ? 1.0f : -1.0f)) - (a2.a - X())) + (((true != L3 ? 1 : -1) * a2.d) / 2.0f));
        int min = L3 ? Math.min(0, a3) : Math.max(0, a3);
        int i8 = (int) X;
        this.b = true != L ? i8 : min;
        if (true == L) {
            min = i8;
        }
        this.c = min;
        if (z2) {
            this.a = i8;
            ehcs ehcsVar4 = this.d;
            int av = av();
            int i9 = this.b;
            int i10 = this.c;
            boolean L4 = L();
            float f = ehcsVar4.a.a;
            HashMap hashMap = new HashMap();
            int i11 = 0;
            int i12 = 0;
            while (i11 < av) {
                if (L4) {
                    i3 = (av - i11) + i7;
                    i2 = i6;
                } else {
                    i2 = 0;
                    i3 = i11;
                }
                float f2 = i3 * f;
                if (i6 != i2) {
                    i4 = i6;
                    i5 = i7;
                } else {
                    i4 = i7;
                    i5 = i4;
                }
                if (f2 * i4 > i10 - ehcsVar4.e || i11 >= av - ehcsVar4.c.size()) {
                    hashMap.put(Integer.valueOf(i3), (ehcr) ehcsVar4.c.get(kqp.b(i12, 0, r11.size() - 1)));
                    i12++;
                }
                i11++;
                i7 = i5;
                i6 = 1;
            }
            int i13 = i7;
            int i14 = 0;
            for (int i15 = av - 1; i15 >= 0; i15--) {
                if (L4) {
                    i = (av - i15) - 1;
                    z = true;
                } else {
                    z = false;
                    i = i15;
                }
                if (i * f * (true != z ? 1 : i13) < i9 + ehcsVar4.d || i15 < ehcsVar4.b.size()) {
                    hashMap.put(Integer.valueOf(i), (ehcr) ehcsVar4.b.get(kqp.b(i14, 0, r11.size() - 1)));
                    i14++;
                }
            }
            this.i = hashMap;
            int i16 = this.m;
            if (i16 != i13) {
                this.a = ac(i16, ao(i16));
            }
        }
        int i17 = this.a;
        this.a = i17 + T(0, i17, this.b, this.c);
        this.h = kqp.b(this.h, 0, woVar.a());
        bR(this.d);
        aO(wfVar);
        bO(wfVar, woVar);
        this.l = av();
    }

    @Override // defpackage.vx
    public final void p(wo woVar) {
        if (at() == 0) {
            this.h = 0;
        } else {
            this.h = bv(aH(0));
        }
    }

    public final int r() {
        return this.j.b();
    }

    public final int s() {
        return this.j.c();
    }

    public final int w() {
        return this.j.e();
    }

    @Override // defpackage.vx
    public final void x(int i, int i2) {
        bS();
    }

    @Override // defpackage.vx
    public final void y() {
        bS();
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new ehci();
        this.h = 0;
        this.k = new View.OnLayoutChangeListener() { // from class: ehcf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i32 - i3 == i7 - i5 && i4 - i22 == i8 - i6) {
                    return;
                }
                final CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                view.post(new Runnable() { // from class: ehce
                    @Override // java.lang.Runnable
                    public final void run() {
                        CarouselLayoutManager.this.I();
                    }
                });
            }
        };
        this.m = -1;
        this.n = 0;
        J(new ehcv());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehcw.a);
            this.n = obtainStyledAttributes.getInt(0, 0);
            I();
            K(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
