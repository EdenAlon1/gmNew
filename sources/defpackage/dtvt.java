package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtvt extends duaw {
    private final dtzj a;

    public dtvt(dtzj dtzjVar) {
        this.a = dtzjVar;
    }

    @Override // defpackage.duaw
    public final void a(dtzu dtzuVar, StringBuilder sb, List list) {
        sb.append("(");
        sb.append(this.a.ah(dtzuVar, list));
        sb.append(")");
    }

    @Override // defpackage.duaw
    public final void b(dtzu dtzuVar, StringBuilder sb) {
        sb.append(this.a.ag(dtzuVar));
    }

    @Override // defpackage.duaw
    public final void e(dtse dtseVar) {
        this.a.ai(dtseVar);
    }
}
