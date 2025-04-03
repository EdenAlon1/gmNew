package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqja implements cqjb {
    private final Set a;
    private final int b;
    private final UUID c;
    private final UUID d;

    public cqja(Set set, int i, UUID uuid, UUID uuid2) {
        uuid2.getClass();
        this.a = set;
        this.b = i;
        this.c = uuid;
        this.d = uuid2;
    }

    @Override // defpackage.cqjb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cqjb
    public final cqai b(cqaj cqajVar) {
        Context context = (Context) cqajVar.a.b();
        context.getClass();
        albq albqVar = (albq) cqajVar.b.b();
        albqVar.getClass();
        akzt akztVar = (akzt) cqajVar.c.b();
        akztVar.getClass();
        ((akzt) cqajVar.d.b()).getClass();
        cqak cqakVar = (cqak) cqajVar.l.b();
        cqakVar.getClass();
        coxk coxkVar = (coxk) cqajVar.e.b();
        coxkVar.getClass();
        ((asnz) cqajVar.f.b()).getClass();
        ((asny) cqajVar.h.b()).getClass();
        asoa asoaVar = (asoa) cqajVar.i.b();
        asoaVar.getClass();
        auxc auxcVar = (auxc) cqajVar.j.b();
        auxcVar.getClass();
        return new cqai(context, albqVar, akztVar, cqakVar, coxkVar, cqajVar.g, asoaVar, auxcVar, cqajVar.k, this.a);
    }

    @Override // defpackage.cqjb
    public final UUID c() {
        return this.d;
    }

    @Override // defpackage.cqjb
    public final UUID d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqja)) {
            return false;
        }
        cqja cqjaVar = (cqja) obj;
        return ffkj.e(this.a, cqjaVar.a) && this.b == cqjaVar.b && ffkj.e(this.c, cqjaVar.c) && ffkj.e(this.d, cqjaVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "UriBasedSyncBatch(messageUris=" + this.a + ", targetMessagesToUpdate=" + this.b + ", syncId=" + this.c + ", batchId=" + this.d + ")";
    }
}
