package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrj implements Comparable {
    public final long a;
    public final dkre b;

    public dkrj(dkre dkreVar) {
        this.b = dkreVar;
        this.a = System.currentTimeMillis() + (dkreVar.a() * 1000);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dkrj dkrjVar = (dkrj) obj;
        return (int) (dkrjVar == null ? 1L : this.a - dkrjVar.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dkrj) && this.b.equals(((dkrj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
