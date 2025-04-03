package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qmc {
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final long f;
    public final Long g;
    public final long h;
    public final Uri i;
    public final boolean j = true;
    public final String k;

    protected qmc(String str, String str2, int i, String str3, long j, Long l, long j2, Uri uri, boolean z, String str4) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = j;
        this.g = l;
        this.h = j2;
        this.i = uri;
        this.k = str4;
    }

    public final String toString() {
        return this.b + " <" + this.c + ">, isValid=true";
    }
}
