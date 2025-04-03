package defpackage;

import android.os.Bundle;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpar {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final ffbr i;
    private final Object j = new Object();
    private final Bundle h = new Bundle();
    private final HashMap k = new HashMap();

    public cpar(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.i = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
        this.e = ffbrVar6;
        this.f = ffbrVar7;
        this.g = ffbrVar8;
        eeww.c().i(new eewj("carrierConfigDump", new eewf(this)));
    }

    public static Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabledMMS", true);
        bundle.putBoolean("enabledTransID", false);
        bundle.putBoolean("enabledNotifyWapMMSC", false);
        bundle.putBoolean("aliasEnabled", false);
        bundle.putBoolean("enableMultipartSMS", true);
        bundle.putBoolean("enableSMSDeliveryReports", true);
        bundle.putBoolean("enableGroupMms", true);
        bundle.putBoolean("supportMmsContentDisposition", true);
        bundle.putBoolean("config_cellBroadcastAppLinks", true);
        bundle.putBoolean("sendMultipartSmsAsSeparateMessages", false);
        bundle.putBoolean("supportHttpCharsetHeader", false);
        bundle.putBoolean("groupChatDefaultsToMMS", true);
        bundle.putBoolean("smsEncodingChangeable", true);
        bundle.putBoolean("smsUsesSimpleCharactersOnly", false);
        bundle.putBoolean("allowEnablingWapPushSI", false);
        bundle.putBoolean("enableWapPushSI", false);
        bundle.putBoolean("supportMmsPriority", true);
        bundle.putBoolean("mms_auto_retrieve_enabled_bool", true);
        bundle.putBoolean("mmsRoamingAutoRetrieveByDefault", false);
        bundle.putBoolean("smsDeliveryReportSettingOnByDefault", false);
        bundle.putBoolean("allowChangingMmsRoamingAutoRetrieve", true);
        bundle.putBoolean("useCustomUserAgent", false);
        bundle.putBoolean("allowEditingSmscAddress", false);
        bundle.putInt("maxMessageSize", 307200);
        bundle.putInt("maxImageHeight", 480);
        bundle.putInt("maxImageWidth", 640);
        bundle.putInt("recipientLimit", Alert.DURATION_SHOW_INDEFINITELY);
        bundle.putInt("httpSocketTimeout", kx.a);
        bundle.putInt("aliasMinChars", 2);
        bundle.putInt("aliasMaxChars", 48);
        bundle.putInt("smsToMmsTextThreshold", -1);
        bundle.putInt("smsToMmsTextLengthThreshold", -1);
        bundle.putInt("maxMessageTextSize", -1);
        bundle.putInt("maxSubjectLength", 40);
        bundle.putInt("emailGatewaySmsToMmsTextThreshold", -1);
        bundle.putString("uaProfTagName", "x-wap-profile");
        bundle.putString("httpParams", "");
        bundle.putString("emailGatewayNumber", "");
        bundle.putString("naiSuffix", "");
        bundle.putString("hiddenContactsData", "");
        bundle.putString("smsErrorDescMap", "");
        bundle.putString("spamForwardingNumber", "");
        return bundle;
    }

    private static void e(Bundle bundle, TreeMap treeMap, cpas cpasVar) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "null";
            }
            treeMap.put(str, new cpag(obj, cpasVar));
        }
    }

    private static void f(final Bundle bundle, Optional optional, final String str) {
        optional.ifPresent(new Consumer() { // from class: cpap
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final Bundle b(int i) {
        cxan cxanVar;
        Bundle bundle = new Bundle();
        synchronized (this.j) {
            HashMap hashMap = this.k;
            Integer valueOf = Integer.valueOf(i);
            cxanVar = (cxan) hashMap.get(valueOf);
            if (cxanVar == null) {
                cxanVar = ((cxao) this.i.b()).a(i);
                this.k.put(valueOf, cxanVar);
            }
        }
        f(bundle, cxanVar.c(), "mms_auto_retrieve_enabled_bool");
        f(bundle, cxanVar.d(), "mmsRoamingAutoRetrieveByDefault");
        f(bundle, cxanVar.g(), "enableWapPushSI");
        f(bundle, cxanVar.e(), "enableGroupMms");
        f(bundle, cxanVar.i(), "smsUsesSimpleCharactersOnly");
        f(bundle, cxanVar.f(), "enableSMSDeliveryReports");
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [aoku, java.lang.Object] */
    public final String c() {
        Stream map = Collection.EL.stream(((ctwb) this.a.b()).m()).map(new Function() { // from class: cpaq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ctwi) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        StringBuilder sb = new StringBuilder();
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) engwVar.get(i2)).intValue();
            Optional i3 = ((ctwb) this.a.b()).h(intValue).i(true);
            String str = (i3.isEmpty() || i3.get().x()) ? "empty\n" : "non-empty (redacted)\n";
            sb.append("Carrier config values based on subId: " + intValue + ":\nLine number: " + str + ((String) Collection.EL.stream(d(intValue, true).entrySet()).map(new Function() { // from class: cpao
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object b = ((cpat) entry.getValue()).b();
                    String str2 = (String) entry.getKey();
                    int b2 = cpbg.b(b) - 1;
                    return str2 + "=" + (b2 != 4 ? b2 != 5 ? b.toString() : Arrays.toString((String[]) b) : Arrays.toString((int[]) b)) + ", Source: " + ((cpat) entry.getValue()).a().toString();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining("\n"))));
            sb.append("\n");
        }
        return sb.toString();
    }

    public final TreeMap d(int i, boolean z) {
        TreeMap treeMap = new TreeMap();
        e(a(), treeMap, cpas.DEFAULTS);
        if (this.b.b() != null) {
            cpai cpaiVar = (cpai) this.b.b();
            cpaiVar.getClass();
            Bundle bundle = new Bundle();
            if (((cpca) this.g.b()).a()) {
                bundle = ((cpcf) this.d.b()).a(i);
            } else {
                cpaiVar.d(i, bundle, R.xml.mms_config);
            }
            e(bundle, treeMap, cpas.BUGLE_MMS_CONFIG);
            Bundle bundle2 = new Bundle();
            if (((cpca) this.g.b()).a()) {
                bundle2 = ((cpcd) this.c.b()).a(i);
            } else {
                cpaiVar.e(i, bundle2);
            }
            e(bundle2, treeMap, cpas.OEM_SPECIFIC_OVERRIDE);
            if (z) {
                Bundle a = ((cpca) this.g.b()).a() ? ((cpcl) this.e.b()).a(i) : cpai.c(i, (ctwb) this.a.b());
                if (a != null) {
                    e(a, treeMap, cpas.PLATFORM);
                }
            }
            if (((cpca) this.g.b()).a()) {
                e(((cpbu) this.f.b()).a(i), treeMap, cpas.SERVER_SIDE_OVERRIDE_MOBILE_CONFIG);
            } else {
                e(cpaiVar.b(cpce.a), treeMap, cpas.SERVER_SIDE_OVERRIDE_PHENOTYPE);
                if (((Boolean) cpai.b.e()).booleanValue()) {
                    e(cpaiVar.b(cpai.c), treeMap, cpas.EXPERIMENT_OVERRIDE);
                }
            }
        }
        e(b(i), treeMap, cpas.USER_SETTING);
        e(this.h, treeMap, cpas.DEBUG_MENU);
        return treeMap;
    }
}
