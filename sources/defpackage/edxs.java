package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edxs extends eyfq implements eyht {
    public edxs() {
        super(edxt.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        edxt edxtVar = (edxt) this.instance;
        edxt edxtVar2 = edxt.a;
        edxtVar.a();
        eydl.addAll(iterable, edxtVar.d);
    }

    public final void b(edxr edxrVar) {
        copyOnWrite();
        edxt edxtVar = (edxt) this.instance;
        edxt edxtVar2 = edxt.a;
        edxrVar.getClass();
        edxtVar.a();
        edxtVar.d.add(edxrVar);
    }
}
