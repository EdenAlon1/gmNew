package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfy extends vgn {
    private final cmtd a;
    private final cmrl b;
    private final cmrm c;
    private final eprt d;

    public vfy(cmtd cmtdVar, cmrl cmrlVar, cmrm cmrmVar, eprt eprtVar) {
        if (cmtdVar == null) {
            throw new NullPointerException("Null reactedMessageData");
        }
        this.a = cmtdVar;
        if (cmrlVar == null) {
            throw new NullPointerException("Null reaction");
        }
        this.b = cmrlVar;
        if (cmrmVar == null) {
            throw new NullPointerException("Null reactionAction");
        }
        this.c = cmrmVar;
        if (eprtVar == null) {
            throw new NullPointerException("Null reactionSurfaceType");
        }
        this.d = eprtVar;
    }

    @Override // defpackage.vgn
    public final cmrl a() {
        return this.b;
    }

    @Override // defpackage.vgn
    public final cmrm b() {
        return this.c;
    }

    @Override // defpackage.vgn
    public final cmtd c() {
        return this.a;
    }

    @Override // defpackage.vgn
    public final eprt d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vgn) {
            vgn vgnVar = (vgn) obj;
            if (this.a.equals(vgnVar.c()) && this.b.equals(vgnVar.a()) && this.c.equals(vgnVar.b()) && this.d.equals(vgnVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eprt eprtVar = this.d;
        cmrm cmrmVar = this.c;
        cmrl cmrlVar = this.b;
        return "ReactionSelectedEvent{reactedMessageData=" + this.a.toString() + ", reaction=" + cmrlVar.toString() + ", reactionAction=" + cmrmVar.toString() + ", reactionSurfaceType=" + eprtVar.toString() + "}";
    }
}
