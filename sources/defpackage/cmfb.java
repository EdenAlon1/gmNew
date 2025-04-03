package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmfb {
    public final ffsk a;
    public final ffbr b;
    public final ffbr c;
    private final ffhd d;
    private final ffbr e;
    private final Context f;
    private final ffbr g;

    public cmfb(ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, Context context, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        context.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.d = ffhdVar;
        this.a = ffskVar;
        this.e = ffbrVar;
        this.b = ffbrVar2;
        this.f = context;
        this.g = ffbrVar3;
        this.c = ffbrVar4;
    }

    public final Object a(epgt epgtVar, epgr epgrVar, Integer num, epbq epbqVar, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.d), new cmex(null, epgtVar, epgrVar, num, epbqVar, this), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final void b(epgu epguVar) {
        akxn a = ((akyb) this.e.b()).a();
        a.d(epyw.UMA_RCS_PROVISIONING_UI_INTERACTION);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eosi eosiVar = (eosi) eosj.a.createBuilder();
        eosiVar.getClass();
        eosiVar.copyOnWrite();
        eosj eosjVar = (eosj) eosiVar.instance;
        eosjVar.c = 11;
        eosjVar.b |= 1;
        eosiVar.copyOnWrite();
        eosj eosjVar2 = (eosj) eosiVar.instance;
        eosjVar2.j = epguVar;
        eosjVar2.b |= 256;
        eowq b = dksy.b(this.f);
        b.getClass();
        eosiVar.copyOnWrite();
        eosj eosjVar3 = (eosj) eosiVar.instance;
        eosjVar3.h = b;
        eosjVar3.b |= 64;
        String b2 = ((ctyz) this.g.b()).b();
        b2.getClass();
        eosiVar.copyOnWrite();
        eosj eosjVar4 = (eosj) eosiVar.instance;
        eosjVar4.b |= 128;
        eosjVar4.i = b2;
        eyfy build = eosiVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.t = (eosj) build;
        eolvVar.b |= 4096;
        a.j(eoluVar, alal.LOG_SPEC_RCS_PROVISIONING_UI_EVENTS);
    }

    public final void c(epgr epgrVar) {
        epgrVar.getClass();
        axol.k(this.a, null, new cmev(this, epgrVar, null), 3);
    }

    public final void d(boolean z, epgr epgrVar, String str) {
        epgrVar.getClass();
        str.getClass();
        axol.k(this.a, null, new cmey(this, z, epgrVar, str, null), 3);
    }

    public final void e(String str, epgr epgrVar) {
        str.getClass();
        epgrVar.getClass();
        axol.k(this.a, null, new cmez(this, epgrVar, str, null), 3);
    }

    public final void f(String str, epgr epgrVar) {
        epgrVar.getClass();
        axol.k(this.a, null, new cmfa(this, epgrVar, str, null), 3);
    }

    public final void g(epgt epgtVar, epgr epgrVar, int i, epgo epgoVar, int i2, String str) {
        epgtVar.getClass();
        epgrVar.getClass();
        if (i == 0) {
            throw null;
        }
        epgoVar.getClass();
        str.getClass();
        axol.k(this.a, null, new cmew(this, epgtVar, epgrVar, i, epgoVar, i2, str, null), 3);
    }
}
