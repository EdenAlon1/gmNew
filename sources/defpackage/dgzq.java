package defpackage;

import com.google.android.gms.location.internal.IGoogleLocationManagerService;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgzq implements dfuf, dhad {
    public dftp a;
    public boolean b = true;
    final /* synthetic */ dgzr c;

    public dgzq(dgzr dgzrVar, dftp dftpVar) {
        this.c = dgzrVar;
        this.a = dftpVar;
    }

    @Override // defpackage.dfuf
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dftn dftnVar;
        boolean z;
        dhal dhalVar = (dhal) obj;
        synchronized (this) {
            dftnVar = this.a.b;
            z = this.b;
            this.a.a();
        }
        if (dftnVar == null) {
            ((dhri) obj2).b(false);
            return;
        }
        synchronized (dhalVar.a) {
            dhak dhakVar = (dhak) dhalVar.a.remove(dftnVar);
            if (dhakVar == null) {
                ((dhri) obj2).b(Boolean.FALSE);
                return;
            }
            dhakVar.a.b().a();
            if (!z) {
                ((dhri) obj2).b(Boolean.TRUE);
            } else if (dhalVar.N(dgyl.j)) {
                ((IGoogleLocationManagerService) dhalVar.w()).unregisterLocationClient(LocationReceiver.b(null, dhakVar, "ILocationListener@" + System.identityHashCode(dhakVar)), new dgzz(Boolean.TRUE, (dhri) obj2));
            } else {
                ((IGoogleLocationManagerService) dhalVar.w()).updateLocationRequest(new LocationRequestUpdateData(2, null, dhakVar, null, null, new dhab(Boolean.TRUE, (dhri) obj2), null));
            }
        }
    }

    @Override // defpackage.dhad
    public final synchronized dftp b() {
        return this.a;
    }

    @Override // defpackage.dhad
    public final synchronized void c(dftp dftpVar) {
        dftp dftpVar2 = this.a;
        if (dftpVar2 != dftpVar) {
            dftpVar2.a();
            this.a = dftpVar;
        }
    }
}
