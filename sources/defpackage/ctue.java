package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctue implements ctud, ctuc {
    private static final cskc a = cskc.g("Bugle", "PermissionCheckerImpl");
    private final Context b;
    private final Map c = DesugarCollections.synchronizedMap(new cmh());

    public ctue(Context context) {
        this.b = context;
    }

    private final boolean t() {
        return a(new String[]{"android.permission.READ_MEDIA_IMAGES"}) || v();
    }

    private final boolean u(String str) {
        if (!this.c.containsKey(str) || ((Integer) this.c.get(str)).intValue() == -1) {
            if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                this.c.put(str, Integer.valueOf(true == q() ? 0 : -1));
            } else {
                this.c.put(str, Integer.valueOf(this.b.checkSelfPermission(str)));
            }
        }
        return ((Integer) this.c.get(str)).intValue() == 0;
    }

    private final boolean v() {
        if (ctid.h) {
            return a(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        }
        return false;
    }

    private final boolean w() {
        return a(new String[]{"android.permission.READ_MEDIA_VIDEO"}) || v();
    }

    @Override // defpackage.ctuc
    public final boolean a(String[] strArr) {
        for (String str : strArr) {
            if (!u(str)) {
                csjb e = a.e();
                e.I("Missing Permission");
                e.I(str);
                e.r();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ctuc
    public final String[] b(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!u(str)) {
                arrayList.add(str);
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    @Override // defpackage.ctud
    public final boolean c() {
        return a(ctug.l);
    }

    @Override // defpackage.ctud
    public final boolean d() {
        return !ctid.h ? a(ctug.d) : a(ctug.c) && t() && w();
    }

    @Override // defpackage.ctud
    public final boolean e() {
        return !ctid.h ? a(ctug.e) : a(ctug.c) && t();
    }

    @Override // defpackage.ctud
    public final boolean f() {
        return a(ctug.c);
    }

    @Override // defpackage.ctud
    public final boolean g() {
        return !ctid.h ? a(ctug.f) : a(ctug.c) && w();
    }

    @Override // defpackage.ctud
    public final boolean h() {
        return u("com.cequint.ecid.CALLER_ID_EXTERNAL_LOOKUP_SMS");
    }

    @Override // defpackage.ctud
    public final boolean i() {
        return a(ctug.i);
    }

    @Override // defpackage.ctud
    public final boolean j() {
        return a(ctug.g);
    }

    @Override // defpackage.ctud
    public final boolean k() {
        if ("com.google.android.ims".equals(this.b.getPackageName())) {
            return true;
        }
        return a(ctug.q);
    }

    @Override // defpackage.ctud
    public final boolean l() {
        return a(ctug.j);
    }

    @Override // defpackage.ctud
    public final boolean m() {
        return u("com.google.android.setupwizard.READ_DEVICE_ORIGIN") || u("com.google.android.setupwizard.READ_DEVICE_ORIGIN_FIRST_PARTY");
    }

    @Override // defpackage.ctud
    public final boolean n() {
        return a(ctug.o);
    }

    @Override // defpackage.ctud
    public final boolean o() {
        return a(ctug.a);
    }

    @Override // defpackage.ctud
    public final boolean p() {
        return a(ctug.p);
    }

    @Override // defpackage.ctud
    public final boolean q() {
        boolean canScheduleExactAlarms;
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        AlarmManager alarmManager = (AlarmManager) this.b.getSystemService("alarm");
        if (alarmManager == null) {
            return false;
        }
        canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
        return canScheduleExactAlarms;
    }

    @Override // defpackage.ctud
    public final boolean r() {
        return a(ctug.h);
    }

    @Override // defpackage.ctud
    public final boolean s() {
        return !ctid.h ? a(ctug.n) : a(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_AUDIO"}) && t() && w();
    }
}
