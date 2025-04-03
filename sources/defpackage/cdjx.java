package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdjx extends cdpt {
    private final String a;
    private final eyee b;

    public cdjx(String str, eyee eyeeVar) {
        this.a = str;
        this.b = eyeeVar;
    }

    @Override // defpackage.cdpt
    public final eyee a() {
        return this.b;
    }

    @Override // defpackage.cdpt
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        eyee eyeeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdpt) {
            cdpt cdptVar = (cdpt) obj;
            if (this.a.equals(cdptVar.b()) && ((eyeeVar = this.b) != null ? eyeeVar.equals(cdptVar.a()) : cdptVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        eyee eyeeVar = this.b;
        return (hashCode * 1000003) ^ (eyeeVar == null ? 0 : eyeeVar.hashCode());
    }

    public final String toString() {
        return "UploadResult{fileId=" + this.a + ", encryptionKey=" + String.valueOf(this.b) + "}";
    }
}
