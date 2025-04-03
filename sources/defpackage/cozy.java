package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozy implements cowq {
    private static final cskc a = cskc.g("BugleRcs", "RcsMessageReceiptSender");
    private final couo b;
    private final cozu c;
    private final ckds d;

    public cozy(couo couoVar, cozu cozuVar, ckds ckdsVar) {
        this.b = couoVar;
        this.c = cozuVar;
        this.d = ckdsVar;
    }

    @Override // defpackage.cowq
    public final elfl b(MessageCoreData messageCoreData, avkl avklVar) {
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxz awxzVar = awxz.CONTROL;
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
        return this.b.h(messageCoreData, avklVar, awzn.DELIVERY, this.c, new emwl() { // from class: cozw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return fayv.a;
            }
        }, (awya) awxvVar.build());
    }

    @Override // defpackage.cowq
    public final elfl c(MessageCoreData messageCoreData, avkl avklVar, int i) {
        awzn a2 = cowo.a(i);
        if (a2 == awzn.UNKNOWN_RECEIPT_TYPE) {
            enrr k = a.k();
            k.Y(csux.f, messageCoreData.E());
            ((enrr) k.h("com/google/android/apps/messaging/shared/sms/UnencryptedRcsMessageReceiptSender", "sendDeliveryReceipt", 76, "UnencryptedRcsMessageReceiptSender.java")).q("Not sending delivery receipt for unknown receipt type");
            ckdq ckdqVar = new ckdq();
            ckdqVar.b = eqxi.a;
            ckdqVar.a = true;
            return elfo.e(ckdqVar);
        }
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxz awxzVar = awxz.CONTROL;
        awxvVar.copyOnWrite();
        awya awyaVar = (awya) awxvVar.instance;
        awyaVar.c = awxzVar.d;
        awyaVar.b = 1 | awyaVar.b;
        awxx awxxVar = awxx.HIGH;
        awxvVar.copyOnWrite();
        awya awyaVar2 = (awya) awxvVar.instance;
        awyaVar2.d = awxxVar.e;
        awyaVar2.b |= 2;
        awxvVar.copyOnWrite();
        awya awyaVar3 = (awya) awxvVar.instance;
        awyaVar3.b |= 4;
        awyaVar3.e = false;
        return this.b.h(messageCoreData, avklVar, a2, this.c, new emwl() { // from class: cozv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return fayv.a;
            }
        }, (awya) awxvVar.build());
    }

    @Override // defpackage.cowq
    public final elfl d(bdhg bdhgVar, Instant instant, avkl avklVar, Optional optional, awui awuiVar, Bundle bundle) {
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxz awxzVar = awxz.CONTROL;
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
        return this.b.d(bdhgVar, avklVar, awzn.DELIVERY, instant, this.c, (awya) awxvVar.build(), awuiVar);
    }

    @Override // defpackage.cowq
    public final elfl e(MessageCoreData messageCoreData, avkl avklVar) {
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxz awxzVar = awxz.CONTROL;
        awxvVar.copyOnWrite();
        awya awyaVar = (awya) awxvVar.instance;
        awyaVar.c = awxzVar.d;
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
        return this.b.h(messageCoreData, avklVar, awzn.DISPLAYED, this.c, new emwl() { // from class: cozx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return fayv.a;
            }
        }, (awya) awxvVar.build());
    }

    @Override // defpackage.cowq
    public final boolean f(MessageCoreData messageCoreData) {
        if (!messageCoreData.cB()) {
            return this.d.K(messageCoreData);
        }
        csjb e = a.e();
        e.I("Not sending regular read report for etouffee message");
        e.h(messageCoreData.E());
        e.r();
        return false;
    }
}
