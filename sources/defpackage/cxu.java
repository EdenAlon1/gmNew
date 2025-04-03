package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxu {
    public static final czo a(ffji ffjiVar) {
        czn cznVar = new czn();
        ffjiVar.invoke(cznVar);
        return new czo(cznVar);
    }

    public static /* synthetic */ dac b(float f, float f2, Object obj, int i) {
        if (1 == (i & 1)) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new dac(f, f2, obj);
    }

    public static /* synthetic */ dbu c(int i, int i2, cym cymVar, int i3) {
        if ((i3 & 4) != 0) {
            cymVar = cyp.a;
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            i2 = 0;
        }
        if (1 == i5) {
            i = 300;
        }
        return new dbu(i, i2, cymVar);
    }

    public static /* synthetic */ cyz d(cyl cylVar, int i, long j, int i2) {
        if ((i2 & 4) != 0) {
            j = dag.b(0);
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return new cyz(cylVar, i, j);
    }
}
