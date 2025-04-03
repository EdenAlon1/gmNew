package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etot implements ettc {
    public static final etot a = new etot();
    public static final etsv b = new etst(etrr.class, etfq.class, new etsu() { // from class: etor
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            byte[] c;
            etrr etrrVar = (etrr) etfsVar;
            ettd ettdVar = etrrVar.a;
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
            etfq etfqVar = (etfq) etgj.b((etzm) etzkVar.build(), etfq.class);
            euag euagVar = ettdVar.d;
            int ordinal = euagVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        c = etsi.a.c();
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(euagVar))));
                    }
                }
                c = etsi.a(etrrVar.a().intValue()).c();
            } else {
                c = etsi.b(etrrVar.a().intValue()).c();
            }
            return new etqc(etfqVar, c);
        }
    });

    @Override // defpackage.ettc
    public final Class a() {
        return etfq.class;
    }

    @Override // defpackage.ettc
    public final Class b() {
        return etfq.class;
    }

    @Override // defpackage.ettc
    public final /* synthetic */ Object c(ettb ettbVar) {
        return new etos(ettbVar);
    }
}
