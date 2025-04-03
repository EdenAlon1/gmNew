package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.ffel;
import defpackage.kop;
import defpackage.ksp;
import defpackage.pmd;
import defpackage.pmt;
import defpackage.pmz;
import defpackage.pnb;
import defpackage.pnc;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SidecarCompat implements pmt {
    public final SidecarInterface a;
    public final pmz b;
    public final Map c;
    public final Map d;
    public pnc e;

    /* compiled from: PG */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecarInterface;
            sidecarDeviceState.getClass();
            for (Activity activity : SidecarCompat.this.c.values()) {
                SidecarCompat sidecarCompat = SidecarCompat.this;
                IBinder a = pnb.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a != null && (sidecarInterface = sidecarCompat.a) != null) {
                    sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(a);
                }
                pnc pncVar = sidecarCompat.e;
                if (pncVar != null) {
                    pmz pmzVar = sidecarCompat.b;
                    pncVar.a(activity, pmz.a(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            iBinder.getClass();
            sidecarWindowLayoutInfo.getClass();
            Activity activity = (Activity) SidecarCompat.this.c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarCompat sidecarCompat = SidecarCompat.this;
            pmz pmzVar = sidecarCompat.b;
            SidecarInterface sidecarInterface = sidecarCompat.a;
            if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            SidecarCompat sidecarCompat2 = SidecarCompat.this;
            pmd a = pmz.a(sidecarWindowLayoutInfo, sidecarDeviceState);
            pnc pncVar = sidecarCompat2.e;
            if (pncVar != null) {
                pncVar.a(activity, a);
            }
        }
    }

    public SidecarCompat(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        pmz pmzVar = new pmz();
        this.a = sidecarImpl;
        this.b = pmzVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final pmd a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder a = pnb.a(activity);
        if (a == null) {
            return new pmd(ffel.a);
        }
        SidecarInterface sidecarInterface = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a) : null;
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return pmz.a(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        this.c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.c.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        pnc pncVar = this.e;
        if (pncVar != null) {
            pncVar.a(activity, a(activity));
        }
        if (this.d.get(activity) == null && (activity instanceof kop)) {
            ksp kspVar = new ksp() { // from class: pna
                @Override // defpackage.ksp
                public final void accept(Object obj) {
                    SidecarCompat sidecarCompat = SidecarCompat.this;
                    pnc pncVar2 = sidecarCompat.e;
                    if (pncVar2 != null) {
                        Activity activity2 = activity;
                        pncVar2.a(activity2, sidecarCompat.a(activity2));
                    }
                }
            };
            this.d.put(activity, kspVar);
            ((kop) activity).hv(kspVar);
        }
    }
}
