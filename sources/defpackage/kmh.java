package defpackage;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmh {
    public PendingIntent a;
    private PendingIntent b;
    private IconCompat c;
    private int d;
    private int e;
    private int f;
    private String g;

    @Deprecated
    public kmh() {
    }

    private final void f(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.f;
        } else {
            i2 = (~i) & this.f;
        }
        this.f = i2;
    }

    public final kmi a() {
        String str = this.g;
        if (str == null && this.b == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        if (str == null && this.c == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        PendingIntent pendingIntent = this.b;
        PendingIntent pendingIntent2 = this.a;
        IconCompat iconCompat = this.c;
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        kmi kmiVar = new kmi(pendingIntent, pendingIntent2, iconCompat, i, i2, i3, str);
        kmiVar.f = i3;
        return kmiVar;
    }

    public final void b(boolean z) {
        f(1, z);
    }

    public final void c(int i) {
        this.d = Math.max(i, 0);
        this.e = 0;
    }

    public final void d(int i) {
        this.e = i;
        this.d = 0;
    }

    public final void e(boolean z) {
        f(2, z);
    }

    public kmh(PendingIntent pendingIntent, IconCompat iconCompat) {
        if (pendingIntent == null) {
            throw new NullPointerException("Bubble requires non-null pending intent");
        }
        this.b = pendingIntent;
        this.c = iconCompat;
    }

    public kmh(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Bubble requires a non-null shortcut id");
    }
}
