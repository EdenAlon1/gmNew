package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elkg extends elks {
    public final eldq a;
    public final SparseArray b;
    public final eyev c;

    public elkg(eldq eldqVar, SparseArray sparseArray, eyev eyevVar) {
        this.a = eldqVar;
        this.b = sparseArray;
        this.c = eyevVar;
    }

    @Override // defpackage.elks
    public final SparseArray a() {
        return this.b;
    }

    @Override // defpackage.elks
    public final eldq b() {
        return this.a;
    }

    @Override // defpackage.elks
    public final eyev c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elks) {
            elks elksVar = (elks) obj;
            if (this.a.equals(elksVar.b()) && this.b.equals(elksVar.a())) {
                elksVar.d();
                if (this.c.equals(elksVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eyev eyevVar = this.c;
        SparseArray sparseArray = this.b;
        return "TraceRecordWithMetadata{traceRecord=" + this.a.toString() + ", spanExtras=" + sparseArray.toString() + ", isPartialTrace=false, timeSinceBoot=" + eyevVar.toString() + "}";
    }

    @Override // defpackage.elks
    public final void d() {
    }
}
