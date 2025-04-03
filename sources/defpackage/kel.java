package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kel extends abg {
    public ffix a;
    public keh c;
    public final kef d;
    private final View e;
    private final float f;

    public kel(ffix ffixVar, keh kehVar, View view, kah kahVar, jzn jznVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), true != kehVar.d ? R.style.FloatingDialogWindowTheme : R.style.DialogWindowTheme));
        this.a = ffixVar;
        this.c = kehVar;
        this.e = view;
        this.f = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        kwg.a(window, this.c.d);
        window.setGravity(17);
        kef kefVar = new kef(getContext(), window);
        Objects.toString(uuid);
        kefVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        kefVar.setClipChildren(false);
        kefVar.setElevation(jznVar.em(8.0f));
        kefVar.setOutlineProvider(new kej());
        this.d = kefVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView(kefVar);
        lmz.b(kefVar, lmz.a(view));
        lna.b(kefVar, lna.a(view));
        oxa.b(kefVar, oxa.a(view));
        a(this.a, this.c, kahVar);
        acc.a(this.b, this, true, new kek(this));
    }

    private static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof kef) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    public final void a(ffix ffixVar, keh kehVar, kah kahVar) {
        int i;
        this.a = ffixVar;
        this.c = kehVar;
        int i2 = kehVar.e;
        int i3 = i2 - 1;
        boolean c = kdy.c(this.e);
        if (i2 == 0) {
            throw null;
        }
        if (i3 != 0) {
            throw new ffcd();
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(true != c ? -8193 : 8192, 8192);
        kef kefVar = this.d;
        int ordinal = kahVar.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else {
            if (ordinal != 1) {
                throw new ffcd();
            }
            i = 1;
        }
        kefVar.setLayoutDirection(i);
        boolean z = kehVar.d;
        kef kefVar2 = this.d;
        boolean z2 = kehVar.c;
        boolean z3 = (kefVar2.d && z2 == kefVar2.b && z == kefVar2.c) ? false : true;
        kefVar2.b = z2;
        kefVar2.c = z;
        if (z3) {
            WindowManager.LayoutParams attributes = kefVar2.a.getAttributes();
            int i4 = true != z2 ? -1 : -2;
            if (i4 != attributes.width || !kefVar2.d) {
                kefVar2.a.setLayout(i4, -2);
                kefVar2.d = true;
            }
        }
        setCanceledOnTouchOutside(kehVar.b);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.c.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.a.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r7 <= r2) goto L24;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.onTouchEvent(r7)
            keh r1 = r6.c
            boolean r1 = r1.b
            if (r1 == 0) goto L70
            kef r1 = r6.d
            float r2 = r7.getX()
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L69
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L69
            float r2 = r7.getY()
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L69
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L69
            r2 = 0
            android.view.View r2 = r1.getChildAt(r2)
            if (r2 != 0) goto L34
            goto L69
        L34:
            int r3 = r1.getLeft()
            int r4 = r2.getLeft()
            int r3 = r3 + r4
            int r4 = r2.getWidth()
            int r4 = r4 + r3
            int r1 = r1.getTop()
            int r5 = r2.getTop()
            int r1 = r1 + r5
            int r2 = r2.getHeight()
            int r2 = r2 + r1
            float r5 = r7.getX()
            int r5 = defpackage.ffln.b(r5)
            if (r3 > r5) goto L69
            if (r5 > r4) goto L69
            float r7 = r7.getY()
            int r7 = defpackage.ffln.b(r7)
            if (r1 > r7) goto L69
            if (r7 > r2) goto L69
            goto L70
        L69:
            ffix r7 = r6.a
            r7.invoke()
            r7 = 1
            return r7
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kel.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
