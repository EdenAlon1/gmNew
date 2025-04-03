package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwj {
    public static final hvh a(isw iswVar, int i) {
        hvh hvhVar = iswVar.C().t;
        if (hvhVar != null && (hvhVar.r & i) != 0) {
            while (hvhVar != null) {
                int i2 = hvhVar.q;
                if ((i2 & 2) != 0) {
                    return null;
                }
                if ((i2 & i) != 0) {
                    return hvhVar;
                }
                hvhVar = hvhVar.t;
            }
        }
        return null;
    }
}
