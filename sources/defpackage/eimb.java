package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eimb extends eilc {
    static final emwd a = new einh();
    private final Context b;

    public eimb(Context context) {
        this.b = context;
    }

    @Override // defpackage.eilc
    public final void b(clny clnyVar, eiad eiadVar) {
        clqs clqsVar = clnyVar.d;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        eiadVar.b(clqsVar.c);
    }

    @Override // defpackage.eilc
    public final void c(clny clnyVar, eiad eiadVar) {
        eydq eydqVar = clnyVar.c;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        eiadVar.e(eydqVar.c);
    }

    @Override // defpackage.eilc
    public final void d(eiad eiadVar) {
        Intent intent = new Intent(this.b, getClass());
        ClipData clipData = eepf.a;
        PendingIntent g = eepf.g(this.b, intent);
        g.getClass();
        eiadVar.c(g);
    }
}
