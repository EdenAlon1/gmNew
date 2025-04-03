package defpackage;

import android.os.Message;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwn extends djxb {
    String a;
    final /* synthetic */ djxs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwn(djxs djxsVar) {
        super(djxsVar);
        this.b = djxsVar;
    }

    private final void q(long j) {
        if (this.b.K.isPresent()) {
            ((dkdw) this.b.M.b()).E(this.b.h, true);
            Object obj = this.b.K.get();
            djxs djxsVar = this.b;
            long j2 = j / 1000;
            RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) obj;
            rcsProvisioningListenableWorker.m("Provisioning Engine entered ReplayRequestState, request will be re-attempted in %s", Long.valueOf(j2));
            rcsProvisioningListenableWorker.u = 10;
            rcsProvisioningListenableWorker.g.m(djxsVar.h, Duration.ofSeconds(j2), 3, eqws.STATE_MACHINE_REPLAY);
            rcsProvisioningListenableWorker.i = new ppp();
            rcsProvisioningListenableWorker.l();
        }
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "ReplayRequestState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        djxb djxbVar;
        this.a = ((dkdw) this.b.M.b()).l(this.b.h);
        super.b();
        int i = 0;
        if (((dkdw) this.b.M.b()).K(this.b.h)) {
            ((dkdw) this.b.M.b()).E(this.b.h, false);
            ((dkdw) this.b.M.b()).q(this.b.h);
            djxs djxsVar = this.b;
            if (djxsVar.f().d()) {
                this.b.z.d("Cannot replay request. RCS is disabled.", new Object[0]);
                djxbVar = this.b.ae;
            } else {
                djxbVar = djxsVar.ad;
                if (!TextUtils.isEmpty(this.a)) {
                    djxb djxbVar2 = (djxb) this.b.g.get(this.a);
                    if (djxbVar2 != null && (djxbVar2.m() || djxbVar2.i())) {
                        djxbVar = djxbVar2;
                    }
                }
            }
            n(djxbVar, djxbVar.g());
            return;
        }
        if (((dkdw) this.b.M.b()).a(this.b.h) >= ((Long) djai.t().a.b.a()).longValue()) {
            this.b.aq(ezez.RCS_PROVISIONING_REPLAY_REQUEST_STATE, 6);
            n(this.b.al, ezez.RCS_PROVISIONING_RETRY_STATE);
            return;
        }
        djxs djxsVar2 = this.b;
        djyt djytVar = djxsVar2.R;
        djta djtaVar = djta.MSG_RETRY_AFTER;
        if (djytVar.m()) {
            djyt djytVar2 = djxsVar2.R;
            djtaVar.getClass();
            Iterator it = djytVar2.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                if (ffkj.e(((ffcf) it.next()).a, djtaVar)) {
                    return;
                }
            }
        } else {
            diyb diybVar = djxsVar2.Q;
            int a = djtaVar.a();
            diyn diynVar = diybVar.b;
            if (diynVar != null) {
                ArrayList arrayList = diynVar.l;
                int size = arrayList.size();
                while (i < size) {
                    int i2 = ((Message) arrayList.get(i)).what;
                    i++;
                    if (i2 == a) {
                        return;
                    }
                }
            }
        }
        djxs djxsVar3 = this.b;
        long e = djxsVar3.e();
        long d = djxsVar3.d();
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(e) - Long.numberOfLeadingZeros(d);
        int a2 = ((dkdw) this.b.M.b()).a(this.b.h);
        if (numberOfLeadingZeros > a2) {
            d = e << a2;
        }
        q(d);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_REPLAY_REQUEST;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_REPLAY_REQUEST_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return false;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.b.D("ReplayRequestState", message);
        if (djxs.ak(message).ordinal() != 10) {
            return super.o(message, djtaVar);
        }
        q(((Integer) message.obj).intValue() * 1000);
        return true;
    }
}
