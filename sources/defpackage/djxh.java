package defpackage;

import android.os.Message;
import j$.time.Instant;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxh extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxh(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "WaitingForAppOpenState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        if (this.a.ac.isEmpty()) {
            n(this.a.af, ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
            return;
        }
        this.a.y(ezdc.WAITING_FOR_APP_OPEN_STAGE);
        algm algmVar = (algm) this.a.ac.get();
        final elfl a = algmVar.a();
        final elfl i = algmVar.i(3);
        axnw.h(elfo.m(a, i).a(new Callable() { // from class: algh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = algm.d;
                boolean z = true;
                if (((Instant) erqt.q(elfl.this)).equals(Instant.EPOCH) && ((Instant) erqt.q(i)).equals(Instant.EPOCH)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, erpp.a).h(new emwl() { // from class: djxg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                djxh djxhVar = djxh.this;
                djxhVar.n(djxhVar.a.ag, ezez.RCS_PROVISIONING_READY_STATE);
                return null;
            }
        }, erpp.a));
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_WAITING_FOR_APP_OPEN;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_WAITING_FOR_APP_OPEN_STATE;
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
        return super.o(message, djtaVar);
    }
}
