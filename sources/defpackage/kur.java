package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kur {
    private final kuq a;

    public kur(View view) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new kup(view) : new kun(view);
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        this.a.b();
    }

    @Deprecated
    public kur(WindowInsetsController windowInsetsController) {
        this.a = new kup(windowInsetsController);
    }
}
