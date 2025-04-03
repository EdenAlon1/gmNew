package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emly extends emmr {
    private final enhk a;
    private final enhk b;

    public emly(enhk enhkVar, enhk enhkVar2) {
        this.a = enhkVar;
        this.b = enhkVar2;
    }

    @Override // defpackage.emmr
    public final enhk a() {
        return this.a;
    }

    @Override // defpackage.emmr
    public final enhk b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emmr) {
            emmr emmrVar = (emmr) obj;
            if (this.a.equals(emmrVar.a()) && this.b.equals(emmrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        enhk enhkVar = this.b;
        return "StickerProviderMaps{emotionToStickerNameMap=" + this.a.toString() + ", stickerNameToStickerMap=" + enhkVar.toString() + "}";
    }
}
