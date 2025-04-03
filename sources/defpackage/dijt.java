package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dijt {
    public static final dktn a = new dktn("ClearcutUtil");
    private static engw b;
    private final cort c;
    private final String d = UUID.randomUUID().toString();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final errl g;
    private final ffbr h;

    public dijt(cort cortVar, errl errlVar, ffbr ffbrVar) {
        this.c = cortVar;
        this.h = ffbrVar;
        this.g = errlVar;
    }

    protected static final eplr f(String str, Context context) {
        eplq eplqVar = (eplq) eplr.a.createBuilder();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            int i = packageInfo.versionCode;
            eplqVar.copyOnWrite();
            eplr eplrVar = (eplr) eplqVar.instance;
            eplrVar.b |= 1;
            eplrVar.c = i;
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                eplqVar.copyOnWrite();
                eplr eplrVar2 = (eplr) eplqVar.instance;
                str2.getClass();
                eplrVar2.b |= 2;
                eplrVar2.d = str2;
            }
            dkty.d(a, "%s client info: %s", str, Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            dkty.i(e, "Failed to get %s client info", str);
        }
        return (eplr) eplqVar.build();
    }

    public final epls a(Context context, eplu epluVar) {
        epls eplsVar = (epls) eplx.a.createBuilder();
        eplsVar.copyOnWrite();
        eplx eplxVar = (eplx) eplsVar.instance;
        eplxVar.j = epluVar.e;
        eplxVar.b |= 128;
        d(eplsVar, context);
        return eplsVar;
    }

    public final eqpc b(djrm djrmVar) {
        String str = djrn.a(djrmVar).a;
        cosz coszVar = (cosz) this.c.j(djrmVar).orElse(cosz.a);
        cost a2 = this.c.a();
        eqpb eqpbVar = (eqpb) eqpc.a.createBuilder();
        String str2 = coszVar.p;
        eqpbVar.copyOnWrite();
        eqpc eqpcVar = (eqpc) eqpbVar.instance;
        str2.getClass();
        eqpcVar.b |= 1;
        eqpcVar.c = str2;
        boolean equals = a2.c.equals(str);
        eqpbVar.copyOnWrite();
        eqpc eqpcVar2 = (eqpc) eqpbVar.instance;
        eqpcVar2.b |= 2;
        eqpcVar2.d = equals;
        boolean equals2 = a2.d.equals(str);
        eqpbVar.copyOnWrite();
        eqpc eqpcVar3 = (eqpc) eqpbVar.instance;
        eqpcVar3.b |= 4;
        eqpcVar3.e = equals2;
        boolean equals3 = a2.e.equals(str);
        eqpbVar.copyOnWrite();
        eqpc eqpcVar4 = (eqpc) eqpbVar.instance;
        eqpcVar4.b |= 8;
        eqpcVar4.f = equals3;
        return (eqpc) eqpbVar.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x012f, code lost:
    
        if (r10 == defpackage.eplu.CARRIER_SERVICES_EVENT_SOURCE_COMMON) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r9, defpackage.eplx r10, defpackage.ezee r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dijt.c(android.content.Context, eplx, ezee):void");
    }

    public final void d(epls eplsVar, Context context) {
        boolean equals;
        eplx eplxVar = (eplx) eplsVar.instance;
        if ((eplxVar.b & 256) != 0) {
            int a2 = eplw.a(eplxVar.k);
            equals = a2 != 0 && a2 == 2;
        } else {
            equals = "com.google.android.apps.messaging".equals(context.getPackageName());
        }
        if (equals) {
            eplr f = f("com.google.android.apps.messaging", context);
            eplsVar.copyOnWrite();
            eplx eplxVar2 = (eplx) eplsVar.instance;
            f.getClass();
            eplxVar2.h = f;
            eplxVar2.b |= 4;
            eplr eplrVar = eplr.a;
            eplsVar.copyOnWrite();
            eplx eplxVar3 = (eplx) eplsVar.instance;
            eplrVar.getClass();
            eplxVar3.g = eplrVar;
            eplxVar3.b |= 2;
            eplsVar.copyOnWrite();
            eplx eplxVar4 = (eplx) eplsVar.instance;
            eplxVar4.k = 1;
            eplxVar4.b |= 256;
        } else if ("com.google.android.apps.tycho".equals(context.getPackageName())) {
            eplr f2 = f("com.google.android.apps.tycho", context);
            eplsVar.copyOnWrite();
            eplx eplxVar5 = (eplx) eplsVar.instance;
            f2.getClass();
            eplxVar5.g = f2;
            eplxVar5.b |= 2;
            eplsVar.copyOnWrite();
            eplx eplxVar6 = (eplx) eplsVar.instance;
            eplxVar6.k = 3;
            eplxVar6.b |= 256;
        } else {
            eplr f3 = f("com.google.android.apps.messaging", context);
            eplsVar.copyOnWrite();
            eplx eplxVar7 = (eplx) eplsVar.instance;
            f3.getClass();
            eplxVar7.h = f3;
            eplxVar7.b |= 4;
            eplr f4 = f("com.google.android.ims", context);
            eplsVar.copyOnWrite();
            eplx eplxVar8 = (eplx) eplsVar.instance;
            f4.getClass();
            eplxVar8.g = f4;
            eplxVar8.b |= 2;
            eplsVar.copyOnWrite();
            eplx eplxVar9 = (eplx) eplsVar.instance;
            eplxVar9.k = 2;
            eplxVar9.b |= 256;
        }
        if (TextUtils.isEmpty((CharSequence) dinr.j.a())) {
            return;
        }
        String str = (String) dinr.j.a();
        eplsVar.copyOnWrite();
        eplx eplxVar10 = (eplx) eplsVar.instance;
        str.getClass();
        eplxVar10.b |= 1024;
        eplxVar10.m = str;
    }

    public final synchronized boolean e(String str) {
        engw engwVar;
        engwVar = b;
        if (engwVar == null) {
            engwVar = engw.p(((String) dizg.o().a.p.a()).split(","));
            b = engwVar;
        }
        return engwVar.contains(str);
    }
}
