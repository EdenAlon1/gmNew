package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewgx extends eyfq implements eyht {
    public ewgx() {
        super(ewgy.a);
    }

    public final void a(ewgu ewguVar) {
        copyOnWrite();
        ewgy ewgyVar = (ewgy) this.instance;
        ewgy ewgyVar2 = ewgy.a;
        ewguVar.getClass();
        eygr eygrVar = ewgyVar.g;
        if (!eygrVar.c()) {
            ewgyVar.g = eyfy.mutableCopy(eygrVar);
        }
        ewgyVar.g.add(ewguVar);
    }
}
