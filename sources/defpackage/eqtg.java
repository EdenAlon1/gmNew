package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqtg implements eyge {
    MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED(0),
    MAGIC_COMPOSE_MAGIC_REWRITE_TONE_REPHRASE(1),
    MAGIC_COMPOSE_MAGIC_REWRITE_TONE_SHAKESPEARE(2),
    MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FELLOW_KID(3),
    MAGIC_COMPOSE_MAGIC_REWRITE_TONE_EXCITED(4),
    MAGIC_COMPOSE_MAGIC_REWRITE_TONE_RHYMES(5),
    MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FORMAL(6),
    MAGIC_COMPOSE_MAGIC_REWRITE_TONE_CONCISE(7);

    public final int i;

    eqtg(int i) {
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
