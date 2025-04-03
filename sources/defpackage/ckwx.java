package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwx {
    public static final /* synthetic */ ckww a(ckwv ckwvVar) {
        eyfy build = ckwvVar.build();
        build.getClass();
        return (ckww) build;
    }

    public static final void b(int i, ckwv ckwvVar) {
        ckwvVar.copyOnWrite();
        ckww ckwwVar = (ckww) ckwvVar.instance;
        ckww ckwwVar2 = ckww.a;
        ckwwVar.e = i;
    }

    public static final void c(String str, ckwv ckwvVar) {
        str.getClass();
        ckwvVar.copyOnWrite();
        ckww ckwwVar = (ckww) ckwvVar.instance;
        ckww ckwwVar2 = ckww.a;
        ckwwVar.b = str;
    }

    public static final void d(int i, ckwv ckwvVar) {
        ckwvVar.copyOnWrite();
        ckww ckwwVar = (ckww) ckwvVar.instance;
        ckww ckwwVar2 = ckww.a;
        ckwwVar.f = i;
    }

    public static final /* synthetic */ void e(Iterable iterable, ckwv ckwvVar) {
        iterable.getClass();
        ckwvVar.copyOnWrite();
        ckww ckwwVar = (ckww) ckwvVar.instance;
        ckww ckwwVar2 = ckww.a;
        eygr eygrVar = ckwwVar.c;
        if (!eygrVar.c()) {
            ckwwVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, ckwwVar.c);
    }

    public static final void f(int i, ckwv ckwvVar) {
        ckwvVar.copyOnWrite();
        ckww ckwwVar = (ckww) ckwvVar.instance;
        ckww ckwwVar2 = ckww.a;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        ckwwVar.d = i - 2;
    }

    public static final void g(ckwv ckwvVar) {
        DesugarCollections.unmodifiableList(((ckww) ckwvVar.instance).c).getClass();
    }
}
