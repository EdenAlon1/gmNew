package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awwr extends eyfq implements eyht {
    public awwr() {
        super(awws.a);
    }

    public final void a(awtq awtqVar) {
        copyOnWrite();
        awws awwsVar = (awws) this.instance;
        awtr awtrVar = (awtr) awtqVar.build();
        awws awwsVar2 = awws.a;
        awtrVar.getClass();
        eygr eygrVar = awwsVar.b;
        if (!eygrVar.c()) {
            awwsVar.b = eyfy.mutableCopy(eygrVar);
        }
        awwsVar.b.add(awtrVar);
    }

    public final void b(awyg awygVar) {
        copyOnWrite();
        awws awwsVar = (awws) this.instance;
        awyh awyhVar = (awyh) awygVar.build();
        awws awwsVar2 = awws.a;
        awyhVar.getClass();
        awwsVar.a();
        awwsVar.c.add(awyhVar);
    }

    public final void c(awyh awyhVar) {
        copyOnWrite();
        awws awwsVar = (awws) this.instance;
        awws awwsVar2 = awws.a;
        awyhVar.getClass();
        awwsVar.a();
        awwsVar.c.add(awyhVar);
    }
}
