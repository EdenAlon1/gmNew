package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqs {
    public final aled a;
    public final eptu b;
    public final eptm c;
    public Instant d;
    public Instant e;
    private final errl f;
    private final cqoh g;
    private final cmqw h;
    private final MessageIdType i;
    private Instant j;

    public cmqs(errl errlVar, aled aledVar, cqoh cqohVar, cmqw cmqwVar, eptu eptuVar, eptm eptmVar, MessageIdType messageIdType) {
        this.f = errlVar;
        this.a = aledVar;
        this.g = cqohVar;
        this.h = cmqwVar;
        this.b = eptuVar;
        this.c = eptmVar;
        this.i = messageIdType;
    }

    private final void e(final epto eptoVar) {
        if (this.j != null) {
            return;
        }
        this.j = this.g.f();
        axnw.h(this.h.a(this.i).i(new eroh() { // from class: cmqr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cmqs cmqsVar = cmqs.this;
                eqaw eqawVar = (eqaw) obj;
                epts eptsVar = epts.REACTION;
                Instant instant = cmqsVar.d;
                instant.getClass();
                Duration between = Duration.between(instant, cmqsVar.a());
                Long valueOf = eqawVar != null ? Long.valueOf(eqawVar.c) : null;
                eptm eptmVar = cmqsVar.c;
                cmqsVar.a.d(eptsVar, cmqsVar.b, eptmVar, eptoVar, 0, between, valueOf);
                return elfo.e(true);
            }
        }, this.f));
    }

    public final Instant a() {
        Instant instant = this.j;
        instant.getClass();
        return instant;
    }

    public final void b() {
        if (this.j == null) {
            e(epto.INTERRUPTED);
        }
        if (this.e != null) {
            return;
        }
        this.e = this.g.f();
        axnw.h(this.h.a(this.i).i(new eroh() { // from class: cmqq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cmqs cmqsVar = cmqs.this;
                eqaw eqawVar = (eqaw) obj;
                epts eptsVar = epts.REACTION;
                eptk eptkVar = eptk.UNKNOWN_CLOSING_SOURCE;
                Instant a = cmqsVar.a();
                Instant instant = cmqsVar.e;
                instant.getClass();
                Duration between = Duration.between(a, instant);
                Long valueOf = eqawVar != null ? Long.valueOf(eqawVar.c) : null;
                cmqsVar.a.c(eptsVar, cmqsVar.b, eptkVar, 0, between, valueOf);
                return elfo.e(true);
            }
        }, this.f));
    }

    public final void c() {
        e(epto.LOADED);
    }

    public final void d() {
        this.d = this.g.f();
    }
}
