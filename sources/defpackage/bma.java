package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bma extends blw {
    public bma(aob aobVar) {
        super(3, aobVar);
    }

    public final void d(avr avrVar) {
        bcd a = bce.a(avrVar.e());
        if (a != null && ((a.d() == bbz.LOCKED_FOCUSED || a.d() == bbz.PASSIVE_FOCUSED) && a.c() == bby.CONVERGED && a.e() == bca.CONVERGED)) {
            super.b(avrVar);
        } else {
            aob.a(avrVar);
        }
    }
}
