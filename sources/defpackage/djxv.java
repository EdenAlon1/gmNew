package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxv {
    public final dkeh a;
    public final dkcp b;
    public final cguo c;
    private final dkpm d;

    public djxv(dkeh dkehVar, dkpm dkpmVar, dkcp dkcpVar, cguo cguoVar) {
        this.a = dkehVar;
        this.b = dkcpVar;
        this.d = dkpmVar;
        this.c = cguoVar;
    }

    static final int e(int i) {
        int b = ewhl.b(i);
        if (b == 2) {
            return 1;
        }
        if (b != 3) {
            return b != 4 ? 0 : 3;
        }
        return 2;
    }

    public final dkef a(Context context, String str, String str2) {
        String c = c(str, str2);
        String str3 = (djai.z() && djai.ab()) ? this.c.c(str2).B : (String) dimn.E().u().a();
        String str4 = (djai.z() && djai.ab()) ? this.c.c(str2).C : (String) dimn.E().w().a();
        String e = dkvy.e(context, dkvy.a(context), 1);
        String b = b(context, str2);
        dkef dkefVar = new dkef(str3, str4, e);
        dkefVar.f = c;
        dkefVar.g = b;
        dkefVar.h = dkvy.b(context);
        return dkefVar;
    }

    final String b(Context context, String str) {
        String str2;
        int intValue;
        dkvt f;
        String imei;
        try {
            f = dkvt.g(context).f(this.d.b());
        } catch (dkvd unused) {
            dkty.g("No permissions to get device id", new Object[0]);
        }
        if (f != null) {
            try {
                imei = f.a.getImei(this.d.a.g());
                str2 = emxe.b(imei);
                if (djai.z() || !djai.ab()) {
                    intValue = ((Integer) dimn.E().r().a()).intValue();
                } else {
                    int c = ewhl.c(this.c.c(str).E);
                    if (c == 0) {
                        c = 1;
                    }
                    intValue = e(c);
                }
                return (intValue != 2 || intValue == 3) ? str2 : "";
            } catch (SecurityException e) {
                throw new dkvd("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
            }
        }
        str2 = "";
        if (djai.z()) {
        }
        intValue = ((Integer) dimn.E().r().a()).intValue();
        if (intValue != 2) {
        }
    }

    final String c(String str, String str2) {
        int intValue;
        if (djai.z() && djai.ab()) {
            int c = ewhl.c(this.c.c(str2).F);
            if (c == 0) {
                c = 1;
            }
            intValue = e(c);
        } else {
            intValue = ((Integer) dimn.E().s().a()).intValue();
        }
        if (intValue != 1) {
            if (intValue != 2 && intValue != 3) {
                return "";
            }
        } else if (!TextUtils.isEmpty(str)) {
            return String.format(Locale.US, "%-15s", str.substring(0, Math.min(str.length(), 6))).replace(' ', '0');
        }
        return str;
    }

    public final void d(Context context, String str, djtp djtpVar, String str2, String str3, int i, String str4, String str5, dkbm dkbmVar) {
        this.a.e(str, djtpVar, str2, str3, i, str4 == null ? a(context, c(this.d.e(), str5), str5) : a(context, str4, str5), Optional.of(dkbmVar));
    }
}
