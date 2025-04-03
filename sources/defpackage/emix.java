package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emix extends eyfq implements eyht {
    public emix() {
        super(emjc.a);
    }

    public final void a(emiy emiyVar) {
        copyOnWrite();
        emjc emjcVar = (emjc) this.instance;
        emiz emizVar = (emiz) emiyVar.build();
        emjc emjcVar2 = emjc.a;
        emizVar.getClass();
        eygr eygrVar = emjcVar.d;
        if (!eygrVar.c()) {
            emjcVar.d = eyfy.mutableCopy(eygrVar);
        }
        emjcVar.d.add(emizVar);
    }

    public final void b(emja emjaVar) {
        copyOnWrite();
        emjc emjcVar = (emjc) this.instance;
        emjb emjbVar = (emjb) emjaVar.build();
        emjc emjcVar2 = emjc.a;
        emjbVar.getClass();
        emjcVar.a();
        emjcVar.e.add(emjbVar);
    }
}
