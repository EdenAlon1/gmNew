package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemj extends eemp {
    @Override // defpackage.eemm
    public final eeku b() {
        try {
            d(2111);
            this.a.h();
            eekq eekqVar = new eekq();
            this.a.a(4095);
            String str = this.a.e.a;
            if (str == null) {
                throw new IllegalArgumentException("The eventType must not be null");
            }
            eekqVar.a = str;
            super.c(eekqVar);
            this.a.h();
            this.a.a(10);
            return eekqVar;
        } catch (eeje e) {
            throw f(e.getMessage());
        }
    }
}
