package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwsn extends eyfq implements eyht {
    public dwsn() {
        super(dwso.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        dwso dwsoVar = (dwso) this.instance;
        dwso dwsoVar2 = dwso.a;
        eygr eygrVar = dwsoVar.p;
        if (!eygrVar.c()) {
            dwsoVar.p = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, dwsoVar.p);
    }
}
