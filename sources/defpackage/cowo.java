package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cowo {
    public static awzn a(int i) {
        if (i == 1) {
            return awzn.DELIVERY;
        }
        if (i != 3) {
            throw new IllegalArgumentException(a.h(i, "Unsupported report type: "));
        }
        if (augy.a()) {
            return awzn.DELIVERY_FAILED;
        }
        ((enrr) ((enrr) cowp.a.j()).h("com/google/android/apps/messaging/shared/sms/RcsMessageReceiptSender", "toDeliveryReceiptType", 181, "RcsMessageReceiptSender.java")).r("Ignore report type: %d as the flag is off", i);
        return awzn.UNKNOWN_RECEIPT_TYPE;
    }
}
