package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgr implements dvgl {
    private final Context a;
    private final dvdy b;

    public dvgr(Context context, dvdy dvdyVar) {
        this.a = context;
        this.b = dvdyVar;
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.BATTERY;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        emxc j;
        dvgn dvgnVar = (dvgn) obj2;
        int i = ((ewag) obj).d;
        if (i < 0 || i > 100) {
            this.b.d(dvgnVar.a(), "Min battery percentage is not between 0 and 100", new Object[0]);
            return false;
        }
        if (i == 0) {
            return true;
        }
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            j = emux.a;
        } else {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            j = (intExtra < 0 || intExtra2 < 0) ? emux.a : emxc.j(Integer.valueOf((int) ((intExtra * 100.0d) / intExtra2)));
        }
        if (!j.g()) {
            this.b.c(dvgnVar.a(), "Unable to retrieve current battery percentage", new Object[0]);
            return false;
        }
        if (((Integer) j.c()).intValue() >= i) {
            return true;
        }
        this.b.c(dvgnVar.a(), "Battery percentage below minimum.", new Object[0]);
        return false;
    }
}
