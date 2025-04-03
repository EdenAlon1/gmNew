package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfz extends ngd {
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;

    public nfz(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfz nfzVar = (nfz) obj;
            String str = this.a;
            String str2 = nfzVar.a;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Objects.equals(this.b, nfzVar.b) && Objects.equals(this.c, nfzVar.c) && Arrays.equals(this.d, nfzVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((((((str != null ? str.hashCode() : 0) + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
    }

    @Override // defpackage.ngd
    public final String toString() {
        return this.f + ": mimeType=" + this.a + ", filename=" + this.b + ", description=" + this.c;
    }
}
