package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class kxi extends kxo {
    protected final Window a;
    private final kur b;

    public kxi(Window window, kur kurVar) {
        this.a = window;
        this.b = kurVar;
    }

    protected final void a(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void b(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    protected final void c(int i) {
        this.a.clearFlags(i);
    }

    protected final void d() {
        this.a.addFlags(Integer.MIN_VALUE);
    }

    @Override // defpackage.kxo
    public final void e() {
        for (int i = 1; i <= 512; i += i) {
            if ((i & 519) != 0) {
                if (i == 1) {
                    a(4);
                } else if (i == 2) {
                    a(2);
                } else if (i == 8) {
                    this.b.a();
                }
            }
        }
    }

    @Override // defpackage.kxo
    public final void f() {
        for (int i = 1; i <= 512; i += i) {
            if ((i & 519) != 0) {
                if (i == 1) {
                    b(4);
                    c(1024);
                } else if (i == 2) {
                    b(2);
                } else if (i == 8) {
                    this.b.b();
                }
            }
        }
    }
}
