package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehun {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public boolean f = false;
    private final PendingIntent g;
    private final PendingIntent h;

    public ehun(String str, int i, int i2, int i3, Integer num, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = num;
        this.g = pendingIntent;
        this.h = pendingIntent2;
    }

    public final PendingIntent a(ehuz ehuzVar) {
        if (((ehvl) ehuzVar).a == 0) {
            PendingIntent pendingIntent = this.h;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            return null;
        }
        PendingIntent pendingIntent2 = this.g;
        if (pendingIntent2 != null) {
            return pendingIntent2;
        }
        return null;
    }
}
