package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtr {
    private final dvrl a;

    public dvtr(dvrl dvrlVar) {
        this.a = dvrlVar;
    }

    public final View a(eg egVar, ewab ewabVar) {
        int i = ewabVar.c;
        int a = ewaa.a(i);
        if (a == 0) {
            throw null;
        }
        int i2 = a - 1;
        if (i2 == 0) {
            return this.a.a(egVar, null, i == 1 ? (String) ewabVar.d : "");
        }
        if (i2 == 1) {
            return this.a.b(egVar, null, i == 8 ? (String) ewabVar.d : "");
        }
        if (i2 != 2) {
            return null;
        }
        dvrl dvrlVar = this.a;
        if (i == 9) {
            ((Integer) ewabVar.d).intValue();
        }
        return dvrlVar.d(egVar);
    }
}
