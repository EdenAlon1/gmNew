package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgv implements ettc {
    public static final etgv a = new etgv();
    public static final etsv b = new etst(etrr.class, etfk.class, new etsu() { // from class: etgs
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
            etfk etfkVar = (etfk) etgj.b((etzm) etzkVar.build(), etfk.class);
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
            return new etlt(etfkVar, c);
        }
    });

    @Override // defpackage.ettc
    public final Class a() {
        return etfk.class;
    }

    @Override // defpackage.ettc
    public final Class b() {
        return etfk.class;
    }

    @Override // defpackage.ettc
    public final /* synthetic */ Object c(ettb ettbVar) {
        HashMap hashMap = new HashMap();
        for (etta ettaVar : ettbVar.b()) {
            etsq.a(ettaVar.b, new etgt((etfk) ettaVar.a, ettaVar.c), hashMap);
        }
        if (ettbVar.e()) {
            etsc.a.a();
            etrv.a(ettbVar);
        }
        etta ettaVar2 = ettbVar.a;
        return new etgu(new etgt((etfk) ettaVar2.a, ettaVar2.c), new etss(hashMap));
    }
}
