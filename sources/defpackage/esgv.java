package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgv {
    public static final /* synthetic */ esgu a(esgr esgrVar) {
        esgu build = esgrVar.build();
        build.getClass();
        return build;
    }

    public static final /* synthetic */ void b(Iterable iterable, esgr esgrVar) {
        iterable.getClass();
        esgrVar.copyOnWrite();
        esgu esguVar = (esgu) esgrVar.instance;
        esgu esguVar2 = esgu.a;
        eygr eygrVar = esguVar.b;
        if (!eygrVar.c()) {
            esguVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, esguVar.b);
    }

    public static final void c(int i, esgr esgrVar) {
        esgrVar.copyOnWrite();
        esgu esguVar = (esgu) esgrVar.instance;
        esgu esguVar2 = esgu.a;
        esguVar.c = etdr.b(i);
    }
}
