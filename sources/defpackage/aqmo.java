package defpackage;

import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqmo {
    public final bont a;

    public aqmo(bont bontVar) {
        this.a = bontVar;
    }

    public final AgentUseCase a() {
        return this.a.f();
    }

    public final String b() {
        return this.a.i();
    }

    public final String c() {
        return this.a.g();
    }

    public final String d() {
        return this.a.j();
    }

    public final String e() {
        return this.a.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ffkj.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ffkj.e(this.a, ((aqmo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
