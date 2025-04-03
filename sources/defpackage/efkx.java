package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efkx implements efku {
    long a = 0;

    @Override // defpackage.efku
    public final evjm a() {
        evjl evjlVar = (evjl) evjm.a.createBuilder();
        long j = this.a;
        evjlVar.copyOnWrite();
        evjm evjmVar = (evjm) evjlVar.instance;
        evjmVar.b = 1;
        evjmVar.c = Long.valueOf(j);
        return (evjm) evjlVar.build();
    }

    @Override // defpackage.efku
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof efkx) && this.a == ((efkx) obj).a;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
