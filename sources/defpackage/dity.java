package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dity {
    HTTP_FT,
    STICKERS,
    LOCATION_PUSH,
    IP_CALL,
    IP_VIDEO_CALL_ONLY,
    MESSAGE_REVOCATION,
    FILE_TRANSFER_VIA_SMS,
    LOCATION_VIA_SMS,
    UP_2_0,
    PAYMENTS_V1;

    private final int l = 1 << ordinal();

    dity() {
    }

    public final int a(int i) {
        return i | this.l;
    }

    public final boolean b(int i) {
        return (i & this.l) > 0;
    }
}
