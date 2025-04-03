package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edgb {
    static dfqu a(fedn fednVar) {
        Status c = Status.c(fednVar);
        Status.Code code = Status.Code.OK;
        int ordinal = c.getCode().ordinal();
        return ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 7 ? ordinal != 13 ? ordinal != 14 ? new dfqu(new com.google.android.gms.common.api.Status(13, c.getDescription())) : new dfqu(new com.google.android.gms.common.api.Status(7, c.getDescription())) : new dfqu(new com.google.android.gms.common.api.Status(8, c.getDescription())) : new dfqu(new com.google.android.gms.common.api.Status(9011, c.getDescription())) : new dfqu(new com.google.android.gms.common.api.Status(9013, c.getDescription())) : new dfqu(new com.google.android.gms.common.api.Status(15, c.getDescription())) : new dfqu(new com.google.android.gms.common.api.Status(9012, c.getDescription()));
    }

    static dfqu b(qou qouVar) {
        int i = qouVar instanceof qog ? 7 : qouVar instanceof qot ? 15 : ((qouVar instanceof qos) || (qouVar instanceof qoj)) ? 8 : qouVar instanceof qnu ? 9011 : 13;
        qoh qohVar = qouVar.a;
        return new dfqu(new com.google.android.gms.common.api.Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", qohVar == null ? "N/A" : String.valueOf(qohVar.a), qouVar)));
    }
}
