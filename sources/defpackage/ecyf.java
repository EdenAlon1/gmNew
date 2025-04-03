package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecyf extends eyfq implements eyht {
    public ecyf() {
        super(ecyg.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ecyg ecygVar = (ecyg) this.instance;
        ecyg ecygVar2 = ecyg.a;
        str.getClass();
        eygr eygrVar = ecygVar.c;
        if (!eygrVar.c()) {
            ecygVar.c = eyfy.mutableCopy(eygrVar);
        }
        ecygVar.c.add(str);
    }
}
