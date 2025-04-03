package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmap extends eyfq<cmay, cmap> implements eyht {
    public cmap() {
        super(cmay.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        cmay cmayVar = (cmay) this.instance;
        cmay cmayVar2 = cmay.a;
        cmayVar.a();
        eydl.addAll(iterable, cmayVar.d);
    }

    public final void b(cmax cmaxVar) {
        copyOnWrite();
        cmay cmayVar = (cmay) this.instance;
        cmay cmayVar2 = cmay.a;
        cmaxVar.getClass();
        cmayVar.a();
        cmayVar.d.add(cmaxVar);
    }
}
