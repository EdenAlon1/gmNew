package defpackage;

import com.google.android.odml.image.ImageProperties;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehum extends ehul {
    private volatile transient int c;
    private volatile transient boolean d;

    public ehum(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.ehul
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehum) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof ImageProperties)) {
                return false;
            }
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.a != imageProperties.a() || this.b != imageProperties.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ehul
    public final int hashCode() {
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    this.c = ((this.a ^ 1000003) * 1000003) ^ this.b;
                    this.d = true;
                }
            }
        }
        return this.c;
    }
}
