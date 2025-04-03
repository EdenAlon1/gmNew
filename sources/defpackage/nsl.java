package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nsl {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public nsl(int i, String str, String str2, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsl)) {
            return false;
        }
        nsl nslVar = (nsl) obj;
        if (this.a == nslVar.a) {
            String str = this.b;
            String str2 = nslVar.b;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Objects.equals(this.c, nslVar.c) && this.d == nslVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        int i = this.a;
        String str2 = this.c;
        return (((((i * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        return "TransformationRequest{outputHeight=" + this.a + ", audioMimeType='" + this.b + "', videoMimeType='" + this.c + "', hdrMode=" + this.d + "}";
    }
}
