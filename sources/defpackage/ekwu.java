package defpackage;

import android.util.SparseArray;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekwu extends eldu {
    public final String a;
    public final UUID b;
    public final eldq c;
    public final SparseArray d;
    public final int e;

    public ekwu(String str, UUID uuid, eldq eldqVar, SparseArray sparseArray, int i) {
        this.a = str;
        this.b = uuid;
        this.c = eldqVar;
        this.d = sparseArray;
        this.e = i;
    }

    @Override // defpackage.eldu
    public final int a() {
        return this.e;
    }

    @Override // defpackage.eldu
    public final SparseArray b() {
        return this.d;
    }

    @Override // defpackage.eldu
    public final eldq c() {
        return this.c;
    }

    @Override // defpackage.eldu
    public final String d() {
        return this.a;
    }

    @Override // defpackage.eldu
    public final UUID e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eldu) {
            eldu elduVar = (eldu) obj;
            if (this.a.equals(elduVar.d()) && this.b.equals(elduVar.e()) && this.c.equals(elduVar.c()) && this.d.equals(elduVar.b()) && this.e == elduVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        SparseArray sparseArray = this.d;
        eldq eldqVar = this.c;
        return "TraceSnapshot{name=" + this.a + ", rootTraceId=" + this.b.toString() + ", record=" + eldqVar.toString() + ", spanExtrasSparseArray=" + sparseArray.toString() + ", numUnfinishedSpans=" + this.e + "}";
    }
}
