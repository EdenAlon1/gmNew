package defpackage;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthn {
    public final NotificationChannel a;

    public cthn(String str, String str2, int i) {
        this.a = new NotificationChannel(str, str2, i);
    }

    public final void a(boolean z) {
        this.a.enableLights(z);
    }

    public final void b(boolean z) {
        this.a.enableVibration(z);
    }

    public final void c(String str) {
        this.a.setGroup(str);
    }

    public final void d() {
        this.a.setShowBadge(false);
    }

    final void e(Uri uri, AudioAttributes audioAttributes) {
        this.a.setSound(uri, audioAttributes);
    }
}
