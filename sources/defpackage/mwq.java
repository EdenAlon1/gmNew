package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mwq implements Comparable {
    private final boolean a;
    private final boolean b;

    public mwq(lqc lqcVar, int i) {
        this.a = 1 == (lqcVar.e & 1);
        this.b = mih.g(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mwq mwqVar) {
        return enem.b.e(this.b, mwqVar.b).e(this.a, mwqVar.a).a();
    }
}
