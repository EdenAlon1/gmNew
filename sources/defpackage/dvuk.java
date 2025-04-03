package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvuk extends dvum {
    private final int a;

    public dvuk(int i) {
        this.a = i;
    }

    @Override // defpackage.dvum, defpackage.dvuu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dvuu
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvuu) {
            dvuu dvuuVar = (dvuu) obj;
            if (dvuuVar.b() == 2 && this.a == dvuuVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AppStateValue{integer=" + this.a + "}";
    }
}
