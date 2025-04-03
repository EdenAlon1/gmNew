package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enio implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public enio(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return enip.p(this.a);
    }
}
