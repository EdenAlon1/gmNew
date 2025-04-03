package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aicj {
    public final fgdj a;
    public final ahzr b;
    public final fgdj c;
    public final fgdj d;
    public final fgdj e;
    public final aici f;

    public aicj(fgdj fgdjVar, ahzr ahzrVar, fgdj fgdjVar2, fgdj fgdjVar3, fgdj fgdjVar4, aici aiciVar) {
        fgdjVar.getClass();
        fgdjVar2.getClass();
        this.a = fgdjVar;
        this.b = ahzrVar;
        this.c = fgdjVar2;
        this.d = fgdjVar3;
        this.e = fgdjVar4;
        this.f = aiciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aicj)) {
            return false;
        }
        aicj aicjVar = (aicj) obj;
        return ffkj.e(this.a, aicjVar.a) && ffkj.e(this.b, aicjVar.b) && ffkj.e(this.c, aicjVar.c) && ffkj.e(this.d, aicjVar.d) && ffkj.e(this.e, aicjVar.e) && ffkj.e(this.f, aicjVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "MultiShareScreenUiData(autoCompleteTopAppBarUiData=" + this.a + ", multiShareListUiData=" + this.b + ", extendedFabUiData=" + this.c + ", destinationsDialogUiData=" + this.d + ", editMessageUiData=" + this.e + ", flags=" + this.f + ")";
    }
}
