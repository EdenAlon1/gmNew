package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecou {
    public final long a;
    public long b;
    long c;
    int d;
    int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    public int j;
    String k;
    fgoz l;
    int m;
    fgmh n;
    int o;
    int p;
    public int q;
    public int r;
    public int s;
    public emxc t;
    int u;
    public int v;
    int w;

    public ecou(String str) {
        this(null, str, false, SystemClock.elapsedRealtime());
    }

    public static ecou a(String str, ecda ecdaVar) {
        return new ecou(str, ecda.d(ecdaVar), true, SystemClock.elapsedRealtime());
    }

    public final void b(int i, int i2) {
        this.c = SystemClock.elapsedRealtime() - this.a;
        this.d = i;
        this.e = i2;
    }

    public final void c(String str) {
        if (emxe.c(str)) {
            return;
        }
        this.k = str;
    }

    public ecou(String str, String str2, boolean z, long j) {
        this.w = 1;
        this.s = -1;
        this.g = emxe.a(str);
        this.f = emxe.a(str2);
        this.h = z;
        this.a = j;
        this.t = emux.a;
    }
}
