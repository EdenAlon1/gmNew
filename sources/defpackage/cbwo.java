package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwo implements dtuu {
    private static final cskc b = cskc.g("BugleDataModel", "TransactionManagerImpl");
    public final ffbr a;

    public cbwo(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.dtuu
    public final Object a(String str, final dtus dtusVar) {
        final cbwn cbwnVar = new cbwn(this, this.a);
        try {
            return c(str, new emyl() { // from class: cbwk
                @Override // defpackage.emyl
                public final Object get() {
                    return dtus.this.a(cbwnVar);
                }
            });
        } catch (cbwm unused) {
            return cbwnVar.a;
        }
    }

    @Override // defpackage.dtuu
    public final Object b(emyl emylVar) {
        return ((dtve) this.a.b()).p(emylVar);
    }

    @Override // defpackage.dtuu
    public final Object c(String str, emyl emylVar) {
        try {
            ekzz f = eleg.f(str);
            try {
                cskc cskcVar = b;
                csjb a = cskcVar.a();
                a.I("tx: ");
                a.I(str);
                a.I(" started");
                a.r();
                Object r = ((dtve) this.a.b()).r(str, emylVar);
                f.close();
                csjb a2 = cskcVar.a();
                a2.I("tx: ");
                a2.I(str);
                a2.I(" ended");
                a2.r();
                return r;
            } finally {
            }
        } catch (Throwable th) {
            csjb a3 = b.a();
            a3.I("tx: ");
            a3.I(str);
            a3.I(" ended");
            a3.r();
            throw th;
        }
    }

    @Override // defpackage.dtuu
    public final void d(String str, Runnable runnable) {
        try {
            ekzz f = eleg.f(str);
            try {
                cskc cskcVar = b;
                csjb a = cskcVar.a();
                a.I("tx: ");
                a.I(str);
                a.I(" started");
                a.r();
                ((dtve) this.a.b()).A(str, runnable);
                f.close();
                csjb a2 = cskcVar.a();
                a2.I("tx: ");
                a2.I(str);
                a2.I(" ended");
                a2.r();
            } finally {
            }
        } catch (Throwable th) {
            csjb a3 = b.a();
            a3.I("tx: ");
            a3.I(str);
            a3.I(" ended");
            a3.r();
            throw th;
        }
    }

    @Override // defpackage.dtuu
    public final void e(Uri uri) {
        ((dtve) this.a.b()).D(uri);
    }

    @Override // defpackage.dtuu
    public final void f(Uri uri, String str) {
        ((dtve) this.a.b()).E(uri, str);
    }

    @Override // defpackage.dtuu
    public final /* synthetic */ void g(dtut dtutVar, String str, Runnable runnable) {
        dtur.a(this, dtutVar, str, runnable, dtuz.NO_TXN);
    }

    @Override // defpackage.dtuu
    public final /* synthetic */ void h(dtut dtutVar, String str, Runnable runnable, dtuz dtuzVar) {
        dtur.a(this, dtutVar, str, runnable, dtuzVar);
    }

    @Override // defpackage.dtuu
    public final boolean i() {
        return ((dtve) this.a.b()).I();
    }
}
