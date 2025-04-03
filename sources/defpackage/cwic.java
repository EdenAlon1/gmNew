package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwic {
    public final fgdj a;
    public final fgdj b;
    public final fgdj c;
    public final cwib d;
    private final boolean e;

    public cwic(fgdj fgdjVar, fgdj fgdjVar2, fgdj fgdjVar3, cwib cwibVar) {
        fgdjVar.getClass();
        fgdjVar2.getClass();
        fgdjVar3.getClass();
        this.a = fgdjVar;
        this.b = fgdjVar2;
        this.c = fgdjVar3;
        this.d = cwibVar;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwic)) {
            return false;
        }
        cwic cwicVar = (cwic) obj;
        if (!ffkj.e(this.a, cwicVar.a) || !ffkj.e(this.b, cwicVar.b) || !ffkj.e(this.c, cwicVar.c) || !ffkj.e(this.d, cwicVar.d)) {
            return false;
        }
        boolean z = cwicVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "StartChatTopAppBarUiData(autoCompleteContactBarUiData=" + this.a + ", extendedTopAppBarUiData=" + this.b + ", simSelectorRowUiData=" + this.c + ", flags=" + this.d + ", focusTextField=true)";
    }
}
