package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.internal.IGoogleLocationManagerService;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhal extends dfwc {
    public final cpn a;
    public final cpn v;
    private final cpn w;

    public dhal(Context context, Looper looper, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar) {
        super(context, looper, 23, dfvsVar, dfsmVar, dftwVar);
        this.a = new cpn();
        this.v = new cpn();
        this.w = new cpn();
        new cpn();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void L() {
        System.currentTimeMillis();
        synchronized (this.a) {
            this.a.clear();
        }
        synchronized (this.v) {
            this.v.clear();
        }
        synchronized (this.w) {
            this.w.clear();
        }
    }

    public final void M(dftn dftnVar, boolean z, dhri dhriVar) {
        synchronized (this.v) {
            dhah dhahVar = (dhah) this.v.remove(dftnVar);
            if (dhahVar == null) {
                dhriVar.b(Boolean.FALSE);
                return;
            }
            ((dgzy) dhahVar.a).a.a();
            if (!z) {
                dhriVar.b(Boolean.TRUE);
            } else if (N(dgyl.j)) {
                ((IGoogleLocationManagerService) w()).unregisterLocationClient(LocationReceiver.a(null, dhahVar, "ILocationCallback@" + System.identityHashCode(dhahVar)), new dgzz(Boolean.TRUE, dhriVar));
            } else {
                ((IGoogleLocationManagerService) w()).updateLocationRequest(new LocationRequestUpdateData(2, null, null, dhahVar, null, new dhab(Boolean.TRUE, dhriVar), null));
            }
        }
    }

    public final boolean N(Feature feature) {
        Feature feature2;
        Feature[] s = s();
        if (s != null) {
            int i = 0;
            while (true) {
                if (i >= s.length) {
                    feature2 = null;
                    break;
                }
                feature2 = s[i];
                if (feature.a.equals(feature2.a)) {
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.a() >= feature.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IGoogleLocationManagerService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return dgyl.p;
    }
}
