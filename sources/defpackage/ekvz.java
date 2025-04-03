package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvz extends eyfq implements eyht {
    public ekvz() {
        super(ekwa.a);
    }

    public final void a(ekvy ekvyVar) {
        copyOnWrite();
        ekwa ekwaVar = (ekwa) this.instance;
        ekwa ekwaVar2 = ekwa.a;
        ekvyVar.getClass();
        eygr eygrVar = ekwaVar.d;
        if (!eygrVar.c()) {
            ekwaVar.d = eyfy.mutableCopy(eygrVar);
        }
        ekwaVar.d.add(ekvyVar);
    }
}
