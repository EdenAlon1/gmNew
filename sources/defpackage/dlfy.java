package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfy extends dlaf {
    public final enhk a;

    public dlfy(enhk enhkVar) {
        this.a = enhkVar;
    }

    public final rqk a() {
        Object obj = this.a.get("/internal/moirai_default/1");
        obj.getClass();
        return (rqk) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlfy) && ffkj.e(this.a, ((dlfy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
