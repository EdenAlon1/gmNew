package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awuv extends eyfq implements eyht {
    public awuv() {
        super(awuw.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        awuw awuwVar = (awuw) this.instance;
        awuw awuwVar2 = awuw.a;
        eygr eygrVar = awuwVar.g;
        if (!eygrVar.c()) {
            awuwVar.g = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, awuwVar.g);
    }
}
