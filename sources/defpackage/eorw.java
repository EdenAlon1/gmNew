package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eorw implements eyge {
    UNKNOWN_BIZINFO_EVENT_SOURCE(0),
    BIZINFO_SOURCE_CONVERSATION_LIST_AVATAR(1),
    BIZINFO_SOURCE_CONVERSATION_AVATAR(2),
    BIZINFO_SOURCE_CONVERSATION_START(3),
    BIZINFO_SOURCE_CONVERSATION_OVERFLOW_MENU(4),
    BIZINFO_SOURCE_CONVERSATION_ACTION_BAR(5),
    BIZINFO_SOURCE_CONVERSATION_TITLE(6),
    BIZINFO_SOURCE_SIM_SWITCHED_TOMBSTONE(7);

    public final int i;

    eorw(int i) {
        this.i = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
