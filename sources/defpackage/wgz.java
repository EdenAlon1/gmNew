package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgz {
    public static final void a(dris drisVar) {
        int i = drht.g;
        drisVar.b(drhr.h);
    }

    public static final void b(Context context, dris drisVar, Throwable th, boolean z) {
        drht drhtVar;
        if ((th instanceof aiyj) || (z && (th instanceof aizg))) {
            int i = drht.g;
            drhtVar = drhr.b;
        } else {
            drhtVar = d(context, drisVar, th);
        }
        drisVar.b(drhtVar);
    }

    public static final void c(Context context, dris drisVar, Throwable th, boolean z) {
        drht drhtVar;
        th.getClass();
        if ((th instanceof aiyj) || (z && (th instanceof aizg))) {
            int i = drht.g;
            drhtVar = drhr.c;
        } else {
            drhtVar = d(context, drisVar, th);
        }
        drisVar.b(drhtVar);
    }

    private static final drht d(final Context context, dris drisVar, Throwable th) {
        if ((th instanceof aiye) || (th instanceof aiyd) || (th instanceof aizm)) {
            int i = drht.g;
            return drhr.a;
        }
        if (th instanceof aize) {
            int i2 = drht.g;
            return drhr.d;
        }
        if ((th instanceof aizj) || (th instanceof aiyf)) {
            int i3 = drht.g;
            return drhr.g;
        }
        if (th instanceof aizi) {
            int i4 = drht.g;
            return drhr.e;
        }
        if (th instanceof aizk) {
            int i5 = drht.g;
            return drhr.f;
        }
        if (!(th instanceof aiyi)) {
            int i6 = drht.g;
            return drhr.g;
        }
        aiyi aiyiVar = (aiyi) th;
        final Intent addFlags = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS").addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        addFlags.getClass();
        ComponentName resolveActivity = addFlags.resolveActivity(context.getPackageManager());
        int i7 = drht.g;
        emdy emdyVar = aiyiVar.a;
        fgdj fgdjVar = emdyVar != null ? emdyVar.a : null;
        ffix ffixVar = resolveActivity != null ? new ffix() { // from class: wgy
            @Override // defpackage.ffix
            public final Object invoke() {
                eldl.p(context, addFlags);
                return ffcu.a;
            }
        } : null;
        emdy emdyVar2 = aiyiVar.a;
        return new drhs(fgdjVar, ffixVar, emdyVar2 != null ? emdyVar2.b : null, emdyVar2 != null ? emdyVar2.c : null, emdyVar2 != null ? emdyVar2.d : null, ((drja) drisVar.a.c()).d);
    }
}
