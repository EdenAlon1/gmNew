package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbr extends bgu {
    public final bgt a;
    private final long b;
    private final int c;

    public bbr(int i, bgt bgtVar, long j) {
        this.c = i;
        if (bgtVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.a = bgtVar;
        this.b = j;
    }

    @Override // defpackage.bgu
    public final long a() {
        return this.b;
    }

    @Override // defpackage.bgu
    public final bgt b() {
        return this.a;
    }

    @Override // defpackage.bgu
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgu) {
            bgu bguVar = (bgu) obj;
            if (this.c == bguVar.c() && this.a.equals(bguVar.b()) && this.b == bguVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.c;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV"));
        sb.append(", configSize=");
        sb.append(this.a);
        sb.append(", streamUseCase=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
