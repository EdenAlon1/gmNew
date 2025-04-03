package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxc implements cink {
    public final cinl a;
    private final Notification b;
    private final String c;

    public acxc(cinl cinlVar, Context context, cthp cthpVar, String str, String str2, String str3) {
        this.a = cinlVar;
        this.c = str;
        NotificationChannel g = cthpVar.g();
        kml kmlVar = new kml(context, g != null ? g.getId() : "");
        kmlVar.r(R.drawable.notification_icon);
        kmlVar.g = eepf.a(context, 0, new Intent(context, (Class<?>) DittoWebActivity.class).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES), ctie.a(1073741824));
        kmlVar.i(str2);
        kmlVar.h(str3);
        this.b = kmlVar.a();
    }

    @Override // defpackage.cink
    public final /* synthetic */ int a() {
        return cini.a(this);
    }

    @Override // defpackage.cink
    public final Notification b() {
        return this.b;
    }

    @Override // defpackage.cink
    public final cinj c() {
        return cinj.SATELLITE_STATUS;
    }

    @Override // defpackage.cink
    public final String d() {
        return this.c;
    }

    public final void e() {
        this.a.b(this.c, cinj.SATELLITE_STATUS);
    }

    public final String toString() {
        return String.format(Locale.US, "%s (id: %s, tag: %s)", String.format("Satellite Status Notification with tag %s", this.c), cinj.SATELLITE_STATUS, this.c);
    }
}
