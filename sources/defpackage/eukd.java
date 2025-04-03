package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eukd extends eyfq implements eyht {
    public eukd() {
        super(euke.a);
    }

    public final void a(String str) {
        copyOnWrite();
        euke eukeVar = (euke) this.instance;
        euke eukeVar2 = euke.a;
        str.getClass();
        eygr eygrVar = eukeVar.c;
        if (!eygrVar.c()) {
            eukeVar.c = eyfy.mutableCopy(eygrVar);
        }
        eukeVar.c.add(str);
    }
}
