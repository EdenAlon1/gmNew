package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndf implements ndn {
    public final luk a;
    public final luk b;
    public final long c;

    public ndf(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        lti.a(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.a = new luk(length2);
            this.b = new luk(length2);
        } else {
            int i = length2 + 1;
            luk lukVar = new luk(i);
            this.a = lukVar;
            luk lukVar2 = new luk(i);
            this.b = lukVar2;
            lukVar.b(0L);
            lukVar2.b(0L);
        }
        this.a.c(jArr);
        this.b.c(jArr2);
        this.c = j;
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        luk lukVar = this.b;
        if (lukVar.a == 0) {
            ndo ndoVar = ndo.a;
            return new ndl(ndoVar, ndoVar);
        }
        int i = lvf.a;
        int i2 = lukVar.a - 1;
        int i3 = 0;
        int i4 = 0;
        while (i4 <= i2) {
            int i5 = (i4 + i2) >>> 1;
            if (lukVar.a(i5) < j) {
                i4 = i5 + 1;
            } else {
                i2 = i5 - 1;
            }
        }
        int i6 = i2 + 1;
        if (i6 < lukVar.a && lukVar.a(i6) == j) {
            i3 = i6;
        } else if (i2 != -1) {
            i3 = i2;
        }
        ndo ndoVar2 = new ndo(this.b.a(i3), this.a.a(i3));
        if (ndoVar2.b != j) {
            luk lukVar2 = this.b;
            if (i3 != lukVar2.a - 1) {
                int i7 = i3 + 1;
                return new ndl(ndoVar2, new ndo(lukVar2.a(i7), this.a.a(i7)));
            }
        }
        return new ndl(ndoVar2, ndoVar2);
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.c;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return this.b.a > 0;
    }
}
