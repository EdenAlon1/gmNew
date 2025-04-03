package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avwz {
    public static final entd a = entd.c("BugleFileTransfer");
    public final String b;
    public int c;

    public avwz(String str) {
        this.b = str;
    }

    public final String a() {
        int i = this.c;
        while (i < this.b.length() && Character.isLetterOrDigit(this.b.charAt(i))) {
            i++;
        }
        String substring = this.b.substring(this.c, i);
        this.c = i;
        return substring;
    }

    public final String b() {
        if (this.b.charAt(this.c) != '\"') {
            return a();
        }
        int i = this.c + 1;
        this.c = i;
        int indexOf = this.b.indexOf(34, i);
        c(indexOf != -1);
        String substring = this.b.substring(this.c, indexOf);
        this.c = indexOf + 1;
        return substring;
    }

    public final void c(boolean z) {
        if (!z) {
            throw new avwu(String.format("Parsing error at position: %d in '%s'", Integer.valueOf(this.c), this.b));
        }
    }

    public final void d() {
        while (!e() && Character.isWhitespace(this.b.charAt(this.c))) {
            this.c++;
        }
    }

    public final boolean e() {
        return this.c == this.b.length();
    }
}
