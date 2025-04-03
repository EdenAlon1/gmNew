package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enet extends engy {
    public static final enet a = new enet();
    private static final long serialVersionUID = 0;

    private enet() {
        super(enoz.a, 0);
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.enhz, defpackage.encm, defpackage.ennd
    public final /* synthetic */ Map w() {
        return this.map;
    }
}
