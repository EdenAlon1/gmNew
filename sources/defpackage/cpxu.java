package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpxu implements Comparable {
    private final Optional a;

    public cpxu() {
        this.a = Optional.empty();
    }

    @Deprecated
    public static cpxu b(long j) {
        return j == -1 ? new cpxu() : new cpxu(j);
    }

    public final long a() {
        return ((Long) this.a.get()).longValue();
    }

    public final boolean c() {
        return !d();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cpxu cpxuVar = (cpxu) obj;
        if (this.a.isPresent() && cpxuVar.a.isPresent()) {
            return ((Long) this.a.get()).compareTo((Long) cpxuVar.a.get());
        }
        if (this.a.isPresent() == cpxuVar.a.isPresent()) {
            return 0;
        }
        return !this.a.isPresent() ? -1 : 1;
    }

    public final boolean d() {
        return this.a.isEmpty() || ((Long) this.a.get()).longValue() < 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof cpxu)) {
            return this.a.equals(((cpxu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "threadId=".concat(this.a.toString());
    }

    public cpxu(long j) {
        this.a = Optional.of(Long.valueOf(j));
    }
}
