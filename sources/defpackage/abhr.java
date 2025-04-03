package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhr implements dmfn {
    public final List a;
    private final boolean b = true;
    private final ffix c;

    public abhr(List list, ffix ffixVar) {
        this.a = list;
        this.c = ffixVar;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new abhr(this.a, ffixVar);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.c;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abhr)) {
            return false;
        }
        abhr abhrVar = (abhr) obj;
        if (!ffkj.e(this.a, abhrVar.a)) {
            return false;
        }
        boolean z = abhrVar.b;
        return ffkj.e(this.c, abhrVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionsSummaryUiData(reactions=" + this.a + ", includeScrim=true, onDismiss=" + this.c + ")";
    }
}
