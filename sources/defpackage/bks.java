package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bks extends bky {
    private final String a;
    private final bem b;

    public bks(String str, bem bemVar) {
        this.a = str;
        this.b = bemVar;
    }

    @Override // defpackage.bky
    public final bem a() {
        return this.b;
    }

    @Override // defpackage.bky
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bky) {
            bky bkyVar = (bky) obj;
            if (this.a.equals(bkyVar.b()) && this.b.equals(bkyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}
