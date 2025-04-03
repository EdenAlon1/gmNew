package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elwy extends elxa {
    private final Enum a;

    public elwy(Enum r1) {
        this.a = r1;
    }

    @Override // defpackage.elxa, defpackage.elyt
    public final Enum a() {
        return this.a;
    }

    @Override // defpackage.elyt
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elyt) {
            elyt elytVar = (elyt) obj;
            if (elytVar.b() == 2 && this.a.equals(elytVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringOrEnumValue{enumValue=" + this.a.toString() + "}";
    }
}
