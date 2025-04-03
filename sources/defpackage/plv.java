package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plv extends ffkk implements ffix {
    public static final plv a = new plv();

    public plv() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = plx.class.getClassLoader();
            plu pluVar = classLoader != null ? new plu(classLoader, new pgp(classLoader)) : null;
            if (pluVar == null || (a2 = pluVar.a()) == null) {
                return null;
            }
            classLoader.getClass();
            pgp pgpVar = new pgp(classLoader);
            int i = pgq.a;
            int a3 = pgq.a();
            return a3 >= 9 ? new pmp(a2, pgpVar) : a3 >= 6 ? new pmo(a2, pgpVar) : a3 >= 2 ? new pmn(a2, pgpVar) : a3 == 1 ? new pmm(a2, pgpVar) : new pmk();
        } catch (Throwable unused) {
            ffbz ffbzVar = plw.a;
            return null;
        }
    }
}
