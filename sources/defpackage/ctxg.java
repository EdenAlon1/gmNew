package defpackage;

import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxg extends ctvk {
    private final TelephonyManager a;

    public ctxg(ctxf ctxfVar, ctwx ctwxVar, int i) {
        super(ctxfVar.a(i));
        this.a = ctwxVar.a(i);
    }

    @Override // defpackage.ctvk, defpackage.ctwy
    public final int b() {
        int simCarrierId;
        simCarrierId = this.a.getSimCarrierId();
        return simCarrierId;
    }
}
