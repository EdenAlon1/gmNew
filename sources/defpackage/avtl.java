package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avtl implements avtj {
    final /* synthetic */ avtj a;
    final /* synthetic */ avtj b;

    public avtl(avtj avtjVar, avtj avtjVar2) {
        this.a = avtjVar;
        this.b = avtjVar2;
    }

    private static final Duration c(Duration duration, Duration duration2) {
        return duration.compareTo(duration2) < 0 ? duration : duration2;
    }

    @Override // defpackage.avtj
    public final Duration a() {
        return c(this.a.a(), this.b.a());
    }

    @Override // defpackage.avtj
    public final Duration b() {
        return c(this.a.b(), this.b.b());
    }
}
