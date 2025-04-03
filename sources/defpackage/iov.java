package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iov implements ipo {
    final /* synthetic */ ipa a;
    final /* synthetic */ int b;
    final /* synthetic */ ipo c;
    private final /* synthetic */ ipo d;

    public iov(ipo ipoVar, ipa ipaVar, int i, ipo ipoVar2) {
        this.a = ipaVar;
        this.b = i;
        this.c = ipoVar2;
        this.d = ipoVar;
    }

    @Override // defpackage.ipo
    public final int j() {
        return this.d.j();
    }

    @Override // defpackage.ipo
    public final int k() {
        return this.d.k();
    }

    @Override // defpackage.ipo
    public final Map m() {
        return this.d.m();
    }

    @Override // defpackage.ipo
    public final ffji n() {
        return this.d.n();
    }

    @Override // defpackage.ipo
    public final void o() {
        this.a.d = this.b;
        this.c.o();
        ipa ipaVar = this.a;
        ipaVar.h(ipaVar.d);
    }
}
