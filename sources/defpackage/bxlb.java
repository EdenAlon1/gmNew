package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxlb extends duak {
    public bxlb() {
        super("restore_workflow_executions");
    }

    public final void a(Optional optional) {
        String[] strArr = bxle.a;
        bxld bxldVar = new bxld();
        bxldVar.b(optional);
        aj(new bxlc(bxldVar), "restore_workflow_executions-buildAndUpdateForSessionId");
    }

    @Override // defpackage.duak
    public final /* bridge */ /* synthetic */ duaj b() {
        ah();
        return new bxla(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(akci akciVar) {
        if (akciVar == null) {
            this.a.putNull("status");
        } else {
            this.a.put("status", Integer.valueOf(akciVar.q));
        }
    }

    public final void d(Instant instant) {
        int intValue = bxle.c().intValue();
        int intValue2 = bxle.c().intValue();
        if (intValue2 < 60220) {
            dtub.w("status_timestamp", intValue2);
        }
        if (intValue >= 60220) {
            if (instant == null) {
                this.a.putNull("status_timestamp");
            } else {
                this.a.put("status_timestamp", Long.valueOf(bdgw.a(instant)));
            }
        }
    }
}
