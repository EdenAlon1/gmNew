package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhtg implements fhtd {
    protected final fhtd a;
    protected final fhtf b;

    public fhtg(fhtd fhtdVar, fhtf fhtfVar) {
        this.a = fhtdVar;
        this.b = fhtfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhtg)) {
            return false;
        }
        fhtg fhtgVar = (fhtg) obj;
        return this.a.equals(fhtgVar.a) && this.b.equals(fhtgVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 16);
    }
}
