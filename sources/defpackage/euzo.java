package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euzo extends evaf {
    private final String a;
    private final evae b;

    public euzo(String str, evae evaeVar) {
        this.a = str;
        this.b = evaeVar;
    }

    @Override // defpackage.evaf
    public final evae a() {
        return this.b;
    }

    @Override // defpackage.evaf
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evaf) {
            evaf evafVar = (evaf) obj;
            if (this.a.equals(evafVar.b())) {
                evafVar.c();
                evae evaeVar = this.b;
                if (evaeVar != null ? evaeVar.equals(evafVar.a()) : evafVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        evae evaeVar = this.b;
        return (hashCode * (-721379959)) ^ (evaeVar == null ? 0 : evaeVar.hashCode());
    }

    public final String toString() {
        return "GrpcMethodConfig{service=" + this.a + ", method=null, grpcRetryConfig=" + String.valueOf(this.b) + "}";
    }

    @Override // defpackage.evaf
    public final void c() {
    }
}
