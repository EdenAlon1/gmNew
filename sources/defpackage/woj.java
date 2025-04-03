package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class woj {
    private final String a;
    private final hho b;
    private final String c;

    public woj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woj)) {
            return false;
        }
        woj wojVar = (woj) obj;
        String str = wojVar.a;
        if (!ffkj.e(null, null) || !ffkj.e(this.b, wojVar.b)) {
            return false;
        }
        String str2 = wojVar.c;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return "MagicRewriteUiState(savedUserDraft=null, savedSelectedRewriteSuggestion=" + this.b + ", savedRewrittenDraft=null)";
    }

    public /* synthetic */ woj(byte[] bArr) {
        hic hicVar = new hic(null, hla.a);
        this.a = null;
        this.b = hicVar;
        this.c = null;
    }
}
