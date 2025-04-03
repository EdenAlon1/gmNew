package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyzq extends dzam {
    private final boolean a;
    private final int b;

    public dyzq(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.dzam
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dzam
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzam) {
            dzam dzamVar = (dzam) obj;
            if (this.a == dzamVar.b() && this.b == dzamVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "CloudBootstrapDownloadConversationResult{isSuccessful=" + this.a + ", conversationsDownloaded=" + this.b + "}";
    }
}
