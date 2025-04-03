package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdn implements vz {
    final /* synthetic */ drfl a;

    public dtdn(drfl drflVar) {
        this.a = drflVar;
    }

    @Override // defpackage.vz
    public final void c(View view) {
        view.getClass();
        if (this.a.a.r().gp(view) == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            yd ydVar = layoutParams instanceof yd ? (yd) layoutParams : null;
            if (ydVar != null) {
                ydVar.b = true;
            }
        }
    }

    @Override // defpackage.vz
    public final void d(View view) {
        view.getClass();
    }
}
