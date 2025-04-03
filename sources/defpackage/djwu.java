package defpackage;

import android.os.Message;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwu extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwu(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [djtd, java.lang.Object] */
    private final void q(long j) {
        this.a.z.d("scheduleRetry, currentRetry = %s, retryMillis = %s", Long.valueOf(((dkdw) this.a.M.b()).c(this.a.h)), Long.valueOf(j));
        ((dkdw) this.a.M.b()).w(this.a.h, j + System.currentTimeMillis());
        if (this.a.K.isPresent()) {
            djxs djxsVar = this.a;
            dkdw dkdwVar = (dkdw) djxsVar.M.b();
            String str = djxsVar.h;
            dkdwVar.r(str);
            ((dkdw) this.a.M.b()).w(str, 0L);
            r();
            this.a.K.get().o(4, this.a.h);
        }
    }

    private final void r() {
        this.a.y(ezdc.RETRY_STAGE);
        djxs djxsVar = this.a;
        dkdv dkdvVar = djxsVar.v;
        Optional of = Optional.of(djxsVar.h);
        if (!dkdvVar.j(dkdvVar.e(of))) {
            dkdvVar.r(new dkdu() { // from class: dkdh
                @Override // defpackage.dkdu
                public final void a(ezch ezchVar) {
                    enhk enhkVar = dkdv.a;
                    ezchVar.copyOnWrite();
                    ezcq ezcqVar = (ezcq) ezchVar.instance;
                    ezcq ezcqVar2 = ezcq.a;
                    ezcqVar.b |= 32768;
                    ezcqVar.s = -1L;
                }
            }, dkdvVar.e(of));
        }
        this.a.ap(5);
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "RetryState";
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [j$.time.temporal.Temporal, java.lang.Object] */
    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        ((dkdw) this.a.M.b()).n(this.a.h);
        if (((Boolean) djxs.d.a()).booleanValue()) {
            Optional h = ((dkdw) this.a.M.b()).h(this.a.h);
            ((dkdw) this.a.M.b()).o(this.a.h);
            if (h.isPresent() && this.a.K.isPresent()) {
                Duration between = Duration.between(this.a.L.f(), h.get());
                if (between.compareTo(djxs.f) > 0) {
                    between = djxs.f;
                }
                if (between.isNegative()) {
                    between = Duration.ZERO;
                }
                Object obj = this.a.K.get();
                djxs djxsVar = this.a;
                RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) obj;
                rcsProvisioningListenableWorker.m("Provisioning Engine entered RetryState, provisioning task will be rescheduled in %s", between);
                rcsProvisioningListenableWorker.u = 7;
                rcsProvisioningListenableWorker.g.m(djxsVar.h, between, 3, eqws.STATE_MACHINE_RETRY);
                rcsProvisioningListenableWorker.i = new ppp();
                rcsProvisioningListenableWorker.l();
                r();
                return;
            }
        }
        long c = ((dkdw) this.a.M.b()).c(this.a.h);
        this.a.z.d("nextRetry = %s", Long.valueOf(c));
        if (c != 0) {
            q(c - System.currentTimeMillis());
            return;
        }
        djxs djxsVar2 = this.a;
        long e = djxsVar2.e();
        long d = djxsVar2.d();
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(e) - Long.numberOfLeadingZeros(d);
        int b = ((dkdw) this.a.M.b()).b(this.a.h);
        long j = numberOfLeadingZeros > b ? e << b : d;
        this.a.z.a("getRetryDelayFromRetryCount, minDelayMs = %s, maxDelayMs = %s, maxShiftCount = %s, retryCount = %s, backoffDelay = %s", Long.valueOf(e), Long.valueOf(d), Integer.valueOf(numberOfLeadingZeros), Integer.valueOf(b), Long.valueOf(j));
        q(j);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_RETRY;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_RETRY_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean i() {
        return false;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return false;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("RetryState", message);
        if (djxs.ak(message).ordinal() != 10) {
            return super.o(message, djtaVar);
        }
        q(((Integer) message.obj).intValue() * 1000);
        return true;
    }
}
