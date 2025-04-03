package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fanb extends fanj {
    private final boolean a;

    public fanb(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fanj
    protected final int a() {
        return c((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fanj fanjVar = (fanj) obj;
        if (a() != fanjVar.a()) {
            return a() - fanjVar.a();
        }
        return (true != this.a ? 20 : 21) - (true == ((fanb) fanjVar).a ? 21 : 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((fanb) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
