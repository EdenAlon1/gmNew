package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eohj implements eyge {
    UNKNOWN_BUGLE_CONTENT_TYPE(0),
    TEXT(1),
    IMAGE(2),
    VIDEO(3),
    AUDIO(4),
    VCARD(5),
    PDF(6),
    CALENDAR(7),
    DOC(8),
    PPT(9),
    XLS(10),
    TXT(11),
    HTML(12),
    COMPRESSED(13),
    UNRECOGNIZED(-1);

    private final int q;

    eohj(int i) {
        this.q = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
