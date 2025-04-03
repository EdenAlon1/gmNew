package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class csxo {
    public abstract Integer a();

    public abstract String b();

    public abstract String c();

    public abstract List d();

    public final Integer e() {
        List d = d();
        if (d != null) {
            return (Integer) d.get(1);
        }
        return null;
    }

    public final Integer f() {
        List d = d();
        if (d != null) {
            return (Integer) d.get(0);
        }
        return null;
    }
}
