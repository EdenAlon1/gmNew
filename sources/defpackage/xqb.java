package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xqb {
    public final fgdj a;
    public final hho b;
    public final fgdj c;
    public final fgdj d;
    public final dpzx e;
    public final boolean f;
    public final boolean g;
    public final xmq h;

    public xqb(fgdj fgdjVar, hho hhoVar, fgdj fgdjVar2, xmq xmqVar, fgdj fgdjVar3, dpzx dpzxVar, boolean z, boolean z2) {
        this.a = fgdjVar;
        this.b = hhoVar;
        this.c = fgdjVar2;
        this.h = xmqVar;
        this.d = fgdjVar3;
        this.e = dpzxVar;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqb)) {
            return false;
        }
        xqb xqbVar = (xqb) obj;
        return ffkj.e(this.a, xqbVar.a) && ffkj.e(this.b, xqbVar.b) && ffkj.e(this.c, xqbVar.c) && ffkj.e(this.h, xqbVar.h) && ffkj.e(this.d, xqbVar.d) && ffkj.e(this.e, xqbVar.e) && this.f == xqbVar.f && this.g == xqbVar.g;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.h.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + xqa.a(this.f)) * 31) + xqa.a(this.g);
    }

    public final String toString() {
        return "DirectSendUiData(headerUiData=" + this.a + ", pagingState=" + this.b + ", attachedMedia=" + this.c + ", cameraUiData=" + this.h + ", directSendComposeRowHolderUiData=" + this.d + ", galleryUiData=" + this.e + ", dynamicallyOffsetPages=" + this.f + ", useConstraintLayout=" + this.g + ")";
    }
}
