package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class abi extends abm {
    @Override // defpackage.abm
    public void a(acf acfVar, acf acfVar2, Window window, View view, boolean z, boolean z2) {
        acfVar.getClass();
        acfVar2.getClass();
        window.getClass();
        view.getClass();
        kwg.a(window, false);
        window.setStatusBarColor(acfVar.a(z));
        window.setNavigationBarColor(acfVar2.a(z2));
        kxp kxpVar = new kxp(window, view);
        kxpVar.b(!z);
        kxpVar.a(!z2);
    }
}
