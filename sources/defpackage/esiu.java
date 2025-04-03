package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esiu implements eyge {
    SUGGESTION_TYPE_UNKNOWN(0),
    SUGGESTION_TYPE_INVALID(1),
    SUGGESTION_TYPE_REPLY(2),
    SUGGESTION_TYPE_WEB(3),
    SUGGESTION_TYPE_PHONE(4),
    SUGGESTION_TYPE_MAP(5),
    SUGGESTION_TYPE_CALENDAR(6),
    SUGGESTION_TYPE_SHARE_LOCATION(7),
    SUGGESTION_TYPE_COMPOSE_TEXT(30),
    SUGGESTION_TYPE_COMPOSE_AUDIO(31),
    SUGGESTION_TYPE_COMPOSE_VIDEO(32),
    SUGGESTION_TYPE_WEBVIEW(33),
    UNRECOGNIZED(-1);

    private final int o;

    esiu(int i) {
        this.o = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
