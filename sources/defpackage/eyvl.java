package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyvl implements eyge {
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNSET(0),
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN(1),
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_DISABLED(2),
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_ENABLED(3),
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_API_NOT_SUPPORTED(4);

    public final int f;

    eyvl(int i) {
        this.f = i;
    }

    public static eyvl b(int i) {
        if (i == 0) {
            return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNSET;
        }
        if (i == 1) {
            return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN;
        }
        if (i == 2) {
            return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_DISABLED;
        }
        if (i == 3) {
            return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_ENABLED;
        }
        if (i != 4) {
            return null;
        }
        return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_API_NOT_SUPPORTED;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
