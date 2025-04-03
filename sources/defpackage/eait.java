package defpackage;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eait extends eaja {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;
    public final int e;

    public eait(URL url, String str, Map map, byte[] bArr, int i) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = i;
    }

    @Override // defpackage.eaja
    public final eaiy a() {
        return new eais(this);
    }

    @Override // defpackage.eaja
    public final String b() {
        return this.b;
    }

    @Override // defpackage.eaja
    public final URL c() {
        return this.a;
    }

    @Override // defpackage.eaja
    public final Map d() {
        return this.c;
    }

    @Override // defpackage.eaja
    public final byte[] e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaja) {
            eaja eajaVar = (eaja) obj;
            if (this.a.equals(eajaVar.c()) && ((str = this.b) != null ? str.equals(eajaVar.b()) : eajaVar.b() == null) && this.c.equals(eajaVar.d())) {
                if (Arrays.equals(this.d, eajaVar instanceof eait ? ((eait) eajaVar).d : eajaVar.e()) && this.e == eajaVar.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.eaja
    public final int f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003) ^ this.e;
    }

    public final String toString() {
        byte[] bArr = this.d;
        Map map = this.c;
        return "GnpHttpRequest{url=" + this.a.toString() + ", contentType=" + this.b + ", headers=" + map.toString() + ", body=" + Arrays.toString(bArr) + ", purpose=" + eaiz.a(this.e) + "}";
    }
}
