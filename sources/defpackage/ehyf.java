package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyf extends ehzu {
    private final String a;

    public ehyf(String str) {
        this.a = str;
    }

    @Override // defpackage.ehzu
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehzu) {
            return this.a.equals(((ehzu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
