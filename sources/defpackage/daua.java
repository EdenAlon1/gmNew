package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daua extends cslh {
    final /* synthetic */ int a;
    final /* synthetic */ csjd b;
    final /* synthetic */ dauv c;
    final /* synthetic */ int k;
    final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daua(dauv dauvVar, int i, int i2, int i3, csjd csjdVar) {
        super("Bugle.Async.DebugUtils.MessageFailure.Duration");
        this.k = i;
        this.l = i2;
        this.a = i3;
        this.b = csjdVar;
        this.c = dauvVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        ((cioy) this.c.M.b()).b((cins) this.c.e.b(), this.k, this.l, this.a, new ArrayList(), this.b).e(true);
        return null;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ((ddzb) this.c.Y.b()).l("Notification refreshed.");
    }
}
