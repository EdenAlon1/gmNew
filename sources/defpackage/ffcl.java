package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcl implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public ffcl(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffcl)) {
            return false;
        }
        ffcl ffclVar = (ffcl) obj;
        return ffkj.e(this.a, ffclVar.a) && ffkj.e(this.b, ffclVar.b) && ffkj.e(this.c, ffclVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
        int i = hashCode * 31;
        Object obj3 = this.c;
        return ((i + hashCode2) * 31) + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }
}
