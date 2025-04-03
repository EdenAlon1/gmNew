package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drje {
    public static final ffbz a = ffca.a(new ffix() { // from class: drjc
        @Override // defpackage.ffix
        public final Object invoke() {
            return new drje(1.0f);
        }
    });
    private final float b;

    public drje(float f) {
        this.b = f;
    }

    public final int a(int i) {
        return ffln.b(i / this.b);
    }

    public final int b(int i) {
        return ffln.b(i * this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drje) && Float.compare(this.b, ((drje) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "AspectRatio(value=" + this.b + ")";
    }

    public drje(int i, int i2) {
        this(i / i2);
    }
}
