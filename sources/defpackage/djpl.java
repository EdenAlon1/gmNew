package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpl extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpl(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "ReadyState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        this.b.F(new Runnable() { // from class: djpk
            @Override // java.lang.Runnable
            public final void run() {
                djpl djplVar = djpl.this;
                djqf djqfVar = djplVar.b;
                if (djqfVar.I != null) {
                    djqfVar.w(djqfVar.Y);
                    return;
                }
                dkty.h(djqfVar.m, "IMS configuration is not available. Stopping.", new Object[0]);
                djqf djqfVar2 = djplVar.b;
                djqfVar2.w(djqfVar2.W);
            }
        });
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 8) {
            this.b.N(message.obj);
            djqf djqfVar = this.b;
            djqfVar.w(djqfVar.W);
            return true;
        }
        if (i != 17) {
            return super.e(message);
        }
        this.b.N(dilc.SIM_REMOVED);
        djqf djqfVar2 = this.b;
        djqfVar2.w(djqfVar2.aj);
        return true;
    }
}
