package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elwz extends elxa {
    private final String a;

    public elwz(String str) {
        this.a = str;
    }

    @Override // defpackage.elyt
    public final int b() {
        return 1;
    }

    @Override // defpackage.elxa, defpackage.elyt
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elyt) {
            elyt elytVar = (elyt) obj;
            if (elytVar.b() == 1 && this.a.equals(elytVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringOrEnumValue{stringValue=" + this.a + "}";
    }
}
