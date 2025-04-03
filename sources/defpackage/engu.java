package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class engu implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public engu(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return engw.p(this.a);
    }
}
