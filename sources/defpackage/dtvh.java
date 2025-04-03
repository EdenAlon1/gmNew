package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtvh {
    protected final dtvi a;
    public duap b;

    public dtvh(String str, String str2) {
        dtrb dtrbVar = new dtrb();
        dtrbVar.b(false);
        dtrbVar.b = dtui.a;
        this.a = dtrbVar;
        this.b = null;
        dtrbVar.a = str;
        dtrbVar.c = str2;
    }

    public abstract dtvg b();

    public final int d() {
        return b().b();
    }

    public final void e() {
        this.a.b(true);
    }

    public final void f(String str) {
        ((dtrb) this.a).b = new dtui(str);
    }
}
