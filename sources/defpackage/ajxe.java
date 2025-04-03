package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajxe implements ffji {
    final /* synthetic */ ajyr a;

    public ajxe(ajyr ajyrVar) {
        this.a = ajyrVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        bxlb bxlbVar = (bxlb) obj;
        bxlbVar.getClass();
        Instant f = this.a.d.f();
        if (f == null) {
            bxlbVar.a.putNull("finish_time");
            return bxlbVar;
        }
        bxlbVar.a.put("finish_time", Long.valueOf(bdgw.a(f)));
        return bxlbVar;
    }
}
