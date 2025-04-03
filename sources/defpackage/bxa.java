package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxa extends bww {
    public final String a;
    public final int b;
    public final bef c;

    public bxa(String str, int i, bef befVar) {
        this.a = str;
        this.b = i;
        this.c = befVar;
    }

    @Override // defpackage.bww
    public final bef a() {
        return this.c;
    }

    @Override // defpackage.bxd
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bxd
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        bef befVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bww) {
            bww bwwVar = (bww) obj;
            if (this.a.equals(bwwVar.c()) && this.b == bwwVar.b() && ((befVar = this.c) != null ? befVar.equals(bwwVar.a()) : bwwVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        bef befVar = this.c;
        return (((hashCode * 1000003) ^ this.b) * 1000003) ^ (befVar == null ? 0 : befVar.hashCode());
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleAudioProfile=" + this.c + "}";
    }
}
