package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exnk extends exnv {
    public final String a;
    public final exoa b;
    public final List c;
    public final List d;
    private final String e;
    private final String f;

    public exnk(String str, String str2, String str3, exoa exoaVar, List list, List list2) {
        this.e = str;
        this.f = str2;
        this.a = str3;
        this.b = exoaVar;
        this.c = list;
        this.d = list2;
    }

    @Override // defpackage.exnv
    public final exoa a() {
        return this.b;
    }

    @Override // defpackage.exnv
    public final String b() {
        return this.a;
    }

    @Override // defpackage.exnv
    public final String c() {
        return this.e;
    }

    @Override // defpackage.exnv
    public final String d() {
        return this.f;
    }

    @Override // defpackage.exnv
    public final List e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exnv) {
            exnv exnvVar = (exnv) obj;
            if (this.e.equals(exnvVar.c()) && this.f.equals(exnvVar.d()) && this.a.equals(exnvVar.b()) && this.b.equals(exnvVar.a()) && this.c.equals(exnvVar.e()) && this.d.equals(exnvVar.f())) {
                exnvVar.g();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.exnv
    public final List f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        List list = this.d;
        List list2 = this.c;
        return "TaskInfo{taskName=" + this.e + ", taskRunningModeName=" + this.f + ", taskGraphName=" + this.a + ", taskOptions=" + this.b.toString() + ", inputStreams=" + list2.toString() + ", outputStreams=" + list.toString() + ", enableFlowLimiting=false}";
    }

    @Override // defpackage.exnv
    public final void g() {
    }
}
