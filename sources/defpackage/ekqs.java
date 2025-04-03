package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqs extends ekqy {
    public final String a;
    public final eyhs b;
    public final ekqn c;
    public final engw d;
    public final emxc e;
    public final emxc f;
    public final Executor g;
    private final emxc h;

    public ekqs(String str, emxc emxcVar, eyhs eyhsVar, ekqn ekqnVar, engw engwVar, emxc emxcVar2, emxc emxcVar3, Executor executor) {
        this.a = str;
        this.h = emxcVar;
        this.b = eyhsVar;
        this.c = ekqnVar;
        this.d = engwVar;
        this.e = emxcVar2;
        this.f = emxcVar3;
        this.g = executor;
    }

    @Override // defpackage.ekqy
    public final ekqn a() {
        return this.c;
    }

    @Override // defpackage.ekqy
    public final emxc b() {
        return this.e;
    }

    @Override // defpackage.ekqy
    public final emxc c() {
        return this.f;
    }

    @Override // defpackage.ekqy
    public final emxc d() {
        return this.h;
    }

    @Override // defpackage.ekqy
    public final engw e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Executor executor;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekqy) {
            ekqy ekqyVar = (ekqy) obj;
            ekqyVar.i();
            if (this.a.equals(ekqyVar.g()) && this.h.equals(ekqyVar.d()) && this.b.equals(ekqyVar.f()) && this.c.equals(ekqyVar.a()) && enkr.h(this.d, ekqyVar.e()) && this.e.equals(ekqyVar.b()) && this.f.equals(ekqyVar.c()) && ((executor = this.g) != null ? executor.equals(ekqyVar.h()) : ekqyVar.h() == null)) {
                ekqyVar.j();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ekqy
    public final eyhs f() {
        return this.b;
    }

    @Override // defpackage.ekqy
    public final String g() {
        return this.a;
    }

    @Override // defpackage.ekqy
    public final Executor h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() ^ 385623362) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Executor executor = this.g;
        return ((((hashCode * 1000003) ^ 2040732332) * 1000003) ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
    }

    public final String toString() {
        return "ProtoDataStoreConfig{blockingSafeReads=false, name=" + this.a + ", nameSuffix=Optional.absent(), schema=" + this.b.toString() + ", storage=" + this.c.toString() + ", migrations=" + String.valueOf(this.d) + ", handler=" + String.valueOf(this.e) + ", logger=Optional.absent(), ioExecutor=" + String.valueOf(this.g) + ", lamsConfig=null}";
    }

    @Override // defpackage.ekqy
    public final void i() {
    }

    @Override // defpackage.ekqy
    public final void j() {
    }
}
