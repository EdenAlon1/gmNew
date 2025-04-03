package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oln extends olp {
    public final int a;
    public final int b;

    public oln(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.olp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oln)) {
            return false;
        }
        oln olnVar = (oln) obj;
        return this.a == olnVar.a && this.b == olnVar.b && this.c == olnVar.c && this.d == olnVar.d && this.e == olnVar.e && this.f == olnVar.f;
    }

    @Override // defpackage.olp
    public final int hashCode() {
        return super.hashCode() + this.a + this.b;
    }

    public final String toString() {
        String c;
        c = ffpc.c("ViewportHint.Access(\n            |    pageOffset=" + this.a + ",\n            |    indexInPage=" + this.b + ",\n            |    presentedItemsBefore=" + this.c + ",\n            |    presentedItemsAfter=" + this.d + ",\n            |    originalPageOffsetFirst=" + this.e + ",\n            |    originalPageOffsetLast=" + this.f + ",\n            |)", "|");
        return c;
    }
}
