package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqoh implements dlpw {
    private final dlpw a;

    public cqoh(dlpw dlpwVar) {
        this.a = dlpwVar;
    }

    @Override // defpackage.dlpw
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.dlpw
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.dlpw
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.dlpw
    public final Duration d() {
        return this.a.d();
    }

    @Override // defpackage.dlpw
    public final Duration e() {
        return this.a.e();
    }

    @Override // defpackage.dlpw
    public final Instant f() {
        return this.a.f();
    }

    public final LocalDateTime g() {
        return f().atZone(ZoneId.systemDefault()).L();
    }
}
