package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cstl extends csto {
    public final byte[] a;
    public final bcyo b;
    public final String c;

    public cstl(byte[] bArr, bcyo bcyoVar, String str) {
        this.a = bArr;
        this.b = bcyoVar;
        this.c = str;
    }

    @Override // defpackage.csto
    public final bcyo a() {
        return this.b;
    }

    @Override // defpackage.csto
    public final String b() {
        return this.c;
    }

    @Override // defpackage.csto
    public final byte[] c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csto) {
            csto cstoVar = (csto) obj;
            if (Arrays.equals(this.a, cstoVar instanceof cstl ? ((cstl) cstoVar).a : cstoVar.c()) && this.b.equals(cstoVar.a()) && this.c.equals(cstoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        bcyo bcyoVar = this.b;
        return "DittoScannedCode{retrievalToken=" + Arrays.toString(this.a) + ", encryptionKeys=" + bcyoVar.toString() + ", originalQrCode=" + this.c + "}";
    }
}
