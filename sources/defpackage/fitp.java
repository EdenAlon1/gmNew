package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fitp extends firl implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final firn b;

    private fitp(firn firnVar) {
        this.b = firnVar;
    }

    public static synchronized fitp h(firn firnVar) {
        fitp fitpVar;
        synchronized (fitp.class) {
            HashMap hashMap = a;
            if (hashMap == null) {
                a = new HashMap(7);
                fitpVar = null;
            } else {
                fitpVar = (fitp) hashMap.get(firnVar);
            }
            if (fitpVar != null) {
                return fitpVar;
            }
            fitp fitpVar2 = new fitp(firnVar);
            a.put(firnVar, fitpVar2);
            return fitpVar2;
        }
    }

    private final UnsupportedOperationException i() {
        return new UnsupportedOperationException(this.b.m.concat(" field is unsupported"));
    }

    private Object readResolve() {
        return h(this.b);
    }

    @Override // defpackage.firl
    public final long a(long j, int i) {
        throw i();
    }

    @Override // defpackage.firl
    public final long b(long j, long j2) {
        throw i();
    }

    @Override // defpackage.firl
    public final long c() {
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // defpackage.firl
    public final firn d() {
        return this.b;
    }

    @Override // defpackage.firl
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fitp)) {
            return false;
        }
        fitp fitpVar = (fitp) obj;
        fitpVar.g();
        return fitpVar.g().equals(g());
    }

    @Override // defpackage.firl
    public final boolean f() {
        return false;
    }

    public final String g() {
        return this.b.m;
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return "UnsupportedDurationField[" + g() + "]";
    }
}
