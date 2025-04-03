package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewij extends eyfq implements eyht {
    public ewij() {
        super(ewik.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ewik ewikVar = (ewik) this.instance;
        ewik ewikVar2 = ewik.a;
        eygr eygrVar = ewikVar.b;
        if (!eygrVar.c()) {
            ewikVar.b = eyfy.mutableCopy(eygrVar);
        }
        ewikVar.b.add(str);
    }
}
