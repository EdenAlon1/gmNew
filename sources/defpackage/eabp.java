package defpackage;

import android.view.View;
import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabp {
    public final eabo a;
    public eabt b = null;
    public dzxw c;
    public eacv d;

    public eabp(eabo eaboVar) {
        ((eabr) eaboVar).setOnClickListener(new View.OnClickListener() { // from class: eabq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eabp eabpVar = eabp.this;
                eabt eabtVar = eabpVar.b;
                if (eabtVar == null || !eabtVar.c().g()) {
                    return;
                }
                eacv eacvVar = eabpVar.d;
                if (eacvVar != null) {
                    Object c = eabpVar.b.c().c();
                    eaac eaacVar = eacvVar.a.e;
                    if (eaacVar != null) {
                        dzqs dzqsVar = (dzqs) c;
                        if (dzqsVar.i() == dzqm.OUTGOING_FAILED_SEND) {
                            eaar eaarVar = eaacVar.a;
                            eaau eaauVar = eaarVar.e;
                            eaauVar.b.b(eaauVar.b(EnergyProfile.EVCONNECTOR_TYPE_OTHER).a());
                            eaarVar.f(dzqsVar);
                        }
                    }
                }
                if (((dzqs) eabpVar.b.c().c()).i().equals(dzqm.OUTGOING_FAILED_SEND)) {
                    return;
                }
                eabr eabrVar = (eabr) eabpVar.a;
                eabrVar.d.setVisibility(eabrVar.d.getVisibility() == 0 ? 8 : 0);
            }
        });
        this.a = eaboVar;
    }
}
