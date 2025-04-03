package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmf extends djma {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmf(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "PublishedState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void b() {
        djkh djkhVar;
        super.b();
        if (!djmm.P() || (djkhVar = this.b.v) == null) {
            return;
        }
        djkhVar.h();
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void c() {
        if (djmm.P()) {
            this.b.G(dilc.ERROR_RESPONSE);
        }
        super.c();
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 9) {
            if (i != 10 && i != 17) {
                if (i != 18) {
                    return false;
                }
                this.b.J(message.arg1);
                return true;
            }
            dkty.r(this.b.i, "[%s] Publish failed.", "PublishedState");
            djmm djmmVar = this.b;
            djmmVar.w(djmmVar.o);
        }
        return true;
    }
}
