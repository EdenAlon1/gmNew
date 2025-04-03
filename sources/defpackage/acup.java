package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acup extends actz {
    final /* synthetic */ acuq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acup(acuq acuqVar, acua acuaVar) {
        super(acuqVar, acuaVar);
        this.c = acuqVar;
    }

    @Override // defpackage.actz
    public final void a(String str, acum acumVar) {
        kfb kfbVar;
        if (str == null || str.equals("stl_open_port")) {
            return;
        }
        cskc cskcVar = acuq.a;
        try {
            esnn esnnVar = (esnn) eyfy.parseFrom(esnn.a, Base64.decode(str.getBytes("UTF-8"), 0), eyfc.a());
            synchronized (this.c.j) {
                kfbVar = (kfb) this.c.j.remove(esnnVar.d);
            }
            if (kfbVar == null) {
                csjb e = acuq.a.e();
                e.I("Received a Ditto response with no associated request");
                e.A("payloadCase", esnm.a(esnnVar.b));
                e.A("requestId", esnnVar.d);
                e.r();
                return;
            }
            int i = esnnVar.e;
            fagh b = fagh.b(i);
            if (b == null) {
                b = fagh.UNRECOGNIZED;
            }
            if (b != fagh.UNKNOWN) {
                fagh b2 = fagh.b(i);
                if (b2 == null) {
                    b2 = fagh.UNRECOGNIZED;
                }
                if (b2 != fagh.OK) {
                    kfbVar.c(new acun(esnnVar.f));
                    acip acipVar = (acip) this.c.g.b();
                    String str2 = esnnVar.d;
                    int i2 = esnm.a(esnnVar.b).B;
                    fagh b3 = fagh.b(esnnVar.e);
                    if (b3 == null) {
                        b3 = fagh.UNRECOGNIZED;
                    }
                    acipVar.e(str2, i2, b3);
                    return;
                }
            }
            kfbVar.b(esnnVar);
            ((acip) this.c.g.b()).f(esnnVar.d, esnm.a(esnnVar.b).B);
        } catch (eygu e2) {
            throw new IllegalStateException("Could not parse SatelliteBridgeRequest proto", e2);
        } catch (UnsupportedEncodingException e3) {
            throw new IllegalStateException("Could not decode Satellite Bridge Request", e3);
        }
    }
}
