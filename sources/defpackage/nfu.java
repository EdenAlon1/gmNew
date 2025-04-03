package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfu extends ngd {
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;

    public nfu(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bArr;
    }

    @Override // defpackage.ngd, defpackage.lra
    public final void b(lqy lqyVar) {
        lqyVar.a(this.d, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfu nfuVar = (nfu) obj;
            if (this.c == nfuVar.c) {
                String str = this.a;
                String str2 = nfuVar.a;
                int i = lvf.a;
                if (Objects.equals(str, str2) && Objects.equals(this.b, nfuVar.b) && Arrays.equals(this.d, nfuVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        int i = this.c;
        String str2 = this.b;
        return ((((((i + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // defpackage.ngd
    public final String toString() {
        return this.f + ": mimeType=" + this.a + ", description=" + this.b;
    }
}
