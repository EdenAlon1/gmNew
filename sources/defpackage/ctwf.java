package defpackage;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwf extends ctwb {
    public static final enru j = enru.c("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtilsPostLMR1");
    public static final diyy k = diyv.b("cache_default_sms_subscription_id");
    public List l;
    public final SubscriptionManager m;
    private final SparseArray n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private emyl r;

    public ctwf(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        super(context, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar5);
        this.n = new SparseArray();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        this.m = subscriptionManager == null ? SubscriptionManager.from(context) : subscriptionManager;
        this.o = ffbrVar4;
        this.p = ffbrVar6;
        this.q = ffbrVar7;
        this.r = ((Boolean) k.a()).booleanValue() ? emys.b(new ctwc(), Duration.ofSeconds(dizg.a())) : null;
    }

    @Override // defpackage.ctwb
    public final int a() {
        List<SubscriptionInfo> activeSubscriptionInfoList = this.m.getActiveSubscriptionInfoList();
        int i = 0;
        if (activeSubscriptionInfoList != null) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                int subscriptionId = it.next().getSubscriptionId();
                ctwi h = h(subscriptionId);
                if (h.e() == 5 && h.A() && this.n.get(subscriptionId) == null) {
                    i++;
                }
            }
        }
        return i + this.n.size();
    }

    @Override // defpackage.ctwb
    public final int b() {
        int defaultDataSubscriptionId;
        defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        return Math.max(defaultDataSubscriptionId, -1);
    }

    @Override // defpackage.ctwb
    public final int c() {
        int defaultSmsSubscriptionId;
        if (!((Boolean) k.a()).booleanValue() || this.r == null) {
            defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
        } else {
            synchronized (this) {
                defaultSmsSubscriptionId = ((Integer) this.r.get()).intValue();
            }
        }
        return Math.max(defaultSmsSubscriptionId, -1);
    }

    @Override // defpackage.ctwb
    public final int d() {
        int defaultVoiceSubscriptionId;
        defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
        return Math.max(defaultVoiceSubscriptionId, -1);
    }

    @Override // defpackage.ctwb
    public final int e() {
        return this.m.getActiveSubscriptionInfoCountMax();
    }

    @Override // defpackage.ctwb
    public final int f() {
        int defaultSubscriptionId;
        defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
        return Math.max(defaultSubscriptionId, -1);
    }

    @Override // defpackage.ctwb
    public final ctwi h(int i) {
        ctwi ctwiVar = (ctwi) this.n.get(i);
        if (ctwiVar != null) {
            return ctwiVar;
        }
        if (((Boolean) dizg.o().a.aj.a()).booleanValue()) {
            emxf.d(i >= -1, "SubscriptionMetadataUtils get: invalid subId = %s", i);
        }
        if (i == -1) {
            i = ((ctvz) this.e.b()).b() ? c() : SmsManager.getDefaultSmsSubscriptionId();
        }
        if (i < -1) {
            i = -1;
        }
        this.b.lock();
        try {
            ctwi ctwiVar2 = (ctwi) this.c.get(i);
            if (ctwiVar2 == null) {
                ctwiVar2 = ((ctwj) this.g.b()).a((ctuy) this.i.b(), i);
                this.c.put(i, ctwiVar2);
            }
            int a = ctwiVar2.a();
            if (i < 0 && a != -1) {
                ensk j2 = ctwb.a.j();
                j2.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) j2;
                enrrVar.W(10, TimeUnit.SECONDS);
                enrrVar.aa(ensy.SMALL);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "get", 196, "SubscriptionMetadataUtils.java")).u("Bugle: SubscriptionMetadataUtils get: unexpected subId = %d, replacing with %d", -1, a);
            }
            return ctwiVar2;
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ctwb
    public final Optional l(final azop azopVar) {
        final azpp a = ((azpo) this.q.b()).a(azopVar);
        return a.c().or(new Supplier() { // from class: ctwd
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = ctwf.j;
                Optional findAny = Collection.EL.stream(azpp.this.a()).findAny();
                ensk h = ctwf.j.h();
                h.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(csux.w, azopVar.b());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtilsPostLMR1", "get", 270, "SubscriptionMetadataUtilsPostLMR1.java")).t("MyIdentity fallback from active subId to any subId: %s", findAny);
                return findAny;
            }
        }).map(new Function() { // from class: ctwe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ctwf.this.h(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.ctwb
    public final List m() {
        List<SubscriptionInfo> activeSubscriptionInfoList = this.m.getActiveSubscriptionInfoList();
        ArrayList arrayList = new ArrayList();
        if (activeSubscriptionInfoList != null) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                int subscriptionId = it.next().getSubscriptionId();
                if (this.n.get(subscriptionId) == null) {
                    ctwi h = h(subscriptionId);
                    if (h.e() == 5 && h.A()) {
                        arrayList.add(h);
                    }
                }
            }
        }
        int size = this.n.size();
        while (true) {
            size--;
            if (size < 0) {
                return arrayList;
            }
            arrayList.add((ctwi) this.n.valueAt(size));
        }
    }

    @Override // defpackage.ctwb
    public final void n() {
        if (((Boolean) k.a()).booleanValue()) {
            synchronized (this) {
                this.r = emys.b(new ctwc(), Duration.ofSeconds(dizg.a()));
            }
        }
    }

    @Override // defpackage.ctwb
    public final boolean q() {
        return c() != -1;
    }

    @Override // defpackage.ctwb
    public final boolean r() {
        int simState;
        int simState2;
        int simState3;
        int simState4;
        simState = ((TelephonyManager) this.f.get()).getSimState(0);
        if (simState != 1) {
            simState4 = ((TelephonyManager) this.f.get()).getSimState(0);
            if (simState4 != 0) {
                return true;
            }
        }
        simState2 = ((TelephonyManager) this.f.get()).getSimState(1);
        if (simState2 != 1) {
            simState3 = ((TelephonyManager) this.f.get()).getSimState(1);
            if (simState3 != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctwb
    public final boolean s(azop azopVar) {
        return ((azpo) this.q.b()).a(azopVar).a().contains(Integer.valueOf(c()));
    }

    @Override // defpackage.ctwb
    public final boolean t() {
        boolean isValidSubscriptionId;
        if (!ctid.d) {
            return true;
        }
        isValidSubscriptionId = SubscriptionManager.isValidSubscriptionId(SmsManager.getDefaultSmsSubscriptionId());
        return isValidSubscriptionId;
    }

    @Override // defpackage.ctwb
    public final void u(int i, String str, int i2, String str2, String str3, aoku aokuVar, int i3, Optional optional) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        optional.isPresent();
        ctvb ctvbVar = (ctvb) this.h.b();
        ctvf ctvfVar = (ctvf) aokuVar.f().orElse(null);
        ctvfVar.getClass();
        String z = ctvbVar.z(ctvfVar);
        ctvi ctviVar = (ctvi) this.o.b();
        ctus ctusVar = new ctus();
        ctusVar.b();
        ctusVar.h(0);
        ctusVar.e = "SUB DISPLAY NAME";
        ctusVar.f = "SUB PREFERRED NAME";
        ctusVar.g = "SUB CARRIER NAME";
        ctusVar.h = "SUB SIM CARRIER NAME";
        ctusVar.p = (short) (ctusVar.p | 8);
        ctusVar.a();
        ctusVar.i = "2025550185";
        ctusVar.f();
        ctusVar.c(0);
        ctusVar.d(0);
        ctusVar.n = "1234567890000000";
        ctusVar.e("US");
        ctusVar.g("US");
        ctusVar.o = 5;
        short s = ctusVar.p;
        ctusVar.a = i;
        ctusVar.p = (short) (s | 257);
        ctusVar.b();
        ctusVar.c = str;
        ctusVar.h(i2);
        ctusVar.e = str2;
        ctusVar.g = str3;
        ctusVar.a();
        ctusVar.i = aokuVar.o();
        ctusVar.f();
        ctusVar.c(214);
        ctusVar.d(i3);
        ctusVar.g(z);
        ctusVar.e(z);
        if (ctusVar.p == 511 && (str4 = ctusVar.e) != null && (str5 = ctusVar.f) != null && (str6 = ctusVar.g) != null && (str7 = ctusVar.h) != null && (str8 = ctusVar.i) != null && (str9 = ctusVar.l) != null && (str10 = ctusVar.m) != null && (str11 = ctusVar.n) != null) {
            ctwq ctwqVar = new ctwq(ctviVar, this, new ctut(ctusVar.a, ctusVar.b, ctusVar.c, ctusVar.d, str4, str5, str6, str7, str8, ctusVar.j, ctusVar.k, str9, str10, str11, ctusVar.o), (aobh) this.p.b());
            this.n.put(ctwqVar.a(), ctwqVar);
            List list = this.l;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((SubscriptionManager.OnSubscriptionsChangedListener) it.next()).onSubscriptionsChanged();
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((ctusVar.p & 1) == 0) {
            sb.append(" subId");
        }
        if ((ctusVar.p & 2) == 0) {
            sb.append(" isAvailable");
        }
        if ((ctusVar.p & 4) == 0) {
            sb.append(" simSlotIndex");
        }
        if (ctusVar.e == null) {
            sb.append(" displayName");
        }
        if (ctusVar.f == null) {
            sb.append(" preferredName");
        }
        if (ctusVar.g == null) {
            sb.append(" carrierName");
        }
        if (ctusVar.h == null) {
            sb.append(" simCarrierName");
        }
        if ((ctusVar.p & 8) == 0) {
            sb.append(" simCarrierId");
        }
        if ((ctusVar.p & 16) == 0) {
            sb.append(" iconTint");
        }
        if (ctusVar.i == null) {
            sb.append(" phoneNumber");
        }
        if ((ctusVar.p & 32) == 0) {
            sb.append(" roaming");
        }
        if ((ctusVar.p & 64) == 0) {
            sb.append(" mcc");
        }
        if ((ctusVar.p & 128) == 0) {
            sb.append(" mnc");
        }
        if (ctusVar.l == null) {
            sb.append(" simCountryIso");
        }
        if (ctusVar.m == null) {
            sb.append(" networkCountryIso");
        }
        if (ctusVar.n == null) {
            sb.append(" subscriptionId");
        }
        if ((ctusVar.p & 256) == 0) {
            sb.append(" simState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
