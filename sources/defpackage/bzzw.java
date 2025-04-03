package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzzw implements cowq {
    public final akzt b;
    private final cozy d;
    private final couo e;
    private final bzzb f;
    private final ckds g;
    private final bzqa h;
    private final avty i = new avty();
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender");
    public static final emyl a = cfvl.w("include_disposition_notification_required");

    public bzzw(cozy cozyVar, couo couoVar, bzzb bzzbVar, ckds ckdsVar, akzt akztVar, bzqa bzqaVar) {
        this.d = cozyVar;
        this.e = couoVar;
        this.f = bzzbVar;
        this.g = ckdsVar;
        this.b = akztVar;
        this.h = bzqaVar;
    }

    public static ckdq a(Throwable th) {
        ensk j = c.j();
        j.Y(ente.a, "BugleEtouffee");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "logAndGetFailedResult", (char) 278, "EtouffeeRcsMessageReceiptSender.java")).q("Failed to send receipt");
        ckdq ckdqVar = new ckdq();
        ckdqVar.a = false;
        return ckdqVar;
    }

    private final awya g(String str) {
        boolean z = this.h.s() && eijq.d.g(str);
        awxz awxzVar = z ? awxz.CONTROL : awxz.USER;
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxvVar.copyOnWrite();
        awya awyaVar = (awya) awxvVar.instance;
        awyaVar.c = awxzVar.d;
        awyaVar.b |= 1;
        awxx awxxVar = awxx.HIGH;
        awxvVar.copyOnWrite();
        awya awyaVar2 = (awya) awxvVar.instance;
        awyaVar2.d = awxxVar.e;
        awyaVar2.b |= 2;
        awxvVar.copyOnWrite();
        awya awyaVar3 = (awya) awxvVar.instance;
        awyaVar3.b |= 4;
        awyaVar3.e = false;
        if (((Boolean) ((cfup) a.get()).e()).booleanValue() && !z) {
            awxvVar.copyOnWrite();
            awya awyaVar4 = (awya) awxvVar.instance;
            awyaVar4.b |= 8;
            awyaVar4.f = false;
        }
        return (awya) awxvVar.build();
    }

    @Override // defpackage.cowq
    public final elfl b(MessageCoreData messageCoreData, avkl avklVar) {
        if (!messageCoreData.cB()) {
            return this.d.b(messageCoreData, avklVar);
        }
        ensk e = c.e();
        e.Y(ente.a, "BugleEtouffee");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "sendDeliveryReceipt", 91, "EtouffeeRcsMessageReceiptSender.java")).t("Attempt to send encrypted delivery report for RCS message: %s", messageCoreData.E().f());
        awya g = g(messageCoreData.am());
        return this.e.h(messageCoreData, avklVar, awzn.DELIVERY, this.f, new emwl() { // from class: bzzv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emyl emylVar = bzzw.a;
                return fayv.a;
            }
        }, g);
    }

    @Override // defpackage.cowq
    public final elfl c(MessageCoreData messageCoreData, avkl avklVar, int i) {
        awzn a2 = cowo.a(i);
        if (a2 == awzn.UNKNOWN_RECEIPT_TYPE) {
            ensk j = c.j();
            j.Y(ente.a, "BugleEtouffee");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(csux.f, messageCoreData.E());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "sendDeliveryReceipt", 116, "EtouffeeRcsMessageReceiptSender.java")).q("Not sending delivery receipt for unknown receipt type");
            ckdq ckdqVar = new ckdq();
            ckdqVar.b = eqxi.a;
            ckdqVar.a = true;
            return elfo.e(ckdqVar);
        }
        if (!messageCoreData.cB()) {
            return this.d.c(messageCoreData, avklVar, i);
        }
        ensk e = c.e();
        e.Y(ente.a, "BugleEtouffee");
        enrr enrrVar2 = (enrr) e;
        enrrVar2.Y(csux.f, messageCoreData.E());
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "sendDeliveryReceipt", 130, "EtouffeeRcsMessageReceiptSender.java")).q("Attempt to send encrypted delivery report for RCS message");
        return this.e.h(messageCoreData, avklVar, a2, this.f, new emwl() { // from class: bzzu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emyl emylVar = bzzw.a;
                return fayv.a;
            }
        }, g(messageCoreData.am()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [cown, java.lang.Object] */
    @Override // defpackage.cowq
    public final elfl d(bdhg bdhgVar, Instant instant, avkl avklVar, Optional optional, awui awuiVar, Bundle bundle) {
        if (!optional.isPresent()) {
            return this.d.d(bdhgVar, instant, avklVar, optional, awuiVar, bundle);
        }
        ?? r6 = optional.get();
        avty avtyVar = this.i;
        awup awupVar = r6.a(awzn.DELIVERY, bdhgVar, instant).c;
        if (awupVar == null) {
            awupVar = awup.a;
        }
        return this.e.d(bdhgVar, avklVar, awzn.DELIVERY, instant, r6, g(((ContentType) avtyVar.fP(awupVar)).toString()), awuiVar);
    }

    @Override // defpackage.cowq
    public final elfl e(MessageCoreData messageCoreData, avkl avklVar) {
        awxz awxzVar;
        if (!messageCoreData.cB()) {
            return this.d.e(messageCoreData, avklVar);
        }
        enru enruVar = c;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleEtouffee");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "sendDisplayReceipt", 150, "EtouffeeRcsMessageReceiptSender.java")).t("Attempt to send encrypted display report for RCS message: %s", messageCoreData.E().f());
        awxv awxvVar = (awxv) awya.a.createBuilder();
        if (bzwf.h() && avklVar.d()) {
            awxz awxzVar2 = awxz.CONTROL;
            awxvVar.copyOnWrite();
            awya awyaVar = (awya) awxvVar.instance;
            awyaVar.c = awxzVar2.d;
            awyaVar.b |= 1;
            awxx awxxVar = awxx.NORMAL;
            awxvVar.copyOnWrite();
            awya awyaVar2 = (awya) awxvVar.instance;
            awyaVar2.d = awxxVar.e;
            awyaVar2.b |= 2;
            awxvVar.copyOnWrite();
            awya awyaVar3 = (awya) awxvVar.instance;
            awyaVar3.b |= 4;
            awyaVar3.e = false;
        } else {
            if (((Boolean) ((cfup) bzwd.B.get()).e()).booleanValue()) {
                awxzVar = awxz.CONTROL;
                ensk h = enruVar.h();
                h.Y(ente.a, "BugleEtouffee");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "sendDisplayReceipt", 165, "EtouffeeRcsMessageReceiptSender.java")).q("Encrypted display IMDN is using CONTROL MessageSource.");
            } else {
                awxzVar = awxz.USER;
                ensk h2 = enruVar.h();
                h2.Y(ente.a, "BugleEtouffee");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeRcsMessageReceiptSender", "sendDisplayReceipt", 168, "EtouffeeRcsMessageReceiptSender.java")).q("Encrypted display IMDN is using USER MessageSource.");
            }
            awxvVar.copyOnWrite();
            awya awyaVar4 = (awya) awxvVar.instance;
            awyaVar4.c = awxzVar.d;
            awyaVar4.b |= 1;
            awxx awxxVar2 = awxx.NORMAL;
            awxvVar.copyOnWrite();
            awya awyaVar5 = (awya) awxvVar.instance;
            awyaVar5.d = awxxVar2.e;
            awyaVar5.b |= 2;
            awxvVar.copyOnWrite();
            awya awyaVar6 = (awya) awxvVar.instance;
            awyaVar6.b |= 4;
            awyaVar6.e = false;
        }
        return this.e.h(messageCoreData, avklVar, awzn.DISPLAYED, this.f, new emwl() { // from class: bzzp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emyl emylVar = bzzw.a;
                return fayv.a;
            }
        }, (awya) awxvVar.build()).e(caeq.class, new emwl() { // from class: bzzq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzzw.this.b.c("Bugle.Etouffee.ChatApi.EmptyRemoteRegistrationIds.Count");
                return bzzw.a((caeq) obj);
            }
        }, erpp.a).e(cagb.class, new emwl() { // from class: bzzr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return bzzw.a((cagb) obj);
            }
        }, erpp.a).e(fedn.class, new emwl() { // from class: bzzs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return bzzw.a((fedn) obj);
            }
        }, erpp.a).e(cadk.class, new emwl() { // from class: bzzt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return bzzw.a((cadk) obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.cowq
    public final boolean f(MessageCoreData messageCoreData) {
        return !messageCoreData.cB() ? this.d.f(messageCoreData) : this.g.K(messageCoreData);
    }
}
