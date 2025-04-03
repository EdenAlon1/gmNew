package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kes extends iya {
    private static final ffji j = ken.a;
    public final View a;
    public final WindowManager b;
    public final WindowManager.LayoutParams c;
    public kev d;
    public kah e;
    public final hho f;
    public final hho g;
    public final hkx h;
    public final int[] i;
    private ffix k;
    private kex l;
    private kac m;
    private final float n;
    private final Rect o;
    private final hte p;
    private Object q;
    private final hho r;
    private boolean s;
    private final keu t;

    public kes(ffix ffixVar, kex kexVar, View view, jzn jznVar, kev kevVar, UUID uuid, keu keuVar) {
        super(view.getContext(), null, 0, 6, null);
        this.k = ffixVar;
        this.l = kexVar;
        this.a = view;
        this.t = keuVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.b = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = kdy.a(this.l, kdy.c(view));
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.c = layoutParams;
        this.d = kevVar;
        this.e = kah.a;
        this.f = new hic(null, hla.a);
        this.g = new hic(null, hla.a);
        keo keoVar = new keo(this);
        hqg hqgVar = hkg.a;
        this.h = new hgk(keoVar, null);
        this.n = 8.0f;
        this.o = new Rect();
        this.p = new hte(new keq(this));
        setId(android.R.id.content);
        lmz.b(this, lmz.a(view));
        lna.b(this, lna.a(view));
        oxa.b(this, oxa.a(view));
        Objects.toString(uuid);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:".concat(String.valueOf(uuid)));
        setClipChildren(false);
        setElevation(jznVar.em(8.0f));
        setOutlineProvider(new kem());
        this.r = new hic(ked.a, hla.a);
        this.i = new int[2];
    }

    private final kac o() {
        View view = this.a;
        Rect rect = this.o;
        view.getWindowVisibleDisplayFrame(rect);
        int i = kdy.a;
        return new kac(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final ioc a() {
        return (ioc) this.g.a();
    }

    public final kaf b() {
        return (kaf) this.f.a();
    }

    @Override // defpackage.iya
    protected final boolean c() {
        return this.s;
    }

    @Override // defpackage.iya
    public final void d(hfd hfdVar) {
        hfdVar.v(-857613600);
        ((ffjm) this.r.a()).a(hfdVar, 0);
        hfdVar.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.l.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                ffix ffixVar = this.k;
                if (ffixVar != null) {
                    ffixVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.iya
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.c.width = childAt.getMeasuredWidth();
        this.c.height = childAt.getMeasuredHeight();
        keu.b(this.b, this, this.c);
    }

    @Override // defpackage.iya
    public final void h(int i, int i2) {
        kac o = o();
        super.h(View.MeasureSpec.makeMeasureSpec(o.b(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(o.a(), Integer.MIN_VALUE));
    }

    public final void k(hfr hfrVar, ffjm ffjmVar) {
        super.i(hfrVar);
        this.r.b(ffjmVar);
        this.s = true;
    }

    public final void l() {
        ioc a = a();
        if (a != null) {
            if (true != a.t()) {
                a = null;
            }
            if (a == null) {
                return;
            }
            long g = a.g();
            long b = iod.b(a);
            kac a2 = kad.a((Math.round(Float.intBitsToFloat((int) (b >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (b & 4294967295L)))), g);
            if (ffkj.e(a2, this.m)) {
                return;
            }
            this.m = a2;
            m();
        }
    }

    public final void m() {
        kaf b;
        kac kacVar = this.m;
        if (kacVar == null || (b = b()) == null) {
            return;
        }
        kac o = o();
        int b2 = o.b();
        long a = o.a();
        ffla fflaVar = new ffla();
        fflaVar.a = 0L;
        long j2 = (b2 << 32) | (a & 4294967295L);
        this.p.c(this, j, new ker(fflaVar, this, kacVar, j2, b.a));
        this.c.x = kaa.a(fflaVar.a);
        this.c.y = kaa.b(fflaVar.a);
        this.t.a(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        keu.b(this.b, this, this.c);
    }

    public final void n(ffix ffixVar, kex kexVar, kah kahVar) {
        int i;
        this.k = ffixVar;
        if (!ffkj.e(this.l, kexVar)) {
            this.l = kexVar;
            this.c.flags = kdy.a(kexVar, kdy.c(this.a));
            keu.b(this.b, this, this.c);
        }
        int ordinal = kahVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new ffcd();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r1 = findOnBackInvokedDispatcher();
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // defpackage.iya, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onAttachedToWindow() {
        /*
            r3 = this;
            super.onAttachedToWindow()
            hte r0 = r3.p
            r0.d()
            kex r0 = r3.l
            boolean r0 = r0.c
            if (r0 == 0) goto L36
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L15
            goto L36
        L15:
            java.lang.Object r0 = r3.q
            if (r0 != 0) goto L22
            ffix r0 = r3.k
            kdz r1 = new kdz
            r1.<init>()
            r3.q = r1
        L22:
            java.lang.Object r0 = r3.q
            boolean r1 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m460m(r0)
            if (r1 == 0) goto L36
            android.window.OnBackInvokedDispatcher r1 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r3)
            if (r1 == 0) goto L36
            r2 = 1000000(0xf4240, float:1.401298E-39)
            defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r1, r2, r0)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kes.onAttachedToWindow():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r1 = findOnBackInvokedDispatcher();
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onDetachedFromWindow() {
        /*
            r2 = this;
            super.onDetachedFromWindow()
            hte r0 = r2.p
            r0.e()
            hte r0 = r2.p
            r0.a()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L24
            java.lang.Object r0 = r2.q
            boolean r1 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m460m(r0)
            if (r1 == 0) goto L24
            android.window.OnBackInvokedDispatcher r1 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r2)
            if (r1 == 0) goto L24
            defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r1, r0)
        L24:
            r0 = 0
            r2.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kes.onDetachedFromWindow():void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            ffix ffixVar = this.k;
            if (ffixVar == null) {
                return true;
            }
            ffixVar.invoke();
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        ffix ffixVar2 = this.k;
        if (ffixVar2 == null) {
            return true;
        }
        ffixVar2.invoke();
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }
}
