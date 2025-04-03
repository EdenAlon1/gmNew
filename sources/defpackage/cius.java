package defpackage;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cius {
    private final Context a;
    private final ciwb b;

    public cius(Context context, ciwb ciwbVar) {
        this.a = context;
        this.b = ciwbVar;
    }

    public final Notification a() {
        String id;
        id = this.b.f().getId();
        kml kmlVar = new kml(this.a, id);
        String string = this.a.getString(R.string.notification2o_foreground_service_notification_generic_text);
        kmlVar.h(string);
        kmlVar.w(string);
        kme kmeVar = new kme(kmlVar);
        kmeVar.e(string);
        kmlVar.u(kmeVar);
        kmlVar.C = this.a.getColor(R.color.primary_brand_icon_color);
        kmlVar.r(R.drawable.quantum_gm_ic_sms_white_24);
        return kmlVar.a();
    }
}
