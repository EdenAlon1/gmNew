package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einn extends eilr {
    static final emwd a = new eima();
    private final Context b;

    public einn(Context context) {
        this.b = context;
    }

    @Override // defpackage.eilr
    public final void b(cltb cltbVar, eidb eidbVar) {
        eydq eydqVar = cltbVar.c;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        eidbVar.d(eydqVar.c);
    }

    @Override // defpackage.eilr
    public final void c(eidb eidbVar) {
        Intent intent = new Intent(this.b, getClass());
        ClipData clipData = eepf.a;
        PendingIntent g = eepf.g(this.b, intent);
        g.getClass();
        eidbVar.c(g);
    }
}
