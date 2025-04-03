package defpackage;

import android.telephony.satellite.wrapper.CarrierRoamingNtnModeListenerWrapper2;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnog implements CarrierRoamingNtnModeListenerWrapper2 {
    final /* synthetic */ cnoi a;
    final /* synthetic */ cnoa b;
    final /* synthetic */ int c;

    public cnog(cnoi cnoiVar, cnoa cnoaVar, int i) {
        this.a = cnoiVar;
        this.b = cnoaVar;
        this.c = i;
    }

    public final void onCarrierRoamingNtnEligibleStateChanged(boolean z) {
        ekzm b = this.a.b.b("CarrierRoamingNtnModeListenerWrapper onCarrierRoamingNtnEligibleStateChanged");
        try {
            this.b.a(z, this.c);
            ffig.a(b, null);
        } finally {
        }
    }

    public final void onCarrierRoamingNtnModeChanged(boolean z) {
        ekzm b = this.a.b.b("CarrierRoamingNtnModeListenerWrapper onCarrierRoamingNtnModeChangedEvent");
        try {
            this.b.b(z, this.c);
            ffig.a(b, null);
        } finally {
        }
    }
}
