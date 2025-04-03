package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxrp implements fbba {
    private final dxri a;
    private final fbbf b;
    private final fbbf c;

    public dxrp(dxri dxriVar, fbbf fbbfVar, fbbf fbbfVar2) {
        this.a = dxriVar;
        this.b = fbbfVar;
        this.c = fbbfVar2;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        Context b = ((dxqe) this.b).b();
        emxc emxcVar = (emxc) this.c.b();
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(b);
        efbrVar.f("mdd_pds_config");
        efbrVar.g(dxvb.d("LoggingState", emxcVar));
        Uri a = efbrVar.a();
        effz h = efga.h();
        h.f(a);
        h.e(dwtr.a);
        h.g(false);
        dxri dxriVar = this.a;
        efgj d = efgm.d(b, dxriVar.a);
        d.c = dxvw.d("gms_icing_mdd_network_usage_monitor", emxcVar);
        d.b();
        d.d(new dxum());
        h.h(d.a());
        return dxriVar.b.a(h.a());
    }
}
