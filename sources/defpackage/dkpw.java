package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.Optional;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dkpw extends dkpc implements dkpn, dkpk {
    public static final dktn a = new dktn("(Sim)");
    SubscriptionManager.OnSubscriptionsChangedListener b;
    volatile Handler c;
    HandlerThread d;
    public final dkpi e;
    public final dkpl f;
    public final Context g;
    private final SparseArray h = new SparseArray();
    private int i = 1;
    private int j = -1;
    private int k = -1;
    private final dkpq l;
    private final dkpp m;
    private final ffbr n;
    private final dksa o;
    private final Executor p;
    private final ffbr q;
    private final dkvf r;

    public dkpw(Context context, dksa dksaVar, dkpl dkplVar, dkpq dkpqVar, dkpp dkppVar, dkpi dkpiVar, ffbr ffbrVar, ffbr ffbrVar2, Executor executor) {
        this.g = context;
        this.o = dksaVar;
        this.f = dkplVar;
        this.l = dkpqVar;
        this.m = dkppVar;
        this.e = dkpiVar;
        this.p = new ersb(executor);
        this.q = ffbrVar;
        this.r = new dkvf(ffbrVar);
        this.n = ffbrVar2;
    }

    public static final int B(Context context) {
        return dkvq.b(context).a.getActiveSubscriptionInfoCountMax();
    }

    protected static final String C(Context context, int i) {
        dkvt F = F(context, i);
        String i2 = F == null ? "" : F.i();
        return TextUtils.isEmpty(i2) ? "" : i2;
    }

    protected static final String D(Context context, int i) {
        dkvt F = F(context, i);
        String n = F == null ? "" : F.n();
        if (TextUtils.isEmpty(n)) {
            throw new IllegalStateException("SIM card is not available");
        }
        return n;
    }

    private final synchronized dkpv E(int i) {
        for (int i2 = 0; i2 < this.i; i2++) {
            dkpv dkpvVar = (dkpv) this.h.get(i2);
            if (dkpvVar != null && dkpvVar.b == i) {
                return dkpvVar;
            }
        }
        return null;
    }

    private static dkvt F(Context context, int i) {
        return dkvt.g(context).f(i);
    }

    private final Optional G(String str) {
        return !TextUtils.isEmpty(str) ? Optional.of(this.o.b(str)) : Optional.empty();
    }

    private final synchronized void H() {
        for (int i = 0; i < this.i; i++) {
            dkty.d(a, "SIM slot#%d : %s", Integer.valueOf(i), this.h.get(i));
        }
    }

    private final void I(String str) {
        try {
            Optional G = G(str);
            if (G.isPresent()) {
                dkty.l(a, "Caching isFiDevice for iccid: %s", dktx.SIM_ICCID.c(G.get()));
                this.o.e((String) G.get());
            }
        } catch (dksb e) {
            dkty.t(e, a, "exception when try to set isFiDeviceToIccid", new Object[0]);
        }
    }

    private final void J(Context context, int i) {
        deva devaVar = this.m.e;
        String C = C(context, i);
        devaVar.e(C);
        String u = u(context, C, i);
        this.m.f.e(u);
        dktn dktnVar = a;
        dkty.d(dktnVar, "Updated raw MSISDN:%s, formatted MSISDN:%s in SimPreferences", dktx.PHONE_NUMBER.c(C), dktx.PHONE_NUMBER.c(u));
        if (!dkuy.f(context)) {
            dkty.l(dktnVar, "Skipping writing to Msisdn because this is not main bugle process.", new Object[0]);
            return;
        }
        efbd.b();
        try {
            this.o.j("currentActiveMsisdn", u, "RcsApplicationData");
            dkty.d(dktnVar, "Updated formatted MSISDN:%s in BugleSharedPreferences", dktx.PHONE_NUMBER.c(u));
        } catch (dksb e) {
            dkty.j(e, a, "Failed to update from bugleSharedPreferences", new Object[0]);
        }
    }

    private final synchronized void K(Context context, int i, int i2, String str) {
        if (i < 0) {
            dkty.h(a, "Invalid slotId %d", Integer.valueOf(i));
            return;
        }
        if (this.i > 1 && "LOADED".equals(str)) {
            z(context);
            if (i2 < 0 && this.h.get(i) != null) {
                i2 = ((dkpv) this.h.get(i)).b;
            }
        }
        int i3 = i2;
        dkpv E = E(i3);
        if (E != null) {
            this.h.delete(E.a);
            if ("NOT_READY".equals(str) && "LOADED".equals(E.f)) {
                dkty.l(a, "Unexpected SIM_NOT_READY.", new Object[0]);
                str = "ABSENT";
            }
        }
        this.h.put(i, new dkpv(i, i3, 0, 0, null, str));
    }

    private final synchronized boolean L() {
        for (int i = 0; i < this.i; i++) {
            if (this.h.get(i) == null) {
                return false;
            }
            String str = ((dkpv) this.h.get(i)).f;
            if (!"ABSENT".equals(str) && !"LOADED".equals(str) && !"LOCKED".equals(str)) {
                return false;
            }
        }
        return true;
    }

    private static final String M(Context context, int i) {
        String m;
        int B = B(context);
        if (B <= 1 || i < 0) {
            dkty.d(a, "Don't use sub id to get mcc/mnc: slot_num=%d; sub_id=%d;", Integer.valueOf(B), Integer.valueOf(i));
            m = dkvt.g(context).m();
        } else {
            dkty.d(a, "Use sub id %d to get mcc/mnc", Integer.valueOf(i));
            if (ctid.b) {
                dkvt F = F(context, i);
                if (F != null) {
                    m = F.m();
                }
                m = "";
            } else {
                try {
                    try {
                        TelephonyManager telephonyManager = dkvt.g(context).a;
                        Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getSimOperator", Integer.TYPE);
                        declaredMethod.setAccessible(true);
                        m = (String) String.class.cast(declaredMethod.invoke(telephonyManager, Integer.valueOf(i)));
                    } catch (Exception e) {
                        throw new dkvc(a.a("getSimOperator", "Invoking ", " failed"), e);
                    }
                } catch (dkvc e2) {
                    dkty.j(e2, a, "Failed to get sim operator from telephony for sub id %d", Integer.valueOf(i));
                }
            }
        }
        return TextUtils.isEmpty(m) ? "" : m;
    }

    public static IntentFilter s() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ims.SIM_LOADED");
        intentFilter.addAction("com.google.android.ims.SIM_ABSENT");
        return intentFilter;
    }

    final synchronized boolean A(Context context, String str) {
        eyxz c = this.l.c();
        if (this.j == f(context) && c != null) {
            int a2 = ezfi.a(c.c);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 == ("LOADED".equals(str) ? 2 : "ABSENT".equals(str) ? 3 : 1)) {
                if (B(context) > 1) {
                    return this.k == b(context);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dkpk
    public final void a(Context context, Intent intent) {
        int i;
        String str;
        if (intent != null) {
            dkty.l(a, "process intent: %s", intent.getAction());
        }
        this.q.b();
        synchronized (this) {
            this.i = B(context);
            String str2 = "";
            final int i2 = -1;
            if (intent != null) {
                str2 = emxe.b(intent.getStringExtra("ss"));
                i = intent.hasExtra("android.telephony.extra.SUBSCRIPTION_INDEX") ? intent.getIntExtra("android.telephony.extra.SUBSCRIPTION_INDEX", -1) : intent.hasExtra("subscription") ? intent.getIntExtra("subscription", -1) : -1;
                boolean equals = "android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction());
                if (equals && B(this.g) == 1) {
                    i2 = 0;
                }
                if (intent.hasExtra("android.telephony.extra.SLOT_INDEX")) {
                    i2 = intent.getIntExtra("android.telephony.extra.SLOT_INDEX", i2);
                } else if (intent.hasExtra("slot")) {
                    i2 = intent.getIntExtra("slot", i2);
                } else if (intent.hasExtra("phone")) {
                    i2 = intent.getIntExtra("phone", i2);
                    dkty.r(a, "EXTRA_SLOT_KEY is not available. use PHONE_KEY:%d", Integer.valueOf(i2));
                } else if (equals) {
                    dkty.r(a, "Missing slot index in SIM_STATE_CHANGED event", new Object[0]);
                }
            } else {
                i = -1;
            }
            this.q.b();
            Handler handler = this.c;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dkpt
                    @Override // java.lang.Runnable
                    public final void run() {
                        dkpw.this.n(i2);
                    }
                });
                return;
            }
            if (intent == null) {
                return;
            }
            dktn dktnVar = a;
            dkty.d(dktnVar, "Received SIM state %s for subId=%d slotId=%d", str2, Integer.valueOf(i), Integer.valueOf(i2));
            K(context, i2, i, str2);
            H();
            dkty.d(dktnVar, "DefaultSubId=%d", Integer.valueOf(f(context)));
            if (!L()) {
                dkty.d(dktnVar, "SIM subscription update is not finished.", new Object[0]);
                return;
            }
            dkpv t = t(context);
            if (t == null) {
                dkty.r(dktnVar, "Default SIM info not updated.", new Object[0]);
                str = "ABSENT";
            } else {
                str = t.f;
            }
            dkty.l(dktnVar, "Processing an intent", new Object[0]);
            x(context, str, i, i2);
        }
    }

    @Override // defpackage.dkpn
    public final int b(Context context) {
        int defaultDataSubscriptionId;
        dkvq.b(context);
        defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        return defaultDataSubscriptionId;
    }

    @Override // defpackage.dkpc
    public final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        dkty.l(a, "Unexpected action: %s", intent.getAction());
    }

    @Override // defpackage.dkpc
    protected final Executor d() {
        return this.p;
    }

    @Override // defpackage.dkpc
    public final boolean e(Context context, Intent intent) {
        if ("android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction()) || "android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED".equals(intent.getAction()) || "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED".equals(intent.getAction())) {
            dkty.d(a, "Received intent %s", intent.getAction());
            return true;
        }
        dkty.r(a, "Unexpected action: %s", intent.getAction());
        return false;
    }

    @Override // defpackage.dkpn
    public final int f(Context context) {
        int defaultSubscriptionId;
        dkvq.b(context);
        defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
        return defaultSubscriptionId;
    }

    @Override // defpackage.dkpn
    public final int g() {
        return this.m.a();
    }

    @Override // defpackage.dkpn
    public final synchronized int h() {
        return this.m.b();
    }

    @Override // defpackage.dkpn
    public final Optional i(int i) {
        String str;
        dkpv E = E(i);
        return (E == null || (str = E.e) == null) ? Optional.empty() : Optional.of(str);
    }

    @Override // defpackage.dkpn
    public final String j() {
        String h;
        synchronized (this) {
            h = this.m.h();
            if (dktk.d(h) && this.m.t()) {
                try {
                    Context context = this.g;
                    int h2 = h();
                    if (r(context)) {
                        J(context, h2);
                    }
                    h = this.m.h();
                } catch (dkvd unused) {
                    dkty.h(a, "Exception updating MSISDN", new Object[0]);
                }
            }
            dkty.d(a, "Formatted MSISDN: %s", dktx.PHONE_NUMBER.c(h));
        }
        return h;
    }

    @Override // defpackage.dkpn
    public final String k() {
        return this.m.j();
    }

    @Override // defpackage.dkpn
    public final synchronized void l(PrintWriter printWriter) {
        printWriter.println("- SimStateTracker -");
        printWriter.println("  default subId: " + this.j);
        printWriter.println("  stored subId: " + this.m.b());
        printWriter.println("  stored slotIndex: " + this.m.a());
        printWriter.println("  stored SIM ID: ".concat(String.valueOf(dktx.SIM_ID.c(this.m.l()))));
        printWriter.println("  stored IMSI: ".concat(String.valueOf(dktx.IMSI.c(this.m.j()))));
        printWriter.println("  stored raw MSISDN: ".concat(String.valueOf(dktx.PHONE_NUMBER.c(this.m.k()))));
        printWriter.println("  stored SIM operator: ".concat(String.valueOf(this.m.m())));
        printWriter.println("  stored GID1: ".concat(String.valueOf(this.m.i())));
        printWriter.println("  isFiDevice: " + this.m.t());
        printWriter.println("  # of SIM slot: " + this.i);
        for (int i = 0; i < this.i; i++) {
            printWriter.printf("  SIM slot#%d : %s\n", Integer.valueOf(i), this.h.get(i));
        }
    }

    @Override // defpackage.dkpn
    public final void m(Context context, Intent intent) {
        a(context, intent);
    }

    @Override // defpackage.dkpn
    public final void n(int i) {
        String str;
        int i2;
        z(this.g);
        H();
        dktn dktnVar = a;
        dkty.d(dktnVar, "DefaultSubId=%d", Integer.valueOf(f(this.g)));
        if (!L()) {
            dkty.d(dktnVar, "SIM subscription update is not finished.", new Object[0]);
            return;
        }
        dkpv t = t(this.g);
        if (t == null) {
            dkty.r(dktnVar, "Default SIM info not updated.", new Object[0]);
            i2 = -1;
            str = "ABSENT";
        } else {
            str = t.f;
            i2 = t.b;
        }
        dkty.l(dktnVar, "Processing an intent", new Object[0]);
        x(this.g, str, i2, i);
    }

    @Override // defpackage.dkpn
    public final synchronized void o() {
        if (this.c == null) {
            HandlerThread handlerThread = new HandlerThread("SimStateTrackerHandler");
            this.d = handlerThread;
            dtnu.a(handlerThread);
            this.d.start();
            this.c = new Handler(this.d.getLooper());
        }
        dkpl dkplVar = this.f;
        if (dkplVar != null) {
            Context context = this.g;
            Handler handler = this.c;
            handler.getClass();
            dkplVar.a(context, this, handler);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED");
        this.g.registerReceiver(this, intentFilter);
        dktn dktnVar = a;
        dkty.d(dktnVar, "Registered sim events broadcast receiver", new Object[0]);
        Handler handler2 = this.c;
        handler2.getClass();
        handler2.post(new Runnable() { // from class: dkps
            @Override // java.lang.Runnable
            public final void run() {
                dkpw dkpwVar = dkpw.this;
                dkpu dkpuVar = new dkpu(dkpwVar);
                try {
                    dkvq.b(dkpwVar.g).e(dkpuVar);
                    dkpwVar.b = dkpuVar;
                    dkty.d(dkpw.a, "SubscriptionsChangedListener is added.", new Object[0]);
                } catch (dkvd e) {
                    dkty.j(e, dkpw.a, "Failed to add onSubscriptionsChangedListener.", new Object[0]);
                }
            }
        });
        dkty.d(dktnVar, "Number of SIM slot: %d", Integer.valueOf(B(this.g)));
    }

    @Override // defpackage.dkpn
    public final void p(String str, String str2) {
        this.o.j("msisdn_for_iccid_".concat(str), str2, "bugle");
    }

    @Override // defpackage.dkpn
    public final synchronized void q() {
        try {
            this.g.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            dkty.j(e, a, "Failed to unregister intent receiver.", new Object[0]);
        }
        HandlerThread handlerThread = this.d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.d = null;
            this.c = null;
        }
        SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener = this.b;
        if (onSubscriptionsChangedListener != null) {
            this.b = null;
            try {
                try {
                    dkvq.b(this.g).a.removeOnSubscriptionsChangedListener(onSubscriptionsChangedListener);
                    dkty.d(a, "SubscriptionsChangedListener is removed.", new Object[0]);
                } catch (SecurityException e2) {
                    throw new dkvd("READ_PHONE_STATE permission is missing.", e2);
                }
            } catch (Exception e3) {
                dkty.j(e3, a, "Failed to remove onSubscriptionsChangedListener.", new Object[0]);
            }
        }
        dkpl dkplVar = this.f;
        if (dkplVar != null) {
            dkplVar.b();
        }
    }

    @Override // defpackage.dkpn
    public final boolean r(Context context) {
        dkpv t = t(context);
        return "LOADED".equals(t != null ? t.f : "");
    }

    final synchronized dkpv t(Context context) {
        if (this.i == 1) {
            return (dkpv) this.h.get(0);
        }
        return E(f(context));
    }

    protected final String u(Context context, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        dkvt F = F(context, i);
        String d = F == null ? "" : emuz.d(F.l());
        if (((esfl) this.q.b()).h(str, d)) {
            return emxe.b(this.r.a(str, d));
        }
        dkty.r(a, "line1number from telephony is invalid! (%s) %s", d, dktx.PHONE_NUMBER.c(str));
        return "";
    }

    public final synchronized List v() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (int i = 0; i < this.h.size(); i++) {
            dkpv dkpvVar = (dkpv) this.h.valueAt(i);
            if (dkpvVar != null) {
                arrayList.add(dkpvVar);
            }
        }
        return arrayList;
    }

    final synchronized void w(eyxz eyxzVar) {
        eyxz eyxzVar2;
        int defaultVoiceSubscriptionId;
        int defaultSmsSubscriptionId;
        try {
            Context context = this.g;
            dkvq.b(context);
            defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
            dkvq.b(context);
            defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
            int b = b(context);
            eyxy eyxyVar = (eyxy) eyxzVar.toBuilder();
            for (dkpv dkpvVar : v()) {
                if (dkpvVar != null && "LOADED".equals(dkpvVar.f)) {
                    int i = dkpvVar.b;
                    SubscriptionInfo a2 = dkvq.b(context).a(i);
                    String number = a2 != null ? a2.getNumber() : "";
                    eyxv eyxvVar = (eyxv) eyxw.a.createBuilder();
                    boolean z = i == defaultVoiceSubscriptionId;
                    eyxvVar.copyOnWrite();
                    eyxw eyxwVar = (eyxw) eyxvVar.instance;
                    eyxwVar.b |= 1;
                    eyxwVar.c = z;
                    boolean z2 = i == defaultSmsSubscriptionId;
                    eyxvVar.copyOnWrite();
                    eyxw eyxwVar2 = (eyxw) eyxvVar.instance;
                    eyxwVar2.b |= 2;
                    eyxwVar2.d = z2;
                    boolean z3 = i == b;
                    eyxvVar.copyOnWrite();
                    eyxw eyxwVar3 = (eyxw) eyxvVar.instance;
                    eyxwVar3.b |= 4;
                    eyxwVar3.e = z3;
                    eyxw eyxwVar4 = (eyxw) eyxvVar.build();
                    eyxt eyxtVar = (eyxt) eyxx.a.createBuilder();
                    eyxtVar.copyOnWrite();
                    eyxx eyxxVar = (eyxx) eyxtVar.instance;
                    eyxxVar.b |= 1;
                    eyxxVar.c = i;
                    int i2 = true != TextUtils.isEmpty(number) ? 2 : 3;
                    eyxtVar.copyOnWrite();
                    eyxx eyxxVar2 = (eyxx) eyxtVar.instance;
                    eyxxVar2.d = i2 - 1;
                    eyxxVar2.b |= 2;
                    eyxtVar.copyOnWrite();
                    eyxx eyxxVar3 = (eyxx) eyxtVar.instance;
                    eyxwVar4.getClass();
                    eyxxVar3.e = eyxwVar4;
                    eyxxVar3.b |= 4;
                    eyxx eyxxVar4 = (eyxx) eyxtVar.build();
                    eyxyVar.copyOnWrite();
                    eyxz eyxzVar3 = (eyxz) eyxyVar.instance;
                    eyxxVar4.getClass();
                    eygr eygrVar = eyxzVar3.g;
                    if (!eygrVar.c()) {
                        eyxzVar3.g = eyfy.mutableCopy(eygrVar);
                    }
                    eyxzVar3.g.add(eyxxVar4);
                }
            }
            eyxzVar2 = (eyxz) eyxyVar.build();
        } catch (dkvd e) {
            dkty.j(e, a, "Attempted to get device SIM configuration without phone permission", new Object[0]);
            eyxzVar2 = eyxzVar;
        }
        this.e.b(eyxzVar2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:18|19|(1:21)(1:254)|(1:23)(1:253)|24|25|26|27|(9:29|30|31|32|33|34|35|36|(34:38|39|40|(4:182|183|(2:185|(1:187))|189)(1:42)|43|(31:173|174|(1:176)(1:178)|177|47|(1:49)(2:167|168)|50|(1:52)|53|(6:55|(6:58|(4:60|61|62|63)|66|(6:68|69|70|71|72|73)(1:77)|74|56)|78|79|(5:82|83|84|(3:86|87|88)(6:89|(6:92|(4:96|(1:98)|99|(7:110|111|112|113|114|116|109)(5:101|102|(1:104)|105|106))|107|108|109|90)|123|119|120|88)|80)|126)|127|(1:129)|130|(1:132)(1:166)|133|(1:135)|136|(1:138)(1:165)|139|(1:141)|142|(1:144)(1:164)|145|146|147|(1:149)(1:161)|150|(1:152)(2:157|(1:159))|153|(1:155)|156)(1:45)|46|47|(0)(0)|50|(0)|53|(0)|127|(0)|130|(0)(0)|133|(0)|136|(0)(0)|139|(0)|142|(0)(0)|145|146|147|(0)(0)|150|(0)(0)|153|(0)|156))(1:249)|193|(3:228|229|(36:233|(1:235)(1:240)|(1:237)|239|40|(0)(0)|43|(0)(0)|46|47|(0)(0)|50|(0)|53|(0)|127|(0)|130|(0)(0)|133|(0)|136|(0)(0)|139|(0)|142|(0)(0)|145|146|147|(0)(0)|150|(0)(0)|153|(0)|156))|195|(3:198|(4:201|(8:203|204|205|206|207|(2:212|213)|209|210)(1:226)|211|199)|227)|197|(0)(0)|43|(0)(0)|46|47|(0)(0)|50|(0)|53|(0)|127|(0)|130|(0)(0)|133|(0)|136|(0)(0)|139|(0)|142|(0)(0)|145|146|147|(0)(0)|150|(0)(0)|153|(0)|156) */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0564, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0567, code lost:
    
        defpackage.dkty.t(r0, defpackage.dkpw.a, "Exception getting groupIdLevel1", new java.lang.Object[0]);
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04b7 A[Catch: IllegalStateException -> 0x065d, dkvd -> 0x0669, all -> 0x06e8, TryCatch #6 {dkvd -> 0x0669, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:118:0x04a2, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x060c A[Catch: IllegalStateException -> 0x065d, dkvd -> 0x0669, all -> 0x06e8, TryCatch #6 {dkvd -> 0x0669, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:118:0x04a2, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0553 A[Catch: dkvd | SecurityException -> 0x0564, SecurityException -> 0x0566, IllegalStateException -> 0x065d, all -> 0x06e8, TryCatch #12 {IllegalStateException -> 0x065d, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:174:0x0242, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:84:0x03d7, B:86:0x03dd, B:89:0x03ea, B:90:0x03ee, B:92:0x03f4, B:94:0x0406, B:96:0x040c, B:98:0x041f, B:99:0x0425, B:111:0x0433, B:114:0x0437, B:118:0x04a2, B:102:0x0456, B:104:0x0466, B:105:0x046b, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:147:0x053d, B:150:0x054a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:157:0x0553, B:161:0x0546, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:178:0x024d, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:229:0x010c, B:231:0x0112, B:237:0x0121, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:204:0x0169, B:207:0x0173, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0546 A[Catch: dkvd | SecurityException -> 0x0564, SecurityException -> 0x0566, IllegalStateException -> 0x065d, all -> 0x06e8, TryCatch #12 {IllegalStateException -> 0x065d, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:174:0x0242, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:84:0x03d7, B:86:0x03dd, B:89:0x03ea, B:90:0x03ee, B:92:0x03f4, B:94:0x0406, B:96:0x040c, B:98:0x041f, B:99:0x0425, B:111:0x0433, B:114:0x0437, B:118:0x04a2, B:102:0x0456, B:104:0x0466, B:105:0x046b, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:147:0x053d, B:150:0x054a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:157:0x0553, B:161:0x0546, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:178:0x024d, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:229:0x010c, B:231:0x0112, B:237:0x0121, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:204:0x0169, B:207:0x0173, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0508 A[Catch: IllegalStateException -> 0x065d, dkvd -> 0x0669, all -> 0x06e8, TryCatch #6 {dkvd -> 0x0669, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:118:0x04a2, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04ea A[Catch: IllegalStateException -> 0x065d, dkvd -> 0x0669, all -> 0x06e8, TryCatch #6 {dkvd -> 0x0669, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:118:0x04a2, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0145 A[Catch: IllegalStateException -> 0x065d, dkvd -> 0x0669, all -> 0x06e8, TryCatch #6 {dkvd -> 0x0669, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:118:0x04a2, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0220 A[Catch: IllegalStateException -> 0x065d, dkvd -> 0x0669, all -> 0x06e8, TryCatch #6 {dkvd -> 0x0669, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:118:0x04a2, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e2 A[Catch: IllegalStateException -> 0x065d, dkvd -> 0x0669, all -> 0x06e8, TryCatch #6 {dkvd -> 0x0669, blocks: (B:19:0x0068, B:24:0x0083, B:27:0x0090, B:31:0x009c, B:36:0x00a8, B:38:0x00b8, B:183:0x01ab, B:185:0x01b5, B:187:0x01d1, B:43:0x0224, B:47:0x0263, B:50:0x02ce, B:53:0x02d6, B:55:0x02e2, B:56:0x02ff, B:58:0x0305, B:62:0x0315, B:63:0x0336, B:65:0x0325, B:66:0x0347, B:70:0x0351, B:72:0x0375, B:76:0x0363, B:79:0x038a, B:80:0x038e, B:82:0x0394, B:118:0x04a2, B:127:0x04af, B:129:0x04b7, B:130:0x04c1, B:133:0x04f0, B:136:0x04f8, B:139:0x050c, B:142:0x0514, B:145:0x052a, B:153:0x0573, B:155:0x060c, B:156:0x0626, B:163:0x0567, B:165:0x0508, B:166:0x04ea, B:168:0x02c8, B:171:0x0655, B:172:0x065c, B:181:0x0253, B:189:0x0208, B:42:0x0220, B:191:0x01ff, B:193:0x00f9, B:195:0x0133, B:198:0x0145, B:199:0x0153, B:201:0x0159, B:213:0x0184, B:217:0x0190, B:220:0x019d, B:242:0x012a, B:244:0x00f0, B:253:0x0080, B:254:0x007a), top: B:18:0x0068, outer: #9 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void x(android.content.Context r24, java.lang.String r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkpw.x(android.content.Context, java.lang.String, int, int):void");
    }

    final void y(Context context, eyxz eyxzVar) {
        Intent a2 = dkpq.a(eyxzVar);
        String action = a2.getAction();
        if (((Boolean) this.n.b()).booleanValue() && action != null && action.equals("com.google.android.ims.SIM_LOADED")) {
            dkty.l(a, "Handling SIM_LOADED in PhoneSimsStateUpdater.", new Object[0]);
        } else {
            dkty.l(a, "Broadcasting %s", a2.toString());
            lpf.a(context).d(a2);
        }
    }

    final synchronized void z(Context context) {
        dkvq b = dkvq.b(context);
        this.i = B(context);
        for (int i = 0; i < this.i; i++) {
            try {
                try {
                    SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = b.a.getActiveSubscriptionInfoForSimSlotIndex(i);
                    dkty.d(a, "Slot#%d: SubscriptionInfo=%s", Integer.valueOf(i), dktx.GENERIC.c(activeSubscriptionInfoForSimSlotIndex));
                    if (activeSubscriptionInfoForSimSlotIndex == null) {
                        this.h.put(i, new dkpv(i, -1, 0, 0, null, "ABSENT"));
                    } else {
                        String str = "";
                        try {
                            TelephonyManager e = dkvt.g(context).e(activeSubscriptionInfoForSimSlotIndex.getSubscriptionId());
                            str = (e == null || e.getSimState() != 5) ? "ABSENT" : "LOADED";
                        } catch (dkvd unused) {
                            dkty.h(a, "Permission is required for TelephonyManager", new Object[0]);
                        }
                        this.h.put(i, new dkpv(i, activeSubscriptionInfoForSimSlotIndex.getSubscriptionId(), activeSubscriptionInfoForSimSlotIndex.getMcc(), activeSubscriptionInfoForSimSlotIndex.getMnc(), activeSubscriptionInfoForSimSlotIndex.getIccId(), str));
                    }
                } catch (SecurityException e2) {
                    throw new dkvd("READ_PHONE_STATE permission is missing.", e2);
                }
            } catch (dkvd unused2) {
                dkty.h(a, "Permission is required for SubscriptionManager", new Object[0]);
                return;
            }
        }
    }
}
