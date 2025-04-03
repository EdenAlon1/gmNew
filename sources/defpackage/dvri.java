package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvri implements dvqo, dvqs {
    public final ffhd d;
    public final fazb e;
    public final String f;
    public final dvdy g;
    public final dvcp h;
    public final dvqv i;
    private final ffbr k;
    public static final entd a = entd.c("GnpSdk");
    private static final Set j = new LinkedHashSet();
    public static final Map b = new LinkedHashMap();
    public static final Map c = new LinkedHashMap();

    public dvri(ffhd ffhdVar, fazb fazbVar, String str, dvdy dvdyVar, dvcp dvcpVar, dvqv dvqvVar, ffbr ffbrVar) {
        ffhdVar.getClass();
        fazbVar.getClass();
        str.getClass();
        dvdyVar.getClass();
        dvcpVar.getClass();
        dvqvVar.getClass();
        ffbrVar.getClass();
        this.d = ffhdVar;
        this.e = fazbVar;
        this.f = str;
        this.g = dvdyVar;
        this.h = dvcpVar;
        this.i = dvqvVar;
        this.k = ffbrVar;
    }

    @Override // defpackage.dvqo
    public final Object a(dvdp dvdpVar, evvt evvtVar, ffgu ffguVar) {
        Object a2 = ffra.a(this.d, new dvrg(evvtVar, this, dvdpVar, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.dvqo
    public final Object b(dvdp dvdpVar, dvqt dvqtVar, ffgu ffguVar) {
        Object a2 = ffra.a(this.d, new dvrh(dvdpVar, this, dvqtVar, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.dvqs
    public final void c(dvdp dvdpVar, evzm evzmVar, eg egVar) {
        evub evubVar = dvdpVar.c().c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        String b2 = dvmu.b(evubVar);
        b.put(b2, evzmVar);
        c.put(b2, egVar);
        Set set = j;
        b2.getClass();
        set.add(b2);
    }

    @Override // defpackage.dvqs
    public final void d(dvdp dvdpVar) {
        evub evubVar = dvdpVar.c().c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        String b2 = dvmu.b(evubVar);
        j.remove(b2);
        b.remove(b2);
        c.remove(b2);
    }

    @Override // defpackage.dvqs
    public final boolean e() {
        return ffdx.at(j);
    }

    public final void f(dvdp dvdpVar, dvqt dvqtVar) {
        if (((dvuy) this.k.b()) == null) {
            ((ensz) a.j()).q("Can't report an impression to collaborator as no callback was provided");
            return;
        }
        dvun dvunVar = new dvun();
        evzd evzdVar = dvdpVar.c().f;
        if (evzdVar == null) {
            evzdVar = evzd.a;
        }
        evzdVar.getClass();
        dvunVar.c = dvdr.b(evzdVar);
        dvuw a2 = dvunVar.a();
        if (dvqtVar == dvqt.SUCCESS) {
            a.o().t("Reporting an impression to the collaborator's callback - %s", a2);
        } else {
            a.o().t("Reporting rendering failure to the collaborator's callback - %s", a2);
            dvqtVar.toString();
        }
    }
}
