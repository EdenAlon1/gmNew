package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prw extends ovj {
    private final Context c;

    public prw(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        if (this.b >= 10) {
            oxiVar.l(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
