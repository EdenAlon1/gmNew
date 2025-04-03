package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class js extends ju {
    public final PowerManager a;
    final /* synthetic */ jz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js(jz jzVar, Context context) {
        super(jzVar);
        this.b = jzVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.ju
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.ju
    public final void b() {
        this.b.p();
    }
}
