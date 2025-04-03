package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class engm implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public engm(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new engn(this.a.clone());
    }
}
