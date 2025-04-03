package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faco extends fadq {
    public final long a;
    public final engw b;

    public faco(long j, engw engwVar) {
        this.a = j;
        this.b = engwVar;
    }

    @Override // defpackage.fadq
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fadq
    public final engw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fadq) {
            fadq fadqVar = (fadq) obj;
            if (this.a == fadqVar.a()) {
                fadqVar.c();
                if (enkr.h(this.b, fadqVar.b())) {
                    fadqVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "ExternalGraphComponents{parentGlContextHandle=" + this.a + ", drishtiCache=null, servicePacketHandles=" + this.b.toString() + ", gpuBufferPoolOptions=null}";
    }

    @Override // defpackage.fadq
    public final void c() {
    }

    @Override // defpackage.fadq
    public final void d() {
    }
}
