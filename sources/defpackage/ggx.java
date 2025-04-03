package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggx extends abg {
    public ffix a;
    public final ggu c;
    private gio d;
    private final View e;
    private final float f;

    public ggx(ffix ffixVar, gio gioVar, View view, kah kahVar, jzn jznVar, UUID uuid, cxj cxjVar, ffsk ffskVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme));
        this.a = ffixVar;
        this.d = gioVar;
        this.e = view;
        this.f = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        kwg.a(window, false);
        ggu gguVar = new ggu(getContext(), window, this.a, cxjVar, ffskVar);
        Objects.toString(uuid);
        gguVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        gguVar.setClipChildren(false);
        gguVar.setElevation(jznVar.em(8.0f));
        gguVar.setOutlineProvider(new ggv());
        this.c = gguVar;
        setContentView(gguVar);
        lmz.b(gguVar, lmz.a(view));
        lna.b(gguVar, lna.a(view));
        oxa.b(gguVar, oxa.a(view));
        a(this.a, this.d, kahVar);
        kxp kxpVar = new kxp(window, window.getDecorView());
        kxpVar.b(this.d.a);
        kxpVar.a(this.d.b);
        acc.a(this.b, this, true, new ggw(this));
    }

    public final void a(ffix ffixVar, gio gioVar, kah kahVar) {
        this.a = ffixVar;
        this.d = gioVar;
        ViewGroup.LayoutParams layoutParams = this.e.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 0;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i2 = gioVar.c;
        Window window = getWindow();
        window.getClass();
        window.setFlags(true != z ? -8193 : 8192, 8192);
        ggu gguVar = this.c;
        int ordinal = kahVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new ffcd();
            }
            i = 1;
        }
        gguVar.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.a.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
