package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoec extends eoef {
    final char[] a;

    public eoec(eoeb eoebVar) {
        super(eoebVar, null);
        this.a = new char[512];
        emxf.a(eoebVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = eoebVar.a(i >>> 4);
            this.a[i | 256] = eoebVar.a(i & 15);
        }
    }

    @Override // defpackage.eoef, defpackage.eoeg
    public final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new eoee("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.b.b(charSequence.charAt(i)) << 4) | this.b.b(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.eoef
    public final eoeg b(eoeb eoebVar, Character ch) {
        return new eoec(eoebVar);
    }

    @Override // defpackage.eoef, defpackage.eoeg
    public final void c(Appendable appendable, byte[] bArr, int i) {
        emxf.k(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }
}
