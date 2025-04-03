package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrk {
    public static void a(iy iyVar) {
        int i = efuu.a()[iyVar.getIntent().getIntExtra("com.google.profile.photopicker.THEME_OVERRIDE", 0)];
        je l = iyVar.l();
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 1) {
                l.m(1);
                l.p();
            } else {
                if (i2 != 2) {
                    return;
                }
                l.m(2);
                l.p();
            }
        }
    }
}
