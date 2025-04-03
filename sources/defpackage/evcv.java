package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evcv {
    public static feeg a(final Context context, enip enipVar, Executor executor) {
        return new evcu(new emyl() { // from class: evcq
            @Override // defpackage.emyl
            public final Object get() {
                return dfqg.c(context);
            }
        }, context.getPackageManager(), enipVar, executor);
    }

    @Deprecated
    public static feey b(Context context) {
        return new evcr(dfqg.c(context));
    }

    @Deprecated
    public static feey c(Context context, enip enipVar) {
        return new evcs(context.getPackageManager(), enipVar, dfqg.c(context));
    }
}
