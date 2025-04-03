package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ejuk implements ejxa {
    public final /* synthetic */ ejwa a;

    @Override // defpackage.ejxa
    public final int a(Instant instant, ejug ejugVar, boolean z) {
        if (ejugVar.f() && ejugVar.g()) {
            if (!ejugVar.d().isBefore(instant.minus(this.a.k))) {
                return 2;
            }
        }
        if (z || !ejugVar.f()) {
            return ejugVar.f() ? 3 : 1;
        }
        return 2;
    }
}
