package defpackage;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmi {
    public final PendingIntent a;
    public final PendingIntent b;
    public final IconCompat c;
    public final int d;
    public final int e;
    public int f;
    public final String g;

    public kmi(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
        this.a = pendingIntent;
        this.c = iconCompat;
        this.d = i;
        this.e = i2;
        this.b = pendingIntent2;
        this.f = i3;
        this.g = str;
    }

    public final boolean a() {
        return (this.f & 1) != 0;
    }

    public final boolean b() {
        return (this.f & 2) != 0;
    }
}
