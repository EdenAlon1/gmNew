package defpackage;

import android.service.chooser.ChooserTargetService;
import com.google.android.apps.messaging.shared.datamodel.BugleChooserTargetService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class azyv extends ChooserTargetService implements fbat {
    private volatile fbaj a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
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

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            BugleChooserTargetService bugleChooserTargetService = (BugleChooserTargetService) this;
            akis akisVar = ((akhb) aX()).b;
            bugleChooserTargetService.a = akisVar.cT;
            bugleChooserTargetService.b = akisVar.a.u;
            akko akkoVar = akisVar.b;
            bugleChooserTargetService.c = akkoVar.dV;
            bugleChooserTargetService.d = akkoVar.dW;
        }
        super.onCreate();
    }
}
