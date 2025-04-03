package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhl {
    public final ffbr a;

    public cvhl(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
    }

    public static /* synthetic */ eolu a(int i) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eoiw eoiwVar = (eoiw) eoix.a.createBuilder();
        eoiwVar.getClass();
        eogu.b(csjc.a, eoiwVar);
        eogy.c(eogu.a(eoiwVar), eoluVar);
        eogy.g(eolt.BUGLE_WEAR_CONVERSATION_SYNC_EVENT, eoluVar);
        eqlx eqlxVar = (eqlx) eqmb.a.createBuilder();
        eqlxVar.getClass();
        eqlxVar.copyOnWrite();
        eqmb eqmbVar = (eqmb) eqlxVar.instance;
        eqmbVar.c = 1;
        eqmbVar.b |= 1;
        eqlxVar.copyOnWrite();
        eqmb eqmbVar2 = (eqmb) eqlxVar.instance;
        eqmbVar2.e = 1;
        eqmbVar2.b |= 8;
        eqlxVar.copyOnWrite();
        eqmb eqmbVar3 = (eqmb) eqlxVar.instance;
        eqmbVar3.d = i - 1;
        eqmbVar3.b |= 2;
        eyfy build = eqlxVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.bB = (eqmb) build;
        eolvVar.g |= 16;
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        return (eolu) builder;
    }
}
