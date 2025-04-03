package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewct extends eyfq implements eyht {
    public ewct() {
        super(ewcu.a);
    }

    public final void a(int i) {
        copyOnWrite();
        ewcu ewcuVar = (ewcu) this.instance;
        ewcu ewcuVar2 = ewcu.a;
        eygi eygiVar = ewcuVar.b;
        if (!eygiVar.c()) {
            ewcuVar.b = eyfy.mutableCopy(eygiVar);
        }
        ewcuVar.b.h(i);
    }
}
