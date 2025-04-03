package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhwd {
    static void a(byte[] bArr, fhqa fhqaVar) {
        fhqaVar.e(bArr, 0, bArr.length);
    }

    static void b(short s, fhqa fhqaVar) {
        fhqaVar.d((byte) (s >>> 8));
        fhqaVar.d((byte) s);
    }

    static void c(int i, fhqa fhqaVar) {
        fhqaVar.d((byte) (i >> 24));
        fhqaVar.d((byte) (i >>> 16));
        fhqaVar.d((byte) (i >>> 8));
        fhqaVar.d((byte) i);
    }
}
