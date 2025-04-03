package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtqr extends dtzs {
    public final String a;

    public dtqr(dtzj dtzjVar, String str) {
        super(dtzjVar);
        this.a = str;
    }

    @Override // defpackage.dtzj
    public final String ag(dtzu dtzuVar) {
        return "(" + this.b.ag(dtzuVar) + ") AS " + this.a;
    }

    @Override // defpackage.dtzj
    public final String ah(dtzu dtzuVar, List list) {
        return "(" + this.b.ah(dtzuVar, list) + ") AS " + this.a;
    }
}
