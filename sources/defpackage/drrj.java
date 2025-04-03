package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drrj {
    public final drje a;
    public final ImageView.ScaleType b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public drrj() {
        this((drje) null, (ImageView.ScaleType) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drrj)) {
            return false;
        }
        drrj drrjVar = (drrj) obj;
        return ffkj.e(this.a, drrjVar.a) && this.b == drrjVar.b && this.c == drrjVar.c;
    }

    public final int hashCode() {
        drje drjeVar = this.a;
        int hashCode = drjeVar == null ? 0 : drjeVar.hashCode();
        ImageView.ScaleType scaleType = this.b;
        return (((hashCode * 31) + (scaleType != null ? scaleType.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "MediaViewHolderConfiguration(aspectRatio=" + this.a + ", scaleType=" + this.b + ", getCoordinatesOnLongPress=" + this.c + ")";
    }

    public drrj(drje drjeVar, ImageView.ScaleType scaleType, boolean z) {
        this.a = drjeVar;
        this.b = scaleType;
        this.c = z;
    }

    public /* synthetic */ drrj(drje drjeVar, ImageView.ScaleType scaleType, int i) {
        this(1 == (i & 1) ? null : drjeVar, (i & 2) != 0 ? ImageView.ScaleType.CENTER_CROP : scaleType, false);
    }
}
