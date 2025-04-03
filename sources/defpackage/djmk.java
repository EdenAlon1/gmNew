package defpackage;

import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmk extends djma {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmk(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "RetryState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        this.b.I(djlz.RESET_FROM_STATE_RETRY);
        dkty.l(this.b.i, "Retrying in %ds.", 3L);
        this.b.t(15, TimeUnit.SECONDS.toMillis(3L));
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void c() {
        super.c();
        this.b.p(15);
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4) {
            dkty.d(this.b.i, "Triggering registration retry.", new Object[0]);
            djmm djmmVar = this.b;
            djmmVar.w(djmmVar.t);
            return true;
        }
        if (i != 15) {
            return super.e(message);
        }
        dkty.d(this.b.i, "Triggering registration retry.", new Object[0]);
        djmm djmmVar2 = this.b;
        djmmVar2.w(djmmVar2.k);
        return true;
    }
}
