package defpackage;

import android.os.RemoteException;
import com.google.android.play.core.appupdate.protocol.IAppUpdateService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvc extends ehwh {
    final /* synthetic */ dhri a;
    final /* synthetic */ String b;
    final /* synthetic */ ehvg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehvc(ehvg ehvgVar, dhri dhriVar, dhri dhriVar2, String str) {
        super(dhriVar);
        this.a = dhriVar2;
        this.b = str;
        this.c = ehvgVar;
    }

    @Override // defpackage.ehwh
    protected final void a() {
        try {
            ehvg ehvgVar = this.c;
            ((IAppUpdateService) ehvgVar.b.n).completeUpdate(ehvgVar.c, ehvg.b(), new ehve(this.c, this.a));
        } catch (RemoteException e) {
            ehvg.a.c(e, "completeUpdate(%s)", this.b);
            this.a.c(new RuntimeException(e));
        }
    }
}
