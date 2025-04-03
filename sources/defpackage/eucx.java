package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eucx implements ettc {
    public static final eucx a = new eucx();
    public static final etsv b = new etst(etrr.class, etgh.class, new etsu() { // from class: eucv
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
            eues.c(ettdVar);
            eues.b(ettdVar);
            return new euer();
        }
    });

    @Override // defpackage.ettc
    public final Class a() {
        return etgh.class;
    }

    @Override // defpackage.ettc
    public final Class b() {
        return etgh.class;
    }

    @Override // defpackage.ettc
    public final /* synthetic */ Object c(ettb ettbVar) {
        return new eucw(ettbVar);
    }
}
