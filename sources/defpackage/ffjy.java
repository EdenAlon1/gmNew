package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffjy implements Serializable {
    public static final ffjy a = new ffjy();

    private ffjy() {
    }

    private Object readResolve() {
        return a;
    }
}
