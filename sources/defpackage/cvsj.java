package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsj {
    public final fgdj a;
    public final ffxx b;
    public final fgdj c;
    public final fgdj d;
    public final fgdj e;
    public final fgdj f;
    public final fgdj g;
    public final ffji h;
    public final ffjm i;
    public final ffix j;
    public final cvsi k;

    public cvsj(fgdj fgdjVar, ffxx ffxxVar, fgdj fgdjVar2, fgdj fgdjVar3, fgdj fgdjVar4, fgdj fgdjVar5, fgdj fgdjVar6, ffji ffjiVar, ffjm ffjmVar, ffix ffixVar, cvsi cvsiVar) {
        fgdjVar.getClass();
        ffxxVar.getClass();
        fgdjVar2.getClass();
        fgdjVar3.getClass();
        fgdjVar4.getClass();
        fgdjVar5.getClass();
        fgdjVar6.getClass();
        this.a = fgdjVar;
        this.b = ffxxVar;
        this.c = fgdjVar2;
        this.d = fgdjVar3;
        this.e = fgdjVar4;
        this.f = fgdjVar5;
        this.g = fgdjVar6;
        this.h = ffjiVar;
        this.i = ffjmVar;
        this.j = ffixVar;
        this.k = cvsiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvsj)) {
            return false;
        }
        cvsj cvsjVar = (cvsj) obj;
        return ffkj.e(this.a, cvsjVar.a) && ffkj.e(this.b, cvsjVar.b) && ffkj.e(this.c, cvsjVar.c) && ffkj.e(this.d, cvsjVar.d) && ffkj.e(this.e, cvsjVar.e) && ffkj.e(this.f, cvsjVar.f) && ffkj.e(this.g, cvsjVar.g) && ffkj.e(this.h, cvsjVar.h) && ffkj.e(this.i, cvsjVar.i) && ffkj.e(this.j, cvsjVar.j) && ffkj.e(this.k, cvsjVar.k);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "ContactListUiData(favoriteFlow=" + this.a + ", contactsFlow=" + this.b + ", headerIndexFlow=" + this.c + ", createGroupFlow=" + this.d + ", chatbotDirectoryFlow=" + this.e + ", penpalUiDataFlow=" + this.f + ", groupChatsFlow=" + this.g + ", onContactListScroll=" + this.h + ", onContactListInteractive=" + this.i + ", onActivateFastScroll=" + this.j + ", flags=" + this.k + ")";
    }
}
