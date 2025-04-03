package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzb {
    public static final String a(Context context, int i) {
        String valueOf;
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            valueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i);
        }
        valueOf.getClass();
        return valueOf;
    }

    public static final ffnl b(nzh nzhVar) {
        nzhVar.getClass();
        return ffno.e(nzhVar, nza.a);
    }
}
