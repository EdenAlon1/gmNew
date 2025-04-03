package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmz {
    public final ffxx a;
    public final fgdj b;
    public final ffxx c;
    public final zql d;
    public final fgdj e;
    public final fgdj f;
    public final fgdj g;
    public final akzt h;
    public final fgdj i;
    public final ffxx j;
    public final ffjm k;
    public final ffjm l;
    public final fgdj m;
    public final ffji n;
    public final ffji o;
    public final ffji p;
    public final ffji q;
    public final ffix r;
    public final zmy s;
    public final ffix t;
    public final zqv u;
    public final zpd v;

    public zmz(ffxx ffxxVar, fgdj fgdjVar, ffxx ffxxVar2, zql zqlVar, fgdj fgdjVar2, fgdj fgdjVar3, fgdj fgdjVar4, zqv zqvVar, zpd zpdVar, akzt akztVar, fgdj fgdjVar5, ffxx ffxxVar3, ffjm ffjmVar, ffjm ffjmVar2, fgdj fgdjVar6, ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3, ffji ffjiVar4, ffix ffixVar, zmy zmyVar, ffix ffixVar2) {
        ffxxVar.getClass();
        fgdjVar4.getClass();
        fgdjVar5.getClass();
        ffxxVar3.getClass();
        this.a = ffxxVar;
        this.b = fgdjVar;
        this.c = ffxxVar2;
        this.d = zqlVar;
        this.e = fgdjVar2;
        this.f = fgdjVar3;
        this.g = fgdjVar4;
        this.u = zqvVar;
        this.v = zpdVar;
        this.h = akztVar;
        this.i = fgdjVar5;
        this.j = ffxxVar3;
        this.k = ffjmVar;
        this.l = ffjmVar2;
        this.m = fgdjVar6;
        this.n = ffjiVar;
        this.o = ffjiVar2;
        this.p = ffjiVar3;
        this.q = ffjiVar4;
        this.r = ffixVar;
        this.s = zmyVar;
        this.t = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmz)) {
            return false;
        }
        zmz zmzVar = (zmz) obj;
        return ffkj.e(this.a, zmzVar.a) && ffkj.e(this.b, zmzVar.b) && ffkj.e(this.c, zmzVar.c) && ffkj.e(this.d, zmzVar.d) && ffkj.e(this.e, zmzVar.e) && ffkj.e(this.f, zmzVar.f) && ffkj.e(this.g, zmzVar.g) && ffkj.e(this.u, zmzVar.u) && ffkj.e(this.v, zmzVar.v) && ffkj.e(this.h, zmzVar.h) && ffkj.e(this.i, zmzVar.i) && ffkj.e(this.j, zmzVar.j) && ffkj.e(this.k, zmzVar.k) && ffkj.e(this.l, zmzVar.l) && ffkj.e(this.m, zmzVar.m) && ffkj.e(this.n, zmzVar.n) && ffkj.e(this.o, zmzVar.o) && ffkj.e(this.p, zmzVar.p) && ffkj.e(this.q, zmzVar.q) && ffkj.e(this.r, zmzVar.r) && ffkj.e(this.s, zmzVar.s) && ffkj.e(this.t, zmzVar.t);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode();
    }

    public final String toString() {
        return "PagedMessageListUiData(messagesFlow=" + this.a + ", initialMessageId=" + this.b + ", jumpIndexFlow=" + this.c + ", messageListFooterUiData=" + this.d + ", headerUiData=" + this.e + ", scheduledMessagesListUiData=" + this.f + ", scrollToBottomUiDataFlow=" + this.g + ", messageListInsetsProvider=" + this.u + ", messageListContentOffsetTracker=" + this.v + ", counterEventLogger=" + this.h + ", isTalkbackEnabled=" + this.i + ", shouldShowTimestampHintFlow=" + this.j + ", generateMessageListKey=" + this.k + ", invalidateMessageListKey=" + this.l + ", parentalApprovalStatusFlow=" + this.m + ", onBottomReached=" + this.n + ", onScroll=" + this.o + ", onMessageListInteractive=" + this.p + ", onMostRecentMessageDisplayedOrChanged=" + this.q + ", onPagingError=" + this.r + ", flags=" + this.s + ", onClick=" + this.t + ")";
    }
}
