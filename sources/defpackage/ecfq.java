package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecfq extends ecfx {
    public final fgqa a;
    public final engw b;

    public ecfq(fgqa fgqaVar, engw engwVar) {
        if (fgqaVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = fgqaVar;
        if (engwVar == null) {
            throw new NullPointerException("Null nativeDebugLogs");
        }
        this.b = engwVar;
    }

    @Override // defpackage.ecfx
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.ecfx
    public final fgqa b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecfx) {
            ecfx ecfxVar = (ecfx) obj;
            if (this.a.equals(ecfxVar.b()) && enkr.h(this.b, ecfxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        engw engwVar = this.b;
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + engwVar.toString() + "}";
    }
}
