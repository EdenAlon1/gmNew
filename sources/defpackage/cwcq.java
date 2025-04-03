package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwcq {
    public final boolean a;
    public final cwic b;
    public final cvsj c;
    public final fgdj d;
    public final cvwp e;
    public final fgdj f;
    public final cwgs g;
    public final fgdj h;
    public final fgcq i;
    public final cwcp j;

    public cwcq(boolean z, cwic cwicVar, cvsj cvsjVar, fgdj fgdjVar, cvwp cvwpVar, fgdj fgdjVar2, cwgs cwgsVar, fgdj fgdjVar3, fgcq fgcqVar, cwcp cwcpVar) {
        fgdjVar.getClass();
        fgdjVar2.getClass();
        cwgsVar.getClass();
        this.a = z;
        this.b = cwicVar;
        this.c = cvsjVar;
        this.d = fgdjVar;
        this.e = cvwpVar;
        this.f = fgdjVar2;
        this.g = cwgsVar;
        this.h = fgdjVar3;
        this.i = fgcqVar;
        this.j = cwcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwcq)) {
            return false;
        }
        cwcq cwcqVar = (cwcq) obj;
        return this.a == cwcqVar.a && ffkj.e(this.b, cwcqVar.b) && ffkj.e(this.c, cwcqVar.c) && ffkj.e(this.d, cwcqVar.d) && ffkj.e(this.e, cwcqVar.e) && ffkj.e(this.f, cwcqVar.f) && ffkj.e(this.g, cwcqVar.g) && ffkj.e(this.h, cwcqVar.h) && ffkj.e(this.i, cwcqVar.i) && ffkj.e(this.j, cwcqVar.j);
    }

    public final int hashCode() {
        return ((((((((((((((((((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "StartChatScreenUiData(isGroupRenameMode=" + this.a + ", topAppBarUiData=" + this.b + ", contactListUiData=" + this.c + ", extendedFabUiData=" + this.d + ", destinationsDialogUiData=" + this.e + ", groupNameUiData=" + this.f + ", toastUiData=" + this.g + ", popupUiDataFlow=" + this.h + ", snackbarUiDataFlow=" + this.i + ", flags=" + this.j + ")";
    }
}
