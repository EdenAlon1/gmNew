package defpackage;

import android.os.Bundle;
import android.os.Message;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
class djop extends diya {
    final /* synthetic */ djqf a;

    public djop(djqf djqfVar) {
        this.a = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public void b() {
        dkty.l(this.a.m, "Enter %s", a());
    }

    @Override // defpackage.diya, defpackage.dixy
    public void c() {
        dkty.l(this.a.m, "Exit %s", a());
        this.a.p(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
    }

    @Override // defpackage.diya, defpackage.dixy
    public boolean e(Message message) {
        int i = message.what;
        if (i == 5) {
            Bundle bundle = (Bundle) message.obj;
            Throwable th = (Throwable) bundle.getSerializable("transport_error_cause");
            dkty.r(this.a.m, "Unexpected transport error from transport %s. %s", bundle.getString("transport_id"), Objects.isNull(th) ? "" : th.getMessage());
            return false;
        }
        if (i == 7) {
            dkty.d(this.a.m, "Registration is already in progress.", new Object[0]);
            if (((Boolean) djqf.i.a()).booleanValue()) {
                this.a.N(dilc.UNKNOWN);
            }
        } else {
            if (i != 101) {
                dkty.d(this.a.m, "[%s] Unexpected event %d", a(), Integer.valueOf(message.what));
                return false;
            }
            if (message.obj instanceof Runnable) {
                ((Runnable) message.obj).run();
            }
        }
        return true;
    }

    public final int f() {
        djjt djjtVar = this.a.w;
        if (djjtVar == null) {
            return 8;
        }
        return djjtVar.c();
    }
}
