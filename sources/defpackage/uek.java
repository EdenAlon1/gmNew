package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uek extends ufe {
    private final String a;

    public uek(String str) {
        this.a = str;
    }

    @Override // defpackage.appw
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ufe) {
            return this.a.equals(((ufe) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "EmojiContent{text=" + this.a + "}";
    }
}
