package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkhv implements Runnable {
    final /* synthetic */ dkhx a;
    private final String b;
    private final long c;

    public dkhv(dkhx dkhxVar, String str, long j) {
        this.a = dkhxVar;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Objects.isNull(this.a.b)) {
            dkty.q("Capability service not registered.", new Object[0]);
            return;
        }
        dkty.o("Requesting capabilities for %s", dktx.USER_ID.c(this.b));
        try {
            this.a.b.s("", this.c, this.b);
        } catch (eejg e) {
            dkty.q("Unable to send capabilities request to %s: %s", dktx.USER_ID.c(this.b), e.getMessage());
        }
    }
}
