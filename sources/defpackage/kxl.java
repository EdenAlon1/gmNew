package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
class kxl extends kxo {
    final WindowInsetsController a;
    protected Window b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kxl(android.view.Window r2) {
        /*
            r1 = this;
            android.view.WindowInsetsController r0 = defpackage.jqg$$ExternalSyntheticApiModelOutline9.m(r2)
            r1.<init>(r0)
            r1.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxl.<init>(android.view.Window):void");
    }

    protected final void a(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void b(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.kxo
    public final void e() {
        this.a.hide(519);
    }

    @Override // defpackage.kxo
    public final void f() {
        this.a.show(519);
    }

    @Override // defpackage.kxo
    public final void g(boolean z) {
        if (z) {
            if (this.b != null) {
                a(8192);
            }
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            if (this.b != null) {
                b(8192);
            }
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.kxo
    public boolean h() {
        int systemBarsAppearance;
        this.a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.kxo
    public final void i(boolean z) {
        if (z) {
            if (this.b != null) {
                a(16);
            }
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            if (this.b != null) {
                b(16);
            }
            this.a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.kxo
    public boolean j() {
        int systemBarsAppearance;
        this.a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        return (systemBarsAppearance & 16) != 0;
    }

    public kxl(WindowInsetsController windowInsetsController) {
        new cpn();
        this.a = windowInsetsController;
    }
}
