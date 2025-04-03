package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ciqf {
    public final Context a;
    public final cthp b;
    public final cnmx c;
    private final ciqn d;

    public ciqf(Context context, cthp cthpVar, cnmx cnmxVar, ciqn ciqnVar) {
        this.a = context;
        this.b = cthpVar;
        this.c = cnmxVar;
        this.d = ciqnVar;
    }

    final ciqm a(final ciqc ciqcVar) {
        return this.d.b(new ciql() { // from class: ciqd
            @Override // defpackage.ciql
            public final Notification a(String str) {
                ciqf ciqfVar = ciqf.this;
                Context context = ciqfVar.a;
                Resources resources = context.getResources();
                kml kmlVar = new kml(context, str);
                String string = resources.getString(R.string.report_issue_notification_text);
                ciqc ciqcVar2 = ciqcVar;
                cina cinaVar = (cina) ciqcVar2;
                String str2 = (String) cinaVar.b.orElse(string);
                kmlVar.h(str2);
                kmlVar.w(str2);
                kme kmeVar = new kme(kmlVar);
                kmeVar.e(str2);
                kmlVar.u(kmeVar);
                kmlVar.l = 3;
                kmlVar.r(R.drawable.notification_icon);
                kmlVar.k(ciqfVar.c.a(cinaVar.a));
                Bundle bundle = new Bundle();
                bundle.putInt("issue_type_extra", cinaVar.a.o);
                kmlVar.B = bundle;
                kmlVar.g = ciqfVar.c.b(ciqcVar2);
                return kmlVar.a();
            }
        }, cinj.REPORT_ISSUE, new cipf() { // from class: ciqe
            @Override // defpackage.cipf
            public final NotificationChannel a() {
                return ciqf.this.b.d();
            }
        });
    }
}
