package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabn implements zsu {
    public final appw a;
    public final boolean b;
    public final String c;
    public final ffix d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final dofn h;
    public final dnwi i;

    public aabn(appw appwVar, boolean z, String str, ffix ffixVar, boolean z2, boolean z3, boolean z4, dofn dofnVar, dnwi dnwiVar) {
        this.a = appwVar;
        this.b = z;
        this.c = str;
        this.d = ffixVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = dofnVar;
        this.i = dnwiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aabn)) {
            return false;
        }
        aabn aabnVar = (aabn) obj;
        return ffkj.e(this.a, aabnVar.a) && this.b == aabnVar.b && ffkj.e(this.c, aabnVar.c) && ffkj.e(this.d, aabnVar.d) && this.e == aabnVar.e && this.f == aabnVar.f && this.g == aabnVar.g && ffkj.e(this.h, aabnVar.h) && ffkj.e(this.i, aabnVar.i);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + aabl.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        dofn dofnVar = this.h;
        int hashCode2 = dofnVar == null ? 0 : dofnVar.hashCode();
        int a = ((((((((hashCode * 31) + aabl.a(this.e)) * 31) + aabl.a(this.f)) * 31) + aabl.a(this.g)) * 31) + hashCode2) * 31;
        dnwi dnwiVar = this.i;
        return a + (dnwiVar != null ? dnwiVar.hashCode() : 0);
    }

    public final String toString() {
        return "EmojiBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", onAnimatedEmojiShown=" + this.d + ", isRichType=" + this.e + ", isOutgoing=" + this.f + ", isReply=" + this.g + ", messageReplySnippetUiData=" + this.h + ", statusUiData=" + this.i + ")";
    }
}
