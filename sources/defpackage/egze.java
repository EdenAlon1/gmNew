package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egze implements kud {
    final /* synthetic */ AppBarLayout a;

    public egze(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        AppBarLayout appBarLayout = this.a;
        kxh kxhVar2 = true != appBarLayout.getFitsSystemWindows() ? null : kxhVar;
        if (!Objects.equals(appBarLayout.c, kxhVar2)) {
            appBarLayout.c = kxhVar2;
            appBarLayout.o();
            appBarLayout.requestLayout();
        }
        return kxhVar;
    }
}
