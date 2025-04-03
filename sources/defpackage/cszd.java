package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszd implements efmo {
    final /* synthetic */ Activity a;
    final /* synthetic */ csyc b;
    public final /* synthetic */ csze c;

    public cszd(csze cszeVar, Activity activity, csyc csycVar) {
        this.a = activity;
        this.b = csycVar;
        this.c = cszeVar;
    }

    @Override // defpackage.efmo
    public final void a(String str, int i) {
        if (((Boolean) ((cfup) csze.b.get()).e()).booleanValue()) {
            akxl akxlVar = (akxl) this.c.c.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            epca epcaVar = (epca) epcn.a.createBuilder();
            epce epceVar = (epce) epcg.a.createBuilder();
            epceVar.copyOnWrite();
            epcg epcgVar = (epcg) epceVar.instance;
            str.getClass();
            epcgVar.b |= 1;
            epcgVar.c = str;
            int i2 = i - 1;
            int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? 7 : 6 : 5 : 4;
            epceVar.copyOnWrite();
            epcg epcgVar2 = (epcg) epceVar.instance;
            epcgVar2.d = i3 - 1;
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
        csze.a.n(String.format("Failed to fetch survey (trigger id: %s, error: %s.)", str, efmn.a(i)));
    }

    @Override // defpackage.efmo
    public final void b(efnl efnlVar) {
        if (((Boolean) ((cfup) csze.b.get()).e()).booleanValue()) {
            akxl akxlVar = (akxl) this.c.c.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            epca epcaVar = (epca) epcn.a.createBuilder();
            epch epchVar = (epch) epci.a.createBuilder();
            String str = efnlVar.a().a;
            epchVar.copyOnWrite();
            epci epciVar = (epci) epchVar.instance;
            epciVar.b |= 1;
            epciVar.c = emxe.b(str);
            epcaVar.copyOnWrite();
            epcn epcnVar = (epcn) epcaVar.instance;
            epci epciVar2 = (epci) epchVar.build();
            epciVar2.getClass();
            epcnVar.c = epciVar2;
            epcnVar.b |= 1;
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
        efmf efmfVar = new efmf(this.a, efnlVar);
        Activity activity = this.a;
        csyc csycVar = this.b;
        View findViewById = activity.findViewById(R.id.bottom_layout);
        int measuredWidth = ((dabg) csycVar).d.getMeasuredWidth();
        if (findViewById == null || measuredWidth < 0) {
            return;
        }
        Drawable background = findViewById.getBackground();
        findViewById.setBackground(null);
        cszc cszcVar = new cszc(this, this.b, findViewById, background);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ksr("sessionId", emxe.b(efnlVar.a().b)));
        efmfVar.b(findViewById.getId(), Integer.valueOf(measuredWidth));
        efmfVar.b = 1;
        efmfVar.a = cszcVar;
        efmfVar.d = arrayList;
        efmq.a(efmfVar.a());
    }
}
