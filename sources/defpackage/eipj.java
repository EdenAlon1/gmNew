package defpackage;

import android.view.Window;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eipj implements eiph {
    public final TemplateLayout a;
    public final Window b;
    public final boolean c;
    public final boolean d;
    public int e = 0;

    public eipj(TemplateLayout templateLayout, Window window) {
        this.a = templateLayout;
        this.b = window;
        einu einuVar = (einu) templateLayout;
        this.c = einuVar.e();
        this.d = einuVar.f();
        if (!eios.q(templateLayout.getContext()) || window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(2);
    }
}
