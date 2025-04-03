package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfkt {
    static final ExperimentTokens[] a = new ExperimentTokens[0];
    static final String[] b = new String[0];

    @Deprecated
    public static final dfqt c;
    private static volatile int m = -1;
    private static final dfqs n;
    private static final dfqj o;
    public final dfme d;
    public final String e;
    public faxs f;
    protected final Context g;
    public final dfle h;
    public final String i;
    protected final String j;
    public final dfmi k;
    public final dflg l;

    static {
        dfqs dfqsVar = new dfqs();
        n = dfqsVar;
        dfkq dfkqVar = new dfkq();
        o = dfkqVar;
        c = new dfqt("ClearcutLogger.API", dfkqVar, dfqsVar);
    }

    protected dfkt(Context context, String str, String str2, dfmi dfmiVar, faxs faxsVar, dfle dfleVar, dfme dfmeVar, emyl emylVar, dflg dflgVar) {
        if (!dfmiVar.a(dfmj.ACCOUNT_NAME)) {
            dfwv.b(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        d(dfmiVar);
        this.g = context.getApplicationContext();
        this.j = context.getPackageName();
        this.i = str;
        this.e = str2;
        this.k = dfmiVar;
        this.f = faxsVar == null ? faxs.DEFAULT : faxsVar;
        this.h = dfleVar == null ? new dfmz(context, emylVar) : dfleVar;
        this.d = dfmeVar == null ? new dfng(context) : dfmeVar;
        this.l = dflgVar;
    }

    static final int a(Context context) {
        if (m == -1) {
            synchronized (dfkt.class) {
                if (m == -1) {
                    try {
                        m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        return m;
    }

    static final String c(Iterable iterable) {
        return new emww(", ").b(iterable);
    }

    static final void d(dfmi dfmiVar) {
        if (!dfmiVar.equals(dfmi.c) && !dfmiVar.equals(dfmi.a) && !dfmiVar.equals(dfmi.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    static final int[] f(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public final boolean e() {
        return this.k.equals(dfmi.b);
    }
}
