package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aefb {
    public static aeey l() {
        aees aeesVar = new aees();
        aeesVar.b(true);
        return aeesVar;
    }

    public static aefb m() {
        aeey l = l();
        aees aeesVar = (aees) l;
        aeesVar.a = "stub_banner_name";
        l.c(0);
        aeesVar.b = null;
        aeesVar.c = null;
        l.e("");
        aeesVar.d = null;
        aeesVar.e = new aefa() { // from class: aeew
            @Override // defpackage.aefa
            public final void a(ejlq ejlqVar, View view) {
            }
        };
        aeesVar.f = null;
        l.d(new aeex());
        return l.a();
    }

    public abstract int a();

    public abstract aeez b();

    public abstract aefa c();

    public abstract aefa d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract String i();

    public abstract boolean j();

    public abstract void k();
}
