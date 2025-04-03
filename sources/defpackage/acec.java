package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsFragment;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acec implements ServiceConnection {
    final /* synthetic */ acee a;

    public acec(acee aceeVar) {
        this.a = aceeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final DiagnosticsFragment diagnosticsFragment;
        eg G;
        acee.a.q("Diagnostics service connected");
        acei aceiVar = (acei) this.a.d.b();
        aced acedVar = this.a.h;
        if (acedVar != null && (G = (diagnosticsFragment = (DiagnosticsFragment) acedVar).G()) != null) {
            G.runOnUiThread(new Runnable() { // from class: achg
                @Override // java.lang.Runnable
                public final void run() {
                    DiagnosticsFragment diagnosticsFragment2 = DiagnosticsFragment.this;
                    diagnosticsFragment2.c.setEnabled(false);
                    diagnosticsFragment2.b.setEnabled(false);
                }
            });
        }
        this.a.e.c();
        acee aceeVar = this.a;
        List<acfm> a = aceeVar.a();
        final aceb acebVar = new aceb(aceeVar);
        for (final acfm acfmVar : a) {
            acfmVar.getClass();
            axos.a(new Runnable() { // from class: aceg
                @Override // java.lang.Runnable
                public final void run() {
                    acfm acfmVar2 = acfm.this;
                    if (acfmVar2.d) {
                        acfmVar2.b(2);
                        acfn a2 = acfmVar2.a();
                        acfmVar2.c(a2.c, a2.b);
                    } else {
                        acfo a3 = acfmVar2.a.a();
                        a3.I("skipping");
                        a3.I(acfmVar2.b);
                        a3.r();
                    }
                }
            }, aceiVar.a);
        }
        axos.a(new Runnable() { // from class: aceh
            @Override // java.lang.Runnable
            public final void run() {
                final DiagnosticsFragment diagnosticsFragment2;
                eg G2;
                acee aceeVar2 = aceb.this.a;
                aced acedVar2 = aceeVar2.h;
                if (acedVar2 != null && (G2 = (diagnosticsFragment2 = (DiagnosticsFragment) acedVar2).G()) != null) {
                    G2.runOnUiThread(new Runnable() { // from class: achf
                        @Override // java.lang.Runnable
                        public final void run() {
                            DiagnosticsFragment diagnosticsFragment3 = DiagnosticsFragment.this;
                            diagnosticsFragment3.c.setEnabled(true);
                            diagnosticsFragment3.b.setEnabled(true);
                            diagnosticsFragment3.b.setVisibility(0);
                        }
                    });
                }
                if (aceeVar2.g) {
                    aceeVar2.b.unbindService(aceeVar2.f);
                    aceeVar2.g = false;
                }
            }
        }, aceiVar.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        acee.a.q("Diagnostics service disconnected");
    }
}
