package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cinq {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;

    public cinq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.m = ffbrVar4;
        this.d = ffbrVar5;
        this.e = ffbrVar6;
        this.n = ffbrVar7;
        this.f = ffbrVar8;
        this.g = ffbrVar9;
        this.o = ffbrVar10;
        this.h = ffbrVar11;
        this.i = ffbrVar12;
        this.j = ffbrVar13;
        this.p = ffbrVar14;
        this.k = ffbrVar15;
        this.q = ffbrVar16;
        this.r = ffbrVar17;
        this.l = ffbrVar18;
    }

    final cink a(final String str) {
        final ciok ciokVar = (ciok) this.p.b();
        return ((ciqn) ciokVar.b.b()).b(new ciql() { // from class: cioi
            @Override // defpackage.ciql
            public final Notification a(String str2) {
                ciok ciokVar2 = ciok.this;
                kml kmlVar = new kml(ciokVar2.a, str2);
                String str3 = str;
                kmlVar.h(str3);
                kmlVar.r(R.drawable.quantum_gm_ic_sync_white_24);
                kmlVar.l = 0;
                kmlVar.w(str3);
                kme kmeVar = new kme(kmlVar);
                kmeVar.e(str3);
                kmlVar.u(kmeVar);
                kmlVar.C = ciokVar2.a.getColor(R.color.silent_notification_icon_color);
                Intent d = ((ayfg) ciokVar2.d.b()).d(ciokVar2.a);
                d.setAction("android.intent.action.VIEW");
                TaskStackBuilder create = TaskStackBuilder.create(ciokVar2.a);
                create.addNextIntentWithParentStack(d);
                PendingIntent pendingIntent = create.getPendingIntent(0, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                kmlVar.g(true);
                kmlVar.g = pendingIntent;
                return kmlVar.a();
            }
        }, cinj.CMS_SYNC_FOREGROUND_SERVICE, new cipf() { // from class: cioj
            @Override // defpackage.cipf
            public final NotificationChannel a() {
                return ((cthp) ciok.this.c.b()).c();
            }
        });
    }

    final cink b(final String str) {
        final ciop ciopVar = (ciop) this.n.b();
        return ((ciqn) ciopVar.d.b()).b(new ciql() { // from class: cion
            @Override // defpackage.ciql
            public final Notification a(String str2) {
                ciop ciopVar2 = ciop.this;
                kml kmlVar = new kml(ciopVar2.c, str2);
                String str3 = str;
                kmlVar.h(str3);
                kmlVar.l = 0;
                kmlVar.w(str3);
                kme kmeVar = new kme(kmlVar);
                kmeVar.e(str3);
                kmlVar.u(kmeVar);
                kmlVar.C = ciopVar2.c.getColor(R.color.silent_notification_icon_color);
                kmlVar.r(true != ((Boolean) ciop.b.e()).booleanValue() ? R.drawable.notification_icon : R.drawable.quantum_gm_ic_sms_white_24);
                if (((Boolean) ciop.a.e()).booleanValue() && ciopVar2.g.isEmpty()) {
                    kmlVar.e(((cipe) ciopVar2.e.b()).a(ephv.PERSISTENT_FOREGROUND_NOTIFICATION));
                }
                return kmlVar.a();
            }
        }, cinj.FOREGROUND_SERVICE, new cipf() { // from class: cioo
            @Override // defpackage.cipf
            public final NotificationChannel a() {
                return ((cthp) ciop.this.f.b()).c();
            }
        });
    }

    final cink c(final ayfg ayfgVar, final ConversationIdType conversationIdType, final String str) {
        final cipp cippVar = (cipp) this.m.b();
        ciqn ciqnVar = cippVar.b;
        ciql ciqlVar = new ciql() { // from class: cipn
            @Override // defpackage.ciql
            public final Notification a(String str2) {
                String str3 = str;
                cipp cippVar2 = cipp.this;
                String string = cippVar2.a.getString(R.string.notification_emergency_send_failure_line1, str3);
                String string2 = cippVar2.a.getString(R.string.notification_emergency_send_failure_line2, str3);
                PendingIntent p = ayfgVar.p(cippVar2.a, new BugleConversationId(conversationIdType), false);
                kml kmlVar = new kml(cippVar2.a, str2);
                kmlVar.w(string);
                kmlVar.i(string);
                kmlVar.h(string2);
                kme kmeVar = new kme(kmlVar);
                kmeVar.e(string2);
                kmlVar.u(kmeVar);
                kmlVar.r(R.drawable.ic_warning_light);
                kmlVar.g = p;
                kmlVar.t(csuu.g(cippVar2.a, "raw", "message_failure"));
                return kmlVar.a();
            }
        };
        cinj cinjVar = cinj.MESSAGE_FAILURE;
        cipf cipfVar = new cipf() { // from class: cipo
            @Override // defpackage.cipf
            public final NotificationChannel a() {
                return cipp.this.c.e(conversationIdType, null, false);
            }
        };
        cine cineVar = (cine) ciqnVar.a.b();
        cineVar.getClass();
        cinjVar.getClass();
        return new ciqm(cineVar, ciqlVar, cinjVar, "Outgoing Emergency Message Failure", cipfVar);
    }

    final cink d(ephv ephvVar, String str, enhk enhkVar) {
        ciqb e = ciqc.e();
        e.b(ephvVar);
        Optional of = Optional.of(str);
        cimz cimzVar = (cimz) e;
        cimzVar.a = of;
        if (enhkVar != null) {
            cimzVar.c = Optional.of(enhkVar);
        }
        return ((ciqf) this.f.b()).a(e.a());
    }

    final cipu e(cins cinsVar) {
        cipv cipvVar = (cipv) this.q.b();
        Context context = (Context) cipvVar.a.b();
        context.getClass();
        cine cineVar = (cine) cipvVar.b.b();
        cineVar.getClass();
        ayfg ayfgVar = (ayfg) cipvVar.c.b();
        ayfgVar.getClass();
        ffbr ffbrVar = cipvVar.d;
        cthp cthpVar = (cthp) cipvVar.e.b();
        cthpVar.getClass();
        akzt akztVar = (akzt) cipvVar.f.b();
        akztVar.getClass();
        cipm cipmVar = (cipm) cipvVar.g.b();
        cipmVar.getClass();
        return new cipu(context, cineVar, ayfgVar, ffbrVar, cthpVar, akztVar, cipmVar, cinsVar, cipvVar.h);
    }

    final cipx f(cins cinsVar) {
        cipy cipyVar = (cipy) this.r.b();
        Context context = (Context) cipyVar.a.b();
        context.getClass();
        cine cineVar = (cine) cipyVar.b.b();
        cineVar.getClass();
        ayfg ayfgVar = (ayfg) cipyVar.c.b();
        ayfgVar.getClass();
        ffbr ffbrVar = cipyVar.d;
        akzt akztVar = (akzt) cipyVar.e.b();
        akztVar.getClass();
        cipm cipmVar = (cipm) cipyVar.f.b();
        cipmVar.getClass();
        return new cipx(context, cineVar, ayfgVar, ffbrVar, akztVar, cipmVar, cinsVar, cipyVar.g, cipyVar.h);
    }

    final ciqw g(cins cinsVar) {
        ciqx ciqxVar = (ciqx) this.o.b();
        Context context = (Context) ciqxVar.a.b();
        context.getClass();
        cine cineVar = (cine) ciqxVar.b.b();
        cineVar.getClass();
        ffbr ffbrVar = ciqxVar.c;
        ffbr ffbrVar2 = ciqxVar.d;
        cipe cipeVar = (cipe) ciqxVar.e.b();
        cipeVar.getClass();
        ffbr ffbrVar3 = ciqxVar.f;
        cnmx cnmxVar = (cnmx) ciqxVar.g.b();
        cnmxVar.getClass();
        cthp cthpVar = (cthp) ciqxVar.h.b();
        cthpVar.getClass();
        return new ciqw(context, cineVar, ffbrVar, ffbrVar2, cipeVar, ffbrVar3, cnmxVar, cthpVar, cinsVar, ciqxVar.i, ciqxVar.j);
    }
}
