package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eycu implements Comparable {
    public final eycx a;
    public final eycw b;

    public eycu(eycx eycxVar, eycw eycwVar) {
        this.a = eycxVar;
        this.b = eycwVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((eycu) obj).b);
    }

    public final String toString() {
        eycw eycwVar = this.b;
        return "[" + String.valueOf(this.a) + ", " + String.valueOf(eycwVar) + "]";
    }
}
