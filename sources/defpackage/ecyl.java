package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecyl extends eyfq implements eyht {
    public ecyl() {
        super(ecym.a);
    }

    public final void a(String str, ecyg ecygVar) {
        str.getClass();
        ecygVar.getClass();
        copyOnWrite();
        ecym ecymVar = (ecym) this.instance;
        ecym ecymVar2 = ecym.a;
        eyhm eyhmVar = ecymVar.b;
        if (!eyhmVar.b) {
            ecymVar.b = eyhmVar.a();
        }
        ecymVar.b.put(str, ecygVar);
    }
}
