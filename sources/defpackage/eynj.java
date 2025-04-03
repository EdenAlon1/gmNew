package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eynj extends eyfq implements eyht {
    public eynj() {
        super(eynk.a);
    }

    public final void a(eyni eyniVar) {
        copyOnWrite();
        eynk eynkVar = (eynk) this.instance;
        eynk eynkVar2 = eynk.a;
        eyniVar.getClass();
        eygr eygrVar = eynkVar.c;
        if (!eygrVar.c()) {
            eynkVar.c = eyfy.mutableCopy(eygrVar);
        }
        eynkVar.c.add(eyniVar);
    }
}
