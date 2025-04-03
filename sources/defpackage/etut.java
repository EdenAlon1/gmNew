package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etut implements ettc {
    public static final etut a = new etut();
    public static final etsv b = new etst(etrr.class, etge.class, new etsu() { // from class: etuq
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
            int ordinal = ettdVar.d.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        etsi.a.c();
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                etsi.a(etrrVar.a().intValue()).c();
            } else {
                etsi.b(etrrVar.a().intValue()).c();
            }
            return new etvn();
        }
    });

    @Override // defpackage.ettc
    public final Class a() {
        return etge.class;
    }

    @Override // defpackage.ettc
    public final Class b() {
        return etge.class;
    }

    @Override // defpackage.ettc
    public final /* synthetic */ Object c(ettb ettbVar) {
        HashMap hashMap = new HashMap();
        for (etta ettaVar : ettbVar.b()) {
            eujt eujtVar = ettaVar.b;
            int i = ettaVar.c;
            etsq.a(eujtVar, new etur(), hashMap);
        }
        if (ettbVar.e()) {
            etsc.a.a();
            etrv.a(ettbVar);
        }
        etta ettaVar2 = ettbVar.a;
        int i2 = ettaVar2.c;
        eujt eujtVar2 = etss.a;
        return new etus();
    }
}
