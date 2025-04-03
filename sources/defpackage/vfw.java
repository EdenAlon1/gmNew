package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfw extends vgb {
    public final cmtd a;
    public final Optional b;

    public vfw(cmtd cmtdVar, Optional optional) {
        this.a = cmtdVar;
        this.b = optional;
    }

    @Override // defpackage.vgb
    public final cmtd a() {
        return this.a;
    }

    @Override // defpackage.vgb
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vgb) {
            vgb vgbVar = (vgb) obj;
            if (this.a.equals(vgbVar.a()) && this.b.equals(vgbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "ReactionSelectionData{reactedMessageData=" + this.a.toString() + ", selectedReaction=" + optional.toString() + "}";
    }
}
