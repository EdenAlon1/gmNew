package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjl extends eyfq implements eyht {
    public emjl() {
        super(emjm.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        emjm emjmVar = (emjm) this.instance;
        emjm emjmVar2 = emjm.a;
        emjmVar.a();
        eydl.addAll(iterable, emjmVar.b);
    }

    public final void b(emjk emjkVar) {
        copyOnWrite();
        emjm emjmVar = (emjm) this.instance;
        emjm emjmVar2 = emjm.a;
        emjkVar.getClass();
        emjmVar.a();
        emjmVar.b.add(emjkVar);
    }
}
