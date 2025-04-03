package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqn extends brd {
    public final but a;
    public final bqe b;
    public final int c;

    public bqn(but butVar, bqe bqeVar, int i) {
        this.a = butVar;
        this.b = bqeVar;
        this.c = i;
    }

    @Override // defpackage.brd
    public final int a() {
        return this.c;
    }

    @Override // defpackage.brd
    public final bqe b() {
        return this.b;
    }

    @Override // defpackage.brd
    public final but c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brd) {
            brd brdVar = (brd) obj;
            if (this.a.equals(brdVar.c()) && this.b.equals(brdVar.b()) && this.c == brdVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "MediaSpec{videoSpec=" + this.a + ", audioSpec=" + this.b + ", outputFormat=" + this.c + "}";
    }
}
