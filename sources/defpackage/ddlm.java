package defpackage;

import defpackage.ddll;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddlm implements acds {
    final /* synthetic */ ddlo a;

    public ddlm(ddlo ddloVar) {
        this.a = ddloVar;
    }

    @Override // defpackage.acds
    public final ellf a(Instant instant) {
        ddln builder = this.a.toBuilder();
        long epochMilli = instant.toEpochMilli();
        builder.copyOnWrite();
        ddlo ddloVar = (ddlo) builder.instance;
        ddloVar.b |= 1;
        ddloVar.c = epochMilli;
        return new ddll.b(builder.build());
    }

    @Override // defpackage.acds
    public final ellf b(acbk acbkVar) {
        ddln builder = this.a.toBuilder();
        long j = acbkVar.d;
        builder.copyOnWrite();
        ddlo ddloVar = (ddlo) builder.instance;
        ddloVar.b |= 1;
        ddloVar.c = j;
        return new ddll.b(builder.build());
    }

    @Override // defpackage.acds
    public final Optional c() {
        return Optional.of(new ddll.a(this.a));
    }

    @Override // defpackage.acds
    public final Optional d() {
        return Optional.of(new ddll.c());
    }

    @Override // defpackage.acds
    public final Optional e() {
        return Optional.of(new ddll.d());
    }

    @Override // defpackage.acds
    public final Optional f() {
        return Optional.of(new ddll.e());
    }

    @Override // defpackage.acds
    public final Optional g() {
        return Optional.of(new ddll.f());
    }
}
