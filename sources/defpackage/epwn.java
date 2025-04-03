package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epwn implements eyge {
    UNKNOWN(0),
    TOO_MANY_PARTICIPANTS_IN_ONE_ON_ONE_CONVERSATION(1),
    RCS_GROUP_ID_UPDATED(2),
    NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID(3),
    NEW_CONVERSATION_CREATED(4),
    CONVERSATION_FORKING(5),
    MIXED_UP_PARTICIPANT(6);

    public final int h;

    epwn(int i2) {
        this.h = i2;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
