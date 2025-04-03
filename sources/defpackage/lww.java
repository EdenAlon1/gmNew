package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lww implements lwm {
    private final Context a;
    private final lwm b;

    public lww(Context context) {
        lwz lwzVar = new lwz();
        this.a = context.getApplicationContext();
        this.b = lwzVar;
    }

    @Override // defpackage.lwm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lwx a() {
        return new lwx(this.a, ((lwz) this.b).a());
    }
}
