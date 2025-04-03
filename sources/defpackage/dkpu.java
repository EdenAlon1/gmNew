package defpackage;

import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkpu extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ dkpw a;

    public dkpu(dkpw dkpwVar) {
        this.a = dkpwVar;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        boolean z;
        dkty.d(dkpw.a, "Received onSubscriptionsChanged event", new Object[0]);
        boolean booleanValue = ((Boolean) djam.a().a.e.a()).booleanValue();
        dkpw dkpwVar = this.a;
        if (booleanValue) {
            try {
                List<SubscriptionInfo> c = dkvq.b(dkpwVar.g).c();
                eyya eyyaVar = (eyya) eyyd.a.createBuilder();
                if (c == null || c.isEmpty()) {
                    z = false;
                } else {
                    z = false;
                    for (SubscriptionInfo subscriptionInfo : c) {
                        int mcc = subscriptionInfo.getMcc();
                        int mnc = subscriptionInfo.getMnc();
                        if (mcc > 0 && mnc > 0) {
                            eyyb eyybVar = (eyyb) eyyc.a.createBuilder();
                            eyybVar.copyOnWrite();
                            eyyc eyycVar = (eyyc) eyybVar.instance;
                            eyycVar.b |= 1;
                            eyycVar.c = mcc;
                            eyybVar.copyOnWrite();
                            eyyc eyycVar2 = (eyyc) eyybVar.instance;
                            eyycVar2.b |= 2;
                            eyycVar2.d = mnc;
                            int simSlotIndex = subscriptionInfo.getSimSlotIndex();
                            eyybVar.copyOnWrite();
                            eyyc eyycVar3 = (eyyc) eyybVar.instance;
                            eyycVar3.b |= 4;
                            eyycVar3.e = simSlotIndex;
                            int subscriptionId = subscriptionInfo.getSubscriptionId();
                            eyybVar.copyOnWrite();
                            eyyc eyycVar4 = (eyyc) eyybVar.instance;
                            eyycVar4.b |= 8;
                            eyycVar4.f = subscriptionId;
                            eyyc eyycVar5 = (eyyc) eyybVar.build();
                            eyyaVar.copyOnWrite();
                            eyyd eyydVar = (eyyd) eyyaVar.instance;
                            eyycVar5.getClass();
                            eygr eygrVar = eyydVar.e;
                            if (!eygrVar.c()) {
                                eyydVar.e = eyfy.mutableCopy(eygrVar);
                            }
                            eyydVar.e.add(eyycVar5);
                            z = true;
                        }
                    }
                }
                eyyaVar.copyOnWrite();
                eyyd eyydVar2 = (eyyd) eyyaVar.instance;
                eyydVar2.b |= 2;
                eyydVar2.d = z;
                int f = dkpwVar.f(dkpwVar.g);
                eyyaVar.copyOnWrite();
                eyyd eyydVar3 = (eyyd) eyyaVar.instance;
                eyydVar3.b = 1 | eyydVar3.b;
                eyydVar3.c = f;
                dkpwVar.e.c((eyyd) eyyaVar.build());
            } catch (dkvd unused) {
                dkty.h(dkpw.a, "Permission is required for SubscriptionManager", new Object[0]);
            }
        }
        dkpw dkpwVar2 = this.a;
        dkpl dkplVar = dkpwVar2.f;
        if (dkplVar == null || !dkplVar.c(dkpw.B(dkpwVar2.g))) {
            this.a.n(-1);
        } else {
            dkty.d(dkpw.a, "delay onSubscriptionsChanged", new Object[0]);
        }
    }
}
