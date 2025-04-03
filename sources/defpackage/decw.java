package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class decw {
    public static final void a(String str, String[] strArr, fivn fivnVar) {
        fivnVar.a(str, debm.e(strArr));
    }

    public static final void b(String str, Collection collection, fivn fivnVar) {
        fivk fivkVar = (fivk) fivm.a.createBuilder();
        fivq fivqVar = (fivq) fivr.a.createBuilder();
        fivqVar.copyOnWrite();
        fivr fivrVar = (fivr) fivqVar.instance;
        fivrVar.a();
        eydl.addAll(collection, fivrVar.b);
        fivr fivrVar2 = (fivr) fivqVar.build();
        fivkVar.copyOnWrite();
        fivm fivmVar = (fivm) fivkVar.instance;
        fivrVar2.getClass();
        fivmVar.c = fivrVar2;
        fivmVar.b = 2;
        fivnVar.a(str, (fivm) fivkVar.build());
    }

    public static final void c(String str, long j, fivn fivnVar) {
        fivnVar.a(str, debm.a(j));
    }

    public static final void d(String str, Collection collection, fivn fivnVar) {
        fivnVar.a(str, debm.b(collection));
    }
}
