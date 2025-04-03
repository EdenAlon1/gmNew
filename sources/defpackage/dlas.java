package defpackage;

import androidx.car.app.model.Alert;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlas extends dlaf {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final Duration r;
    private final int s;

    public dlas() {
        this(false, false, false, false, 0L, 0L, false, null, null, false, 524287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlas)) {
            return false;
        }
        dlas dlasVar = (dlas) obj;
        if (this.m != dlasVar.m || this.n != dlasVar.n || this.a != dlasVar.a) {
            return false;
        }
        boolean z = dlasVar.o;
        if (this.b != dlasVar.b || this.c != dlasVar.c || this.d != dlasVar.d || this.e != dlasVar.e || this.f != dlasVar.f || this.g != dlasVar.g || this.h != dlasVar.h || !ffkj.e(this.i, dlasVar.i) || !ffkj.e(this.j, dlasVar.j) || !ffkj.e(this.k, dlasVar.k) || this.l != dlasVar.l) {
            return false;
        }
        boolean z2 = dlasVar.p;
        boolean z3 = dlasVar.q;
        if (!ffkj.e(this.r, dlasVar.r)) {
            return false;
        }
        int i = dlasVar.s;
        return true;
    }

    public final int hashCode() {
        int a = dlaq.a(this.m);
        String str = this.i;
        boolean z = this.h;
        long j = this.g;
        long j2 = this.f;
        boolean z2 = this.e;
        boolean z3 = this.d;
        boolean z4 = this.c;
        boolean z5 = this.b;
        return (((((((((((((((((((((((((((((((((((a * 31) + dlaq.a(this.n)) * 31) + dlaq.a(this.a)) * 31) + dlaq.a(false)) * 31) + dlaq.a(z5)) * 31) + dlaq.a(z4)) * 31) + dlaq.a(z3)) * 31) + dlaq.a(z2)) * 31) + dlar.a(j2)) * 31) + dlar.a(j)) * 31) + dlaq.a(z)) * 31) + str.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + dlaq.a(this.l)) * 31) + dlaq.a(true)) * 31) + dlaq.a(false)) * 31) + this.r.hashCode()) * 31) + Alert.DURATION_SHOW_INDEFINITELY;
    }

    public /* synthetic */ dlas(boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, boolean z5, String str, String str2, boolean z6, int i) {
        String str3 = (i & 2048) != 0 ? "ondevicesafety-pa.googleapis.com" : str;
        Duration e = ernk.e(10);
        str3.getClass();
        String str4 = (i & 4096) != 0 ? "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8" : str2;
        str4.getClass();
        String str5 = (i & 8192) != 0 ? "https://www.gstatic.com" : null;
        str5.getClass();
        this.m = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.n = ((i & 2) == 0) & z2;
        this.a = (!((i & 4) == 0)) | z3;
        this.o = false;
        this.b = (i & 16) != 0;
        this.c = (i & 32) != 0;
        this.d = ((i & 64) == 0) & z4;
        this.e = (i & 128) != 0;
        this.f = (i & 256) != 0 ? -1L : j;
        this.g = (i & 512) != 0 ? 1000L : j2;
        this.h = ((i & 1024) == 0) & z5;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = ((i & 16384) == 0) & z6;
        this.p = true;
        this.q = false;
        this.r = e;
        this.s = Alert.DURATION_SHOW_INDEFINITELY;
    }
}
