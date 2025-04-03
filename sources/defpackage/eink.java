package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eink extends eilo {
    static final emwd a = new einl();
    static final emwd b = new eimr();
    static final emwd c = new eind();
    static final emwd d = new eima();
    static final emwd e = new eine();
    private final Context f;

    public eink(Context context) {
        this.f = context;
    }

    @Override // defpackage.eilo
    public final void b(clsh clshVar, eico eicoVar) {
        eydq eydqVar = clshVar.c;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        eicoVar.g(eydqVar.c);
    }

    @Override // defpackage.eilo
    public final void c(eico eicoVar) {
        Intent intent = new Intent(this.f, getClass());
        ClipData clipData = eepf.a;
        PendingIntent g = eepf.g(this.f, intent);
        g.getClass();
        eicoVar.c(g);
    }
}
