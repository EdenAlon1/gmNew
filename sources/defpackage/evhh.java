package defpackage;

import com.google.frameworks.client.data.android.server.tiktok.MainProcessEndpointService;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evhh extends lkx implements fbat {
    private volatile fbaj a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbaj aW() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new fbaj(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.lkx, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            MainProcessEndpointService mainProcessEndpointService = (MainProcessEndpointService) this;
            akhb akhbVar = (akhb) aX();
            mainProcessEndpointService.a = new evgy(akhbVar.a, (ScheduledExecutorService) akhbVar.b.p.b(), (fdzj) akhbVar.b.b.qP.b(), emxc.j((List) akhbVar.b.b.qQ.b()));
            mainProcessEndpointService.b = (feeq) akhbVar.b.b.rh.b();
            enpd enpdVar = enpd.a;
        }
        super.onCreate();
    }
}
