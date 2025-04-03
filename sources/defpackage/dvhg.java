package defpackage;

import android.util.SparseArray;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhg implements dvgl {
    private static final SparseArray a;
    private final dlpw b;
    private final dvdy c;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(1, faus.SUNDAY);
        sparseArray.put(2, faus.MONDAY);
        sparseArray.put(3, faus.TUESDAY);
        sparseArray.put(4, faus.WEDNESDAY);
        sparseArray.put(5, faus.THURSDAY);
        sparseArray.put(6, faus.FRIDAY);
        sparseArray.put(7, faus.SATURDAY);
    }

    public dvhg(dlpw dlpwVar, dvdy dvdyVar) {
        this.b = dlpwVar;
        this.c = dvdyVar;
    }

    private static int c(fava favaVar) {
        return d(favaVar.b, favaVar.c);
    }

    private static int d(int i, int i2) {
        return (i * 60) + i2;
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.TIME_CONSTRAINT;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        dvgn dvgnVar = (dvgn) obj2;
        eygr<evzw> eygrVar = ((ewag) obj).h;
        if (!eygrVar.isEmpty()) {
            dlpw dlpwVar = this.b;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(dlpwVar.f().toEpochMilli());
            faus fausVar = (faus) a.get(calendar.get(7));
            int d = d(calendar.get(11), calendar.get(12));
            for (evzw evzwVar : eygrVar) {
                fava favaVar = evzwVar.d;
                if (favaVar == null) {
                    favaVar = fava.a;
                }
                int c = c(favaVar);
                fava favaVar2 = evzwVar.e;
                if (favaVar2 == null) {
                    favaVar2 = fava.a;
                }
                int c2 = c(favaVar2);
                if (!new eygk(evzwVar.f, evzw.a).contains(fausVar) || d < c || d > c2) {
                }
            }
            this.c.c(dvgnVar.a(), "No condition matched. Condition list: %s", eygrVar);
            return false;
        }
        return true;
    }
}
