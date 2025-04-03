package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class akvq extends ffkh implements ffjn {
    public akvq(Object obj) {
        super(3, obj, AlarmManager.class, "setAndAllowWhileIdle", "setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V", 0);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        PendingIntent pendingIntent = (PendingIntent) obj3;
        pendingIntent.getClass();
        ((AlarmManager) this.g).setAndAllowWhileIdle(intValue, longValue, pendingIntent);
        return ffcu.a;
    }
}
