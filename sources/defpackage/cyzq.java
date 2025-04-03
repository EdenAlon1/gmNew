package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyzq implements hgo {
    final /* synthetic */ Window a;
    final /* synthetic */ hho b;

    public cyzq(Window window, hho hhoVar) {
        this.a = window;
        this.b = hhoVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        Window window = this.a;
        new kxp(window, window.getDecorView()).b(((Boolean) this.b.a()).booleanValue());
    }
}
