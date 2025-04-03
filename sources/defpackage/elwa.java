package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elwa extends elwb {
    private final Enum a;

    public elwa(Enum r1) {
        this.a = r1;
    }

    @Override // defpackage.elwb, defpackage.elwr
    public final Enum a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elwr) {
            elwr elwrVar = (elwr) obj;
            elwrVar.b();
            if (this.a.equals(elwrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PossibleValue{enumValue=" + this.a.toString() + "}";
    }

    @Override // defpackage.elwr
    public final void b() {
    }
}
