package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duq extends isz implements ixl, isu {
    public ffji a;
    public boolean b;
    public final ffji c = new dup(this);
    public final ffwm d = ffwp.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    public final ilx e;
    public dni f;
    private ixl g;
    private dlz h;

    public duq(dni dniVar, ffji ffjiVar, boolean z) {
        this.f = dniVar;
        this.a = ffjiVar;
        this.b = z;
        duo duoVar = new duo(this);
        iki ikiVar = ilv.a;
        imf imfVar = new imf(null, null, null, duoVar);
        M(imfVar);
        this.e = imfVar;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ long a() {
        return ixt.a;
    }

    @Override // defpackage.hvh
    public final /* synthetic */ void dL() {
        ixk.a(this);
    }

    @Override // defpackage.hvh
    public final void dT() {
        this.h = dma.a(this);
    }

    @Override // defpackage.ixl
    public final void dU() {
        this.e.dU();
        ixl ixlVar = this.g;
        if (ixlVar != null) {
            ixlVar.dU();
        }
    }

    @Override // defpackage.ixl
    public final void dV(iki ikiVar, ikk ikkVar, long j) {
        dlz dlzVar = this.h;
        if (this.b) {
            List list = ikiVar.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!ilq.b(((iku) list.get(i)).i, 2)) {
                    i++;
                } else if (dlzVar != null && this.g == null) {
                    duj dujVar = new duj(this, dlzVar);
                    iki ikiVar2 = ilv.a;
                    imf imfVar = new imf(null, null, null, dujVar);
                    M(imfVar);
                    this.g = imfVar;
                }
            }
        }
        this.e.dV(ikiVar, ikkVar, j);
        ixl ixlVar = this.g;
        if (ixlVar != null) {
            ixlVar.dV(ikiVar, ikkVar, j);
        }
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void dW() {
        ixk.b(this);
    }

    @Override // defpackage.ixl
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void y() {
    }
}
