package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxl implements qxq {
    int a;
    public Class b;
    private final qxm c;

    public qxl(qxm qxmVar) {
        this.c = qxmVar;
    }

    @Override // defpackage.qxq
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qxl) {
            qxl qxlVar = (qxl) obj;
            if (this.a == qxlVar.a && this.b == qxlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.a + "array=" + String.valueOf(this.b) + "}";
    }
}
