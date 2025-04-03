package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcik implements erqj {
    final /* synthetic */ dcil a;

    public dcik(dcil dcilVar) {
        this.a = dcilVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        this.a.h(true);
        final dcil dcilVar = this.a;
        if (dcilVar.n == null) {
            ehft ehftVar = new ehft(dcilVar.a);
            ehftVar.x(R.string.c2o_gif_no_connection_alert_title);
            ehftVar.m(R.string.c2o_gif_no_connection_alert_message);
            ehftVar.t(R.string.c2o_gif_error_alert_ok, new DialogInterface.OnClickListener() { // from class: dcid
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dcil.this.e(eptk.UNKNOWN_CLOSING_SOURCE);
                }
            });
            ehftVar.r(new DialogInterface.OnCancelListener() { // from class: dcie
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    dcil.this.e(eptk.UNKNOWN_CLOSING_SOURCE);
                }
            });
            dcilVar.n = ehftVar.create();
        }
        if (!dcilVar.n.isShowing()) {
            dcilVar.n.show();
        }
        this.a.a.af(epto.FAILED_TO_LOAD);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
