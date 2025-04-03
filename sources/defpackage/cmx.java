package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmx {
    public static final cmw a = new cnv(0);

    public static final cmw a(int... iArr) {
        int length = iArr.length;
        cnv cnvVar = new cnv(length);
        int i = cnvVar.b;
        if (i < 0) {
            cpx.c("");
        }
        cnvVar.d(cnvVar.b + length);
        int[] iArr2 = cnvVar.a;
        int i2 = cnvVar.b;
        if (i != i2) {
            ffdo.l(iArr2, iArr2, i + length, i, i2);
        }
        ffdo.p(iArr, iArr2, i, 0, 12);
        cnvVar.b += length;
        return cnvVar;
    }

    public static final cnv b(int i) {
        cnv cnvVar = new cnv(1);
        cnvVar.e(i);
        return cnvVar;
    }
}
