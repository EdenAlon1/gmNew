package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfr implements iwy {
    public final int a;
    public Float b = null;
    public Float c = null;
    public jjk d = null;
    public jjk e = null;
    private final List f;

    public jfr(int i, List list) {
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.iwy
    public final boolean A() {
        return this.f.contains(this);
    }
}
