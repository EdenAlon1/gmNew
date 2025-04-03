package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjoe {
    public final cjmw a;
    public final azsu b;
    public final avkl c;
    public final azcr d;
    public final azhq e;
    public final cjmu f;
    public final cjnz g;
    public final bdhg h;
    public final fjay i;
    public final fayv j;
    public final int k;

    public cjoe(cjmw cjmwVar, azsu azsuVar, avkl avklVar, azcr azcrVar, int i, cjmu cjmuVar, cjnz cjnzVar, bdhg bdhgVar, fjay fjayVar, fayv fayvVar) {
        cjmwVar.getClass();
        azsuVar.getClass();
        if (i == 0) {
            throw null;
        }
        cjmuVar.getClass();
        cjnzVar.getClass();
        bdhgVar.getClass();
        fjayVar.getClass();
        fayvVar.getClass();
        this.a = cjmwVar;
        this.b = azsuVar;
        this.c = avklVar;
        this.d = azcrVar;
        this.e = null;
        this.k = 1;
        this.f = cjmuVar;
        this.g = cjnzVar;
        this.h = bdhgVar;
        this.i = fjayVar;
        this.j = fayvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjoe)) {
            return false;
        }
        cjoe cjoeVar = (cjoe) obj;
        if (!ffkj.e(this.a, cjoeVar.a) || !ffkj.e(this.b, cjoeVar.b) || !ffkj.e(this.c, cjoeVar.c) || !ffkj.e(this.d, cjoeVar.d)) {
            return false;
        }
        azhq azhqVar = cjoeVar.e;
        if (!ffkj.e(null, null)) {
            return false;
        }
        int i = cjoeVar.k;
        return ffkj.e(this.f, cjoeVar.f) && ffkj.e(this.g, cjoeVar.g) && ffkj.e(this.h, cjoeVar.h) && ffkj.e(this.i, cjoeVar.i) && ffkj.e(this.j, cjoeVar.j);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        azcr azcrVar = this.d;
        return (((((((((((((hashCode * 31) + (azcrVar == null ? 0 : azcrVar.hashCode())) * 961) + 1) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "SendingMessageData(messageToken=" + this.a + ", from=" + this.b + ", to=" + this.c + ", destinationToken=" + this.d + ", groupToken=null, protocol=RCS, messagePayload=" + this.f + ", sendingConfiguration=" + this.g + ", rcsMessageId=" + this.h + ", traceId=" + this.i + ", customHeaders=" + this.j + ")";
    }
}
