package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmqe {
    public final String a;
    public final boolean b;
    private final String c = null;

    public /* synthetic */ dmqe(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmqe)) {
            return false;
        }
        dmqe dmqeVar = (dmqe) obj;
        if (!ffkj.e(this.a, dmqeVar.a) || this.b != dmqeVar.b) {
            return false;
        }
        String str = dmqeVar.c;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31;
    }

    public final String toString() {
        return "CounterUiData(text=" + this.a + ", isError=" + this.b + ", contentDescription=null)";
    }
}
