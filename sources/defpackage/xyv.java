package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyv implements xyg {
    private final xyt a;
    private final xyu b;
    private final xyo c;
    private final xyn d;
    private final xza e;
    private final xyk f;

    public xyv(xyt xytVar, xyu xyuVar, xyo xyoVar, xyn xynVar, xza xzaVar, xyk xykVar) {
        this.a = xytVar;
        this.b = xyuVar;
        this.c = xyoVar;
        this.d = xynVar;
        this.e = xzaVar;
        this.f = xykVar;
    }

    @Override // defpackage.xyg
    public final Object a(xho xhoVar, xyj xyjVar, String str, ffgu ffguVar) {
        xyg xygVar;
        doxs doxsVar = xhoVar.a;
        if (!(doxsVar instanceof drlj)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        drlj drljVar = (drlj) doxsVar;
        if (drljVar instanceof drni) {
            xygVar = this.a;
        } else if (drljVar instanceof drnl) {
            xygVar = this.b;
        } else if (drljVar instanceof drng) {
            xygVar = this.c;
        } else if (drljVar instanceof drcr) {
            xygVar = this.d;
        } else if (drljVar instanceof dsci) {
            xygVar = this.e;
        } else {
            if (!(drljVar instanceof dqzc)) {
                Objects.toString(drljVar);
                throw new UnsupportedOperationException("Unsupported media: ".concat(drljVar.toString()));
            }
            xygVar = this.f;
        }
        return xygVar.a(xhoVar, xyjVar, str, ffguVar);
    }
}
