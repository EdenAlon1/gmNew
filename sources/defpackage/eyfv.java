package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyfv implements Comparable {
    final eygf a;
    final int b;
    final eyjr c;
    final boolean d;
    final boolean e;

    public eyfv(eygf eygfVar, int i, eyjr eyjrVar, boolean z, boolean z2) {
        this.a = eygfVar;
        this.b = i;
        this.c = eyjrVar;
        this.d = z;
        this.e = z2;
    }

    public final eyjs a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((eyfv) obj).b;
    }
}
