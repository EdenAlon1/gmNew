package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqgc {
    private final ctbk a;
    private final errl b;

    public aqgc(ctbk ctbkVar, errl errlVar) {
        this.a = ctbkVar;
        this.b = errlVar;
    }

    public final aqgb a(aqge aqgeVar) {
        return aqgeVar instanceof aqgb ? (aqgb) aqgeVar : new aqgb(this.a, this.b, aqgeVar);
    }
}
