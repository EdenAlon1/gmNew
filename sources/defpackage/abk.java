package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class abk extends abj {
    @Override // defpackage.abi, defpackage.abm
    public void a(acf acfVar, acf acfVar2, Window window, View view, boolean z, boolean z2) {
        acfVar.getClass();
        acfVar2.getClass();
        window.getClass();
        view.getClass();
        kwg.a(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        kxp kxpVar = new kxp(window, view);
        kxpVar.b(!z);
        kxpVar.a(true ^ z2);
    }
}
