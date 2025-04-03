package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exot extends expg {
    private final Optional a;
    private final Optional b;
    private final List c;
    private final long d;

    public exot(Optional optional, Optional optional2, List list, long j) {
        if (optional == null) {
            throw new NullPointerException("Null confidenceMasks");
        }
        this.a = optional;
        this.b = optional2;
        if (list == null) {
            throw new NullPointerException("Null qualityScores");
        }
        this.c = list;
        this.d = j;
    }

    @Override // defpackage.expg
    public final long a() {
        return this.d;
    }

    @Override // defpackage.expg
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.expg
    public final Optional c() {
        return this.a;
    }

    @Override // defpackage.expg
    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof expg) {
            expg expgVar = (expg) obj;
            if (this.a.equals(expgVar.c()) && this.b.equals(expgVar.b()) && this.c.equals(expgVar.d()) && this.d == expgVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        List list = this.c;
        Optional optional = this.b;
        return "ImageSegmenterResult{confidenceMasks=" + this.a.toString() + ", categoryMask=" + optional.toString() + ", qualityScores=" + list.toString() + ", timestampMs=" + this.d + "}";
    }
}
