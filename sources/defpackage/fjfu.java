package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjfu {
    public final String a;
    public final boolean b;

    public fjfu() {
        this("", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjfu)) {
            return false;
        }
        fjfu fjfuVar = (fjfu) obj;
        return ffkj.e(this.a, fjfuVar.a) && this.b == fjfuVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "EntryPointUiData(accountName=" + this.a + ", hideEntryForBoundAccount=" + this.b + ")";
    }

    public fjfu(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
