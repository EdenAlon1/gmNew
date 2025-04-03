package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abet implements dmfn {
    public final List a;
    private final boolean b = true;
    private final ffix c;

    public abet(List list, ffix ffixVar) {
        this.a = list;
        this.c = ffixVar;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new abet(this.a, ffixVar);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.c;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abet)) {
            return false;
        }
        abet abetVar = (abet) obj;
        if (!ffkj.e(this.a, abetVar.a)) {
            return false;
        }
        boolean z = abetVar.b;
        return ffkj.e(this.c, abetVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ActiveComposersUiData(composers=" + this.a + ", includeScrim=true, onDismiss=" + this.c + ")";
    }
}
