package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itw implements ipo {
    private final /* synthetic */ ipo a;
    private final int b;
    private final int c;

    public itw(ipo ipoVar, itx itxVar) {
        this.a = ipoVar;
        iuw iuwVar = itxVar.h;
        iuwVar.getClass();
        this.b = iuwVar.a;
        iuwVar.getClass();
        this.c = iuwVar.b;
    }

    @Override // defpackage.ipo
    public final int j() {
        return this.c;
    }

    @Override // defpackage.ipo
    public final int k() {
        return this.b;
    }

    @Override // defpackage.ipo
    public final Map m() {
        return this.a.m();
    }

    @Override // defpackage.ipo
    public final ffji n() {
        return this.a.n();
    }

    @Override // defpackage.ipo
    public final void o() {
        this.a.o();
    }
}
