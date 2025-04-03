package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djme extends djma {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djme(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "InitialState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 3) {
            djmm djmmVar = this.b;
            djmmVar.w(djmmVar.k);
            return true;
        }
        if (i != 4) {
            return false;
        }
        djmm djmmVar2 = this.b;
        djmmVar2.w(djmmVar2.t);
        return true;
    }
}
