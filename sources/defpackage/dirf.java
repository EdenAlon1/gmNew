package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirf extends diso {
    private final int a;
    private final Optional b;
    private final enhk c;

    public dirf(int i, Optional optional, enhk enhkVar) {
        this.a = i;
        this.b = optional;
        if (enhkVar == null) {
            throw new NullPointerException("Null responseHeaders");
        }
        this.c = enhkVar;
    }

    @Override // defpackage.diso
    public final int a() {
        return this.a;
    }

    @Override // defpackage.diso
    public final enhk b() {
        return this.c;
    }

    @Override // defpackage.diso
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof diso) {
            diso disoVar = (diso) obj;
            if (this.a == disoVar.a() && this.b.equals(disoVar.c()) && this.c.equals(disoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        enhk enhkVar = this.c;
        return "HttpDownloadResponse{responseCode=" + this.a + ", inputStream=" + this.b.toString() + ", responseHeaders=" + enhkVar.toString() + "}";
    }
}
