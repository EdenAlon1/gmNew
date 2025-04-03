package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgjo extends fghl {
    public final ffqj c;

    public fgjo(long j, fgjo fgjoVar, int i) {
        super(j, fgjoVar, i);
        this.c = new ffqj(fgjn.f);
    }

    @Override // defpackage.fghl
    public final int a() {
        return fgjn.f;
    }

    @Override // defpackage.fghl
    public final void l(int i) {
        ffqj ffqjVar = this.c;
        ffqjVar.a(i).c(fgjn.e);
        t();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
