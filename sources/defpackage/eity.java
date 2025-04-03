package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eity extends eyfq<eiub, eity> implements eyht {
    public eity() {
        super(eiub.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eiub eiubVar = (eiub) this.instance;
        eiub eiubVar2 = eiub.a;
        eygr eygrVar = eiubVar.f;
        if (!eygrVar.c()) {
            eiubVar.f = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, eiubVar.f);
    }
}
