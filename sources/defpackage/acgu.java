package defpackage;

import android.app.Dialog;
import android.content.Context;
import defpackage.acgt;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acgu implements ellh {
    final /* synthetic */ acgt a;

    public acgu(acgt acgtVar) {
        this.a = acgtVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        acgm acgmVar = (acgm) ((acgt.a) ellfVar).a();
        int i = acgmVar.c - 1;
        acgt acgtVar = this.a;
        if (i != 0) {
            acgz acgzVar = acgtVar.a;
            Dialog dialog = acgtVar.b.d;
            if (dialog != null) {
                dialog.dismiss();
            }
            acgzVar.c.aJ(6);
            acgz.a.m("User canceled taking a bug report");
        } else {
            final acgz acgzVar2 = acgtVar.a;
            acgr acgrVar = acgtVar.b;
            final acew acewVar = acgmVar.a;
            String str = acgmVar.b;
            Context z = acgrVar.z();
            Dialog dialog2 = acgrVar.d;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            if (acewVar == null) {
                acgz.a.r("No category is selected, skip taking bug report");
            } else {
                acgzVar2.c.aK(4, acewVar.a());
                dhre b = acgzVar2.b.b(z, acewVar.b, str);
                final Runnable l = eldl.l(new Runnable() { // from class: acgw
                    @Override // java.lang.Runnable
                    public final void run() {
                        acgz.this.c.aK(5, acewVar.a());
                        acgz.a.m("Successfully uploaded the bug report");
                    }
                });
                b.a(new dhqy() { // from class: acgx
                    @Override // defpackage.dhqy
                    public final void e(Object obj) {
                        l.run();
                    }
                });
                b.t(new dhqv() { // from class: acgy
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        csjb e = acgz.a.e();
                        e.I("Failed to upload the bug report");
                        e.s(exc);
                    }
                });
                csjb d = acgz.a.d();
                d.I("User took bug report");
                d.A("Category", acewVar.b);
                d.A("Comment", str);
                d.r();
            }
        }
        return elli.a;
    }
}
