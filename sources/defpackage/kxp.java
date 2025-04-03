package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxp {
    public final kxo a;

    public kxp(Window window, View view) {
        kur kurVar = new kur(view);
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new kxn(window, this, kurVar);
        } else if (Build.VERSION.SDK_INT >= 30) {
            this.a = new kxl(window);
        } else {
            this.a = new kxk(window, kurVar);
        }
    }

    public final void a(boolean z) {
        this.a.i(z);
    }

    public final void b(boolean z) {
        this.a.g(z);
    }

    public final boolean c() {
        return this.a.j();
    }

    public final boolean d() {
        return this.a.h();
    }

    public final void e() {
        this.a.f();
    }

    @Deprecated
    public kxp(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new kxn(windowInsetsController, new kur(windowInsetsController));
        } else {
            this.a = new kxl(windowInsetsController);
        }
    }
}
