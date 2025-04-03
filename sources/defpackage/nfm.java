package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfm implements lra {
    private static final lqc f;
    private static final lqc g;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    static {
        lqb lqbVar = new lqb();
        lqbVar.c("application/id3");
        f = new lqc(lqbVar);
        lqb lqbVar2 = new lqb();
        lqbVar2.c("application/x-scte35");
        g = new lqc(lqbVar2);
    }

    public nfm(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.lra
    public final lqc a() {
        char c;
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode == -1468477611) {
            if (str.equals("urn:scte:scte35:2014:bin")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -795945609) {
            if (hashCode == 1303648457 && str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("https://aomedia.org/emsg/ID3")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            return f;
        }
        if (c != 2) {
            return null;
        }
        return g;
    }

    @Override // defpackage.lra
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfm nfmVar = (nfm) obj;
            if (this.c == nfmVar.c && this.d == nfmVar.d) {
                String str = this.a;
                String str2 = nfmVar.a;
                int i = lvf.a;
                if (Objects.equals(str, str2) && Objects.equals(this.b, nfmVar.b) && Arrays.equals(this.e, nfmVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
        long j = this.c;
        long j2 = this.d;
        int hashCode2 = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
        this.h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // defpackage.lra
    public final /* synthetic */ void b(lqy lqyVar) {
    }
}
