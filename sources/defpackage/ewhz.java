package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewhz extends eyfq implements eyht {
    public ewhz() {
        super(ewia.a);
    }

    public final void a(ewhx ewhxVar) {
        copyOnWrite();
        ewia ewiaVar = (ewia) this.instance;
        ewhy ewhyVar = (ewhy) ewhxVar.build();
        ewia ewiaVar2 = ewia.a;
        ewhyVar.getClass();
        eygr eygrVar = ewiaVar.b;
        if (!eygrVar.c()) {
            ewiaVar.b = eyfy.mutableCopy(eygrVar);
        }
        ewiaVar.b.add(ewhyVar);
    }
}
