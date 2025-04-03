package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqza implements eyge {
    UNDEFINED_EVENT(0),
    REQUEST_BUGLE_DATABASE_RESTORE(1),
    REQUEST_ATTACHMENTS_RESTORE(2),
    COMPLETE_RESTORE(3),
    DO_COMPLETE_RESTORE(4),
    DO_BUGLE_DATABASE_RESTORE(5),
    DO_ATTACHMENTS_RESTORE(6),
    REQUEST_RESTORE_AFTER_APP_UPDATE(7),
    INITIALIZE_RESTORE_WORKFLOW(8),
    CLEAN_UP(9),
    COMPLETE_FROM_STALLED_RESTORE(10),
    FIX_UP_PARTS_TABLE_CONVERSATION_IDS(11),
    WAITING_FOR_APP_UPDATE_INITIAL_PROMPT_SHOWN(12),
    WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT(13);

    public final int o;

    eqza(int i) {
        this.o = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
