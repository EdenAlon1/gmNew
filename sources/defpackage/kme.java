package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kme extends knb {
    private CharSequence a;

    public kme() {
    }

    @Override // defpackage.knb
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.knb
    public final void b(kls klsVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((kni) klsVar).b).setBigContentTitle(this.h).bigText(this.a);
        if (this.j) {
            bigText.setSummaryText(this.i);
        }
    }

    @Override // defpackage.knb
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.bigText");
    }

    @Override // defpackage.knb
    protected final void d(Bundle bundle) {
        super.d(bundle);
        this.a = bundle.getCharSequence("android.bigText");
    }

    public final void e(CharSequence charSequence) {
        this.a = kml.c(charSequence);
    }

    public kme(kml kmlVar) {
        i(kmlVar);
    }
}
