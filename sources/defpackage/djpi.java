package defpackage;

import android.os.Bundle;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpi extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpi(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "DeregisteringState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        this.b.F(new Runnable() { // from class: djph
            @Override // java.lang.Runnable
            public final void run() {
                djpi djpiVar = djpi.this;
                try {
                    djpiVar.b.L();
                } catch (djkg | eejg e) {
                    dkty.j(e, djpiVar.b.m, "Can't sent deREGISTER.", new Object[0]);
                    djqf djqfVar = djpiVar.b;
                    djqfVar.w(djqfVar.ah);
                }
            }
        });
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 2) {
            if (i == 3) {
                dkty.h(this.b.m, "Deregistration timeout.", new Object[0]);
                djqf djqfVar = this.b;
                djqfVar.w(djqfVar.ah);
                return true;
            }
            if (i == 5) {
                Bundle bundle = (Bundle) message.obj;
                this.b.C(bundle.getString("transport_id"), (Throwable) bundle.getSerializable("transport_error_cause"));
                return true;
            }
            if (i == 8) {
                this.b.N(message.obj);
                dkty.d(this.b.m, "Deregistration in progress.", new Object[0]);
                return true;
            }
            if (i != 17) {
                return super.e(message);
            }
            this.b.N(dilc.SIM_REMOVED);
            return true;
        }
        if (message.obj instanceof eenl) {
            eenl eenlVar = (eenl) message.obj;
            if (eenlVar.y() == 200) {
                djqf djqfVar2 = this.b;
                djqfVar2.w(djqfVar2.ah);
            } else {
                if (eenlVar.y() == 401) {
                    dkty.d(this.b.m, "401 response received", new Object[0]);
                    try {
                        this.b.K.b(eenlVar);
                        dkty.d(this.b.m, "Send second de-REGISTER", new Object[0]);
                        this.b.L();
                    } catch (djkg | eejg e) {
                        dkty.j(e, this.b.m, "Send second de-REGISTER failed.", new Object[0]);
                    }
                }
                dkty.h(this.b.m, "Deregistration failed (%d %s).", Integer.valueOf(eenlVar.y()), eenlVar.A());
                djqf djqfVar3 = this.b;
                djqfVar3.w(djqfVar3.ah);
            }
        } else {
            dkty.j((eejg) message.obj, this.b.m, "Deregistration failed.", new Object[0]);
            djqf djqfVar4 = this.b;
            djqfVar4.w(djqfVar4.ah);
        }
        return true;
    }
}
