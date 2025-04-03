package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjv extends dzkb {
    static final dzjv a = new dzjv();

    private dzjv() {
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.NO_OP_ACTION;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "ActionPayload{noOpAction}";
    }
}
