package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jm implements op {
    final /* synthetic */ jz a;

    public jm(jz jzVar) {
        this.a = jzVar;
    }

    @Override // defpackage.op
    public final void a(od odVar, boolean z) {
        this.a.B(odVar);
    }

    @Override // defpackage.op
    public final boolean b(od odVar) {
        Window.Callback x = this.a.x();
        if (x == null) {
            return true;
        }
        x.onMenuOpened(108, odVar);
        return true;
    }
}
