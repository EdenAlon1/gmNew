package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acpa implements ejwd<Boolean> {
    final /* synthetic */ acow a;

    public acpa(acow acowVar) {
        this.a = acowVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        acow.a.s("Failed to read shouldShowFailToLoadDittoDialog", th);
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            AlertDialog alertDialog = this.a.z;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            this.a.z.dismiss();
            acow.a.p("Dismissed FailToLoadDialog");
            ((akzt) this.a.l.b()).e("Bugle.Satellite.FailToLoadDialog.Status.Counts", 4);
            return;
        }
        acow.a.p("Show FailToLoadDialog");
        final acow acowVar = this.a;
        AlertDialog alertDialog2 = acowVar.z;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(acowVar.e.z(), R.style.FailToLoadDialog).setTitle(R.string.fail_to_load_dialog_title_new).setPositiveButton(R.string.fail_to_load_dialog_positive_button, new elbb((elbx) acowVar.m.b(), "FailToLoadDialog:positive", new DialogInterface.OnClickListener() { // from class: acoi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                acow acowVar2 = acow.this;
                acowVar2.A = true;
                acowVar2.d();
                final acpo acpoVar = (acpo) acowVar2.j.b();
                ((aclb) acpoVar.c.b()).j(false).k(axnw.c(new Consumer() { // from class: acpl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        acpo.this.d();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), acpoVar.e);
                ((akzt) acowVar2.l.b()).e("Bugle.Satellite.FailToLoadDialog.Status.Counts", 2);
            }
        }));
        if (((ctvs) acowVar.n.b()).e()) {
            positiveButton.setNegativeButton(R.string.fail_to_load_dialog_negative_button, new elbb((elbx) acowVar.m.b(), "FailToLoadDialog:negative", new DialogInterface.OnClickListener() { // from class: acon
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    acow acowVar2 = acow.this;
                    acpo acpoVar = (acpo) acowVar2.j.b();
                    ((aclb) acpoVar.c.b()).j(false).k(axnw.b(), acpoVar.e);
                    ((akzt) acowVar2.l.b()).e("Bugle.Satellite.FailToLoadDialog.Status.Counts", 3);
                    acow.a.p("launching Standalone mode");
                    eg a = acowVar2.a();
                    a.setResult(-1, a.getIntent());
                    a.finish();
                }
            }));
        }
        acowVar.z = positiveButton.create();
        AlertDialog alertDialog3 = acowVar.z;
        if (alertDialog3 == null) {
            acow.a.r("failToLoadDialog is null.");
        } else {
            alertDialog3.show();
            ((akzt) acowVar.l.b()).e("Bugle.Satellite.FailToLoadDialog.Status.Counts", 1);
        }
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
