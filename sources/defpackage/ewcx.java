package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewcx extends eyfq implements eyht {
    public ewcx() {
        super(ewcy.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ewcy ewcyVar = (ewcy) this.instance;
        ewcy ewcyVar2 = ewcy.a;
        str.getClass();
        eygr eygrVar = ewcyVar.b;
        if (!eygrVar.c()) {
            ewcyVar.b = eyfy.mutableCopy(eygrVar);
        }
        ewcyVar.b.add(str);
    }
}
