package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiky extends eikz {
    static final emwd a = new eima();
    static final emwd b = new einh();
    private final Context c;

    public eiky(Context context) {
        this.c = context;
    }

    @Override // defpackage.eikz
    public final void a(clni clniVar, ehxt ehxtVar) {
        eydq eydqVar = clniVar.c;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        ehxtVar.d(eydqVar.c);
    }

    @Override // defpackage.eikz
    public final void b(clni clniVar, ehxt ehxtVar) {
        if (clniVar.e.isEmpty()) {
            throw new IllegalArgumentException("user required in request");
        }
        ehxtVar.e((RcsDestinationId) b.fP((clqv) clniVar.e.get(0)));
    }

    @Override // defpackage.eikz
    public final void c(ehxt ehxtVar) {
        Intent intent = new Intent(this.c, getClass());
        ClipData clipData = eepf.a;
        PendingIntent g = eepf.g(this.c, intent);
        g.getClass();
        ehxtVar.c(g);
    }
}
