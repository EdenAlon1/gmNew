package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipv implements ipn {
    private final ipu a;

    public ipv(ipu ipuVar) {
        this.a = ipuVar;
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        return this.a.a(inyVar, ivo.a(inyVar), i);
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        return this.a.b(inyVar, ivo.a(inyVar), i);
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        return this.a.c(inyVar, ivo.a(inyVar), i);
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        return this.a.d(inyVar, ivo.a(inyVar), i);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        return this.a.e(ipqVar, ivo.a(ipqVar), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipv) && ffkj.e(this.a, ((ipv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
