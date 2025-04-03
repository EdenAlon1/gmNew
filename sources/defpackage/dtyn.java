package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtyn extends dtzs {
    public dtyn(dtzj dtzjVar) {
        super(dtzjVar);
    }

    @Override // defpackage.dtzj
    public final String ag(dtzu dtzuVar) {
        return "(SELECT NOT EXISTS " + this.b.ag(dtzuVar) + ")";
    }

    @Override // defpackage.dtzj
    public final String ah(dtzu dtzuVar, List list) {
        return "(SELECT NOT EXISTS " + this.b.ah(null, list) + ")";
    }
}
