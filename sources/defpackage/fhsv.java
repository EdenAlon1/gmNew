package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhsv extends fhsx {
    public final int a() {
        int b = b();
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(b);
        fhsx fhsxVar = this;
        int i = 1;
        while (numberOfLeadingZeros > 0) {
            fhsxVar = fhsxVar.m(i).d(fhsxVar);
            numberOfLeadingZeros--;
            i = b >>> numberOfLeadingZeros;
            if ((i & 1) != 0) {
                fhsxVar = fhsxVar.k().d(this);
            }
        }
        if (fhsxVar.o()) {
            return 0;
        }
        if (fhsxVar.n()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }
}
