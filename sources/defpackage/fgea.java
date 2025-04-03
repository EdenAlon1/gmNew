package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgea implements fgfd {
    public final ffhd a;
    public final int b;
    public final int c;

    public fgea(ffhd ffhdVar, int i, int i2) {
        this.a = ffhdVar;
        this.b = i;
        this.c = i2;
        boolean z = ffso.a;
    }

    public static /* synthetic */ Object h(fgea fgeaVar, ffxy ffxyVar, ffgu ffguVar) {
        Object a = ffsl.a(new fgdy(ffxyVar, fgeaVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.ffxx
    public Object a(ffxy ffxyVar, ffgu ffguVar) {
        return h(this, ffxyVar, ffguVar);
    }

    protected abstract Object b(ffxe ffxeVar, ffgu ffguVar);

    protected abstract fgea c(ffhd ffhdVar, int i, int i2);

    protected String d() {
        return null;
    }

    public ffxg e(ffsk ffskVar) {
        ffsm ffsmVar = ffsm.c;
        fgdz fgdzVar = new fgdz(this, null);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        return ffxd.c(ffskVar, this.a, i, i2, ffsmVar, fgdzVar);
    }

    public ffxx f() {
        return null;
    }

    @Override // defpackage.fgfd
    public final ffxx ib(ffhd ffhdVar, int i, int i2) {
        boolean z = ffso.a;
        ffhd plus = ffhdVar.plus(this.a);
        if (i2 == 1) {
            int i3 = this.b;
            if (i3 != -3) {
                if (i != -3) {
                    if (i3 != -2) {
                        if (i != -2 && (i3 = i3 + i) < 0) {
                            i = Alert.DURATION_SHOW_INDEFINITELY;
                        }
                    }
                }
                i = i3;
            }
            i2 = this.c;
        }
        return (ffkj.e(plus, this.a) && i == this.b && i2 == this.c) ? this : c(plus, i, i2);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        ffhd ffhdVar = this.a;
        if (ffhdVar != ffhe.a) {
            Objects.toString(ffhdVar);
            arrayList.add("context=".concat(String.valueOf(ffhdVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.h(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            Objects.toString(ffwb.a(i2));
            arrayList.add("onBufferOverflow=".concat(ffwb.a(i2)));
        }
        return ffsp.a(this) + "[" + ffdx.aA(arrayList, ", ", null, null, null, 62) + "]";
    }
}
