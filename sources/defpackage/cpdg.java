package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdg {
    public static final cskc a = cskc.g("BugleDataModel", "MmsSmsUtils");
    public static final emyl b = cfvl.x(206791863, "enable_cdma_delivery_report_status");
    public final Context c;
    private String[] d;
    private final fazb e;
    private final fazb f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public cpdg(Context context, fazb fazbVar, fazb fazbVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = context;
        this.e = fazbVar;
        this.f = fazbVar2;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
    }

    public static int a(boolean z, boolean z2, int i) {
        if (z) {
            return (i == 4 || i == 5) ? 8 : 1;
        }
        if (z2) {
            return EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        }
        return 100;
    }

    public static int b(boolean z, int i, int i2) {
        if (!z) {
            return 100;
        }
        if (i == 4 || i == 6) {
            return 5;
        }
        if (i == 5) {
            return 8;
        }
        if (i == 2 && i2 == 64) {
            return 8;
        }
        return i2 != 0 ? 1 : 2;
    }

    public final String c(Resources resources, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.d == null) {
            this.d = resources.getStringArray(R.array.empty_subject_strings);
        }
        for (String str2 : this.d) {
            if (emuz.e(str, str2)) {
                return null;
            }
        }
        return str;
    }

    public final String d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? a.B(i, " (check MmsSmsUtils)") : "NO_RETRY" : "MANUAL_RETRY" : "AUTO_RETRY" : "SUCCEEDED";
    }

    public final String e(String str) {
        return ((aoqw) this.f.b()).e(str);
    }

    public final void f(Intent intent) {
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
    }

    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return h(str, ((ctvi) this.e.b()).c());
    }

    public final boolean h(String str, String str2) {
        try {
            return ((esfl) this.g.b()).j(((esfl) this.g.b()).n(str, str2));
        } catch (esfg unused) {
            return false;
        }
    }

    public final boolean i(String str) {
        return (TextUtils.isEmpty(str) || aoqw.h(str) || !aoqw.g(str)) ? false : true;
    }

    public final boolean j(String str) {
        return aoqw.j(str) && !aoqw.h(str);
    }

    public final boolean k(String str) {
        return ((aoqw) this.f.b()).k(str);
    }

    public final boolean l(String str) {
        return (((Boolean) this.i.b()).booleanValue() && ((Optional) ((fbbb) this.h).a).filter(new Predicate() { // from class: cpdf
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cskc cskcVar = cpdg.a;
                return ((cazr) obj).a();
            }
        }).isPresent()) || ((aoqw) this.f.b()).k(str) || aoqw.h(str);
    }
}
