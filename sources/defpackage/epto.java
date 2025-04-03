package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epto implements eyge {
    UNKNOWN_OPENING_STATE(0),
    LOADED(1),
    FAILED_TO_LOAD(2),
    PREVIOUSLY_LOADED(3),
    INTERRUPTED(4);

    public final int f;

    epto(int i) {
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
