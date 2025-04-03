package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apqg implements apqh {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleMapi");
    private final bcwz c;

    public apqg(bcwz bcwzVar) {
        bcwzVar.getClass();
        this.c = bcwzVar;
    }

    public static final bcxb c(apmq apmqVar, eohh eohhVar) {
        Uri e = apmqVar.e();
        final bcxb C = bcxc.C();
        bcqk bcqkVar = (bcqk) C;
        bcqkVar.d = e;
        C.o(eohhVar);
        bcqkVar.c = le.c(apmqVar.b());
        Uri c = apmqVar.c();
        if (c == null || csup.b(c)) {
            c = null;
        }
        bcqkVar.e = c;
        if (apmqVar instanceof apmt) {
            apmt apmtVar = (apmt) apmqVar;
            C.g(apmtVar.h().toMillis());
            bcqkVar.l = apmtVar.g();
            return C;
        }
        if (!(apmqVar instanceof apqd)) {
            if (!(apmqVar instanceof apph)) {
                ((ensz) b.i()).t("Cannot create message part for: %s", apmqVar);
                return C;
            }
            apph apphVar = (apph) apmqVar;
            bcqkVar.j = apphVar.h();
            C.p(apphVar.a());
            C.h(apphVar.a());
            return C;
        }
        apqd apqdVar = (apqd) apmqVar;
        C.q(apqdVar.f().getWidth());
        C.i(apqdVar.f().getHeight());
        if (apqdVar instanceof appq) {
            appq appqVar = (appq) apqdVar;
            C.j(appqVar.a());
            C.l(!appqVar.l());
            C.n(appqVar.m());
            Optional j = appqVar.j();
            final ffji ffjiVar = new ffji() { // from class: apqe
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    Long l = (Long) obj;
                    int i = apqg.a;
                    l.getClass();
                    bcxb.this.g(l.longValue());
                    return ffcu.a;
                }
            };
            j.ifPresent(new Consumer() { // from class: apqf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    int i = apqg.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (cubs.f()) {
                if (appqVar.n() == 0) {
                    bcqkVar.n = byyz.DEFAULT_NO_VERDICT;
                    return C;
                }
                int n = appqVar.n();
                if (n == 0) {
                    throw null;
                }
                int i = n - 1;
                bcqkVar.n = i != 0 ? i != 1 ? i != 2 ? i != 3 ? byyz.PENDING_VERDICT : byyz.POSITIVE_VERDICT_REQUIRE_SPEEDBUMP : byyz.POSITIVE_VERDICT_HIDE_IMAGE : byyz.POSITIVE_VERDICT_DISPLAY_IMAGE : byyz.DEFAULT_NO_VERDICT;
                return C;
            }
        } else {
            if (apqdVar instanceof apps) {
                apps appsVar = (apps) apqdVar;
                LocationInformation locationInformation = new LocationInformation();
                locationInformation.d = appsVar.a();
                locationInformation.c = appsVar.h();
                bcqkVar.h = locationInformation;
                bcqkVar.b = appsVar.m();
                return C;
            }
            if (apqdVar instanceof appt) {
                appt apptVar = (appt) apqdVar;
                bcqkVar.f = apptVar.g();
                bcqkVar.g = apptVar.a();
            }
        }
        return C;
    }

    @Override // defpackage.apqh
    public final MessagePartCoreData a(apmq apmqVar, eohh eohhVar) {
        apmqVar.getClass();
        eohhVar.getClass();
        return this.c.c(c(apmqVar, eohhVar).r());
    }

    @Override // defpackage.apqh
    public final MessagePartCoreData b(apmq apmqVar, eohh eohhVar, awap awapVar) {
        apmqVar.getClass();
        eohhVar.getClass();
        bcxb c = c(apmqVar, eohhVar);
        ((bcqk) c).m = awapVar;
        return this.c.c(c.r());
    }
}
