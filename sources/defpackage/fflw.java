package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fflw implements Serializable {
    public static final fflw a = new fflw();
    private static final long serialVersionUID = 0;

    private fflw() {
    }

    private final Object readResolve() {
        return ffly.a;
    }
}
