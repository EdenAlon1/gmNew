package defpackage;

import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpw extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpw(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "RetryState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        djqf djqfVar = this.b;
        djqfVar.H = 0L;
        djqfVar.F(new Runnable() { // from class: djpu
            @Override // java.lang.Runnable
            public final void run() {
                final djpw djpwVar = djpw.this;
                long a = djpwVar.b.G.a();
                if (a == 0) {
                    djqf djqfVar2 = djpwVar.b;
                    djqfVar2.w(djqfVar2.Y);
                } else {
                    dkty.l(djpwVar.b.m, "Scheduling MSG_RETRY_TIMEOUT for %ds.", Long.valueOf(a));
                    djpwVar.b.J(new Runnable() { // from class: djpv
                        @Override // java.lang.Runnable
                        public final void run() {
                            djpw.this.b.q(15);
                        }
                    }, a, TimeUnit.SECONDS);
                    djpwVar.b.H = dkvj.a().longValue() + (a * 1000);
                }
                djpwVar.b.G.b();
            }
        });
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void c() {
        super.c();
        this.b.z();
        djqf djqfVar = this.b;
        djqfVar.G.a = 0;
        djqfVar.p(15);
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4) {
            djqf djqfVar = this.b;
            dkty.d(djqfVar.m, "Ignore connectivity event. Next retry in %dms", Long.valueOf(djqfVar.H - dkvj.a().longValue()));
            return true;
        }
        if (i == 8) {
            this.b.N(message.obj);
            djqf djqfVar2 = this.b;
            djqfVar2.w(djqfVar2.W);
            return true;
        }
        if (i != 15) {
            return super.e(message);
        }
        dkty.d(this.b.m, "Triggering registration retry.", new Object[0]);
        djqf djqfVar3 = this.b;
        djqfVar3.w(djqfVar3.Y);
        return true;
    }
}
