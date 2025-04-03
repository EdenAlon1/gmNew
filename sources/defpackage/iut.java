package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iut implements ipo {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ ffji d;
    final /* synthetic */ ffji e;
    final /* synthetic */ iuv f;

    public iut(int i, int i2, Map map, ffji ffjiVar, ffji ffjiVar2, iuv iuvVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = ffjiVar;
        this.e = ffjiVar2;
        this.f = iuvVar;
    }

    @Override // defpackage.ipo
    public final int j() {
        return this.b;
    }

    @Override // defpackage.ipo
    public final int k() {
        return this.a;
    }

    @Override // defpackage.ipo
    public final Map m() {
        return this.c;
    }

    @Override // defpackage.ipo
    public final ffji n() {
        return this.d;
    }

    @Override // defpackage.ipo
    public final void o() {
        this.e.invoke(this.f.l);
    }
}
