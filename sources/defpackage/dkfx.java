package defpackage;

import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkfx implements erqj {
    final /* synthetic */ RcsEngineProxyImpl a;

    public dkfx(RcsEngineProxyImpl rcsEngineProxyImpl) {
        this.a = rcsEngineProxyImpl;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dktn dktnVar;
        dktn dktnVar2;
        if (((djtp) obj).R()) {
            dktnVar2 = this.a.B;
            dkty.l(dktnVar2, "Ignoring SIM removed, since we have valid RCS config", new Object[0]);
        } else {
            dktnVar = this.a.B;
            dkty.l(dktnVar, "Handling SIM removed", new Object[0]);
            this.a.onSimAbsentInternal();
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dktn dktnVar;
        dktnVar = this.a.B;
        dkty.j(th, dktnVar, "Failed retrieve RCS Configuration %s", th.getMessage());
        this.a.onSimAbsentInternal();
    }
}
