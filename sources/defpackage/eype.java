package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eype extends eyfq implements eyht {
    public eype() {
        super(eypf.a);
    }

    public final void a(eypq eypqVar) {
        copyOnWrite();
        eypf eypfVar = (eypf) this.instance;
        eyps eypsVar = (eyps) eypqVar.build();
        eypf eypfVar2 = eypf.a;
        eypsVar.getClass();
        eygr eygrVar = eypfVar.d;
        if (!eygrVar.c()) {
            eypfVar.d = eyfy.mutableCopy(eygrVar);
        }
        eypfVar.d.add(eypsVar);
    }
}
