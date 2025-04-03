package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgd {
    public xgd(Context context) {
        context.getClass();
    }

    public static final void a(epog epogVar, int i, Boolean bool) {
        eppx eppxVar = (eppx) epqg.a.createBuilder();
        eppxVar.getClass();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            eppxVar.copyOnWrite();
            epqg epqgVar = (epqg) eppxVar.instance;
            epqgVar.b |= 1;
            epqgVar.e = booleanValue;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                epqc epqcVar = (epqc) epqd.a.createBuilder();
                epqcVar.getClass();
                eyfy build = epqcVar.build();
                build.getClass();
                eppxVar.copyOnWrite();
                epqg epqgVar2 = (epqg) eppxVar.instance;
                epqgVar2.d = (epqd) build;
                epqgVar2.c = 103;
            } else if (i2 == 2) {
                eppy eppyVar = (eppy) eppz.a.createBuilder();
                eppyVar.getClass();
                eyfy build2 = eppyVar.build();
                build2.getClass();
                eppxVar.copyOnWrite();
                epqg epqgVar3 = (epqg) eppxVar.instance;
                epqgVar3.d = (eppz) build2;
                epqgVar3.c = 102;
            } else if (i2 != 3) {
                epqa epqaVar = (epqa) epqb.a.createBuilder();
                epqaVar.getClass();
                eyfy build3 = epqaVar.build();
                build3.getClass();
                eppxVar.copyOnWrite();
                epqg epqgVar4 = (epqg) eppxVar.instance;
                epqgVar4.d = (epqb) build3;
                epqgVar4.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            } else {
                epqe epqeVar = (epqe) epqf.a.createBuilder();
                epqeVar.getClass();
                eyfy build4 = epqeVar.build();
                build4.getClass();
                eppxVar.copyOnWrite();
                epqg epqgVar5 = (epqg) eppxVar.instance;
                epqgVar5.d = (epqf) build4;
                epqgVar5.c = 104;
            }
        }
        eyfy build5 = eppxVar.build();
        build5.getClass();
        eppq eppqVar = epogVar.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epprVar.f = (epqg) build5;
        epprVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
    }

    public static final eppr b(int i, Boolean bool) {
        epog a = epof.a((eppq) eppr.a.createBuilder());
        xgm.b(a, i);
        a(a, i, bool);
        return a.a();
    }
}
