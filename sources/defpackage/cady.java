package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cady {
    private static final cskc a = cskc.g("BugleEtouffee", "ReceiptInfos");

    static ReceiptInfo a(eyee eyeeVar) {
        return b((fayq) eyfy.parseFrom(fayq.a, eyeeVar));
    }

    static ReceiptInfo b(fayq fayqVar) {
        ReceiptError receiptError;
        String str = fayqVar.c;
        fayp b = fayp.b(fayqVar.d);
        if (b == null) {
            b = fayp.UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                receiptError = ReceiptError.SUCCESS;
            } else if (ordinal == 2) {
                receiptError = ReceiptError.FAILED_TO_DECRYPT;
            } else if (ordinal == 3) {
                receiptError = ReceiptError.OTK_NOT_TARGETED_TO_ME;
            } else if (ordinal != 4) {
                csjb e = a.e();
                e.I("Unknown ReceiptInfo.Error value");
                e.y("error", b.f);
                e.r();
                receiptError = ReceiptError.UNKNOWN;
            }
            return new ReceiptInfo(str, 0L, receiptError, fayqVar.e.I());
        }
        receiptError = ReceiptError.UNKNOWN;
        return new ReceiptInfo(str, 0L, receiptError, fayqVar.e.I());
    }
}
