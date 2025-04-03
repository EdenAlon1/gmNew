package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.bajq;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awge implements awgm {
    public final ffbr a;
    public final Duration b;
    public final ceve c;
    private final errl d;
    private final Optional e;
    private final cqoh f;

    public awge(errl errlVar, ffbr ffbrVar, Optional optional, cqoh cqohVar, Duration duration, ceve ceveVar) {
        this.d = errlVar;
        this.a = ffbrVar;
        this.e = optional;
        this.f = cqohVar;
        this.b = duration;
        this.c = ceveVar;
    }

    @Override // defpackage.awgm
    public final elfl a(final MessageCoreData messageCoreData) {
        messageCoreData.aX(Instant.ofEpochMilli(messageCoreData.cK() ? messageCoreData.o() : this.f.f().toEpochMilli()));
        this.e.ifPresent(new Consumer() { // from class: awgb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                MessageCoreData messageCoreData2 = MessageCoreData.this;
                ((akni) obj).a(messageCoreData2.u(), messageCoreData2.k());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elfo.g(new Callable() { // from class: awgc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((bdmq) awge.this.a.b()).T(messageCoreData));
            }
        }, this.d).h(new emwl() { // from class: awgd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int c = bbfp.c(messageCoreData);
                emxf.b(true, "ProcessPendingMessagesAction: empty processing work item handler");
                bajq.a aVar = (bajq.a) ctba.a(bajq.a.class);
                if (!aVar.cR().G()) {
                    ensk j = bajq.a.j();
                    j.Y(ente.a, "BugleDataModel");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromWorkItemHandler", 303, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - not default SMS app");
                    return null;
                }
                long epochMilli = aVar.v().f().toEpochMilli();
                if (aVar.aM().d(c, epochMilli)) {
                    ensk h = bajq.a.h();
                    h.Y(ente.a, "BugleDataModel");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromWorkItemHandler", 308, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - too frequent");
                    return null;
                }
                bajs aL = aVar.aL();
                ffbr ffbrVar = aL.a;
                bbgc bbgcVar = (bbgc) aL.b.b();
                bbgcVar.getClass();
                cqoh cqohVar = (cqoh) aL.c.b();
                cqohVar.getClass();
                ffbr ffbrVar2 = aL.d;
                csjk csjkVar = (csjk) aL.e.b();
                csjkVar.getClass();
                ffbr ffbrVar3 = aL.f;
                altk altkVar = (altk) aL.g.b();
                altkVar.getClass();
                banu banuVar = (banu) aL.h.b();
                banuVar.getClass();
                bbfw bbfwVar = (bbfw) aL.i.b();
                bbfwVar.getClass();
                bbgq bbgqVar = (bbgq) aL.j.b();
                bbgqVar.getClass();
                baio baioVar = (baio) aL.k.b();
                baioVar.getClass();
                byzp byzpVar = (byzp) aL.l.b();
                byzpVar.getClass();
                bbfo bbfoVar = (bbfo) aL.m.b();
                bbfoVar.getClass();
                bbhf bbhfVar = (bbhf) aL.n.b();
                bbhfVar.getClass();
                Optional optional = (Optional) aL.o.b();
                optional.getClass();
                clws clwsVar = (clws) aL.p.b();
                clwsVar.getClass();
                cbut cbutVar = (cbut) aL.q.b();
                cbutVar.getClass();
                ((cqrl) aL.r.b()).getClass();
                ffbr ffbrVar4 = aL.s;
                ffbr ffbrVar5 = aL.t;
                bajp bajpVar = (bajp) aL.u.b();
                bajpVar.getClass();
                ffbr ffbrVar6 = aL.v;
                cpez cpezVar = (cpez) aL.w.b();
                cpezVar.getClass();
                errl errlVar = (errl) aL.x.b();
                errlVar.getClass();
                cmlm cmlmVar = (cmlm) aL.y.b();
                cmlmVar.getClass();
                awge awgeVar = awge.this;
                Map map = (Map) aL.z.b();
                map.getClass();
                axcf axcfVar = (axcf) aL.A.b();
                axcfVar.getClass();
                bajm bajmVar = (bajm) aL.B.b();
                bajmVar.getClass();
                ffbr ffbrVar7 = aL.C;
                ffbr ffbrVar8 = aL.D;
                ffbr ffbrVar9 = aL.E;
                ffbr ffbrVar10 = aL.F;
                ffbr ffbrVar11 = aL.G;
                ffbr ffbrVar12 = aL.H;
                ffbr ffbrVar13 = aL.I;
                ffbr ffbrVar14 = aL.J;
                ffbr ffbrVar15 = aL.K;
                ceve ceveVar = awgeVar.c;
                new bajq(ffbrVar15, ffbrVar, bbgcVar, cqohVar, ffbrVar2, csjkVar, ffbrVar3, altkVar, banuVar, bbfwVar, bbgqVar, baioVar, byzpVar, bbfoVar, bbhfVar, optional, clwsVar, cbutVar, ffbrVar4, ffbrVar5, bajpVar, ffbrVar6, cpezVar, errlVar, c, awgeVar.b, null, null, ceveVar, ceveVar.getClass().getSimpleName(), cmlmVar, map, axcfVar, bajmVar, ffbrVar7, ffbrVar8, ffbrVar9, ffbrVar11, ffbrVar12, ffbrVar10, ffbrVar13, ffbrVar14).c();
                banu.d = epochMilli;
                return null;
            }
        }, this.d);
    }
}
