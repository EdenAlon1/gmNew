package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekrd extends ekrh {
    public final long a;
    public final long b;
    public final Map c;
    public final boolean d;

    public ekrd(long j, long j2, Map map, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = map;
        this.d = z;
    }

    @Override // defpackage.ekrh
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ekrh
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ekrh
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.ekrh
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekrh) {
            ekrh ekrhVar = (ekrh) obj;
            if (this.a == ekrhVar.a() && this.b == ekrhVar.b() && ennc.m(this.c, ekrhVar.c()) && this.d == ekrhVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "SyncConfig{minSyncInterval=" + this.a + ", timeout=" + this.b + ", constraints=" + ennc.g(this.c) + ", allowMultiprocess=" + this.d + "}";
    }
}
