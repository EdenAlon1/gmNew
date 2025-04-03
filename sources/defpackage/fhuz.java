package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhuz extends fhuw {
    public final byte[] c;
    public final byte[] d;

    public fhuz(fhux fhuxVar, byte[] bArr) {
        super(false, fhuxVar);
        int length = bArr.length;
        int i = length - 32;
        this.c = fics.g(bArr, 0, i);
        this.d = fics.g(bArr, i, length);
    }

    public fhuz(fhux fhuxVar, byte[] bArr, byte[] bArr2) {
        super(false, fhuxVar);
        this.c = fics.c(bArr);
        this.d = fics.c(bArr2);
    }
}
