package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxrk implements fbba {
    private final dxri a;
    private final fbbf b;
    private final fbbf c;
    private final fbbf d;
    private final fbbf e;
    private final fbbf f;
    private final fbbf g;

    public dxrk(dxri dxriVar, fbbf fbbfVar, fbbf fbbfVar2, fbbf fbbfVar3, fbbf fbbfVar4, fbbf fbbfVar5, fbbf fbbfVar6) {
        this.a = dxriVar;
        this.b = fbbfVar;
        this.c = fbbfVar2;
        this.d = fbbfVar3;
        this.e = fbbfVar4;
        this.f = fbbfVar5;
        this.g = fbbfVar6;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        Context b = ((dxqe) this.b).b();
        Uri uri = (Uri) this.c.b();
        dxsy dxsyVar = (dxsy) this.e.b();
        dxnh b2 = ((dxni) this.f).b();
        emxc emxcVar = (emxc) this.g.b();
        effz h = efga.h();
        h.f(uri);
        h.e(dwua.a);
        h.g(false);
        dxri dxriVar = this.a;
        h.h(dxvs.b(b, dxriVar.a, dxsyVar, b2, emxcVar));
        return dxriVar.b.a(h.a());
    }
}
