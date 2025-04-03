package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class af {

    @Deprecated
    public final ae a;

    @Deprecated
    public final ae b;

    @Deprecated
    public af(ae aeVar, ae aeVar2) {
        if (aeVar.b != aeVar2.b) {
            throw new IllegalArgumentException(a.c(aeVar2, aeVar, "Ranges must have the same number of visible decimals: ", "~"));
        }
        this.a = aeVar;
        this.b = aeVar2;
    }

    @Deprecated
    public final String toString() {
        ae aeVar = this.b;
        ae aeVar2 = this.a;
        return aeVar2.toString().concat(aeVar == aeVar2 ? "" : "~".concat(aeVar.toString()));
    }
}
