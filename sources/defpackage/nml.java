package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nml implements Comparable {
    public final int a;
    public final nmg b;

    public nml(int i, nmg nmgVar) {
        this.a = i;
        this.b = nmgVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((nml) obj).a);
    }
}
