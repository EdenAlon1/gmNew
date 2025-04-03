package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ditp {
    public Thread a;
    public String b;
    public PendingIntent c;

    public final String toString() {
        return "Thread: \"" + this.a.getName() + "\", intent: " + String.valueOf(this.c);
    }
}
