package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszc implements efmh {
    final /* synthetic */ csyc a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ cszd d;

    public cszc(cszd cszdVar, csyc csycVar, View view, Drawable drawable) {
        this.a = csycVar;
        this.b = view;
        this.c = drawable;
        this.d = cszdVar;
    }

    @Override // defpackage.efmh
    public final void a(efmm efmmVar) {
        if (((Boolean) ((cfup) csze.b.get()).e()).booleanValue()) {
            akxl akxlVar = (akxl) this.d.c.c.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            epca epcaVar = (epca) epcn.a.createBuilder();
            epcj epcjVar = (epcj) epck.a.createBuilder();
            String str = efmmVar.a;
            epcjVar.copyOnWrite();
            epck epckVar = (epck) epcjVar.instance;
            epckVar.b |= 1;
            epckVar.c = emxe.b(str);
            epcaVar.copyOnWrite();
            epcn epcnVar = (epcn) epcaVar.instance;
            epck epckVar2 = (epck) epcjVar.build();
            epckVar2.getClass();
            epcnVar.f = epckVar2;
            epcnVar.b |= 8;
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
        this.b.setBackground(this.c);
    }

    @Override // defpackage.efmh
    public final void b(efmm efmmVar) {
        if (((Boolean) ((cfup) csze.b.get()).e()).booleanValue()) {
            akxl akxlVar = (akxl) this.d.c.c.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            epca epcaVar = (epca) epcn.a.createBuilder();
            epcl epclVar = (epcl) epcm.a.createBuilder();
            String str = efmmVar.a;
            epclVar.copyOnWrite();
            epcm epcmVar = (epcm) epclVar.instance;
            epcmVar.b |= 1;
            epcmVar.c = emxe.b(str);
            epcaVar.copyOnWrite();
            epcn epcnVar = (epcn) epcaVar.instance;
            epcm epcmVar2 = (epcm) epclVar.build();
            epcmVar2.getClass();
            epcnVar.e = epcmVar2;
            epcnVar.b |= 4;
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
        dabg dabgVar = (dabg) this.a;
        dabgVar.e = true;
        long epochMilli = dabgVar.c.f().toEpochMilli();
        ctyx ctyxVar = (ctyx) dabgVar.a.b();
        if (ctyxVar.e("last_saw_survey_time", 0L) + TimeUnit.DAYS.toMillis(1L) < epochMilli) {
            ((akzt) dabgVar.b.b()).c("Bugle.UI.HaTS.Shown");
            ctyxVar.k("last_saw_survey_time", epochMilli);
        }
    }
}
