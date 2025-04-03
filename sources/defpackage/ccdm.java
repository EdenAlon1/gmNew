package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ccdm;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccdm extends ceut {
    public static final cskc a = cskc.g("BugleCms", "CmsBackupWorkHandler");
    public final Context b;
    public final babm c;
    public final errl d;
    public final axdf e;
    public final albq f;
    public final erqa g = new erqa();
    private final errl h;
    private final axkm i;
    private final cqoh j;
    private final ffbr k;

    /* compiled from: PG */
    public interface a {
        cccv bn();
    }

    public ccdm(Context context, babm babmVar, axdf axdfVar, axkm axkmVar, errl errlVar, errl errlVar2, cqoh cqohVar, ffbr ffbrVar, albq albqVar) {
        this.b = context;
        this.c = babmVar;
        this.e = axdfVar;
        this.i = axkmVar;
        this.d = errlVar;
        this.h = errlVar2;
        this.j = cqohVar;
        this.k = ffbrVar;
        this.f = albqVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.EXPONENTIAL);
        poh pohVar = new poh();
        pohVar.c(4);
        ((ceti) l).a = pohVar.a();
        l.e(true);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsBackupWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ccce.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final ccce ccceVar = (ccce) eyhsVar;
        final int i = ccceVar.d;
        final String str = ccceVar.e;
        final int i2 = ccceVar.c;
        ((akzt) this.k.b()).g("Bugle.Cms.IncrementalBackup.PwqDelay", this.j.f().toEpochMilli() - ((cetk) ceuwVar.a()).f);
        return this.i.n.b().i(new eroh() { // from class: ccdh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final ccdm ccdmVar = ccdm.this;
                final ceuw ceuwVar2 = ceuwVar;
                final ccce ccceVar2 = ccceVar;
                if (booleanValue) {
                    return ccdmVar.f.o(new emyl() { // from class: ccdi
                        @Override // defpackage.emyl
                        public final Object get() {
                            final ccce ccceVar3 = ccceVar2;
                            final int i3 = ccceVar3.d;
                            final String str2 = ccceVar3.e;
                            final int i4 = ccceVar3.c;
                            final epdw a2 = axcq.a(i3, ccceVar3.f);
                            final ceuw ceuwVar3 = ceuwVar2;
                            final int i5 = ((cetk) ceuwVar3.a()).c + ccceVar3.h;
                            final boolean z = ccceVar3.g;
                            boolean isEmpty = TextUtils.isEmpty(str2);
                            final ccdm ccdmVar2 = ccdm.this;
                            if (!isEmpty) {
                                csjb a3 = ccdm.a.a();
                                a3.I("Processing");
                                a3.y("tableType", i3);
                                a3.A("itemId", str2);
                                a3.y("flags", ccceVar3.f);
                                a3.A("queue", ((cetk) ceuwVar3.a()).b);
                                a3.y("accountId", i4);
                                a3.A("workItemId", "pwq");
                                a3.A("triggerName", ccceVar3.j);
                                a3.r();
                                return elfl.g(ccdmVar2.g.b(eldl.c(new erog() { // from class: ccdj
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        final ceuw ceuwVar4 = ceuwVar3;
                                        final int i6 = i4;
                                        final epdw epdwVar = a2;
                                        final boolean z2 = z;
                                        final ccdm ccdmVar3 = ccdm.this;
                                        final int i7 = i3;
                                        final String str3 = str2;
                                        ekzz f = eleg.f("CmsBackupWorkHandler#launchBackupWork");
                                        final int i8 = i5;
                                        final ccce ccceVar4 = ccceVar3;
                                        try {
                                            elfl e = ccdmVar3.c.b(i6).i(new eroh() { // from class: ccdk
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj2) {
                                                    elfl c;
                                                    cccv bn = ((ccdm.a) ekhv.a(ccdm.this.b, ccdm.a.class, (eisx) obj2)).bn();
                                                    ffbr ffbrVar = bn.a;
                                                    ceva a4 = ceuwVar4.a();
                                                    Map map = (Map) ffbrVar.b();
                                                    map.getClass();
                                                    axdf axdfVar = (axdf) bn.b.b();
                                                    axdfVar.getClass();
                                                    cqoh cqohVar = (cqoh) bn.c.b();
                                                    cqohVar.getClass();
                                                    ccbt ccbtVar = (ccbt) bn.d.b();
                                                    ccbtVar.getClass();
                                                    ccdo ccdoVar = (ccdo) bn.e.b();
                                                    ccdoVar.getClass();
                                                    cscn cscnVar = (cscn) bn.f.b();
                                                    cscnVar.getClass();
                                                    ((ccdw) bn.g.b()).getClass();
                                                    cfyt cfytVar = (cfyt) bn.h.b();
                                                    cfytVar.getClass();
                                                    ffsk ffskVar = (ffsk) bn.i.b();
                                                    ffskVar.getClass();
                                                    asjt asjtVar = (asjt) bn.j.b();
                                                    asjtVar.getClass();
                                                    asia asiaVar = (asia) bn.k.b();
                                                    asiaVar.getClass();
                                                    ccce ccceVar5 = ccceVar4;
                                                    ccceVar5.getClass();
                                                    String str4 = str3;
                                                    str4.getClass();
                                                    cccu cccuVar = new cccu(map, axdfVar, cqohVar, ccbtVar, ccdoVar, cscnVar, cfytVar, ffskVar, asjtVar, asiaVar, ccceVar5, a4, str4, i8);
                                                    c = axol.c(cccuVar.a, ffhe.a, ffsm.a, new cccs(cccuVar, null));
                                                    return c;
                                                }
                                            }, ccdmVar3.d).e(baan.class, new emwl() { // from class: ccdl
                                                public final /* synthetic */ String g = "pwq";

                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj2) {
                                                    baan baanVar = (baan) obj2;
                                                    csjb e2 = ccdm.a.e();
                                                    e2.I("Account not linked, skipping work item.");
                                                    e2.y("tableType", i7);
                                                    e2.A("itemId", str3);
                                                    ccce ccceVar5 = ccceVar4;
                                                    e2.y("flags", ccceVar5.f);
                                                    e2.A("queue", ((cetk) ceuwVar4.a()).b);
                                                    e2.y("accountId", i6);
                                                    e2.A("workItemId", this.g);
                                                    e2.A("triggerName", ccceVar5.j);
                                                    e2.s(baanVar);
                                                    ccdm ccdmVar4 = ccdm.this;
                                                    ccdmVar4.e.j(epdwVar, z2, i8, baanVar);
                                                    ccdmVar4.k(ccceVar5, 3);
                                                    return ceyt.k();
                                                }
                                            }, erpp.a);
                                            f.b(e);
                                            f.close();
                                            return e;
                                        } finally {
                                        }
                                    }
                                }), ccdmVar2.d));
                            }
                            csjb e = ccdm.a.e();
                            e.I("Missing itemId; work item will be failed permanently.");
                            e.y("tableType", i3);
                            e.y("flags", ccceVar3.f);
                            e.A("queue", ((cetk) ceuwVar3.a()).b);
                            e.y("accountId", i4);
                            e.A("workItemId", "pwq");
                            e.A("triggerName", ccceVar3.j);
                            e.r();
                            ccdmVar2.e.j(a2, z, i5, new ccdn());
                            ccdmVar2.k(ccceVar3, 3);
                            return elfo.e(ceyt.k());
                        }
                    });
                }
                int i3 = i2;
                String str2 = str;
                int i4 = i;
                csjb e = ccdm.a.e();
                e.I("Ignoring work, multidevice disabled on the device.");
                e.y("tableType", i4);
                e.A("itemId", str2);
                e.y("flags", ccceVar2.f);
                e.A("queue", ((cetk) ceuwVar2.a()).b);
                e.y("accountId", i3);
                e.A("triggerName", ccceVar2.j);
                e.r();
                ccdmVar.k(ccceVar2, 4);
                return elfo.e(ceyt.i());
            }
        }, this.h);
    }

    public final void k(ccce ccceVar, int i) {
        if ((ccceVar.b & 64) != 0) {
            axdf axdfVar = this.e;
            epfi epfiVar = epfi.BACKUP_WORK;
            eyja eyjaVar = ccceVar.i;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            axdfVar.v(epfiVar, eyjaVar, eykm.d(this.j.f().toEpochMilli()), i);
        }
    }
}
