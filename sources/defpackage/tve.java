package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tve {
    REACTION_BADGE(0, tvd.REACTIONS_GROUP),
    CUSTOM_REACTION_BADGE(1, tvd.REACTIONS_GROUP),
    STAR_BADGE(2, tvd.STAR_GROUP),
    CALENDAR_BADGE(3, tvd.CALENDAR_GROUP),
    SCHEDULED_SEND_BADGE(4, tvd.SCHEDULED_SEND_GROUP),
    REMINDER_BADGE(5, tvd.REMINDER_GROUP);

    public final int g;
    public final tvd h;

    tve(int i2, tvd tvdVar) {
        this.g = i2;
        this.h = tvdVar;
    }
}
