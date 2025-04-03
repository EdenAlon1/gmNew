package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epnb {
    public static final /* synthetic */ epfu a(epft epftVar) {
        eyfy build = epftVar.build();
        build.getClass();
        return (epfu) build;
    }

    public static final void b(String str, epft epftVar) {
        str.getClass();
        epftVar.copyOnWrite();
        epfu epfuVar = (epfu) epftVar.instance;
        epfu epfuVar2 = epfu.a;
        epfuVar.b |= 1;
        epfuVar.c = str;
    }

    public static final void c(int i, epft epftVar) {
        epftVar.copyOnWrite();
        epfu epfuVar = (epfu) epftVar.instance;
        epfu epfuVar2 = epfu.a;
        epfuVar.b |= 4;
        epfuVar.e = i;
    }

    public static final void d(int i, epft epftVar) {
        epftVar.copyOnWrite();
        epfu epfuVar = (epfu) epftVar.instance;
        epfu epfuVar2 = epfu.a;
        epfuVar.b |= 8;
        epfuVar.f = i;
    }

    public static final void e(int i, epft epftVar) {
        epftVar.copyOnWrite();
        epfu epfuVar = (epfu) epftVar.instance;
        epfu epfuVar2 = epfu.a;
        epfuVar.b |= 2;
        epfuVar.d = i;
    }

    public static final /* synthetic */ void f(Iterable iterable, epft epftVar) {
        epftVar.copyOnWrite();
        epfu epfuVar = (epfu) epftVar.instance;
        epfu epfuVar2 = epfu.a;
        eygr eygrVar = epfuVar.g;
        if (!eygrVar.c()) {
            epfuVar.g = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, epfuVar.g);
    }
}
