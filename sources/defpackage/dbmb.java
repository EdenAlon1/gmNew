package defpackage;

import android.app.AlertDialog;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbmb {
    public final dblu a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public AlertDialog g;
    public int h;
    public final ejxk i = new dbma(this);
    public final ejlr j = new ejlr<Void, Void>() { // from class: dbmb.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            AlertDialog alertDialog = dbmb.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration pending");
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            csjy.c("Bugle", "Registered successfully with tachyon");
            AlertDialog alertDialog = dbmb.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration successful");
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            csjy.p("Bugle", th, "Registration with Tachyon failed");
            AlertDialog alertDialog = dbmb.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration failed");
            }
        }
    };

    public dbmb(dblu dbluVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = dbluVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
    }
}
