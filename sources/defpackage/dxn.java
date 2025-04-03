package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxn implements dxj {
    private final float a;
    private final boolean b;
    private final ffjm c;
    private final float d;

    public dxn(float f, boolean z, ffjm ffjmVar) {
        this.a = f;
        this.b = z;
        this.c = ffjmVar;
        this.d = f;
    }

    @Override // defpackage.dxi
    public final float a() {
        return this.d;
    }

    @Override // defpackage.dxi
    public final void b(jzn jznVar, int i, int[] iArr, kah kahVar, int[] iArr2) {
        int i2;
        int i3;
        int i4;
        int length = iArr.length;
        if (length == 0) {
            return;
        }
        int eo = jznVar.eo(this.a);
        if (this.b && kahVar == kah.b) {
            int i5 = length - 1;
            i2 = 0;
            i3 = 0;
            while (i5 >= 0) {
                int i6 = iArr[i5];
                int min = Math.min(i2, i - i6);
                iArr2[i5] = min;
                int min2 = Math.min(eo, (i - min) - i6);
                int i7 = iArr2[i5] + i6 + min2;
                i5--;
                i3 = min2;
                i2 = i7;
            }
        } else {
            i2 = 0;
            i3 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int i10 = iArr[i8];
                int min3 = Math.min(i2, i - i10);
                iArr2[i9] = min3;
                int min4 = Math.min(eo, (i - min3) - i10);
                int i11 = iArr2[i9] + i10 + min4;
                i8++;
                i3 = min4;
                i2 = i11;
                i9++;
            }
        }
        ffjm ffjmVar = this.c;
        if (ffjmVar == null || (i4 = i2 - i3) >= i) {
            return;
        }
        int intValue = ((Number) ffjmVar.a(Integer.valueOf(i - i4), kahVar)).intValue();
        int length2 = iArr2.length;
        for (int i12 = 0; i12 < length2; i12++) {
            iArr2[i12] = iArr2[i12] + intValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxn)) {
            return false;
        }
        dxn dxnVar = (dxn) obj;
        return jzq.b(this.a, dxnVar.a) && this.b == dxnVar.b && ffkj.e(this.c, dxnVar.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        ffjm ffjmVar = this.c;
        return ((floatToIntBits + (true != this.b ? 1237 : 1231)) * 31) + (ffjmVar == null ? 0 : ffjmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.b ? "Absolute" : "");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) jzq.a(this.a));
        sb.append(", ");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.dxq
    public final void b(jzn jznVar, int i, int[] iArr, int[] iArr2) {
        b(jznVar, i, iArr, kah.a, iArr2);
    }
}
