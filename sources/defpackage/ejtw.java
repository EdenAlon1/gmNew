package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejtw extends ejvj {
    public final ListenableFuture a;
    public final Object b;
    public final emwl c;

    public ejtw(ListenableFuture listenableFuture, Object obj, emwl emwlVar) {
        this.a = listenableFuture;
        this.b = obj;
        this.c = emwlVar;
    }

    @Override // defpackage.ejvj
    public final emwl a() {
        return this.c;
    }

    @Override // defpackage.ejvj
    public final ListenableFuture b() {
        return this.a;
    }

    @Override // defpackage.ejvj
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        emwl emwlVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejvj) {
            ejvj ejvjVar = (ejvj) obj;
            if (this.a.equals(ejvjVar.b()) && this.b.equals(ejvjVar.c()) && ((emwlVar = this.c) != null ? emwlVar.equals(ejvjVar.a()) : ejvjVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        emwl emwlVar = this.c;
        return (hashCode * 1000003) ^ (emwlVar == null ? 0 : emwlVar.hashCode());
    }

    public final String toString() {
        emwl emwlVar = this.c;
        Object obj = this.b;
        return "Mutation{future=" + this.a.toString() + ", key=" + obj.toString() + ", localOptimisticTransform=" + String.valueOf(emwlVar) + "}";
    }
}
