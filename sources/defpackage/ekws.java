package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekws implements Serializable, ekyu {
    private static final long serialVersionUID = -5526853588017907499L;

    @Override // defpackage.ekyu
    public final int a() {
        return 1500;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ekyu.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekyu)) {
            return false;
        }
        ((ekyu) obj).a();
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 1335632595;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.apps.tiktok.tracing.MaxSpansPerTrace(1500)";
    }
}
