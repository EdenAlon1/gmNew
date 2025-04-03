package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozo extends pas {
    boolean a = false;
    final ViewGroup b;

    public ozo(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.pas, defpackage.pak
    public final void a(par parVar) {
        pbe.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.pas, defpackage.pak
    public final void b(par parVar) {
        if (!this.a) {
            pbe.a(this.b, false);
        }
        parVar.I(this);
    }

    @Override // defpackage.pas, defpackage.pak
    public final void c() {
        pbe.a(this.b, false);
    }

    @Override // defpackage.pas, defpackage.pak
    public final void d() {
        pbe.a(this.b, true);
    }
}
