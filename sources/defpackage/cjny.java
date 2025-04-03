package defpackage;

import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjny implements cjjt {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/SendRcsReportSerializingInterceptor");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final cjjv e;

    public cjny(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = new cjjv("SendRcsReportSerializingInterceptor");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.e;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        cjns cjnsVar;
        eigx eigxVar;
        MessageReceipt k;
        cjns cjnsVar2 = (cjns) obj;
        if (cjnsVar2 instanceof cjnq) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.e;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjnq.class).c());
            cjnsVar = cjnsVar2;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.e;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjnq.class).c(), new ffkb(cjnsVar2.getClass()).c());
            cjnsVar = null;
        }
        cjnq cjnqVar = (cjnq) cjnsVar;
        if (cjnqVar == null) {
            return cjnsVar2;
        }
        cjnj cjnjVar = cjnqVar.a;
        if (cjnjVar.l != null) {
            ensk g = a.g();
            g.Y(ente.a, "BugleSending");
            ((enrr) g.h("com/google/android/apps/messaging/shared/pipeline/rcs/send/SendRcsReportSerializingInterceptor", "execute", 50, "SendRcsReportSerializingInterceptor.kt")).q("SendRcsReportSerializingInterceptor skipping because already serialized");
            return cjnqVar;
        }
        if (cjnjVar.j) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSending");
            ((enrr) j.h("com/google/android/apps/messaging/shared/pipeline/rcs/send/SendRcsReportSerializingInterceptor", "execute", 61, "SendRcsReportSerializingInterceptor.kt")).t("Sending IMDN plaintext receipt, since it wasn't pre-serialized: %s", cjnjVar.g);
        }
        if (((augx) this.d.b()).a()) {
            bdhg bdhgVar = cjnjVar.g;
            Instant instant = cjnjVar.c;
            int ordinal = cjnjVar.h.ordinal();
            if (ordinal == 0) {
                throw new IllegalArgumentException("Unsupported receipt type: UNKNOWN_RECEIPT_TYPE");
            }
            if (ordinal == 1) {
                eies eiesVar = new eies();
                eiesVar.j(eigx.DELIVERY);
                eiesVar.h(eigx.DELIVERY.f);
                eiesVar.g(bdhg.e(bdhgVar));
                eiesVar.i(instant);
                k = eiesVar.k();
            } else if (ordinal == 2) {
                eies eiesVar2 = new eies();
                eiesVar2.j(eigx.DISPLAY);
                eiesVar2.h(eigx.DISPLAY.f);
                eiesVar2.g(bdhg.e(bdhgVar));
                eiesVar2.i(instant);
                k = eiesVar2.k();
            } else {
                if (ordinal != 3) {
                    throw new ffcd();
                }
                eies eiesVar3 = new eies();
                eiesVar3.j(eigx.DELIVERY);
                eiesVar3.h("failed");
                eiesVar3.g(bdhg.e(bdhgVar));
                eiesVar3.i(instant);
                k = eiesVar3.k();
            }
        } else {
            int ordinal2 = cjnjVar.h.ordinal();
            if (ordinal2 == 0) {
                throw new IllegalArgumentException("Unsupported receipt type: UNKNOWN_RECEIPT_TYPE");
            }
            if (ordinal2 == 1) {
                eigxVar = eigx.DELIVERY;
            } else if (ordinal2 == 2) {
                eigxVar = eigx.DISPLAY;
            } else {
                if (ordinal2 != 3) {
                    throw new ffcd();
                }
                eigxVar = eigx.DELIVERY;
            }
            eies eiesVar4 = new eies();
            eiesVar4.j(eigxVar);
            eiesVar4.g(bdhg.e(cjnjVar.g));
            eiesVar4.i(cjnjVar.c);
            eiesVar4.h(eigxVar.f);
            k = eiesVar4.k();
        }
        ensk e = a.e();
        e.Y(ente.a, "BugleSending");
        ((enrr) e.h("com/google/android/apps/messaging/shared/pipeline/rcs/send/SendRcsReportSerializingInterceptor", "execute", 84, "SendRcsReportSerializingInterceptor.kt")).t("SendRcsReportSerializingInterceptor serializing receipt for %s", cjnjVar.g);
        try {
            return new cjnq(cjnj.a(cjnjVar, null, (awul) ((avtx) this.c.b()).fP(((eikl) this.b.b()).b(MessageReceipt.class).b(k)), null, null, 30719));
        } catch (eikm e2) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleSending");
            ((enrr) ((enrr) j2).g(e2).h("com/google/android/apps/messaging/shared/pipeline/rcs/send/SendRcsReportSerializingInterceptor", "execute", 96, "SendRcsReportSerializingInterceptor.kt")).q("Failed to serialize imdn receipt");
            return cjnt.a(cjnjVar, new cowg(e2));
        }
    }
}
