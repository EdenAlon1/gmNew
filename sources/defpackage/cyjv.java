package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyjv extends cyko {
    private final String a;
    private final String b;
    private final Runnable c;

    public cyjv(String str, String str2, Runnable runnable) {
        if (str == null) {
            throw new NullPointerException("Null message");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null actionLabel");
        }
        this.b = str2;
        this.c = runnable;
    }

    @Override // defpackage.cyko
    public final Runnable a() {
        return this.c;
    }

    @Override // defpackage.cyko
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cyko
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyko) {
            cyko cykoVar = (cyko) obj;
            if (this.a.equals(cykoVar.c()) && this.b.equals(cykoVar.b()) && this.c.equals(cykoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "UnblockUnspamSnackbarEvent{message=" + this.a + ", actionLabel=" + this.b + ", action=" + this.c.toString() + "}";
    }
}
