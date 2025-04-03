package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabg implements ajhy, csyc {
    private static final engw f = engw.u(eovb.HAPPINESS_TRACKING_MODE_SURVEY, eovb.SMART_REPLY_HAPPINESS_TRACKING_SURVEY, eovb.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY, eovb.ORGANIZE_HAPPINESS_TRACKING_SURVEY);
    public final ffbr a;
    public final ffbr b;
    public final cqoh c;
    public final View d;
    public boolean e;
    private ajid g;
    private final fazb h;

    public dabg(ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, fazb fazbVar, View view) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = cqohVar;
        this.d = view;
        this.h = fazbVar;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        if (!((Boolean) cszt.a.e()).booleanValue()) {
            return elfo.e(false);
        }
        final cszo cszoVar = (cszo) this.h.b();
        ffbr ffbrVar = cszoVar.a;
        final engw engwVar = f;
        return ((cszl) ffbrVar.b()).c().i(new eroh() { // from class: cszm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return elfo.e(false);
                }
                final engw engwVar2 = engwVar;
                final cszo cszoVar2 = cszo.this;
                return ((cszs) cszoVar2.b.b()).a().h(new emwl() { // from class: cszn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cszb cszbVar = (cszb) obj2;
                        if (!engwVar2.contains(cszbVar.c()) && !((Boolean) cszt.s.e()).booleanValue()) {
                            return false;
                        }
                        cszo cszoVar3 = cszo.this;
                        cszoVar3.e = cszbVar;
                        cszoVar3.c.b();
                        return true;
                    }
                }, cszoVar2.d);
            }
        }, cszoVar.d);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.g = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        this.g.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        cszo cszoVar = (cszo) this.h.b();
        csze cszeVar = (csze) cszoVar.c.b();
        cszb cszbVar = cszoVar.e;
        cszz cszzVar = cszeVar.d;
        efmq efmqVar = null;
        CronetEngine cronetEngine = (CronetEngine) cszzVar.a.a().orElse(null);
        if (((Boolean) ((cfup) csze.b.get()).e()).booleanValue() && cronetEngine == null) {
            String d = cszbVar instanceof csza ? ((csza) cszbVar).d() : "";
            akxl akxlVar = (akxl) cszzVar.b.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            epca epcaVar = (epca) epcn.a.createBuilder();
            epce epceVar = (epce) epcg.a.createBuilder();
            epceVar.copyOnWrite();
            epcg epcgVar = (epcg) epceVar.instance;
            d.getClass();
            epcgVar.b |= 1;
            epcgVar.c = d;
            epceVar.copyOnWrite();
            epcg epcgVar2 = (epcg) epceVar.instance;
            epcgVar2.d = 1;
            epcgVar2.b |= 2;
            epcaVar.copyOnWrite();
            epcn epcnVar = (epcn) epcaVar.instance;
            epcg epcgVar3 = (epcg) epceVar.build();
            epcgVar3.getClass();
            epcnVar.d = epcgVar3;
            epcnVar.b |= 2;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            epcn epcnVar2 = (epcn) epcaVar.build();
            epcnVar2.getClass();
            eolvVar.aU = epcnVar2;
            eolvVar.e |= 262144;
            eolt eoltVar = eolt.BUGLE_HATS_NEXT_CLIENT_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eolvVar2.j = eoltVar.dk;
            eolvVar2.b |= 1;
            akxlVar.j(eoluVar);
        }
        if (cronetEngine != null && (cszbVar instanceof csza)) {
            efmqVar = efmq.c(context, cronetEngine);
        }
        if (cszbVar != null && efmqVar != null) {
            if (cszbVar.c() == eovb.HAPPINESS_TRACKING_MODE_PLAY_STORE_RATING) {
                cszeVar.a(context);
            }
            String d2 = ((csza) cszbVar).d();
            if (TextUtils.isEmpty(d2)) {
                csze.a.r(String.format("SiteId was blank or missing from BugleHatsSurvey: %s, not showing survey", cszbVar));
            } else {
                if (TextUtils.isEmpty(d2)) {
                    throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
                }
                efmq.b(new efmp(context, d2, new cszd(cszeVar, (Activity) context, this), (String) cszt.b.e(), null, ((Boolean) cszt.q.e()).booleanValue()));
            }
        }
        return this.e;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 14;
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
