package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vfx extends vgm {
    private final cmrl a;
    private final cmrm b;

    public vfx(cmrl cmrlVar, cmrm cmrmVar) {
        this.a = cmrlVar;
        if (cmrmVar == null) {
            throw new NullPointerException("Null reactionAction");
        }
        this.b = cmrmVar;
    }

    @Override // defpackage.vgm
    public final cmrl a() {
        return this.a;
    }

    @Override // defpackage.vgm
    public final cmrm b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vgm) {
            vgm vgmVar = (vgm) obj;
            if (this.a.equals(vgmVar.a()) && this.b.equals(vgmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cmrm cmrmVar = this.b;
        return "ReactionSelectedDialogEvent{reaction=" + this.a.toString() + ", reactionAction=" + cmrmVar.toString() + "}";
    }
}
