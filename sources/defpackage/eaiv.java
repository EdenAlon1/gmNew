package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaiv extends eajc {
    private final Integer a;
    private final Map b;
    private final byte[] c;
    private final byte[] d;
    private final Exception e;

    public eaiv(Integer num, Map map, byte[] bArr, byte[] bArr2, Exception exc) {
        this.a = num;
        this.b = map;
        this.c = bArr;
        this.d = bArr2;
        this.e = exc;
    }

    @Override // defpackage.eajc
    public final Exception a() {
        return this.e;
    }

    @Override // defpackage.eajc
    public final Integer b() {
        return this.a;
    }

    @Override // defpackage.eajc
    public final Map c() {
        return this.b;
    }

    @Override // defpackage.eajc
    public final byte[] d() {
        return this.d;
    }

    @Override // defpackage.eajc
    public final byte[] e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Exception exc;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eajc) {
            eajc eajcVar = (eajc) obj;
            Integer num = this.a;
            if (num != null ? num.equals(eajcVar.b()) : eajcVar.b() == null) {
                eajcVar.f();
                if (this.b.equals(eajcVar.c())) {
                    boolean z = eajcVar instanceof eaiv;
                    if (Arrays.equals(this.c, z ? ((eaiv) eajcVar).c : eajcVar.e())) {
                        if (Arrays.equals(this.d, z ? ((eaiv) eajcVar).d : eajcVar.d()) && ((exc = this.e) != null ? exc.equals(eajcVar.a()) : eajcVar.a() == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (((((((num == null ? 0 : num.hashCode()) ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ Arrays.hashCode(this.d);
        Exception exc = this.e;
        return (hashCode * 1000003) ^ (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        Exception exc = this.e;
        byte[] bArr = this.d;
        byte[] bArr2 = this.c;
        return "GnpHttpResponse{statusCode=" + this.a + ", statusMessage=null, headers=" + this.b.toString() + ", rawBody=" + Arrays.toString(bArr2) + ", body=" + Arrays.toString(bArr) + ", exception=" + String.valueOf(exc) + "}";
    }

    @Override // defpackage.eajc
    public final void f() {
    }
}
