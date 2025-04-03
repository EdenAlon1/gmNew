package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imz implements ipo {
    final /* synthetic */ ffji a;
    final /* synthetic */ ina b;
    private final int c;
    private final int d;
    private final Map e;
    private final ffji f;

    public imz(int i, int i2, Map map, ffji ffjiVar, ffji ffjiVar2, ina inaVar) {
        this.a = ffjiVar2;
        this.b = inaVar;
        this.c = i;
        this.d = i2;
        this.e = map;
        this.f = ffjiVar;
    }

    @Override // defpackage.ipo
    public final int j() {
        return this.d;
    }

    @Override // defpackage.ipo
    public final int k() {
        return this.c;
    }

    @Override // defpackage.ipo
    public final Map m() {
        return this.e;
    }

    @Override // defpackage.ipo
    public final ffji n() {
        return this.f;
    }

    @Override // defpackage.ipo
    public final void o() {
        this.a.invoke(this.b.a.l);
    }
}
