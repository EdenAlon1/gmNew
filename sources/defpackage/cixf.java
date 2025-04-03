package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cixf implements eyge {
    NT_UNKNOWN(0),
    NT_TEST(1),
    NT_INCOMING_MESSAGE(2),
    NT_DIRECTOR(3),
    NT_SHARE_PDU(4),
    NT_SECONDARY_USER(5),
    NT_INCOMING_UNAPPROVED_MESSAGE(6),
    NT_SUMMARY(7),
    NT_SAFETYCORE_MISSING(8);

    public final int j;

    cixf(int i) {
        this.j = i;
    }

    public static cixf b(int i) {
        switch (i) {
            case 0:
                return NT_UNKNOWN;
            case 1:
                return NT_TEST;
            case 2:
                return NT_INCOMING_MESSAGE;
            case 3:
                return NT_DIRECTOR;
            case 4:
                return NT_SHARE_PDU;
            case 5:
                return NT_SECONDARY_USER;
            case 6:
                return NT_INCOMING_UNAPPROVED_MESSAGE;
            case 7:
                return NT_SUMMARY;
            case 8:
                return NT_SAFETYCORE_MISSING;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
