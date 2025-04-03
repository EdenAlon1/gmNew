package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debm {
    static fivm a(long j) {
        fivk fivkVar = (fivk) fivm.a.createBuilder();
        fivs fivsVar = (fivs) fivt.a.createBuilder();
        fivsVar.a(j);
        fivt fivtVar = (fivt) fivsVar.build();
        fivkVar.copyOnWrite();
        fivm fivmVar = (fivm) fivkVar.instance;
        fivtVar.getClass();
        fivmVar.c = fivtVar;
        fivmVar.b = 3;
        return (fivm) fivkVar.build();
    }

    static fivm b(Iterable iterable) {
        fivk fivkVar = (fivk) fivm.a.createBuilder();
        fivs fivsVar = (fivs) fivt.a.createBuilder();
        fivsVar.copyOnWrite();
        fivt fivtVar = (fivt) fivsVar.instance;
        fivtVar.a();
        eydl.addAll(iterable, fivtVar.b);
        fivt fivtVar2 = (fivt) fivsVar.build();
        fivkVar.copyOnWrite();
        fivm fivmVar = (fivm) fivkVar.instance;
        fivtVar2.getClass();
        fivmVar.c = fivtVar2;
        fivmVar.b = 3;
        return (fivm) fivkVar.build();
    }

    static fivm c(String str) {
        return e(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static fivm d(Iterable iterable) {
        fivg fivgVar = (fivg) fivh.a.createBuilder();
        enqv it = ((engw) iterable).iterator();
        while (it.hasNext()) {
            fivgVar.a(eyee.A(emxe.b((String) it.next())));
        }
        fivk fivkVar = (fivk) fivm.a.createBuilder();
        fivh fivhVar = (fivh) fivgVar.build();
        fivkVar.copyOnWrite();
        fivm fivmVar = (fivm) fivkVar.instance;
        fivhVar.getClass();
        fivmVar.c = fivhVar;
        fivmVar.b = 1;
        return (fivm) fivkVar.build();
    }

    static fivm e(String... strArr) {
        int i = engw.d;
        engr engrVar = new engr();
        for (String str : strArr) {
            engrVar.h(emxe.b(str));
        }
        return d(engrVar.g());
    }
}
