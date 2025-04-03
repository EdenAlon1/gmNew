package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eini extends eilm {
    static final emwd a = new eima();
    static final emwd b = new einh();
    private final Context c;

    public eini(Context context) {
        this.c = context;
    }

    @Override // defpackage.eilm
    public final void b(clrd clrdVar, eicd eicdVar) {
        eydq eydqVar = clrdVar.c;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        eicdVar.d(eydqVar.c);
    }

    @Override // defpackage.eilm
    public final void c(clrd clrdVar, eicd eicdVar) {
        if (clrdVar.e.isEmpty()) {
            throw new IllegalArgumentException("user required in request");
        }
        eicdVar.e((RcsDestinationId) b.fP((clqv) clrdVar.e.get(0)));
    }

    @Override // defpackage.eilm
    public final void d(eicd eicdVar) {
        Intent intent = new Intent(this.c, getClass());
        ClipData clipData = eepf.a;
        PendingIntent g = eepf.g(this.c, intent);
        g.getClass();
        eicdVar.c(g);
    }
}
