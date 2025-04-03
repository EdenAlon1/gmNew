package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbx {
    public final String a;

    public dgbx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dgbx) {
            return this.a.equals(((dgbx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
