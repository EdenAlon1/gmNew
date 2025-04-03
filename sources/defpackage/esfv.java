package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfv {
    private final Context a;
    private final esfn b;

    public esfv(Context context, esfn esfnVar) {
        this.a = context;
        this.b = esfnVar;
    }

    public final esfl a() {
        Context context = this.a;
        context.getClass();
        if (!evpy.a) {
            synchronized (evpy.b) {
                if (!evpy.a) {
                    evqw.b(context);
                    evpy.a = true;
                }
            }
        }
        esfm esfmVar = new esfm(new esfq(evqu.h(), evqv.a));
        return this.b.e() ? new esfu(esfmVar) : esfmVar;
    }
}
