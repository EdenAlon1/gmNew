package defpackage;

import android.app.Notification;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acwo implements cink {
    final /* synthetic */ acwp a;
    private final Notification b;

    public acwo(acwp acwpVar, Notification notification) {
        this.a = acwpVar;
        this.b = notification;
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
        return cinj.SATELLITE_INCOMING_MESSAGE;
    }

    @Override // defpackage.cink
    public final String d() {
        return this.a.d.toString();
    }

    public final String toString() {
        return String.format(Locale.US, "%s (id: %s, tag: %s)", String.format("Incoming Message Notification for Satellite Conversation %s", this.a.d), cinj.SATELLITE_INCOMING_MESSAGE, d());
    }
}
