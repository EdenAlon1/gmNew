package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum exqh implements eyge {
    FEATURE_UNSPECIFIED(0),
    USER_FEEDBACK_IHNR(1),
    IN_APP_PROMPTS(2),
    NO_TRAY_NOTIFICATIONS(3),
    USER_FEEDBACK_IHNR_ACTION_BUTTONS(5),
    CHIME_SOURCED_GMS_CORE(6);

    public final int g;

    exqh(int i) {
        this.g = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
