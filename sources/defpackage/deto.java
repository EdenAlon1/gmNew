package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deto extends detr {
    public final Object a;
    private final dets b;

    public deto(Object obj, dets detsVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        this.b = detsVar;
    }

    @Override // defpackage.detr
    public final dets a() {
        return this.b;
    }

    @Override // defpackage.detr
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof detr) {
            detr detrVar = (detr) obj;
            detrVar.c();
            if (this.a.equals(detrVar.b())) {
                detrVar.e();
                if (this.b.equals(detrVar.a())) {
                    detrVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ 1) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a.toString() + ", priority=DEFAULT, productData=" + this.b.toString() + ", eventContext=null}";
    }

    @Override // defpackage.detr
    public final void c() {
    }

    @Override // defpackage.detr
    public final void d() {
    }

    @Override // defpackage.detr
    public final void e() {
    }
}
