package defpackage;

import android.content.Context;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class lwy implements lwm {
    private final Context a;
    private final lwm b;

    public lwy(Context context, String str) {
        lwz lwzVar = new lwz();
        lwzVar.a = str;
        this.a = context.getApplicationContext();
        this.b = lwzVar;
    }

    @Override // defpackage.lwm
    public final /* bridge */ /* synthetic */ lwn a() {
        return new lwx(this.a, ((lwz) this.b).a());
    }
}
