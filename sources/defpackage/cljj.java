package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljj extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        clnm clnmVar = (clnm) obj;
        awun awunVar = (awun) awup.a.createBuilder();
        if ((clnmVar.b & 1) != 0) {
            String str = clnmVar.c;
            awunVar.copyOnWrite();
            awup awupVar = (awup) awunVar.instance;
            str.getClass();
            awupVar.b |= 1;
            awupVar.c = str;
        }
        if ((clnmVar.b & 2) != 0) {
            String str2 = clnmVar.d;
            awunVar.copyOnWrite();
            awup awupVar2 = (awup) awunVar.instance;
            str2.getClass();
            awupVar2.b |= 2;
            awupVar2.d = str2;
        }
        c(clnmVar, awunVar);
        return (awup) awunVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awup awupVar = (awup) obj;
        clnl clnlVar = (clnl) clnm.a.createBuilder();
        if ((awupVar.b & 1) != 0) {
            String str = awupVar.c;
            clnlVar.copyOnWrite();
            clnm clnmVar = (clnm) clnlVar.instance;
            str.getClass();
            clnmVar.b |= 1;
            clnmVar.c = str;
        }
        if ((awupVar.b & 2) != 0) {
            String str2 = awupVar.d;
            clnlVar.copyOnWrite();
            clnm clnmVar2 = (clnm) clnlVar.instance;
            str2.getClass();
            clnmVar2.b |= 2;
            clnmVar2.d = str2;
        }
        d(awupVar, clnlVar);
        return (clnm) clnlVar.build();
    }

    public abstract void c(clnm clnmVar, awun awunVar);

    public abstract void d(awup awupVar, clnl clnlVar);
}
