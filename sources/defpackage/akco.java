package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum akco {
    DATABASE_RESTORE(2),
    RESTORE_ATTACHMENT(3),
    NOTIFY_LISTENERS(4),
    FINALIZE_RESTORE(5),
    REFRESH_CONVERSATIONS(7),
    MESSAGESRESTOREWORKTYPE_NOT_SET(0);

    public final int g;

    akco(int i) {
        this.g = i;
    }

    public static akco a(int i) {
        if (i == 0) {
            return MESSAGESRESTOREWORKTYPE_NOT_SET;
        }
        if (i == 7) {
            return REFRESH_CONVERSATIONS;
        }
        if (i == 2) {
            return DATABASE_RESTORE;
        }
        if (i == 3) {
            return RESTORE_ATTACHMENT;
        }
        if (i == 4) {
            return NOTIFY_LISTENERS;
        }
        if (i != 5) {
            return null;
        }
        return FINALIZE_RESTORE;
    }
}
