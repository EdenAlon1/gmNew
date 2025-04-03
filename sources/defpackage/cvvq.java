package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvq {
    public final boolean a;
    public final String b;

    public cvvq(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvvq)) {
            return false;
        }
        cvvq cvvqVar = (cvvq) obj;
        return this.a == cvvqVar.a && ffkj.e(this.b, cvvqVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChatBotInfo(isAvailable=" + this.a + ", uri=" + this.b + ")";
    }
}
