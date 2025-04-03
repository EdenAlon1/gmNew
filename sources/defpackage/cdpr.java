package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpr extends Exception {
    public final cdps a;
    public final Integer b;

    public cdpr(cdps cdpsVar) {
        super(cdpsVar.i);
        this.a = cdpsVar;
        this.b = null;
    }

    public cdpr(cdps cdpsVar, int i) {
        super(cdpsVar.i);
        this.b = Integer.valueOf(i);
        this.a = cdpsVar;
    }
}
