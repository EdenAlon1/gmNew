package defpackage;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evht {
    public static final Charset a;
    public static final evhs b;
    private static final erho c;
    private final evio d;

    static {
        erhn erhnVar = (erhn) erho.a.createBuilder();
        erhnVar.copyOnWrite();
        erho erhoVar = (erho) erhnVar.instance;
        erhoVar.b |= 1;
        erhoVar.c = 0L;
        erhnVar.copyOnWrite();
        erho.b((erho) erhnVar.instance);
        erhnVar.copyOnWrite();
        erho.a((erho) erhnVar.instance);
        c = (erho) erhnVar.build();
        a = Charset.forName("UTF-8");
        b = evhs.d().a();
    }

    public evht(String str, String str2) {
        evir evirVar = (evir) evis.a.createBuilder();
        evirVar.copyOnWrite();
        evis evisVar = (evis) evirVar.instance;
        str.getClass();
        evisVar.b |= 1;
        evisVar.c = str;
        evirVar.copyOnWrite();
        evis evisVar2 = (evis) evirVar.instance;
        evisVar2.b |= 2;
        evisVar2.d = str2;
        evin evinVar = (evin) evio.a.createBuilder();
        evinVar.copyOnWrite();
        evio evioVar = (evio) evinVar.instance;
        evis evisVar3 = (evis) evirVar.build();
        evisVar3.getClass();
        evioVar.c = evisVar3;
        evioVar.b |= 1;
        eviy eviyVar = (eviy) evja.a.createBuilder();
        eviyVar.copyOnWrite();
        evja evjaVar = (evja) eviyVar.instance;
        evjaVar.c = 0;
        evjaVar.b |= 1;
        evinVar.copyOnWrite();
        evio evioVar2 = (evio) evinVar.instance;
        evja evjaVar2 = (evja) eviyVar.build();
        evjaVar2.getClass();
        evioVar2.d = evjaVar2;
        evioVar2.b |= 2;
        this.d = (evio) evinVar.build();
    }

    public static Object a(entl entlVar, ensn ensnVar) {
        return entlVar.i().d(ensnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.evit c(defpackage.erhq r7, int r8, defpackage.evhs r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evht.c(erhq, int, evhs, java.lang.Object[]):evit");
    }

    public final evit b(entl entlVar, int i, evhs evhsVar) {
        String name;
        erhq erhqVar;
        fgmh fgmhVar;
        if (entlVar.i().d(ecfo.a) != null) {
            erhp erhpVar = (erhp) erhq.a.createBuilder();
            erho erhoVar = c;
            erhpVar.copyOnWrite();
            erhq erhqVar2 = (erhq) erhpVar.instance;
            erhoVar.getClass();
            erhqVar2.c = erhoVar;
            erhqVar2.b |= 1;
            int intValue = entlVar.m().intValue();
            erhpVar.copyOnWrite();
            erhq erhqVar3 = (erhq) erhpVar.instance;
            erhqVar3.b |= 4;
            erhqVar3.e = intValue;
            String b2 = entlVar.e().b();
            erhpVar.copyOnWrite();
            erhq erhqVar4 = (erhq) erhpVar.instance;
            b2.getClass();
            erhqVar4.b |= 8;
            erhqVar4.f = b2;
            String d = entlVar.e().d();
            erhpVar.copyOnWrite();
            erhq erhqVar5 = (erhq) erhpVar.instance;
            d.getClass();
            erhqVar5.b |= 16;
            erhqVar5.g = d;
            int a2 = entlVar.e().a();
            erhpVar.copyOnWrite();
            erhq erhqVar6 = (erhq) erhpVar.instance;
            erhqVar6.b |= 32;
            erhqVar6.h = a2;
            String c2 = entlVar.e().c();
            if (c2 != null) {
                erhpVar.copyOnWrite();
                erhq erhqVar7 = (erhq) erhpVar.instance;
                erhqVar7.b |= 64;
                erhqVar7.i = c2;
            }
            String str = (String) entlVar.i().d(ecfo.b);
            if (str != null) {
                erhpVar.copyOnWrite();
                erhq erhqVar8 = (erhq) erhpVar.instance;
                erhqVar8.b |= 2;
                erhqVar8.d = str;
            } else {
                erhpVar.copyOnWrite();
                erhq erhqVar9 = (erhq) erhpVar.instance;
                erhqVar9.b |= 2;
                erhqVar9.d = "Unknown native thread";
            }
            enup j = entlVar.j();
            if (j != null) {
                erhpVar.copyOnWrite();
                erhq erhqVar10 = (erhq) erhpVar.instance;
                erhqVar10.b |= 256;
                erhqVar10.j = j.b;
            } else {
                String obj = entlVar.k().toString();
                erhpVar.copyOnWrite();
                erhq erhqVar11 = (erhq) erhpVar.instance;
                obj.getClass();
                erhqVar11.b |= 256;
                erhqVar11.j = obj;
            }
            erhqVar = (erhq) erhpVar.build();
        } else {
            enup j2 = entlVar.j();
            if (j2 != null) {
                name = j2.b;
            } else {
                Object k = entlVar.k();
                name = k instanceof String ? (String) k : k != null ? k.getClass().getName() : "null";
            }
            Throwable th = i == 2 ? (Throwable) a(entlVar, enrz.a) : null;
            ense e = entlVar.e();
            Level m = entlVar.m();
            String b3 = e.b();
            String d2 = e.d();
            int a3 = e.a();
            erhp erhpVar2 = (erhp) erhq.a.createBuilder();
            erho erhoVar2 = c;
            erhpVar2.copyOnWrite();
            erhq erhqVar12 = (erhq) erhpVar2.instance;
            erhoVar2.getClass();
            erhqVar12.c = erhoVar2;
            erhqVar12.b |= 1;
            String name2 = Thread.currentThread().getName();
            erhpVar2.copyOnWrite();
            erhq erhqVar13 = (erhq) erhpVar2.instance;
            name2.getClass();
            erhqVar13.b |= 2;
            erhqVar13.d = name2;
            int intValue2 = m.intValue();
            erhpVar2.copyOnWrite();
            erhq erhqVar14 = (erhq) erhpVar2.instance;
            erhqVar14.b |= 4;
            erhqVar14.e = intValue2;
            erhpVar2.copyOnWrite();
            erhq erhqVar15 = (erhq) erhpVar2.instance;
            b3.getClass();
            erhqVar15.b |= 8;
            erhqVar15.f = b3;
            erhpVar2.copyOnWrite();
            erhq erhqVar16 = (erhq) erhpVar2.instance;
            d2.getClass();
            erhqVar16.b |= 16;
            erhqVar16.g = d2;
            erhpVar2.copyOnWrite();
            erhq erhqVar17 = (erhq) erhpVar2.instance;
            erhqVar17.b |= 32;
            erhqVar17.h = a3;
            if (name != null) {
                erhpVar2.copyOnWrite();
                erhq erhqVar18 = (erhq) erhpVar2.instance;
                erhqVar18.b |= 256;
                erhqVar18.j = name;
            }
            if (th != null) {
                erhv a4 = ((evhn) evhsVar).c ? erkv.a(th, false) : erkv.c(th);
                erhpVar2.copyOnWrite();
                erhq erhqVar19 = (erhq) erhpVar2.instance;
                eria eriaVar = (eria) a4.build();
                eriaVar.getClass();
                erhqVar19.k = eriaVar;
                erhqVar19.b |= 1024;
            }
            erhqVar = (erhq) erhpVar2.build();
        }
        evit c3 = entlVar.j() != null ? c(erhqVar, i, evhsVar, entlVar.T()) : c(erhqVar, i, evhsVar, new Object[0]);
        if (i == 2 && ((evhn) evhsVar).a && (fgmhVar = (fgmh) a(entlVar, evhv.b)) != null) {
            c3.copyOnWrite();
            evix evixVar = (evix) c3.instance;
            evix evixVar2 = evix.a;
            evixVar.e = fgmhVar;
            evixVar.b |= 4;
        }
        return c3;
    }
}
