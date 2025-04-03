package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqbw implements eyge {
    UNSET(0),
    USER_ENABLED_FEATURE(1),
    USER_DISABLED_FEATURE(2),
    CONSENT_NOTICE_SHOWN(3),
    CONSENT_ENABLED_FEATURE(4);

    public final int f;

    eqbw(int i) {
        this.f = i;
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
