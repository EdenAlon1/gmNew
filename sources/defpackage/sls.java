package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sls extends ffhv implements ffjm {
    int a;
    final /* synthetic */ slz b;
    final /* synthetic */ slu c;
    final /* synthetic */ ceuw d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sls(ffgu ffguVar, slz slzVar, slu sluVar, ceuw ceuwVar) {
        super(2, ffguVar);
        this.b = slzVar;
        this.c = sluVar;
        this.d = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sls) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ((ensz) slv.a.h()).t("Transcription started, %s.", this.b.c);
                this.c.b(this.b, ardn.VMT_STATUS_IN_PROGRESS, null);
                slo sloVar = this.c.a;
                Uri parse = Uri.parse(this.b.c);
                parse.getClass();
                String str = this.b.d;
                str.getClass();
                this.a = 1;
                obj = ffra.a(ekxi.a(sloVar.a), new slj(null, sloVar, parse, str), this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            slq slqVar = (slq) obj;
            this.c.b(this.b, ardn.VMT_STATUS_COMPLETE, slqVar.b);
            sia siaVar = this.c.b;
            int a = sly.a(this.b.g);
            if (a == 0) {
                a = 1;
            }
            int i = ((cetk) this.d.a()).c;
            slqVar.getClass();
            ercg ercgVar = (ercg) erch.a.createBuilder();
            ercgVar.getClass();
            ercl erclVar = (ercl) ercm.a.createBuilder();
            erclVar.getClass();
            int b = sia.b(slqVar.c);
            erclVar.copyOnWrite();
            ercm ercmVar = (ercm) erclVar.instance;
            ercmVar.b |= 1;
            ercmVar.c = b;
            boolean J = ffpc.J(slqVar.b);
            erclVar.copyOnWrite();
            ercm ercmVar2 = (ercm) erclVar.instance;
            ercmVar2.b |= 2;
            ercmVar2.d = J;
            eyfy build = erclVar.build();
            build.getClass();
            ercgVar.copyOnWrite();
            erch erchVar = (erch) ercgVar.instance;
            erchVar.d = (ercm) build;
            erchVar.c = 1;
            ercd ercdVar = (ercd) erce.a.createBuilder();
            ercdVar.getClass();
            ercf.b(sia.b(slqVar.a.c), ercdVar);
            ercf.d(slqVar.a.a, ercdVar);
            ercf.e(sia.c(slqVar.a.b), ercdVar);
            ercf.c(slqVar.a.d, ercdVar);
            erci.c(ercf.a(ercdVar), ercgVar);
            erci.d(sia.d(a), ercgVar);
            erci.b(i, ercgVar);
            siaVar.a(erci.a(ercgVar));
            ((ensz) slv.a.h()).t("Transcription completed, %s.", this.b.c);
            return ceyt.i();
        } catch (slp e) {
            slu sluVar = this.c;
            int a2 = sly.a(this.b.g);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = ((cetk) this.d.a()).c;
            ercg ercgVar2 = (ercg) erch.a.createBuilder();
            ercgVar2.getClass();
            ercj ercjVar = (ercj) erck.a.createBuilder();
            ercjVar.getClass();
            if (e.getCause() instanceof skt) {
                Throwable cause = e.getCause();
                cause.getClass();
                int i3 = ((skt) cause).a;
                ercjVar.copyOnWrite();
                erck erckVar = (erck) ercjVar.instance;
                erckVar.b = 1 | erckVar.b;
                erckVar.c = i3;
            }
            eyfy build2 = ercjVar.build();
            build2.getClass();
            ercgVar2.copyOnWrite();
            erch erchVar2 = (erch) ercgVar2.instance;
            erchVar2.d = (erck) build2;
            erchVar2.c = 2;
            skk skkVar = e.a;
            if (skkVar != null) {
                ercd ercdVar2 = (ercd) erce.a.createBuilder();
                ercdVar2.getClass();
                ercf.b(sia.b(skkVar.c), ercdVar2);
                ercf.d(skkVar.a, ercdVar2);
                ercf.e(sia.c(skkVar.b), ercdVar2);
                ercf.c(skkVar.d, ercdVar2);
                erci.c(ercf.a(ercdVar2), ercgVar2);
            }
            sia siaVar2 = sluVar.b;
            erci.d(sia.d(a2), ercgVar2);
            erci.b(i2, ercgVar2);
            siaVar2.a(erci.a(ercgVar2));
            if ((e.getCause() instanceof IOException) || (e.getCause() instanceof IllegalStateException)) {
                ((ensz) ((ensz) slv.a.j()).g(e)).t("Transcription failed, permanent error, %s.", this.b.c);
                this.c.b(this.b, ardn.VMT_STATUS_ERROR_PERMANENT, null);
                return ceyt.k();
            }
            if (!this.d.c()) {
                Throwable cause2 = e.getCause();
                skt sktVar = cause2 instanceof skt ? (skt) cause2 : null;
                if (sktVar != null && sktVar.a == 8) {
                    ((ensz) ((ensz) slv.a.j()).g(e)).t("Transcription failed, temporary error, %s.", this.b.c);
                    this.c.b(this.b, ardn.VMT_STATUS_ERROR_TEMPORARY, null);
                    return ceyt.k();
                }
            }
            if (this.d.c()) {
                return ceyt.m();
            }
            ((ensz) ((ensz) slv.a.j()).g(e)).t("Transcription failed, unclassified error, %s.", this.b.c);
            this.c.b(this.b, ardn.VMT_STATUS_ERROR_UNKNOWN, null);
            return ceyt.k();
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sls slsVar = new sls(ffguVar, this.b, this.c, this.d);
        slsVar.e = obj;
        return slsVar;
    }
}
