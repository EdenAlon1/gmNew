package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bps extends bpy {
    private final lkr a;
    private final bky b;

    public bps(lkr lkrVar, bky bkyVar) {
        this.a = lkrVar;
        this.b = bkyVar;
    }

    @Override // defpackage.bpy
    public final bky a() {
        return this.b;
    }

    @Override // defpackage.bpy
    public final lkr b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpy) {
            bpy bpyVar = (bpy) obj;
            if (this.a.equals(bpyVar.b()) && this.b.equals(bpyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
