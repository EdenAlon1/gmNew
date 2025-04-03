package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogx {
    public final eokc a;

    public eogx(eokc eokcVar) {
        this.a = eokcVar;
    }

    public final void a(int i) {
        eokc eokcVar = this.a;
        eokcVar.copyOnWrite();
        eokd eokdVar = (eokd) eokcVar.instance;
        eokd eokdVar2 = eokd.a;
        eokdVar.d = i - 1;
        eokdVar.b |= 2;
    }

    public final void b(int i) {
        eokc eokcVar = this.a;
        eokcVar.copyOnWrite();
        eokd eokdVar = (eokd) eokcVar.instance;
        eokd eokdVar2 = eokd.a;
        eokdVar.c = i - 1;
        eokdVar.b |= 1;
    }
}
