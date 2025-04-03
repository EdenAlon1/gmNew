package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffth implements fftx {
    public final boolean a;

    public ffth(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fftx
    public final ffuv hN() {
        return null;
    }

    @Override // defpackage.fftx
    public final boolean hP() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
