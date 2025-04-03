package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nft implements lra {
    public final byte[] a;
    public final String b;
    public final String c;

    public nft(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.lra
    public final /* synthetic */ lqc a() {
        return null;
    }

    @Override // defpackage.lra
    public final void b(lqy lqyVar) {
        String str = this.b;
        if (str != null) {
            lqyVar.a = str;
        }
    }

    @Override // defpackage.lra
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((nft) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, Integer.valueOf(this.a.length));
    }
}
