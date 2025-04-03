package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptError;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class caix extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cajj cajjVar = (cajj) obj;
        ReceiptError receiptError = ReceiptError.UNKNOWN;
        int ordinal = cajjVar.ordinal();
        if (ordinal == 0) {
            return ReceiptError.UNKNOWN;
        }
        if (ordinal == 1) {
            return ReceiptError.SUCCESS;
        }
        if (ordinal == 2) {
            return ReceiptError.FAILED_TO_DECRYPT;
        }
        if (ordinal == 3) {
            return ReceiptError.OTK_NOT_TARGETED_TO_ME;
        }
        if (ordinal == 4) {
            return c();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cajjVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ReceiptError receiptError = (ReceiptError) obj;
        int ordinal = receiptError.ordinal();
        if (ordinal == 0) {
            return cajj.UNKNOWN_RECEIPT_ERROR;
        }
        if (ordinal == 1) {
            return cajj.SUCCESS;
        }
        if (ordinal == 2) {
            return cajj.FAILED_TO_DECRYPT;
        }
        if (ordinal == 3) {
            return cajj.OTK_NOT_TARGETED_TO_ME;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(receiptError.toString()));
    }

    public abstract ReceiptError c();
}
