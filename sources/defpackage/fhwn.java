package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhwn extends fhwk {
    public final byte[] c;
    public final byte[] d;

    public fhwn(fhwl fhwlVar, byte[] bArr) {
        super(false, fhwlVar);
        byte[] g = fics.g(bArr, 0, 32);
        this.c = g;
        this.d = fics.g(bArr, g.length, bArr.length);
    }
}
