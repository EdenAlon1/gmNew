package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiky implements aigt {
    private final Context a;
    private final eisx b;
    private final ffbr c;

    public aiky(Context context, eisx eisxVar, ffbr ffbrVar) {
        eisxVar.getClass();
        this.a = context;
        this.b = eisxVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        aikx aikxVar = (aikx) aihsVar;
        adtc adtcVar = (adtc) this.c.b();
        Activity a = ddxb.a(this.a);
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object c = fgfz.c(adtcVar.d(a, aikxVar.a, this.b, aikxVar.b), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }
}
