package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rae implements rac {
    private final String a;

    public rae(String str) {
        this.a = str;
    }

    @Override // defpackage.rac
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rae) {
            return this.a.equals(((rae) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
