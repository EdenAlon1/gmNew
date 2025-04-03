package defpackage;

import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kxn extends kxm {
    public kxn(Window window, kxp kxpVar, kur kurVar) {
        super(window, kurVar);
    }

    @Override // defpackage.kxl, defpackage.kxo
    public final boolean h() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.kxl, defpackage.kxo
    public final boolean j() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        return (systemBarsAppearance & 16) != 0;
    }

    public kxn(WindowInsetsController windowInsetsController, kur kurVar) {
        super(windowInsetsController);
    }
}
