package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etna implements ettc {
    public static final etna a = new etna();
    public static final etsv b = new etst(etrr.class, etfp.class, new etsu() { // from class: etmx
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
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
            euag euagVar = ettdVar.d;
            int ordinal = euagVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        etsi.a.c();
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException(a.P(euagVar, "unknown output prefix type "));
                    }
                }
                etsi.a(etrrVar.a().intValue()).c();
            } else {
                etsi.b(etrrVar.a().intValue()).c();
            }
            return new etni();
        }
    });

    @Override // defpackage.ettc
    public final Class a() {
        return etfp.class;
    }

    @Override // defpackage.ettc
    public final Class b() {
        return etfp.class;
    }

    @Override // defpackage.ettc
    public final /* synthetic */ Object c(ettb ettbVar) {
        HashMap hashMap = new HashMap();
        for (etta ettaVar : ettbVar.b()) {
            eujt eujtVar = ettaVar.b;
            int i = ettaVar.c;
            etsq.a(eujtVar, new etmy(), hashMap);
        }
        if (ettbVar.e()) {
            etsc.a.a();
            etrv.a(ettbVar);
        }
        etta ettaVar2 = ettbVar.a;
        int i2 = ettaVar2.c;
        eujt eujtVar2 = etss.a;
        return new etmz();
    }
}
