package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djnq implements djjk {
    final /* synthetic */ djnr a;

    public djnq(djnr djnrVar) {
        this.a = djnrVar;
    }

    @Override // defpackage.djjk
    public final void onConnectivityChange(Context context, int i) {
        NetworkInfo networkInfo;
        try {
            networkInfo = dkvo.f(context).d();
        } catch (dkvd e) {
            dkty.s(e, "Can't get active network info. Missing permissions.", new Object[0]);
            networkInfo = null;
        }
        dkty.d(this.a.a, "RegistrationEngine received connectivity change event. state=%d, NetworkInfo=%s", Integer.valueOf(i), networkInfo);
        djqf djqfVar = this.a.c;
        if (djqfVar != null) {
            Message c = djqfVar.c(4, i, -1, networkInfo);
            diyn diynVar = djqfVar.b;
            if (diynVar == null) {
                return;
            }
            diynVar.sendMessage(c);
        }
    }

    @Override // defpackage.djjk
    public final boolean shouldTriggerOnCapabilitiesChanged() {
        return true;
    }
}
