package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dila implements dkvu {
    public dkvg a = dkvg.UNKNOWN;

    @Override // defpackage.dkvu
    public final dkvg a(int i) {
        dkvg dkvgVar = this.a;
        emxf.b(!dkvg.UNKNOWN.equals(dkvgVar), "SipConnectionType is UNKNOWN.");
        return dkvgVar;
    }

    @Override // defpackage.dkvu
    public final boolean b(int i) {
        return dkvg.SINGLE_REG.equals(a(i));
    }
}
