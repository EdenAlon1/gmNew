package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfi implements zeu {
    public final Context a;
    public final zhp b;
    public final zzb c;
    public final zjt d;
    private final alye e;
    private final ffbr f;
    private final ffbr g;
    private final xre h;
    private final akle i;

    public zfi(alye alyeVar, Context context, zhp zhpVar, zjt zjtVar, zzb zzbVar, akle akleVar, ffbr ffbrVar, ffbr ffbrVar2, xre xreVar) {
        alyeVar.getClass();
        context.getClass();
        akleVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        xreVar.getClass();
        this.e = alyeVar;
        this.a = context;
        this.b = zhpVar;
        this.d = zjtVar;
        this.c = zzbVar;
        this.i = akleVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = xreVar;
    }

    private static final ffxx b(fgdj fgdjVar, ffji ffjiVar) {
        zez zezVar = new zez(null, new HashMap(1), ffjiVar);
        int i = fgau.a;
        return new fgen(zezVar, fgdjVar);
    }

    @Override // defpackage.zeu
    public final zfj a(alxr alxrVar, final ffsk ffskVar, final ffix ffixVar) {
        ffxx ffygVar;
        ffxx ffygVar2;
        alxrVar.getClass();
        ffxx a = aqfu.a(this.e.h(alxrVar.b()));
        int i = fgcz.a;
        fgdj b = fgbn.b(a, ffskVar, fgcy.a(0L, 3), alxrVar);
        final fgcm a2 = fgdm.a(false);
        zfg zfgVar = new zfg(b, this, ffixVar, a2);
        ffxx b2 = ((asqc) this.g.b()).a() ? b(b, new ffji() { // from class: zex
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                alxr alxrVar2 = (alxr) obj;
                alxrVar2.getClass();
                ffxx a3 = ffyy.a(new fgcp(new zjk(zfi.this.d, alxrVar2, a2, ffixVar, null)));
                int i2 = fgcz.a;
                return fgbn.a(a3, ffskVar, fgcy.b, 1);
            }
        }) : new ffyg(null);
        if (((asqb) this.f.b()).a()) {
            zey zeyVar = new zey(null, this);
            int i2 = fgau.a;
            ffygVar = new fgen(zeyVar, b);
        } else {
            ffygVar = new ffyg(null);
        }
        if (((asqb) this.f.b()).a()) {
            akle akleVar = this.i;
            cmrx cmrxVar = cmrx.MEDIA_VIEWER_REACTION_PICKER;
            aklq aklqVar = akleVar.a.c;
            ffxx bi = aklqVar.bi();
            ffxx ffxxVar = (ffxx) aklqVar.t.b();
            abbk abbkVar = (abbk) akleVar.a.c.dY.b();
            aklp aklpVar = akleVar.a;
            zfa zfaVar = new zfa(null, new abcd(bi, ffxxVar, abbkVar, aklpVar.c.av(), aklpVar.a.a.lb, cmrxVar));
            int i3 = fgau.a;
            ffygVar2 = new fgen(zfaVar, b);
        } else {
            ffygVar2 = new ffyg(null);
        }
        return new zfj(zfgVar, b2, ffygVar, ffygVar2, ((asqc) this.g.b()).a() ? b(b, new ffji() { // from class: zev
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                alxr alxrVar2 = (alxr) obj;
                alxrVar2.getClass();
                ffxx a3 = ffyy.a(new zfd(ffyy.a(aqfu.a(alxrVar2.l())), this, a2));
                int i4 = fgcz.a;
                return fgbn.a(a3, ffsk.this, fgcy.b, 1);
            }
        }) : new ffyg(null), this.h.a());
    }
}
