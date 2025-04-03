package defpackage;

import android.app.job.JobService;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbeh extends JobService implements fbat {
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
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ActionJobService actionJobService = (ActionJobService) this;
            akhb akhbVar = (akhb) aX();
            actionJobService.a = (bbdv) akhbVar.b.a.fC.b();
            actionJobService.b = (elbx) akhbVar.b.aJ.b();
            actionJobService.c = akhbVar.b.a.fF;
        }
        super.onCreate();
    }
}
