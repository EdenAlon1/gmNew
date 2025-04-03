package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pou {
    public static final String a = ppt.d("Data");

    public static final Byte[] a(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }
}
