package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocy {
    public final oed a = new oed();
    public final fgcl b;
    public final fgcq c;
    public final ffud d;
    public final ffxx e;

    public ocy(ffxx ffxxVar, ffsk ffskVar) {
        fgcl d = fgcu.d(1, Alert.DURATION_SHOW_INDEFINITELY, 1);
        this.b = d;
        this.c = new fgds(d, new ocx(this, null));
        ffud d2 = ffqy.d(ffskVar, null, ffsm.b, new ocv(ffxxVar, this, null), 1);
        d2.hZ(new ocw(this));
        this.d = d2;
        this.e = new fgcp(new ocs(this, null));
    }
}
