package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yud implements ytq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl");
    public final ffsk b;
    public final Context c;
    public final aigz d;
    public final dqlx e;
    public final llv f;
    public final ajjc g;
    public final cnpd h;
    public final ffbr i;
    private final Optional j;
    private final fgcq k;
    private final ffbr l;
    private final attg m;
    private final Duration n;
    private final ffbr o;
    private final fgcq p;
    private final ablq q;

    public yud(ffsk ffskVar, Context context, Optional optional, fgcq fgcqVar, aigz aigzVar, dqlx dqlxVar, ablq ablqVar, llv llvVar, ajjc ajjcVar, cnpd cnpdVar, ffbr ffbrVar, attg attgVar, Duration duration, ffbr ffbrVar2, ffbr ffbrVar3, fgcq fgcqVar2) {
        ffskVar.getClass();
        context.getClass();
        optional.getClass();
        fgcqVar.getClass();
        aigzVar.getClass();
        dqlxVar.getClass();
        ablqVar.getClass();
        llvVar.getClass();
        ajjcVar.getClass();
        cnpdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffskVar;
        this.c = context;
        this.j = optional;
        this.k = fgcqVar;
        this.d = aigzVar;
        this.e = dqlxVar;
        this.q = ablqVar;
        this.f = llvVar;
        this.g = ajjcVar;
        this.h = cnpdVar;
        this.l = ffbrVar;
        this.m = attgVar;
        this.n = duration;
        this.o = ffbrVar2;
        this.i = ffbrVar3;
        this.p = fgcqVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yua
            if (r0 == 0) goto L13
            r0 = r5
            yua r0 = (defpackage.yua) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yua r0 = new yua
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            fgcq r5 = r4.p
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 == r1) goto L4d
        L3c:
            aqvj r5 = (defpackage.aqvj) r5
            aqvj r0 = defpackage.aqvj.d
            if (r5 == r0) goto L48
            aqvj r0 = defpackage.aqvj.e
            if (r5 != r0) goto L47
            goto L48
        L47:
            r3 = 0
        L48:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yud.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r19, defpackage.kli r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yud.b(java.lang.String, kli, ffgu):java.lang.Object");
    }

    public final void c() {
        dhqg dhqgVar = new dhqg();
        Duration ofSeconds = ((ersq) ((atsw) this.m).a.b()).a("bugle.extend_satellite_location_timeout") ? this.n : Duration.ofSeconds(1L);
        dgym dgymVar = (dgym) this.l.b();
        dgyg dgygVar = new dgyg();
        dgygVar.c(100);
        dgygVar.b(ofSeconds.toMillis());
        dfwv.b(true, "maxUpdateAgeMillis must be greater than or equal to 0");
        dgygVar.a = 10000L;
        dgyo.b(2);
        dgygVar.b = 2;
        dhre a2 = dgymVar.a(dgygVar.a(), dhqgVar.a);
        final ffji ffjiVar = new ffji() { // from class: ytr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                yud yudVar = yud.this;
                Location location = (Location) obj;
                if (location == null) {
                    yudVar.d(new IllegalStateException("Location is null"));
                } else {
                    String a3 = bdws.a(location.getLatitude(), location.getLongitude());
                    ensk e = yud.a.e();
                    e.Y(ente.a, "BugleComposeRow2");
                    ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLatLngResult", 288, "LocationHandlerImpl.kt")).D("Setting location url as attachment, uri %s, location %s", a3, location);
                    a3.getClass();
                    axol.k(yudVar.b, null, new ytw(yudVar, new RichLocation(a3, location.getLatitude(), location.getLongitude()), null), 3);
                }
                return ffcu.a;
            }
        };
        a2.a(new dhqy() { // from class: yts
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                ffji.this.invoke(obj);
            }
        });
        a2.t(new dhqv() { // from class: ytt
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                yud.this.d(exc);
            }
        });
    }

    public final void d(Exception exc) {
        ensk j = a.j();
        j.Y(ente.a, "BugleComposeRow2");
        ((enrr) ((enrr) j).g(exc).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationFailure", 275, "LocationHandlerImpl.kt")).q("Unable to attach location directly");
        axol.k(this.b, null, new ytz(this, null), 3);
    }

    public final void e(ade adeVar) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        if (((atbu) this.o.b()).a()) {
            this.f.d("location_saved_state_pending_result", false);
        }
        if (adeVar.a != -1) {
            ensk h = a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 193, "LocationHandlerImpl.kt")).r("Location picker did not succeed. resultCode %s", adeVar.a);
            return;
        }
        Intent intent = adeVar.b;
        if (intent == null) {
            ensk i = a.i();
            i.Y(ente.a, "BugleComposeRow2");
            ((enrr) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 198, "LocationHandlerImpl.kt")).q("Location picker succeeded with null data");
            return;
        }
        Uri data = intent.getData();
        String stringExtra = intent.getStringExtra("location_url");
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra2 = intent.getParcelableExtra("location_extra", Location.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("location_extra");
        }
        Location location = (Location) parcelableExtra;
        if (data == null || stringExtra == null || location == null) {
            ensk j = a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 227, "LocationHandlerImpl.kt")).J("Missing data, not setting location, dataUri %s, locationUrl %s, location %s", data, stringExtra, location);
            return;
        }
        ensk e = a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 208, "LocationHandlerImpl.kt")).J("Setting location url as attachment, dataUri %s, locationUrl %s, location %s", data, stringExtra, location);
        if (!ffkj.e(data, Uri.EMPTY)) {
            Objects.toString(data);
            throw new IllegalStateException("Location picker result data URI is ".concat(data.toString()));
        }
        this.e.e(new RichLocation(stringExtra, location.getLatitude(), location.getLongitude()));
    }
}
