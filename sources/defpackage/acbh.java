package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbh extends eyfq implements eyht {
    public acbh() {
        super(acbi.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        acbi acbiVar = (acbi) this.instance;
        acbi acbiVar2 = acbi.a;
        eygr eygrVar = acbiVar.b;
        if (!eygrVar.c()) {
            acbiVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, acbiVar.b);
    }
}
