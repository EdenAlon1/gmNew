package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apmu extends apnm {
    private final String a;

    public apmu(String str) {
        this.a = str;
    }

    @Override // defpackage.apnm
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apnm) {
            return this.a.equals(((apnm) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BreadcrumbBubbleContent{text=" + this.a + "}";
    }
}
