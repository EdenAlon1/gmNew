package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbbk extends fbbl {
    private final Object a;

    public fbbk(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.fbbl
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fbbk) {
            return emxb.a(this.a, ((fbbk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Produced[" + this.a + "]";
    }
}
