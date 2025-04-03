package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewsc implements eyge {
    REQUEST_MASK_CONTAINER_UNKNOWN(0),
    PROFILE(1),
    DOMAIN_PROFILE(7),
    CONTACT(2),
    ACCOUNT(5),
    AFFINITY(11),
    DOMAIN_CONTACT(8),
    PLACE(4),
    RAW_DEVICE_CONTACT(13),
    DELEGATED_CONTACT(15),
    CONTACT_ANNOTATION(14),
    GOOGLE_GROUP(10),
    CHAT_ROOM(17),
    CIRCLE(3),
    EXTERNAL_ACCOUNT(6),
    DEVICE_CONTACT(9),
    UNRECOGNIZED(-1);

    private final int s;

    ewsc(int i) {
        this.s = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
