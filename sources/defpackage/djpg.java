package defpackage;

import android.os.Message;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpg extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpg(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "DeregisteredState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        djqf djqfVar = this.b;
        dkty.d(djqfVar.m, "Deregistered. reason=%s", djqfVar.D);
        this.b.I();
        djqf djqfVar2 = this.b;
        djqfVar2.y = null;
        djqfVar2.w = null;
        this.b.O();
        djqf djqfVar3 = this.b;
        eeno eenoVar = djqfVar3.x;
        if (!Objects.isNull(eenoVar)) {
            eenoVar.j(new eenp() { // from class: djog
                @Override // defpackage.eenp
                public final void a(String str, Throwable th) {
                    diyy diyyVar = djqf.d;
                }
            });
        }
        djqfVar3.x = null;
        this.b.A();
        this.b.F(new Runnable() { // from class: djpf
            @Override // java.lang.Runnable
            public final void run() {
                dilc dilcVar = dilc.DISABLED;
                djpg djpgVar = djpg.this;
                if (dilcVar.equals(djpgVar.b.D) || dilc.CANCELED.equals(djpgVar.b.D) || dilc.SHUTDOWN.equals(djpgVar.b.D) || dilc.NO_RETRY_NO_DEREGISTER_FOR_TEST.equals(djpgVar.b.D)) {
                    djqf djqfVar4 = djpgVar.b;
                    dkty.d(djqfVar4.m, "Stopping registration. reason=%s", djqfVar4.D);
                    djqf djqfVar5 = djpgVar.b;
                    djqfVar5.w(djqfVar5.W);
                    return;
                }
                if (dilc.SIM_REMOVED.equals(djpgVar.b.D)) {
                    djqf djqfVar6 = djpgVar.b;
                    djqfVar6.w(djqfVar6.aj);
                } else {
                    djqf djqfVar7 = djpgVar.b;
                    djqfVar7.w(djqfVar7.ak);
                }
            }
        });
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        if (message.what != 17) {
            return super.e(message);
        }
        this.b.N(dilc.SIM_REMOVED);
        djqf djqfVar = this.b;
        djqfVar.w(djqfVar.aj);
        return true;
    }
}
