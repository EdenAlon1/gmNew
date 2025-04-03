package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfw extends ngd {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final ngd[] g;

    public nfw(String str, int i, int i2, long j, long j2, ngd[] ngdVarArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.g = ngdVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfw nfwVar = (nfw) obj;
            if (this.b == nfwVar.b && this.c == nfwVar.c && this.d == nfwVar.d && this.e == nfwVar.e) {
                String str = this.a;
                String str2 = nfwVar.a;
                int i = lvf.a;
                if (Objects.equals(str, str2) && Arrays.equals(this.g, nfwVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b + 527;
        String str = this.a;
        long j = this.e;
        return (((((((i * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
