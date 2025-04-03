package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ios implements ipo {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ ffji d;
    final /* synthetic */ iot e;
    final /* synthetic */ ipa f;
    final /* synthetic */ ffji g;

    public ios(int i, int i2, Map map, ffji ffjiVar, iot iotVar, ipa ipaVar, ffji ffjiVar2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = ffjiVar;
        this.e = iotVar;
        this.f = ipaVar;
        this.g = ffjiVar2;
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
        iuw iuwVar;
        if (!this.e.eu() || (iuwVar = ((ito) this.f.a.y()).g) == null) {
            this.g.invoke(this.f.a.y().l);
        } else {
            this.g.invoke(iuwVar.l);
        }
    }
}
