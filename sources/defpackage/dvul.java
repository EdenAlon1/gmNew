package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvul extends dvum {
    @Override // defpackage.dvuu
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dvuu)) {
            return false;
        }
        dvuu dvuuVar = (dvuu) obj;
        if (dvuuVar.b() != 3) {
            return false;
        }
        dvuuVar.c();
        return true;
    }

    public final int hashCode() {
        return -1;
    }

    public final String toString() {
        return "AppStateValue{invalid=-1}";
    }

    @Override // defpackage.dvum, defpackage.dvuu
    public final void c() {
    }
}
