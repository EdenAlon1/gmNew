package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eskq {
    DEVICE_ONBOARDING_MESSAGE,
    PREWARM_MESSAGE,
    PAYLOAD_NOT_SET;

    public static eskq a(int i) {
        if (i == 0) {
            return PAYLOAD_NOT_SET;
        }
        if (i == 11) {
            return DEVICE_ONBOARDING_MESSAGE;
        }
        if (i != 12) {
            return null;
        }
        return PREWARM_MESSAGE;
    }
}
