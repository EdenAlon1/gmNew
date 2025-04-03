package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzmg extends dzjm {
    private final String a;
    private final String b;

    public dzmg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dzjm
    public final String c() {
        return this.b;
    }

    @Override // defpackage.dzjm
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzjm) {
            dzjm dzjmVar = (dzjm) obj;
            if (this.a.equals(dzjmVar.d()) && this.b.equals(dzjmVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ReplyActionPayload{text=" + this.a + ", messageCallbackPayload=" + this.b + "}";
    }
}
