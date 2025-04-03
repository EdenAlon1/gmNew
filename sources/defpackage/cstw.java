package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cstw implements Comparable {
    final int a;
    final int b;

    public cstw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cstw cstwVar = (cstw) obj;
        int i = this.a - cstwVar.a;
        return i != 0 ? i : this.b - cstwVar.b;
    }
}
