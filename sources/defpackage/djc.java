package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djc extends hvh implements itu, ixn {
    public dji a;
    public boolean b;
    public boolean c;

    public djc(dji djiVar, boolean z, boolean z2) {
        this.a = djiVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        dev.a(j, this.c ? dqs.a : dqs.b);
        boolean z = this.c;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int a = z ? Integer.MAX_VALUE : jzk.a(j);
        if (z) {
            i = jzk.b(j);
        }
        iqk e = iplVar.e(jzk.m(j, 0, i, 0, a, 5));
        int i2 = e.a;
        int g = ffmk.g(i2, jzk.b(j));
        int i3 = e.b;
        int g2 = ffmk.g(i3, jzk.a(j));
        int i4 = i3 - g2;
        int i5 = i2 - g;
        if (true != this.c) {
            i4 = i5;
        }
        dji djiVar = this.a;
        djiVar.e.i(i4);
        hrw a2 = hrv.a();
        ffji k = a2 != null ? a2.k() : null;
        hrw b = hrv.b(a2);
        try {
            if (djiVar.c() > i4) {
                djiVar.f(i4);
            }
            hrv.e(a2, b, k);
            this.a.c.i(true != this.c ? g : g2);
            ei = ipqVar.ei(g, g2, ffem.a, new djb(this, i4, e));
            return ei;
        } catch (Throwable th) {
            hrv.e(a2, b, k);
            throw th;
        }
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        jkr.L(jkvVar);
        jjk jjkVar = new jjk(new diy(this), new diz(this), this.b);
        if (this.c) {
            jkr.A(jkvVar, jjkVar);
        } else {
            jkr.m(jkvVar, jjkVar);
        }
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        if (true != this.c) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return inxVar.a(i);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean ea() {
        return false;
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        if (true == this.c) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return inxVar.b(i);
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        if (true != this.c) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return inxVar.c(i);
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        if (true == this.c) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return inxVar.d(i);
    }
}
