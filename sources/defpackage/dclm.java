package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dclm {
    public static engw b(cstx cstxVar, MessagePartCoreData messagePartCoreData) {
        String ae;
        Integer num;
        eppr a = dcln.a(messagePartCoreData);
        if (a.e != 201 || (ae = messagePartCoreData.ae()) == null || (num = (Integer) cstxVar.a(ae).a) == null || num.intValue() <= 0) {
            return engw.r(a);
        }
        eppq eppqVar = (eppq) eppr.a.createBuilder();
        epqg epqgVar = epqg.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        epqgVar.getClass();
        epprVar.f = epqgVar;
        epprVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        eppr epprVar2 = (eppr) eppqVar.build();
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.h(a);
        engrVar.j(Collections.nCopies(num.intValue(), epprVar2));
        return engrVar.g();
    }
}
