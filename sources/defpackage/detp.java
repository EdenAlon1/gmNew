package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class detp extends dets {
    private final Integer a;

    public detp(Integer num) {
        this.a = num;
    }

    @Override // defpackage.dets
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dets)) {
            return false;
        }
        dets detsVar = (dets) obj;
        Integer num = this.a;
        return num == null ? detsVar.a() == null : num.equals(detsVar.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
