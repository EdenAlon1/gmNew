package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euda implements ettc {
    public static final euda a = new euda();
    public static final etsv b = new etst(etrr.class, etgi.class, new etsu() { // from class: eucy
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            ettd ettdVar = ((etrr) etfsVar).a;
            etzk etzkVar = (etzk) etzm.a.createBuilder();
            String str = ettdVar.a;
            etzkVar.copyOnWrite();
            etzm etzmVar = (etzm) etzkVar.instance;
            str.getClass();
            etzmVar.b = str;
            eyee eyeeVar = ettdVar.c;
            etzkVar.copyOnWrite();
            etzm etzmVar2 = (etzm) etzkVar.instance;
            eyeeVar.getClass();
            etzmVar2.c = eyeeVar;
            int i = ettdVar.f;
            etzkVar.copyOnWrite();
            ((etzm) etzkVar.instance).d = etzl.a(i);
            return new eues((etgi) etgj.b((etzm) etzkVar.build(), etgi.class), eues.c(ettdVar), eues.b(ettdVar));
        }
    });

    @Override // defpackage.ettc
    public final Class a() {
        return etgi.class;
    }

    @Override // defpackage.ettc
    public final Class b() {
        return etgi.class;
    }

    @Override // defpackage.ettc
    public final /* synthetic */ Object c(ettb ettbVar) {
        return new eucz(ettbVar);
    }
}
