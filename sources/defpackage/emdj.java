package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdj {
    public final ernh a;
    public final fgcm b;
    public final fgcm c;
    public final fgcm d;
    public final fgcm e;
    public final fgdj f;
    public final fgdj g;
    public final fgdj h;
    public final fgdj i;
    public Instant j;

    public emdj(ernh ernhVar) {
        this.a = ernhVar;
        fgcm a = fgdm.a(false);
        this.b = a;
        fgcm a2 = fgdm.a(0L);
        this.c = a2;
        fgcm a3 = fgdm.a(0L);
        this.d = a3;
        fgcm a4 = fgdm.a(false);
        this.e = a4;
        this.f = new fgco(a);
        this.g = new fgco(a2);
        this.h = new fgco(a3);
        this.i = new fgco(a4);
        Instant instant = Instant.MIN;
        instant.getClass();
        this.j = instant;
    }

    public final void a() {
        this.j = this.a.a();
    }

    public final void b() {
        this.b.g(true, false);
        this.d.f(0L);
        this.e.g(true, false);
        this.j = Instant.MIN;
    }

    public final boolean c() {
        return Duration.between(this.j, this.a.a()).toSeconds() > 5;
    }
}
