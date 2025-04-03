package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.net.tachyonreceiver.PullMessagesWorker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cilj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver");
    public final Context b;
    public final emyl c;
    public final emyl d;
    public final emyl e;
    public volatile boolean f = false;
    private final errl g;

    public cilj(Context context, final ffbr ffbrVar, final cija cijaVar, final chzl chzlVar, final cihi cihiVar, errl errlVar, final cgwn cgwnVar, final int i, final Optional optional, final Duration duration, final Duration duration2, final int i2, final int i3, final boolean z, final boolean z2, final boolean z3) {
        this.b = context;
        this.g = errlVar;
        this.c = emys.a(new emyl() { // from class: cild
            @Override // defpackage.emyl
            public final Object get() {
                chhw chhwVar = (chhw) ffbrVar.b();
                cija cijaVar2 = cija.this;
                Map map = (Map) cijaVar2.a.b();
                map.getClass();
                Map map2 = (Map) cijaVar2.b.b();
                map2.getClass();
                chga chgaVar = (chga) cijaVar2.c.b();
                chgaVar.getClass();
                errm errmVar = (errm) cijaVar2.d.b();
                errmVar.getClass();
                ffsk ffskVar = (ffsk) cijaVar2.e.b();
                ffskVar.getClass();
                cqoh cqohVar = (cqoh) cijaVar2.f.b();
                cqohVar.getClass();
                akzt akztVar = (akzt) cijaVar2.g.b();
                akztVar.getClass();
                chhwVar.getClass();
                cgwn cgwnVar2 = cgwnVar;
                cgwnVar2.getClass();
                return new ciiz(map, map2, chgaVar, errmVar, ffskVar, cqohVar, akztVar, cijaVar2.h, chhwVar, cgwnVar2);
            }
        });
        this.e = emys.a(new emyl() { // from class: cile
            @Override // defpackage.emyl
            public final Object get() {
                ciio ciioVar = (ciio) cilj.this.c.get();
                chhw chhwVar = (chhw) ffbrVar.b();
                cihi cihiVar2 = cihiVar;
                chga chgaVar = (chga) cihiVar2.a.b();
                chgaVar.getClass();
                errl errlVar2 = (errl) cihiVar2.b.b();
                errlVar2.getClass();
                ciioVar.getClass();
                chhwVar.getClass();
                cgwn cgwnVar2 = cgwnVar;
                cgwnVar2.getClass();
                return new cihh(chgaVar, errlVar2, cihiVar2.c, ciioVar, chhwVar, cgwnVar2, z, epkl.a(i));
            }
        });
        this.d = emys.a(new emyl() { // from class: cilf
            @Override // defpackage.emyl
            public final Object get() {
                cilj ciljVar = cilj.this;
                ciio ciioVar = (ciio) ciljVar.c.get();
                chhw chhwVar = (chhw) ffbrVar.b();
                Optional of = z3 ? Optional.of(ciljVar.e) : Optional.empty();
                int i4 = i;
                cgwn cgwnVar2 = cgwnVar;
                ciaa ciaaVar = (ciaa) chzlVar;
                chga chgaVar = (chga) ciaaVar.b.b();
                chgaVar.getClass();
                akzt akztVar = (akzt) ciaaVar.e.b();
                akztVar.getClass();
                errm errmVar = (errm) ciaaVar.g.b();
                errmVar.getClass();
                errl errlVar2 = (errl) ciaaVar.h.b();
                errlVar2.getClass();
                cqoh cqohVar = (cqoh) ciaaVar.j.b();
                cqohVar.getClass();
                elbx elbxVar = (elbx) ciaaVar.k.b();
                elbxVar.getClass();
                ciioVar.getClass();
                chhwVar.getClass();
                cgwnVar2.getClass();
                boolean z4 = z2;
                boolean z5 = z;
                int i5 = i3;
                int i6 = i2;
                Duration duration3 = duration2;
                Duration duration4 = duration;
                Optional optional2 = optional;
                optional2.getClass();
                duration4.getClass();
                duration3.getClass();
                ffbr ffbrVar2 = ciaaVar.m;
                ffbr ffbrVar3 = ciaaVar.l;
                ffbr ffbrVar4 = ciaaVar.i;
                return new chzz(chgaVar, ciaaVar.c, ciaaVar.d, akztVar, ciaaVar.f, errmVar, errlVar2, ffbrVar4, cqohVar, elbxVar, ffbrVar3, ffbrVar2, ciioVar, chhwVar, cgwnVar2, i4, optional2, of, duration4, duration3, i6, i5, z5, z4);
            }
        });
    }

    public final elfl a(final fcek fcekVar, elfl elflVar) {
        return elflVar.e(Throwable.class, new emwl() { // from class: cili
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (!chfh.d(th)) {
                    ensk j = cilj.a.j();
                    j.Y(ente.a, "BugleNetwork");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(chfh.a, chfh.a(th));
                    ((enrr) ((enrr) enrrVar.g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessages", 170, "TachyonReceiver.java")).q("Tachyon PullMessages or RegisterRefresh failed with non-retriable error");
                    return null;
                }
                fcek fcekVar2 = fcekVar;
                cilj ciljVar = cilj.this;
                ensk j2 = cilj.a.j();
                j2.Y(ente.a, "BugleNetwork");
                enrr enrrVar2 = (enrr) j2;
                enrrVar2.Y(chfh.a, chfh.a(th));
                ((enrr) ((enrr) enrrVar2.g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessages", 161, "TachyonReceiver.java")).q("Tachyon PullMessages or RegisterRefresh failed with retriable error");
                PullMessagesWorker.c(ciljVar.b, fcekVar2);
                return null;
            }
        }, this.g);
    }

    public final elfl b(fcek fcekVar) {
        this.f = true;
        return a(fcekVar, ((cigx) this.e.get()).a());
    }

    public final elfl c(final fcek fcekVar) {
        this.f = false;
        return ((cigx) this.e.get()).a().h(new emwl() { // from class: cilg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new ppp();
            }
        }, erpp.a).e(Throwable.class, new emwl() { // from class: cilh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (!chfh.d(th)) {
                    ensk j = cilj.a.j();
                    j.Y(ente.a, "BugleNetwork");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(chfh.a, chfh.a(th));
                    ((enrr) ((enrr) enrrVar.g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessagesFromWorker", 217, "TachyonReceiver.java")).q("Tachyon PullMessagesFromWorker failed with a non-retriable error");
                    return new ppn();
                }
                cilj ciljVar = cilj.this;
                ensk j2 = cilj.a.j();
                j2.Y(ente.a, "BugleNetwork");
                enrr enrrVar2 = (enrr) j2;
                enrrVar2.Y(chfh.a, chfh.a(th));
                ((enrr) ((enrr) enrrVar2.g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessagesFromWorker", 197, "TachyonReceiver.java")).q("Tachyon PullMessagesFromWorker failed with a retriable error");
                if (!ciljVar.f) {
                    return new ppo();
                }
                fcek fcekVar2 = fcekVar;
                ensk h = cilj.a.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessagesFromWorker", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "TachyonReceiver.java")).q("Re-scheduling a Tachyon PullMessagesWorker retry due to a new request");
                PullMessagesWorker.c(ciljVar.b, fcekVar2);
                return new ppn();
            }
        }, this.g);
    }

    public final elfl d() {
        return ((chzk) this.d.get()).a();
    }

    public final void e() {
        ((chzk) this.d.get()).c();
    }

    public final elfl f(String str) {
        return ((chzk) this.d.get()).d(str);
    }
}
