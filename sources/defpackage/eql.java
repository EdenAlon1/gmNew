package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eql extends eqd {
    public eql(eqe eqeVar, eqe eqeVar2, eqe eqeVar3, eqe eqeVar4) {
        super(eqeVar, eqeVar2, eqeVar3, eqeVar4);
    }

    @Override // defpackage.eqd
    public final /* synthetic */ eqd b(eqe eqeVar, eqe eqeVar2, eqe eqeVar3, eqe eqeVar4) {
        return new eql(eqeVar, eqeVar2, eqeVar3, eqeVar4);
    }

    @Override // defpackage.eqd
    public final icr c(long j, float f, float f2, float f3, float f4, kah kahVar) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new icp(ias.c(j));
        }
        iam c = ias.c(j);
        float f5 = kahVar == kah.a ? f : f2;
        long floatToRawIntBits = Float.floatToRawIntBits(f5);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f5);
        float f6 = kahVar != kah.a ? f : f2;
        long floatToRawIntBits3 = Float.floatToRawIntBits(f6);
        long floatToRawIntBits4 = Float.floatToRawIntBits(f6);
        float f7 = kahVar == kah.a ? f3 : f4;
        long floatToRawIntBits5 = Float.floatToRawIntBits(f7);
        long floatToRawIntBits6 = Float.floatToRawIntBits(f7);
        float f8 = kahVar != kah.a ? f3 : f4;
        return new icq(iap.a(c, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L), (floatToRawIntBits5 << 32) | (floatToRawIntBits6 & 4294967295L), (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eql) {
            eql eqlVar = (eql) obj;
            return ffkj.e(this.a, eqlVar.a) && ffkj.e(this.b, eqlVar.b) && ffkj.e(this.c, eqlVar.c) && ffkj.e(this.d, eqlVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
