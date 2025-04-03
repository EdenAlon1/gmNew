package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qqt implements Cloneable {
    public rji a = rjf.b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qqt clone() {
        try {
            return (qqt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof qqt) {
            return rkh.l(this.a, ((qqt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        rji rjiVar = this.a;
        if (rjiVar != null) {
            return rjiVar.hashCode();
        }
        return 0;
    }
}
