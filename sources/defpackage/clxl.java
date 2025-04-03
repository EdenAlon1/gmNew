package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clxl implements clxm {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/waker/RcsEngineWaker");
    private final coko b;
    private final cqoh c;
    private final ckds d;
    private final ffbr e;
    private final Duration f;

    public clxl(coko cokoVar, cqoh cqohVar, ckds ckdsVar, ffbr ffbrVar) {
        cqohVar.getClass();
        ckdsVar.getClass();
        ffbrVar.getClass();
        this.b = cokoVar;
        this.c = cqohVar;
        this.d = ckdsVar;
        this.e = ffbrVar;
        Object b = ffbrVar.b();
        b.getClass();
        this.f = Duration.ofSeconds(((Number) b).longValue());
    }

    @Override // defpackage.clxm
    public final boolean a() {
        if ((this.b.a().b & 1) != 0) {
            eyja eyjaVar = this.b.a().c;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            Instant f = this.c.f();
            f.getClass();
            if (eykm.c(eyjaVar, eykn.b(f)).b < this.f.getSeconds()) {
                return false;
            }
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleTransport");
        ((enrr) h.h("com/google/android/apps/messaging/shared/rcs/waker/RcsEngineWaker", "wake", 37, "RcsEngineWaker.kt")).q("Waking RCS Engine");
        ckds ckdsVar = this.d;
        eytb eytbVar = (eytb) eyte.a.createBuilder();
        eytbVar.getClass();
        eytd eytdVar = eytd.SEND_KEEPALIVE;
        eytdVar.getClass();
        eytbVar.copyOnWrite();
        ((eyte) eytbVar.instance).b = eytdVar.a();
        UUID randomUUID = UUID.randomUUID();
        Objects.toString(randomUUID);
        String valueOf = String.valueOf(randomUUID);
        eytbVar.copyOnWrite();
        ((eyte) eytbVar.instance).c = "client_".concat(valueOf);
        eyfy build = eytbVar.build();
        build.getClass();
        ckdsVar.w((eyte) build);
        coko cokoVar = this.b;
        cokl coklVar = (cokl) cokm.a.createBuilder();
        coklVar.getClass();
        Instant f2 = this.c.f();
        f2.getClass();
        eyja b = eykn.b(f2);
        coklVar.copyOnWrite();
        cokm cokmVar = (cokm) coklVar.instance;
        cokmVar.c = b;
        cokmVar.b |= 1;
        eyfy build2 = coklVar.build();
        build2.getClass();
        final cokm cokmVar2 = (cokm) build2;
        cokoVar.a.m(new emwl() { // from class: cokn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cokm.this;
            }
        });
        return true;
    }
}
