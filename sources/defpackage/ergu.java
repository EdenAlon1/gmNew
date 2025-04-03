package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergu extends eyfq implements eyht {
    public ergu() {
        super(ergv.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ergv ergvVar = (ergv) this.instance;
        ergv ergvVar2 = ergv.a;
        eygr eygrVar = ergvVar.b;
        if (!eygrVar.c()) {
            ergvVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, ergvVar.b);
    }
}
