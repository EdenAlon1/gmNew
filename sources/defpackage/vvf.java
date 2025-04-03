package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvf implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ vvn a;

    public vvf(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.z = windowInsets.getSystemWindowInsetTop();
        return windowInsets;
    }
}
