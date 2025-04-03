package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznt extends dzqz {
    private long a;
    private engw b;
    private byte c;

    @Override // defpackage.dzqz
    public final dzra a() {
        engw engwVar;
        if (this.c == 1 && (engwVar = this.b) != null) {
            return new dznu(this.a, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" lastCapabilitiesReportTimeMs");
        }
        if (this.b == null) {
            sb.append(" lastReportedCapabilities");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzqz
    public final void b(long j) {
        this.a = j;
        this.c = (byte) 1;
    }

    @Override // defpackage.dzqz
    public final void c(List list) {
        this.b = engw.n(list);
    }
}
