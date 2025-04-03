package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhz {
    public final fhii a;
    public final fhey b;
    public final fhid c;
    public fhil d;
    public fhim e;
    public int f;
    public int g;
    public int h;
    public fhhf i;

    public fhhz(fhii fhiiVar, fhey fheyVar, fhid fhidVar) {
        this.a = fhiiVar;
        this.b = fheyVar;
        this.c = fhidVar;
    }

    public final void a(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof fhku) && ((fhku) iOException).a == 8) {
            this.f++;
        } else if (iOException instanceof fhji) {
            this.g++;
        } else {
            this.h++;
        }
    }

    public final boolean b(fhgk fhgkVar) {
        fhgk fhgkVar2 = this.b.i;
        return fhgkVar.d == fhgkVar2.d && ffkj.e(fhgkVar.c, fhgkVar2.c);
    }
}
