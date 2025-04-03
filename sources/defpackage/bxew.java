package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxew extends dtrr {
    public String a;
    public boolean b;
    public boolean c;
    public bdhd d;
    public Instant e;
    public byte[] f;
    public long g;
    public Instant h;
    public boolean i;

    public bxew() {
        super(bxgl.e());
        this.b = false;
        this.c = false;
        this.d = new bdhd(0L);
        this.e = bdgw.b(0L);
        this.g = 0L;
        this.h = bdgw.b(0L);
        this.i = false;
    }

    public final bxeu a() {
        bxev bxevVar = new bxev();
        bxevVar.aC(aB());
        bxevVar.a = this.a;
        bxevVar.b = this.b;
        bxevVar.c = this.c;
        bxevVar.d = this.d;
        bxevVar.e = this.e;
        bxevVar.f = this.f;
        bxevVar.g = this.g;
        bxevVar.h = this.h;
        bxevVar.i = this.i;
        bxevVar.cK = aC();
        return bxevVar;
    }

    public final void b(Instant instant) {
        aE(7);
        this.h = instant;
    }

    public final void c(boolean z) {
        aE(1);
        this.b = z;
    }

    public final void d(boolean z) {
        int i = this.aB;
        if (i < 46000) {
            dtub.w("better_etouffee", i);
        }
        aE(2);
        this.c = z;
    }

    public final void e(byte[] bArr) {
        aE(5);
        this.f = bArr;
    }

    public final void f(boolean z) {
        aE(8);
        this.i = z;
    }

    public final void g(Instant instant) {
        aE(4);
        this.e = instant;
    }

    public final void h(bdhd bdhdVar) {
        int i = this.aB;
        if (i < 58800) {
            dtub.w("messages_feature_hash", i);
        }
        aE(3);
        this.d = bdhdVar;
    }

    public final void i(String str) {
        aE(0);
        this.a = str;
    }

    public final void j(long j) {
        aE(6);
        this.g = j;
    }
}
