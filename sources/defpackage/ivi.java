package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivi extends ffkk implements ffix {
    final /* synthetic */ ivm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivi(ivm ivmVar) {
        super(0);
        this.a = ivmVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ivm ivmVar = this.a;
        ivmVar.f.h = 0;
        hne s = ivmVar.o().s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            ivm x = ((iui) objArr[i2]).x();
            x.h = x.i;
            x.i = Alert.DURATION_SHOW_INDEFINITELY;
            x.t = false;
            if (x.G == 2) {
                x.G = 3;
            }
        }
        this.a.j(ivg.a);
        this.a.i().K().o();
        iui o = this.a.o();
        hne s2 = o.s();
        Object[] objArr2 = s2.a;
        int i3 = s2.b;
        for (int i4 = 0; i4 < i3; i4++) {
            iui iuiVar = (iui) objArr2[i4];
            if (iuiVar.x().h != iuiVar.o()) {
                o.Z();
                o.Q();
                if (iuiVar.o() == Integer.MAX_VALUE) {
                    if (iuiVar.y.c) {
                        ivd w = iuiVar.w();
                        w.getClass();
                        w.r(false);
                    }
                    iuiVar.x().t();
                }
            }
        }
        this.a.j(ivh.a);
        return ffcu.a;
    }
}
