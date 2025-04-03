package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbhm extends Service implements fbat {
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

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ResizingService resizingService = (ResizingService) this;
            akhb akhbVar = (akhb) aX();
            resizingService.b = (cins) akhbVar.b.a.jc.b();
            resizingService.c = (cbif) akhbVar.b.a.pH.b();
            resizingService.d = (elbx) akhbVar.b.aJ.b();
        }
        super.onCreate();
    }
}
