package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aksz implements acds {
    final /* synthetic */ akta a;

    public aksz(akta aktaVar) {
        this.a = aktaVar;
    }

    @Override // defpackage.acds
    public final ellf a(Instant instant) {
        this.a.a = 10;
        return new aktb(instant);
    }

    @Override // defpackage.acds
    public final ellf b(acbk acbkVar) {
        this.a.a = acbkVar.e;
        return new aktb(Instant.ofEpochMilli(acbkVar.d));
    }

    @Override // defpackage.acds
    public final /* synthetic */ Optional c() {
        return Optional.empty();
    }

    @Override // defpackage.acds
    public final /* synthetic */ Optional d() {
        return Optional.empty();
    }

    @Override // defpackage.acds
    public final /* synthetic */ Optional e() {
        return Optional.empty();
    }

    @Override // defpackage.acds
    public final /* synthetic */ Optional f() {
        return Optional.empty();
    }

    @Override // defpackage.acds
    public final /* synthetic */ Optional g() {
        return Optional.empty();
    }
}
