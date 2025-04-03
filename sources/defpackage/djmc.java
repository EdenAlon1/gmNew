package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmc extends djma {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmc(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "DeregisteringState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        djmm djmmVar = this.b;
        djkh djkhVar = djmmVar.v;
        if (djkhVar != null) {
            djkhVar.i(dilc.DISABLED);
        }
        djmmVar.w(djmmVar.t);
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        return true;
    }
}
