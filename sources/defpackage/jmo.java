package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmo {
    public static final jmo a = new jmo(false);
    public final boolean b;
    public final int c;

    public jmo(boolean z) {
        this.b = z;
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmo)) {
            return false;
        }
        jmo jmoVar = (jmo) obj;
        if (this.b != jmoVar.b) {
            return false;
        }
        int i = jmoVar.c;
        return jlt.a(0);
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.b + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public jmo(byte[] bArr) {
        this.b = false;
        this.c = 0;
    }

    public jmo() {
        this(false);
    }
}
