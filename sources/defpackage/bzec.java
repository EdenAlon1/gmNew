package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.Temporal;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzec implements bzea {
    public static final /* synthetic */ int a = 0;
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl");
    private static final enip c = enip.s(ezlj.ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT, ezlj.ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT_FROM_NOTIFICATION, ezlj.SHOW_VERIFICATION_PROMPT_NOTIFICATION);
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final bzed g;
    private final ffbr h;
    private final errl i;
    private akxl j;
    private final Context k;
    private final AtomicReference l = new AtomicReference();
    private final AtomicReference m = new AtomicReference();
    private int n = -1;
    private int o = -1;
    private ezmg p;
    private final aslr q;
    private final ffbr r;

    public bzec(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, bzed bzedVar, ffbr ffbrVar4, aslr aslrVar, ffbr ffbrVar5, errl errlVar) {
        this.k = context;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = bzedVar;
        this.h = ffbrVar4;
        this.q = aslrVar;
        this.r = ffbrVar5;
        this.i = errlVar;
    }

    private static String B(String str) {
        int i = eodh.a;
        return eodf.a.c(str, StandardCharsets.UTF_8).toString().substring(0, 32);
    }

    private static void C() {
        ensk e = b.e();
        e.Y(ente.a, "DittoClearcutLogger");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logClearcutDisabled", 145, "DittoClearcutLoggerImpl.java")).q("Clearcut loggings are disabled.");
    }

    private final void D(ezlx ezlxVar, ezlc ezlcVar) {
        Instant now = Instant.now();
        if (this.l.get() == null || Duration.between((Temporal) this.l.get(), now).compareTo(Duration.ofSeconds(5L)) > 0) {
            this.n = chho.a(this.k);
            this.o = chho.b(this.k);
            this.l.set(now);
        }
        int i = this.n;
        if (i != -1) {
            if (ezlxVar != null) {
                ezlxVar.copyOnWrite();
                ezma ezmaVar = (ezma) ezlxVar.instance;
                ezma ezmaVar2 = ezma.a;
                ezmaVar.l = i;
            }
            if (ezlcVar != null) {
                int i2 = this.n;
                ezlcVar.copyOnWrite();
                ezld ezldVar = (ezld) ezlcVar.instance;
                ezld ezldVar2 = ezld.a;
                ezldVar.f = i2;
            }
        }
        int i3 = this.o;
        if (i3 != -1) {
            if (i3 == 0) {
                if (ezlxVar != null) {
                    ezlxVar.copyOnWrite();
                    ezma ezmaVar3 = (ezma) ezlxVar.instance;
                    ezma ezmaVar4 = ezma.a;
                    ezmaVar3.m = ezlb.a(2);
                }
                if (ezlcVar != null) {
                    ezlcVar.copyOnWrite();
                    ezld ezldVar3 = (ezld) ezlcVar.instance;
                    ezld ezldVar4 = ezld.a;
                    ezldVar3.g = ezlb.a(2);
                    return;
                }
                return;
            }
            if (i3 != 1) {
                if (ezlxVar != null) {
                    ezlxVar.copyOnWrite();
                    ezma ezmaVar5 = (ezma) ezlxVar.instance;
                    ezma ezmaVar6 = ezma.a;
                    ezmaVar5.m = ezlb.a(4);
                }
                if (ezlcVar != null) {
                    ezlcVar.copyOnWrite();
                    ezld ezldVar5 = (ezld) ezlcVar.instance;
                    ezld ezldVar6 = ezld.a;
                    ezldVar5.g = ezlb.a(4);
                    return;
                }
                return;
            }
            if (ezlxVar != null) {
                ezlxVar.copyOnWrite();
                ezma ezmaVar7 = (ezma) ezlxVar.instance;
                ezma ezmaVar8 = ezma.a;
                ezmaVar7.m = ezlb.a(3);
            }
            if (ezlcVar != null) {
                ezlcVar.copyOnWrite();
                ezld ezldVar7 = (ezld) ezlcVar.instance;
                ezld ezldVar8 = ezld.a;
                ezldVar7.g = ezlb.a(3);
            }
        }
    }

    private static boolean E(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        cskc cskcVar = cpdg.a;
        if (!aoqw.h(str)) {
            return true;
        }
        ensk j = b.j();
        j.Y(ente.a, "DittoClearcutLogger");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "canLogSessionId", 1137, "DittoClearcutLoggerImpl.java")).q("Preventing unexpected logging of sessionId containing email address");
        return false;
    }

    private static ezmh F(int i) {
        ezmh ezmhVar = (ezmh) ezmk.a.createBuilder();
        ezmhVar.copyOnWrite();
        ((ezmk) ezmhVar.instance).e = ezmj.a(i);
        ezmhVar.copyOnWrite();
        ((ezmk) ezmhVar.instance).g = ezmi.a(8);
        return ezmhVar;
    }

    private final void G(String str, String str2, int i, int i2, int i3, int i4, String str3, int i5, int i6) {
        H("", str, str2, i, i2, i3, i4, str3, i5, i6, -1);
    }

    private final void H(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4, int i5, int i6, int i7) {
        int i8;
        String str5;
        ezlz ezlzVar;
        if (!this.g.a()) {
            C();
            return;
        }
        int i9 = i2 - 1;
        ezmh F = F(2);
        switch (i9) {
            case 1:
                i8 = 3;
                break;
            case 2:
                i8 = 4;
                break;
            case 3:
                i8 = 5;
                break;
            case 4:
                i8 = 6;
                break;
            case 5:
                i8 = 7;
                break;
            case 6:
                i8 = 8;
                break;
            case 7:
                i8 = 9;
                break;
            case 8:
                i8 = 10;
                break;
            case 9:
                i8 = 11;
                break;
            case 10:
                i8 = 12;
                break;
            case 11:
                i8 = 13;
                break;
            case 12:
            default:
                i8 = 14;
                break;
            case 13:
                i8 = 15;
                break;
            case 14:
                i8 = 16;
                break;
        }
        ezlx ezlxVar = (ezlx) ezma.a.createBuilder();
        ezlxVar.copyOnWrite();
        ((ezma) ezlxVar.instance).c = 1;
        ezlxVar.copyOnWrite();
        ((ezma) ezlxVar.instance).d = ezly.a(i8);
        if (i != -1) {
            ezlxVar.copyOnWrite();
            ((ezma) ezlxVar.instance).b = i;
        }
        if (i3 != -1) {
            ezlxVar.copyOnWrite();
            ((ezma) ezlxVar.instance).g = i3;
        }
        if (i4 != -1) {
            ezlxVar.copyOnWrite();
            ((ezma) ezlxVar.instance).i = i4;
        }
        if (!TextUtils.isEmpty(str2)) {
            ezlxVar.copyOnWrite();
            ezma ezmaVar = (ezma) ezlxVar.instance;
            str2.getClass();
            ezmaVar.e = str2;
        }
        if (E(str3)) {
            ezlxVar.copyOnWrite();
            ezma ezmaVar2 = (ezma) ezlxVar.instance;
            str3.getClass();
            str5 = str3;
            ezmaVar2.f = str5;
        } else {
            str5 = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            ezlxVar.copyOnWrite();
            ezma ezmaVar3 = (ezma) ezlxVar.instance;
            str4.getClass();
            ezmaVar3.h = str4;
        }
        if (!TextUtils.isEmpty(str)) {
            ezlxVar.copyOnWrite();
            ezma ezmaVar4 = (ezma) ezlxVar.instance;
            str.getClass();
            ezmaVar4.o = str;
        }
        if (i5 != -1) {
            ezlxVar.copyOnWrite();
            ((ezma) ezlxVar.instance).j = i5;
        }
        if (i6 != -1) {
            ezlxVar.copyOnWrite();
            ((ezma) ezlxVar.instance).k = i6;
        }
        try {
            Context context = this.k;
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, "com.google.android.ims.binding.SystemBindingService"));
            if (componentEnabledSetting == 1) {
                ezlzVar = ezlz.ENABLED;
            } else {
                if (componentEnabledSetting != 2) {
                    throw new IllegalStateException(a.h(componentEnabledSetting, "Unexpected component state: "));
                }
                ezlzVar = ezlz.DISABLED;
            }
        } catch (IllegalStateException unused) {
            ezlzVar = ezlz.UNKNOWN_STATE;
        }
        ensk f = b.f();
        f.Y(ente.a, "DittoClearcutLogger");
        ((enrr) ((enrr) f).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logDittoGrpcMessage", 478, "DittoClearcutLoggerImpl.java")).t("System binding state: %s", ezlzVar);
        ezlxVar.copyOnWrite();
        ((ezma) ezlxVar.instance).n = ezlzVar.a();
        boolean z = !((cspt) this.r.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? 0 : 4 : 3 : 2;
        if (i10 != 0) {
            ezlxVar.copyOnWrite();
            ((ezma) ezlxVar.instance).p = i10 - 2;
        }
        D(ezlxVar, null);
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezma ezmaVar5 = (ezma) ezlxVar.build();
        ezmaVar5.getClass();
        ezmkVar3.d = ezmaVar5;
        ezmkVar3.c = 3;
        A(F, bzed.b(str5));
    }

    private final void I(String str, String str2, int i) {
        int i2 = 5;
        ezmh F = F(5);
        boolean z = !((cspt) this.r.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        int i3 = i - 1;
        if (i3 == 2) {
            i2 = 4;
        } else if (i3 != 3) {
            i2 = i3 != 4 ? 7 : 6;
        }
        ezmp ezmpVar = (ezmp) ezmq.a.createBuilder();
        ezmpVar.copyOnWrite();
        ((ezmq) ezmpVar.instance).b = i2 - 2;
        String B = B(str);
        ezmpVar.copyOnWrite();
        ezmq ezmqVar = (ezmq) ezmpVar.instance;
        B.getClass();
        ezmqVar.c = B;
        ezmpVar.copyOnWrite();
        ezmq ezmqVar2 = (ezmq) ezmpVar.instance;
        str2.getClass();
        ezmqVar2.d = str2;
        ezmq ezmqVar3 = (ezmq) ezmpVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezmqVar3.getClass();
        ezmkVar3.d = ezmqVar3;
        ezmkVar3.c = 6;
        A(F, 2);
    }

    private final void J(ezlj ezljVar, int i, String str, String str2, int i2, Integer num, Integer num2) {
        if (!this.g.a()) {
            C();
            return;
        }
        ffbr ffbrVar = this.r;
        ezmh F = F(14);
        boolean z = !((cspt) ffbrVar.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        ezlg ezlgVar = (ezlg) ezlw.a.createBuilder();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).d = ezljVar.a();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).e = ezln.a(i2);
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).f = str;
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).g = str2;
        if (this.q.a()) {
            ezlgVar.copyOnWrite();
            ((ezlw) ezlgVar.instance).h = ezlk.a(i);
        }
        ezlh ezlhVar = (ezlh) ezli.a.createBuilder();
        if (num != null) {
            int intValue = num.intValue();
            ezlhVar.copyOnWrite();
            ezli ezliVar = (ezli) ezlhVar.instance;
            ezliVar.b |= 1;
            ezliVar.e = intValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            ezlhVar.copyOnWrite();
            ezli ezliVar2 = (ezli) ezlhVar.instance;
            ezliVar2.b |= 2;
            ezliVar2.f = intValue2;
        }
        ezli ezliVar3 = (ezli) ezlhVar.build();
        int i3 = ezliVar3.b;
        if ((i3 & 1) != 0 || (i3 & 2) != 0) {
            ezlgVar.copyOnWrite();
            ezlw ezlwVar = (ezlw) ezlgVar.instance;
            ezliVar3.getClass();
            ezlwVar.c = ezliVar3;
            ezlwVar.b = 5;
        }
        ezlw ezlwVar2 = (ezlw) ezlgVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezlwVar2.getClass();
        ezmkVar3.d = ezlwVar2;
        ezmkVar3.c = 18;
        A(F, 3);
    }

    final void A(ezmh ezmhVar, int i) {
        ezmg ezmgVar;
        if (this.g.a()) {
            AtomicReference atomicReference = this.m;
            Instant now = Instant.now();
            if (atomicReference.get() == null || Duration.between((Temporal) this.m.get(), now).compareTo(Duration.ofSeconds(5L)) > 0) {
                Intent registerReceiver = this.k.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    ezmgVar = ezmg.a;
                } else {
                    int intExtra = registerReceiver.getIntExtra("level", -1);
                    int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                    int intExtra3 = registerReceiver.getIntExtra("status", -1);
                    if (intExtra2 == 0) {
                        ezmf ezmfVar = (ezmf) ezmg.a.createBuilder();
                        ezmfVar.copyOnWrite();
                        ((ezmg) ezmfVar.instance).c = intExtra3;
                        ezmgVar = (ezmg) ezmfVar.build();
                    } else {
                        float f = intExtra2;
                        ezmf ezmfVar2 = (ezmf) ezmg.a.createBuilder();
                        ezmfVar2.copyOnWrite();
                        ((ezmg) ezmfVar2.instance).b = (int) ((intExtra / f) * 100.0f);
                        ezmfVar2.copyOnWrite();
                        ((ezmg) ezmfVar2.instance).c = intExtra3;
                        ezmgVar = (ezmg) ezmfVar2.build();
                    }
                }
                this.p = ezmgVar;
                this.m.set(now);
            }
            ezmg ezmgVar2 = this.p;
            ezmhVar.copyOnWrite();
            ezmk ezmkVar = (ezmk) ezmhVar.instance;
            ezmk ezmkVar2 = ezmk.a;
            ezmgVar2.getClass();
            ezmkVar.i = ezmgVar2;
            ezmkVar.b |= 1;
            ezmx ezmxVar = (ezmx) ezmy.a.createBuilder();
            ezmxVar.copyOnWrite();
            ezmy ezmyVar = (ezmy) ezmxVar.instance;
            ezmk ezmkVar3 = (ezmk) ezmhVar.build();
            ezmkVar3.getClass();
            ezmyVar.c = ezmkVar3;
            ezmyVar.b |= 1;
            final ezmy ezmyVar2 = (ezmy) ezmxVar.build();
            final dfld c2 = this.g.c(i);
            if (c2 != null) {
                axnw.h(((aleo) this.h.b()).a().h(new emwl() { // from class: bzeb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        int i2 = bzec.a;
                        if (!((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        dflc i3 = dfld.this.i(ezmyVar2);
                        i3.i(-1);
                        i3.c();
                        return null;
                    }
                }, this.i));
            }
        }
    }

    @Override // defpackage.bzea
    public final void a() {
        efbd.b();
        bzed bzedVar = this.g;
        boolean i = ((csxu) bzedVar.g.b()).i("bugle_enable_analytics", true);
        if (i) {
            bzedVar.b = (akxl) bzedVar.a.b();
            Context context = bzedVar.f;
            List list = dfld.m;
            bzedVar.c = new dfla(context, "COMMS_MESSAGES_WEB").c();
            bzedVar.d = dfld.g(bzedVar.f, "COMMS_MESSAGES_WEB").c();
        }
        bzedVar.e.set(i);
        if (this.g.a()) {
            this.j = this.g.b;
        }
    }

    @Override // defpackage.bzea
    public final void b(boolean z, int i) {
        if (!this.g.a()) {
            C();
            return;
        }
        ffbr ffbrVar = this.r;
        ezmh F = F(12);
        boolean z2 = !((cspt) ffbrVar.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z2;
        eohv b2 = ((aljq) this.e.b()).b(-1);
        fagh b3 = fagh.b(i);
        if (b3 == null) {
            b3 = fagh.UNKNOWN;
        }
        ezkz ezkzVar = (ezkz) ezla.a.createBuilder();
        ezkzVar.copyOnWrite();
        ezla ezlaVar = (ezla) ezkzVar.instance;
        b2.getClass();
        ezlaVar.e = b2;
        ezlaVar.b |= 1;
        ezkzVar.copyOnWrite();
        ((ezla) ezkzVar.instance).c = z;
        ezkzVar.copyOnWrite();
        ((ezla) ezkzVar.instance).d = b3.a();
        ezla ezlaVar2 = (ezla) ezkzVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezlaVar2.getClass();
        ezmkVar3.d = ezlaVar2;
        ezmkVar3.c = 16;
        A(F, 4);
    }

    @Override // defpackage.bzea
    public final void c(String str, String str2) {
        if (this.g.a()) {
            I(str, str2, 6);
        } else {
            C();
        }
    }

    @Override // defpackage.bzea
    public final void d(int i) {
        H("", "", "", -1, 15, -1, -1, "", -1, -1, i);
    }

    @Override // defpackage.bzea
    public final void e(String str, int i, int i2) {
        G("", "", -1, 7, -1, -1, str, i, i2);
    }

    @Override // defpackage.bzea
    public final void f(String str, String str2, int i, int i2, String str3) {
        g(str, str2, i, i2, -1, str3);
    }

    @Override // defpackage.bzea
    public final void g(String str, String str2, int i, int i2, int i3, String str3) {
        G(str, str2, i, 4, i2, i3, str3, -1, -1);
    }

    @Override // defpackage.bzea
    public final void h(String str, String str2, int i, String str3, int i2) {
        H("", str, str2, i, 8, i2, -1, str3, -1, -1, -1);
    }

    @Override // defpackage.bzea
    public final void i(String str, String str2, String str3, int i, String str4, int i2) {
        H(str, str2, str3, i, 8, i2, -1, str4, -1, -1, -1);
    }

    @Override // defpackage.bzea
    public final void j(String str, String str2, String str3, int i, int i2, int i3, String str4) {
        H(str, str2, str3, i, 4, i2, i3, str4, -1, -1, -1);
    }

    @Override // defpackage.bzea
    public final void k(String str, String str2, int i, String str3) {
        G(str, str2, i, 2, -1, -1, str3, -1, -1);
    }

    @Override // defpackage.bzea
    public final void l(String str, String str2, int i, String str3) {
        G(str, str2, i, 3, -1, -1, str3, -1, -1);
    }

    @Override // defpackage.bzea
    public final void m(String str, String str2, int i, String str3, int i2) {
        G(str, str2, i, 6, i2, -1, str3, -1, -1);
    }

    @Override // defpackage.bzea
    public final void n(String str, String str2, int i, String str3) {
        G(str, str2, i, 5, -1, -1, str3, -1, -1);
    }

    @Override // defpackage.bzea
    public final void o(String str, String str2) {
        if (this.g.a()) {
            I(str, str2, 4);
        } else {
            C();
        }
    }

    @Override // defpackage.bzea
    public final void p(String str) {
        if (!this.g.a()) {
            C();
            return;
        }
        I(str, (String) Optional.ofNullable(((ctyx) this.d.b()).f("tachyon_registration_id", "")).orElse(""), 3);
        ensk h = b.h();
        h.Y(ente.a, "DittoClearcutLogger");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logDittoQrCodeScannedEvent", 719, "DittoClearcutLoggerImpl.java")).t("Scanned QR code. hash: %s", B(str));
    }

    @Override // defpackage.bzea
    public final void q(eoys eoysVar, fagh faghVar, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.g.a()) {
            C();
            return;
        }
        Optional ofNullable = Optional.ofNullable(((ctyx) this.d.b()).f("tachyon_registration_id", ""));
        eohu a2 = ((aljq) this.e.b()).a(-1);
        a2.copyOnWrite();
        eohv eohvVar = (eohv) a2.instance;
        eygj eygjVar = eohv.a;
        eohvVar.c &= -5;
        eohvVar.f = false;
        eohv eohvVar2 = (eohv) a2.build();
        boolean z2 = i == 2 || i == 5;
        if (z2) {
            ezmh F = F(8);
            boolean z3 = !((cspt) this.r.b()).a();
            F.copyOnWrite();
            i2 = -1;
            ezmk ezmkVar = (ezmk) F.instance;
            ezmk ezmkVar2 = ezmk.a;
            ezmkVar.b |= 2;
            ezmkVar.j = z3;
            int ordinal = eoysVar.ordinal();
            if (ordinal == 0) {
                i4 = 2;
            } else if (ordinal == 1) {
                i4 = 3;
            } else if (ordinal == 2) {
                i4 = 4;
            } else if (ordinal == 3) {
                i4 = 5;
            } else {
                if (ordinal != 4) {
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(eoysVar))));
                }
                i4 = 6;
            }
            int i6 = i - 1;
            ezlc ezlcVar = (ezlc) ezld.a.createBuilder();
            String str = (String) ofNullable.orElse("");
            ezlcVar.copyOnWrite();
            ezld ezldVar = (ezld) ezlcVar.instance;
            str.getClass();
            ezldVar.c = str;
            ezlcVar.copyOnWrite();
            ((ezld) ezlcVar.instance).d = i4 - 2;
            int i7 = z ? 4 : 3;
            ezlcVar.copyOnWrite();
            ((ezld) ezlcVar.instance).e = i7 - 2;
            if (i6 == 1) {
                i3 = 3;
                i5 = 3;
            } else if (i6 != 2) {
                i3 = 3;
                i5 = i6 != 3 ? 6 : 5;
            } else {
                i3 = 3;
                i5 = 4;
            }
            ezlcVar.copyOnWrite();
            ((ezld) ezlcVar.instance).j = i5 - 2;
            ezlcVar.copyOnWrite();
            ezld ezldVar2 = (ezld) ezlcVar.instance;
            eohvVar2.getClass();
            ezldVar2.i = eohvVar2;
            ezldVar2.b |= 1;
            D(null, ezlcVar);
            ezlcVar.copyOnWrite();
            ((ezld) ezlcVar.instance).h = faghVar.a();
            ezld ezldVar3 = (ezld) ezlcVar.build();
            F.copyOnWrite();
            ezmk ezmkVar3 = (ezmk) F.instance;
            ezldVar3.getClass();
            ezmkVar3.d = ezldVar3;
            ezmkVar3.c = 9;
            A(F, i == 5 ? i3 : i == 2 ? 2 : 1);
        } else {
            i2 = -1;
            i3 = 3;
        }
        if (!z2) {
            int i8 = i - 1;
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.DITTO_BINDING_STATUS;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eoyt eoytVar = (eoyt) eoyv.a.createBuilder();
            String str2 = (String) ofNullable.orElse("");
            eoytVar.copyOnWrite();
            eoyv eoyvVar = (eoyv) eoytVar.instance;
            str2.getClass();
            eoyvVar.b |= 1;
            eoyvVar.c = str2;
            eoytVar.copyOnWrite();
            eoyv eoyvVar2 = (eoyv) eoytVar.instance;
            eoyvVar2.d = eoysVar.f;
            eoyvVar2.b |= 2;
            int i9 = true != z ? 2 : i3;
            eoytVar.copyOnWrite();
            eoyv eoyvVar3 = (eoyv) eoytVar.instance;
            eoyvVar3.e = i9 - 1;
            eoyvVar3.b |= 4;
            AtomicReference atomicReference = this.l;
            Instant now = Instant.now();
            if (atomicReference.get() == null || Duration.between((Temporal) this.l.get(), now).compareTo(Duration.ofSeconds(5L)) > 0) {
                this.n = chho.a(this.k);
                this.o = chho.b(this.k);
                this.l.set(now);
            }
            int i10 = this.n;
            int i11 = i2;
            if (i10 != i11) {
                eoytVar.copyOnWrite();
                eoyv eoyvVar4 = (eoyv) eoytVar.instance;
                eoyvVar4.b |= 8;
                eoyvVar4.f = i10;
            }
            int i12 = this.o;
            if (i12 != i11) {
                if (i12 == 0) {
                    eoytVar.copyOnWrite();
                    eoyv eoyvVar5 = (eoyv) eoytVar.instance;
                    eoyvVar5.g = 0;
                    eoyvVar5.b |= 16;
                } else if (i12 != 1) {
                    eoytVar.copyOnWrite();
                    eoyv eoyvVar6 = (eoyv) eoytVar.instance;
                    eoyvVar6.g = 2;
                    eoyvVar6.b |= 16;
                } else {
                    eoytVar.copyOnWrite();
                    eoyv eoyvVar7 = (eoyv) eoytVar.instance;
                    eoyvVar7.g = 1;
                    eoyvVar7.b |= 16;
                }
            }
            eoytVar.copyOnWrite();
            eoyv eoyvVar8 = (eoyv) eoytVar.instance;
            eoyvVar8.h = faghVar.a();
            eoyvVar8.b |= 32;
            eoytVar.copyOnWrite();
            eoyv eoyvVar9 = (eoyv) eoytVar.instance;
            eohvVar2.getClass();
            eoyvVar9.i = eohvVar2;
            eoyvVar9.b |= 64;
            eoytVar.copyOnWrite();
            eoyv eoyvVar10 = (eoyv) eoytVar.instance;
            eoyvVar10.j = i8;
            eoyvVar10.b |= 128;
            eoyv eoyvVar11 = (eoyv) eoytVar.build();
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eoyvVar11.getClass();
            eolvVar2.ag = eoyvVar11;
            eolvVar2.c |= Integer.MIN_VALUE;
            this.j.j(eoluVar);
        }
        ensk f = b.f();
        f.Y(ente.a, "DittoClearcutLogger");
        ((enrr) ((enrr) f).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logDittoBindingStatusEvent", 699, "DittoClearcutLoggerImpl.java")).t("Binding status: %s", eoysVar);
    }

    @Override // defpackage.bzea
    public final void r(String str, int i) {
        int i2;
        if (!this.g.a()) {
            C();
            return;
        }
        ffbr ffbrVar = this.r;
        ezmh F = F(4);
        boolean z = !((cspt) ffbrVar.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        int i3 = i - 1;
        if (i3 != 25) {
            switch (i3) {
                case 10:
                    i2 = 12;
                    break;
                case 11:
                    i2 = 13;
                    break;
                case 12:
                    i2 = 14;
                    break;
                case 13:
                    i2 = 15;
                    break;
                case 14:
                    i2 = 16;
                    break;
                case 15:
                    i2 = 17;
                    break;
                case 16:
                    i2 = 18;
                    break;
                case 17:
                    i2 = 19;
                    break;
                case 18:
                    i2 = 20;
                    break;
                case 19:
                    i2 = 21;
                    break;
                case 20:
                    i2 = 22;
                    break;
                case 21:
                    i2 = 23;
                    break;
                case 22:
                    i2 = 24;
                    break;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(i3)));
            }
        } else {
            i2 = 27;
        }
        ezmt ezmtVar = (ezmt) ezmu.a.createBuilder();
        ezmtVar.copyOnWrite();
        ((ezmu) ezmtVar.instance).c = 6;
        ezmtVar.copyOnWrite();
        ((ezmu) ezmtVar.instance).d = i2 - 2;
        if (E(str)) {
            ezmtVar.copyOnWrite();
            ezmu ezmuVar = (ezmu) ezmtVar.instance;
            str.getClass();
            ezmuVar.b = str;
        }
        ezmu ezmuVar2 = (ezmu) ezmtVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezmuVar2.getClass();
        ezmkVar3.d = ezmuVar2;
        ezmkVar3.c = 5;
        A(F, bzed.b(str));
    }

    @Override // defpackage.bzea
    public final void s(ezlj ezljVar, int i, String str, String str2, Integer num, Integer num2) {
        J(ezljVar, i, str, str2, 3, num, num2);
    }

    @Override // defpackage.bzea
    public final void t(ezlj ezljVar, int i, String str, String str2, eslj esljVar, fagh faghVar) {
        if (!this.g.a()) {
            C();
            return;
        }
        ffbr ffbrVar = this.r;
        ezmh F = F(14);
        boolean z = !((cspt) ffbrVar.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        ezlh ezlhVar = (ezlh) ezli.a.createBuilder();
        ezlhVar.copyOnWrite();
        ((ezli) ezlhVar.instance).c = faghVar.a();
        ezlhVar.copyOnWrite();
        ((ezli) ezlhVar.instance).d = esljVar.a();
        ezli ezliVar = (ezli) ezlhVar.build();
        ezlg ezlgVar = (ezlg) ezlw.a.createBuilder();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).d = ezljVar.a();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).e = ezln.a(6);
        ezlgVar.copyOnWrite();
        ezlw ezlwVar = (ezlw) ezlgVar.instance;
        str.getClass();
        ezlwVar.f = str;
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).g = str2;
        ezlgVar.copyOnWrite();
        ezlw ezlwVar2 = (ezlw) ezlgVar.instance;
        ezliVar.getClass();
        ezlwVar2.c = ezliVar;
        ezlwVar2.b = 5;
        if (this.q.a()) {
            ezlgVar.copyOnWrite();
            ((ezlw) ezlgVar.instance).h = ezlk.a(i);
        }
        ezlw ezlwVar3 = (ezlw) ezlgVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezlwVar3.getClass();
        ezmkVar3.d = ezlwVar3;
        ezmkVar3.c = 18;
        A(F, 3);
    }

    @Override // defpackage.bzea
    public final void u(ezlj ezljVar, int i, String str, String str2, Integer num, Integer num2) {
        J(ezljVar, i, str, str2, 4, num, num2);
    }

    @Override // defpackage.bzea
    public final void v(int i, String str, int i2) {
        if (!this.g.a()) {
            C();
            return;
        }
        ffbr ffbrVar = this.r;
        ezmh F = F(14);
        boolean z = !((cspt) ffbrVar.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        ezlg ezlgVar = (ezlg) ezlw.a.createBuilder();
        ezlj ezljVar = ezlj.VERIFICATION_PROMPT_CLOSED;
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).d = ezljVar.a();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).e = ezln.a(5);
        ezlgVar.copyOnWrite();
        ezlw ezlwVar = (ezlw) ezlgVar.instance;
        str.getClass();
        ezlwVar.g = str;
        ezlq ezlqVar = (ezlq) ezlr.a.createBuilder();
        ezlqVar.copyOnWrite();
        ((ezlr) ezlqVar.instance).b = i2 - 2;
        ezlr ezlrVar = (ezlr) ezlqVar.build();
        ezlgVar.copyOnWrite();
        ezlw ezlwVar2 = (ezlw) ezlgVar.instance;
        ezlrVar.getClass();
        ezlwVar2.c = ezlrVar;
        ezlwVar2.b = 10;
        if (this.q.a()) {
            ezlgVar.copyOnWrite();
            ((ezlw) ezlgVar.instance).h = ezlk.a(i);
        }
        ezlw ezlwVar3 = (ezlw) ezlgVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezlwVar3.getClass();
        ezmkVar3.d = ezlwVar3;
        ezmkVar3.c = 18;
        A(F, 3);
    }

    @Override // defpackage.bzea
    public final void w(int i, String str, ezlj ezljVar) {
        if (!this.g.a()) {
            C();
            return;
        }
        if (!c.contains(ezljVar)) {
            ensk j = b.j();
            j.Y(ente.a, "DittoClearcutLogger");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logGaiaPairingVerificationPromptEvent", 1057, "DittoClearcutLoggerImpl.java")).q("This is not a verificationPromptEvent, skip logging");
            return;
        }
        ffbr ffbrVar = this.r;
        ezmh F = F(14);
        boolean z = !((cspt) ffbrVar.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        ezlg ezlgVar = (ezlg) ezlw.a.createBuilder();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).d = ezljVar.a();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).e = ezln.a(5);
        ezlgVar.copyOnWrite();
        ezlw ezlwVar = (ezlw) ezlgVar.instance;
        str.getClass();
        ezlwVar.g = str;
        if (this.q.a()) {
            ezlgVar.copyOnWrite();
            ((ezlw) ezlgVar.instance).h = ezlk.a(i);
        }
        ezlw ezlwVar2 = (ezlw) ezlgVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezlwVar2.getClass();
        ezmkVar3.d = ezlwVar2;
        ezmkVar3.c = 18;
        A(F, 3);
    }

    @Override // defpackage.bzea
    public final void x(int i, String str, int i2) {
        if (!this.g.a()) {
            C();
            return;
        }
        ffbr ffbrVar = this.r;
        ezmh F = F(14);
        boolean z = !((cspt) ffbrVar.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        ezlg ezlgVar = (ezlg) ezlw.a.createBuilder();
        ezlj ezljVar = ezlj.VERIFICATION_PROMPT_LAUNCHED;
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).d = ezljVar.a();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).e = ezln.a(5);
        ezlgVar.copyOnWrite();
        ezlw ezlwVar = (ezlw) ezlgVar.instance;
        str.getClass();
        ezlwVar.g = str;
        ezls ezlsVar = (ezls) ezlt.a.createBuilder();
        ezlsVar.copyOnWrite();
        ezlt ezltVar = (ezlt) ezlsVar.instance;
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        ezltVar.b = i2 - 2;
        ezlt ezltVar2 = (ezlt) ezlsVar.build();
        ezlgVar.copyOnWrite();
        ezlw ezlwVar2 = (ezlw) ezlgVar.instance;
        ezltVar2.getClass();
        ezlwVar2.c = ezltVar2;
        ezlwVar2.b = 9;
        if (this.q.a()) {
            ezlgVar.copyOnWrite();
            ((ezlw) ezlgVar.instance).h = ezlk.a(i);
        }
        ezlw ezlwVar3 = (ezlw) ezlgVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezlwVar3.getClass();
        ezmkVar3.d = ezlwVar3;
        ezmkVar3.c = 18;
        A(F, 3);
    }

    @Override // defpackage.bzea
    public final void y(int i, String str, Integer num) {
        if (!this.g.a()) {
            C();
            return;
        }
        ffbr ffbrVar = this.r;
        ezmh F = F(14);
        boolean z = !((cspt) ffbrVar.b()).a();
        F.copyOnWrite();
        ezmk ezmkVar = (ezmk) F.instance;
        ezmk ezmkVar2 = ezmk.a;
        ezmkVar.b |= 2;
        ezmkVar.j = z;
        ezlu ezluVar = (ezlu) ezlv.a.createBuilder();
        ezluVar.copyOnWrite();
        ezlv ezlvVar = (ezlv) ezluVar.instance;
        str.getClass();
        ezlvVar.c = str;
        int intValue = num.intValue();
        ezluVar.copyOnWrite();
        ezlv ezlvVar2 = (ezlv) ezluVar.instance;
        ezlvVar2.b |= 1;
        ezlvVar2.d = intValue;
        ezlg ezlgVar = (ezlg) ezlw.a.createBuilder();
        ezlj ezljVar = ezlj.WRONG_EMOJI_CODE;
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).d = ezljVar.a();
        ezlgVar.copyOnWrite();
        ((ezlw) ezlgVar.instance).e = ezln.a(5);
        ezlv ezlvVar3 = (ezlv) ezluVar.build();
        ezlgVar.copyOnWrite();
        ezlw ezlwVar = (ezlw) ezlgVar.instance;
        ezlvVar3.getClass();
        ezlwVar.c = ezlvVar3;
        ezlwVar.b = 8;
        if (this.q.a()) {
            ezlgVar.copyOnWrite();
            ((ezlw) ezlgVar.instance).h = ezlk.a(i);
        }
        ezlw ezlwVar2 = (ezlw) ezlgVar.build();
        F.copyOnWrite();
        ezmk ezmkVar3 = (ezmk) F.instance;
        ezlwVar2.getClass();
        ezmkVar3.d = ezlwVar2;
        ezmkVar3.c = 18;
        A(F, 3);
    }

    @Override // defpackage.bzea
    public final void z(int i, int i2, int i3) {
        if (!this.g.a()) {
            C();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_TABLET_MODE_SWITCH;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eouf eoufVar = (eouf) eoui.a.createBuilder();
        eoufVar.copyOnWrite();
        eoui eouiVar = (eoui) eoufVar.instance;
        eouiVar.c = i - 1;
        eouiVar.b |= 1;
        eoufVar.copyOnWrite();
        eoui eouiVar2 = (eoui) eoufVar.instance;
        eouiVar2.d = i2 - 1;
        eouiVar2.b |= 2;
        eoufVar.copyOnWrite();
        eoui eouiVar3 = (eoui) eoufVar.instance;
        eouiVar3.b |= 4;
        eouiVar3.e = i3;
        boolean e = ((ctvs) this.f.b()).e();
        eoufVar.copyOnWrite();
        eoui eouiVar4 = (eoui) eoufVar.instance;
        eouiVar4.b |= 8;
        eouiVar4.f = e;
        eoui eouiVar5 = (eoui) eoufVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eouiVar5.getClass();
        eolvVar2.aS = eouiVar5;
        eolvVar2.e |= 65536;
        this.j.j(eoluVar);
    }
}
