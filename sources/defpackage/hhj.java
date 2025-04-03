package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhj {
    public static final hhh a(ffhd ffhdVar) {
        hhh hhhVar = (hhh) ffhdVar.get(hhh.e);
        if (hhhVar != null) {
            return hhhVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(ffji ffjiVar, ffgu ffguVar) {
        return a(ffguVar.u()).a(new hhi(ffjiVar), ffguVar);
    }

    public static final Object c(ffji ffjiVar, ffgu ffguVar) {
        return a(ffguVar.u()).a(ffjiVar, ffguVar);
    }
}
