package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejkk {
    final Notification a;
    final int b;
    final String c;

    public ejkk(Notification notification, int i, String str) {
        this.a = notification;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        String channelId;
        channelId = this.a.getChannelId();
        return "Trace=[" + this.c + "], importance=[" + this.b + "]" + (", notification=[" + channelId + "]");
    }
}
