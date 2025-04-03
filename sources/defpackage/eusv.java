package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eusv extends euth {
    private final String a;
    private final List b;

    public eusv(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.euth
    public final String a() {
        return this.a;
    }

    @Override // defpackage.euth
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euth) {
            euth euthVar = (euth) obj;
            if (this.a.equals(euthVar.a()) && this.b.equals(euthVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b.toString() + "}";
    }
}
