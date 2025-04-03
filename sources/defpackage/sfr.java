package defpackage;

import android.app.Activity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfr {
    private Optional a = Optional.empty();
    private final sfq b;
    private final Activity c;
    private final uav d;

    public sfr(sfq sfqVar, Activity activity, uav uavVar) {
        this.b = sfqVar;
        this.c = activity;
        this.d = uavVar;
    }

    public final synchronized sfp a() {
        if (this.a.isEmpty()) {
            sfq sfqVar = this.b;
            Activity activity = this.c;
            uav uavVar = this.d;
            byzp byzpVar = (byzp) sfqVar.a.b();
            byzpVar.getClass();
            this.a = Optional.of(new sfp(byzpVar, activity, uavVar));
        }
        return (sfp) this.a.get();
    }
}
