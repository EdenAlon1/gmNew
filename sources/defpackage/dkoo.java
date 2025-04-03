package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dkoo {
    STATE_UNKNOWN(0),
    CONFIGURATION_UPDATED(30050),
    CONFIGURATION_DISABLED(30053),
    CONFIGURATION_REJECTED(30054),
    CONFIGURATION_TEMPORARILY_REJECTED(30056),
    REGISTRATION_SUCCESSFUL(30100),
    REGISTRATION_FAILED(30101),
    REGISTRATION_TERMINATED(30102),
    REGISTRATION_RECENTLY_TERMINATED(30107),
    REGISTRATION_PENDING(30108),
    REGISTRATION_DISABLED_BY_BUGLE(30109);

    public final int l;

    dkoo(int i) {
        this.l = i;
    }

    public static dkoo a(int i) {
        for (dkoo dkooVar : values()) {
            if (dkooVar.l == i) {
                return dkooVar;
            }
        }
        return STATE_UNKNOWN;
    }
}
