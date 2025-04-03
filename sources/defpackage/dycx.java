package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dycx extends dydb {
    public final boolean a;

    public dycx(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dydb
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dydb) && this.a == ((dydb) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "PhotoOptions{allowDefaultImage=" + this.a + "}";
    }
}
