package defpackage;

import android.os.Message;
import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes4.dex */
class djma extends diya {
    final /* synthetic */ djmm a;

    public djma(djmm djmmVar) {
        this.a = djmmVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public void b() {
        dkty.l(this.a.i, "Enter %s", a());
    }

    @Override // defpackage.diya, defpackage.dixy
    public void c() {
        dkty.l(this.a.i, "Exit %s", a());
        this.a.p(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
    }

    @Override // defpackage.diya, defpackage.dixy
    public boolean e(Message message) {
        if (message.what == 101) {
            if (message.obj instanceof Runnable) {
                ((Runnable) message.obj).run();
            }
            return true;
        }
        dkty.d(this.a.i, "[%s] Unexpected event %d", a(), Integer.valueOf(message.what));
        return false;
    }
}
