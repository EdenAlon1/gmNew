package defpackage;

import android.telephony.ims.ImsReasonInfo;
import android.telephony.ims.ImsRegistrationAttributes;
import android.telephony.ims.RegistrationManager$RegistrationCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djly extends RegistrationManager$RegistrationCallback {
    private final djlj a;

    public djly(djlj djljVar) {
        this.a = djljVar;
    }

    public final void onRegistered(ImsRegistrationAttributes imsRegistrationAttributes) {
        this.a.b(imsRegistrationAttributes, true);
    }

    public final void onRegistering(ImsRegistrationAttributes imsRegistrationAttributes) {
        this.a.b(imsRegistrationAttributes, false);
    }

    public final void onTechnologyChangeFailed(int i, ImsReasonInfo imsReasonInfo) {
        int code;
        int extraCode;
        eyvr eyvrVar = (eyvr) eyvt.a.createBuilder();
        eyvrVar.copyOnWrite();
        eyvt eyvtVar = (eyvt) eyvrVar.instance;
        eyvtVar.c = 4;
        eyvtVar.b |= 1;
        eyuo eyuoVar = (eyuo) eyur.a.createBuilder();
        eyuoVar.copyOnWrite();
        eyur eyurVar = (eyur) eyuoVar.instance;
        eyurVar.d = djlj.c(i) - 1;
        eyurVar.b |= 1;
        eyvrVar.copyOnWrite();
        eyvt eyvtVar2 = (eyvt) eyvrVar.instance;
        eyur eyurVar2 = (eyur) eyuoVar.build();
        eyurVar2.getClass();
        eyvtVar2.d = eyurVar2;
        eyvtVar2.b |= 2;
        eyum eyumVar = (eyum) eyun.a.createBuilder();
        code = imsReasonInfo.getCode();
        eyumVar.copyOnWrite();
        eyun eyunVar = (eyun) eyumVar.instance;
        eyunVar.b |= 1;
        eyunVar.c = code;
        extraCode = imsReasonInfo.getExtraCode();
        eyumVar.copyOnWrite();
        eyun eyunVar2 = (eyun) eyumVar.instance;
        eyunVar2.b |= 2;
        eyunVar2.d = extraCode;
        eyvrVar.copyOnWrite();
        eyvt eyvtVar3 = (eyvt) eyvrVar.instance;
        eyun eyunVar3 = (eyun) eyumVar.build();
        eyunVar3.getClass();
        eyvtVar3.e = eyunVar3;
        eyvtVar3.b |= 4;
        this.a.a((eyvt) eyvrVar.build());
    }

    public final void onUnregistered(ImsReasonInfo imsReasonInfo) {
        int code;
        int extraCode;
        eyvr eyvrVar = (eyvr) eyvt.a.createBuilder();
        eyvrVar.copyOnWrite();
        eyvt eyvtVar = (eyvt) eyvrVar.instance;
        eyvtVar.c = 3;
        eyvtVar.b |= 1;
        eyum eyumVar = (eyum) eyun.a.createBuilder();
        code = imsReasonInfo.getCode();
        eyumVar.copyOnWrite();
        eyun eyunVar = (eyun) eyumVar.instance;
        eyunVar.b |= 1;
        eyunVar.c = code;
        extraCode = imsReasonInfo.getExtraCode();
        eyumVar.copyOnWrite();
        eyun eyunVar2 = (eyun) eyumVar.instance;
        eyunVar2.b |= 2;
        eyunVar2.d = extraCode;
        eyvrVar.copyOnWrite();
        eyvt eyvtVar2 = (eyvt) eyvrVar.instance;
        eyun eyunVar3 = (eyun) eyumVar.build();
        eyunVar3.getClass();
        eyvtVar2.e = eyunVar3;
        eyvtVar2.b |= 4;
        this.a.a((eyvt) eyvrVar.build());
    }
}
