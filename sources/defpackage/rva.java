package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rva {
    private final View a;
    private final Window b;
    private final kxp c;

    public rva(View view, Window window) {
        view.getClass();
        this.a = view;
        this.b = window;
        this.c = window != null ? new kxp(window, view) : null;
    }

    public final void a(long j, boolean z, ffji ffjiVar) {
        kxp kxpVar;
        ffjiVar.getClass();
        kxp kxpVar2 = this.c;
        if (kxpVar2 != null) {
            kxpVar2.b(z);
        }
        Window window = this.b;
        if (window != null) {
            if (z && ((kxpVar = this.c) == null || !kxpVar.d())) {
                j = ((ibw) ffjiVar.invoke(new ibw(j))).i;
            }
            window.setStatusBarColor(iby.b(j));
        }
    }

    public final void b(long j, boolean z, ffji ffjiVar) {
        kxp kxpVar;
        Window window;
        ffjiVar.getClass();
        kxp kxpVar2 = this.c;
        if (kxpVar2 != null) {
            kxpVar2.a(z);
        }
        if (Build.VERSION.SDK_INT >= 29 && (window = this.b) != null) {
            window.setNavigationBarContrastEnforced(true);
        }
        Window window2 = this.b;
        if (window2 != null) {
            if (z && ((kxpVar = this.c) == null || !kxpVar.c())) {
                j = ((ibw) ffjiVar.invoke(new ibw(j))).i;
            }
            window2.setNavigationBarColor(iby.b(j));
        }
    }
}
