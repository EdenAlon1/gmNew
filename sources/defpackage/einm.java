package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einm extends eilq {
    static final emwd a = new eima();
    private final Context b;

    public einm(Context context) {
        this.b = context;
    }

    @Override // defpackage.eilq
    public final void b(clst clstVar, eicw eicwVar) {
        eydq eydqVar = clstVar.c;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        eicwVar.d(eydqVar.c);
    }

    @Override // defpackage.eilq
    public final void c(eicw eicwVar) {
        Intent intent = new Intent(this.b, getClass());
        ClipData clipData = eepf.a;
        PendingIntent g = eepf.g(this.b, intent);
        g.getClass();
        eicwVar.c(g);
    }
}
