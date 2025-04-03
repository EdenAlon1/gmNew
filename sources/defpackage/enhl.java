package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enhl implements Serializable {
    private static final long serialVersionUID = 0;
    final enhk a;

    public enhl(enhk enhkVar) {
        this.a = enhkVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
