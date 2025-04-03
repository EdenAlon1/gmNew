package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwg extends emwj implements Serializable {
    public static final emwg a = new emwg();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.emwj
    protected final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.emwj
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
