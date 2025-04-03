package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkw extends evkt {
    public final evmu a = new evmu(evmu.a, false);

    public final evkw d(String str) {
        return (evkw) this.a.get(str);
    }

    public final void e(String str, evkt evktVar) {
        this.a.put(str, evktVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof evkw) && ((evkw) obj).a.equals(this.a);
        }
        return true;
    }

    public final void f(String str, String str2) {
        e(str, str2 == null ? evkv.a : new evkz(str2));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
