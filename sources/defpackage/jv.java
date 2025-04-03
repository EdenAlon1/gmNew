package defpackage;

import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jv extends ju {
    public final kn a;
    final /* synthetic */ jz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(jz jzVar, kn knVar) {
        super(jzVar);
        this.b = jzVar;
        this.a = knVar;
    }

    @Override // defpackage.ju
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.ju
    public final void b() {
        this.b.p();
    }
}
