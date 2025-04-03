package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oet {
    public final oeq a = new oeq();

    public final oln a() {
        return this.a.c;
    }

    public final ffxx b(ofz ofzVar) {
        ofzVar.getClass();
        int ordinal = ofzVar.ordinal();
        if (ordinal == 1) {
            return this.a.a.b;
        }
        if (ordinal == 2) {
            return this.a.b.b;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }
}
