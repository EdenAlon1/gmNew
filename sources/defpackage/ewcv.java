package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewcv extends eyfq implements eyht {
    public ewcv() {
        super(ewcw.a);
    }

    public final void a(long j) {
        copyOnWrite();
        ewcw ewcwVar = (ewcw) this.instance;
        ewcw ewcwVar2 = ewcw.a;
        eygl eyglVar = ewcwVar.b;
        if (!eyglVar.c()) {
            ewcwVar.b = eyfy.mutableCopy(eyglVar);
        }
        ewcwVar.b.g(j);
    }
}
