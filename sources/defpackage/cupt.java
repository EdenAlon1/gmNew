package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupt implements cskg {
    public final ffbr a;
    private final ffsk b;

    public cupt(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffskVar;
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        cfup cfupVar = cubs.a;
        if (((Boolean) ((cfup) cubs.L.get()).e()).booleanValue()) {
            if (i >= 60 || (i >= 5 && i < 16)) {
                axol.m(this.b, new cups(this, null));
            }
        }
    }
}
