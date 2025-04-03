package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewaf extends eyfq implements eyht {
    public ewaf() {
        super(ewag.a);
    }

    public final void a(evyb evybVar) {
        copyOnWrite();
        ewag ewagVar = (ewag) this.instance;
        evye evyeVar = (evye) evybVar.build();
        ewag ewagVar2 = ewag.a;
        evyeVar.getClass();
        eygr eygrVar = ewagVar.f;
        if (!eygrVar.c()) {
            ewagVar.f = eyfy.mutableCopy(eygrVar);
        }
        ewagVar.f.add(evyeVar);
    }
}
