package defpackage;

import android.os.Bundle;
import androidx.car.app.model.Alert;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpan {
    public static final /* synthetic */ int o = 0;
    private static final engw p = engw.C("aliasEnabled", "allowChangingMmsRoamingAutoRetrieve", "allowEditingSmscAddress", "allowEnablingWapPushSI", "enabledMMS", "enabledNotifyWapMMSC", "enabledTransID", "enableGroupMms", "enableMultipartSMS", "enableWapPushSI", "groupChatDefaultsToMMS", "mms_auto_retrieve_enabled_bool", "mmsRoamingAutoRetrieveByDefault", "sendMultipartSmsAsSeparateMessages", "smsEncodingChangeable", "smsUsesSimpleCharactersOnly", "supportHttpCharsetHeader", "supportMmsContentDisposition", "supportMmsPriority", "useCustomUserAgent");
    private static final engw q = engw.C("aliasMaxChars", "aliasMinChars", "emailGatewaySmsToMmsTextThreshold", "httpSocketTimeout", "maxImageHeight", "maxImageWidth", "maxMessageTextSize", "recipientLimit", "smsToMmsTextLengthThreshold", "smsToMmsTextThreshold", "maxMessageSize", "maxSubjectLength", new String[0]);
    private static final engw r = engw.v("emailGatewayNumber", "httpParams", "naiSuffix", "spamForwardingNumber", "uaProfTagName");
    public final cpai a;
    public final cpar b;
    public final ctwb c;
    public final cpcd d;
    public final cpcf e;
    public final cpcl f;
    public final cpbu g;
    public final cpca h;
    public final Bundle i;
    public final Bundle j;
    public Bundle k;
    public Bundle l;
    public Bundle m;
    public Bundle n;
    private final Bundle s;

    public cpan(cpai cpaiVar, cpar cparVar, ctwb ctwbVar, cpcd cpcdVar, cpcf cpcfVar, cpcl cpclVar, cpca cpcaVar, cpbu cpbuVar) {
        this.a = cpaiVar;
        this.b = cparVar;
        this.c = ctwbVar;
        this.d = cpcdVar;
        this.e = cpcfVar;
        this.f = cpclVar;
        this.h = cpcaVar;
        this.g = cpbuVar;
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
        this.s = bundle;
        this.i = new Bundle();
        this.j = new Bundle();
        this.k = new Bundle();
        this.l = new Bundle();
        this.m = new Bundle();
        this.n = new Bundle();
    }

    private static Optional d(Bundle bundle, String str) {
        if (bundle == null || !bundle.containsKey(str)) {
            return Optional.empty();
        }
        String string = bundle.getString(str);
        if (string == null) {
            string = "null";
        }
        return Optional.of(string);
    }

    public final eoif a(String str) {
        if (!p.contains(str)) {
            throw new IllegalArgumentException(a.a(str, "Carrier config key: ", " does not refer to a boolean value"));
        }
        eoie eoieVar = (eoie) eoif.a.createBuilder();
        if (this.s.containsKey(str)) {
            boolean z = this.s.getBoolean(str);
            eoieVar.copyOnWrite();
            eoif eoifVar = (eoif) eoieVar.instance;
            eoifVar.b |= 4;
            eoifVar.e = z;
            eoieVar.copyOnWrite();
            eoif eoifVar2 = (eoif) eoieVar.instance;
            eoifVar2.b |= 1;
            eoifVar2.c = z;
            eoieVar.copyOnWrite();
            eoif eoifVar3 = (eoif) eoieVar.instance;
            eoifVar3.d = 1;
            eoifVar3.b |= 2;
        }
        if (this.i.containsKey(str)) {
            boolean z2 = this.i.getBoolean(str);
            eoieVar.copyOnWrite();
            eoif eoifVar4 = (eoif) eoieVar.instance;
            eoifVar4.b |= 8;
            eoifVar4.f = z2;
            eoieVar.copyOnWrite();
            eoif eoifVar5 = (eoif) eoieVar.instance;
            eoifVar5.b |= 1;
            eoifVar5.c = z2;
            eoieVar.copyOnWrite();
            eoif eoifVar6 = (eoif) eoieVar.instance;
            eoifVar6.d = 2;
            eoifVar6.b |= 2;
        }
        if (this.j.containsKey(str)) {
            boolean z3 = this.j.getBoolean(str);
            eoieVar.copyOnWrite();
            eoif eoifVar7 = (eoif) eoieVar.instance;
            eoifVar7.b |= 16;
            eoifVar7.g = z3;
            eoieVar.copyOnWrite();
            eoif eoifVar8 = (eoif) eoieVar.instance;
            eoifVar8.b |= 1;
            eoifVar8.c = z3;
            eoieVar.copyOnWrite();
            eoif eoifVar9 = (eoif) eoieVar.instance;
            eoifVar9.d = 3;
            eoifVar9.b |= 2;
        }
        Bundle bundle = this.k;
        if (bundle != null && bundle.containsKey(str)) {
            boolean z4 = this.k.getBoolean(str);
            eoieVar.copyOnWrite();
            eoif eoifVar10 = (eoif) eoieVar.instance;
            eoifVar10.b |= 32;
            eoifVar10.h = z4;
            eoieVar.copyOnWrite();
            eoif eoifVar11 = (eoif) eoieVar.instance;
            eoifVar11.b |= 1;
            eoifVar11.c = z4;
            eoieVar.copyOnWrite();
            eoif eoifVar12 = (eoif) eoieVar.instance;
            eoifVar12.d = 4;
            eoifVar12.b |= 2;
        }
        if (this.m.containsKey(str)) {
            boolean z5 = this.m.getBoolean(str);
            eoieVar.copyOnWrite();
            eoif eoifVar13 = (eoif) eoieVar.instance;
            eoifVar13.b |= 128;
            eoifVar13.j = z5;
            eoieVar.copyOnWrite();
            eoif eoifVar14 = (eoif) eoieVar.instance;
            eoifVar14.b |= 1;
            eoifVar14.c = z5;
            if (this.h.a()) {
                eoieVar.copyOnWrite();
                eoif eoifVar15 = (eoif) eoieVar.instance;
                eoifVar15.d = 8;
                eoifVar15.b |= 2;
            } else {
                eoieVar.copyOnWrite();
                eoif eoifVar16 = (eoif) eoieVar.instance;
                eoifVar16.d = 6;
                eoifVar16.b |= 2;
            }
        }
        if (this.n.containsKey(str)) {
            boolean z6 = this.n.getBoolean(str);
            eoieVar.copyOnWrite();
            eoif eoifVar17 = (eoif) eoieVar.instance;
            eoifVar17.b |= 256;
            eoifVar17.k = z6;
            eoieVar.copyOnWrite();
            eoif eoifVar18 = (eoif) eoieVar.instance;
            eoifVar18.b |= 1;
            eoifVar18.c = z6;
            eoieVar.copyOnWrite();
            eoif eoifVar19 = (eoif) eoieVar.instance;
            eoifVar19.d = 7;
            eoifVar19.b |= 2;
        }
        if (this.l.containsKey(str)) {
            boolean z7 = this.l.getBoolean(str);
            eoieVar.copyOnWrite();
            eoif eoifVar20 = (eoif) eoieVar.instance;
            eoifVar20.b |= 64;
            eoifVar20.i = z7;
            eoieVar.copyOnWrite();
            eoif eoifVar21 = (eoif) eoieVar.instance;
            eoifVar21.b |= 1;
            eoifVar21.c = z7;
            eoieVar.copyOnWrite();
            eoif eoifVar22 = (eoif) eoieVar.instance;
            eoifVar22.d = 5;
            eoifVar22.b |= 2;
        }
        return (eoif) eoieVar.build();
    }

    public final epdb b(String str) {
        if (!q.contains(str)) {
            throw new IllegalArgumentException(a.a(str, "Carrier config key: ", " does not refer to an int value"));
        }
        epda epdaVar = (epda) epdb.a.createBuilder();
        if (this.s.containsKey(str)) {
            int i = this.s.getInt(str);
            epdaVar.copyOnWrite();
            epdb epdbVar = (epdb) epdaVar.instance;
            epdbVar.b |= 4;
            epdbVar.e = i;
            epdaVar.copyOnWrite();
            epdb epdbVar2 = (epdb) epdaVar.instance;
            epdbVar2.b |= 1;
            epdbVar2.c = i;
            epdaVar.copyOnWrite();
            epdb epdbVar3 = (epdb) epdaVar.instance;
            epdbVar3.d = 1;
            epdbVar3.b |= 2;
        }
        if (this.i.containsKey(str)) {
            int i2 = this.i.getInt(str);
            epdaVar.copyOnWrite();
            epdb epdbVar4 = (epdb) epdaVar.instance;
            epdbVar4.b |= 8;
            epdbVar4.f = i2;
            epdaVar.copyOnWrite();
            epdb epdbVar5 = (epdb) epdaVar.instance;
            epdbVar5.b |= 1;
            epdbVar5.c = i2;
            epdaVar.copyOnWrite();
            epdb epdbVar6 = (epdb) epdaVar.instance;
            epdbVar6.d = 2;
            epdbVar6.b |= 2;
        }
        if (this.j.containsKey(str)) {
            int i3 = this.j.getInt(str);
            epdaVar.copyOnWrite();
            epdb epdbVar7 = (epdb) epdaVar.instance;
            epdbVar7.b |= 16;
            epdbVar7.g = i3;
            epdaVar.copyOnWrite();
            epdb epdbVar8 = (epdb) epdaVar.instance;
            epdbVar8.b |= 1;
            epdbVar8.c = i3;
            epdaVar.copyOnWrite();
            epdb epdbVar9 = (epdb) epdaVar.instance;
            epdbVar9.d = 3;
            epdbVar9.b |= 2;
        }
        Bundle bundle = this.k;
        if (bundle != null && bundle.containsKey(str)) {
            int i4 = this.k.getInt(str);
            epdaVar.copyOnWrite();
            epdb epdbVar10 = (epdb) epdaVar.instance;
            epdbVar10.b |= 32;
            epdbVar10.h = i4;
            epdaVar.copyOnWrite();
            epdb epdbVar11 = (epdb) epdaVar.instance;
            epdbVar11.b |= 1;
            epdbVar11.c = i4;
            epdaVar.copyOnWrite();
            epdb epdbVar12 = (epdb) epdaVar.instance;
            epdbVar12.d = 4;
            epdbVar12.b |= 2;
        }
        if (this.m.containsKey(str)) {
            int i5 = this.m.getInt(str);
            epdaVar.copyOnWrite();
            epdb epdbVar13 = (epdb) epdaVar.instance;
            epdbVar13.b |= 128;
            epdbVar13.j = i5;
            epdaVar.copyOnWrite();
            epdb epdbVar14 = (epdb) epdaVar.instance;
            epdbVar14.b |= 1;
            epdbVar14.c = i5;
            if (this.h.a()) {
                epdaVar.copyOnWrite();
                epdb epdbVar15 = (epdb) epdaVar.instance;
                epdbVar15.d = 8;
                epdbVar15.b |= 2;
            } else {
                epdaVar.copyOnWrite();
                epdb epdbVar16 = (epdb) epdaVar.instance;
                epdbVar16.d = 6;
                epdbVar16.b |= 2;
            }
        }
        if (this.n.containsKey(str)) {
            int i6 = this.n.getInt(str);
            epdaVar.copyOnWrite();
            epdb epdbVar17 = (epdb) epdaVar.instance;
            epdbVar17.b |= 256;
            epdbVar17.k = i6;
            epdaVar.copyOnWrite();
            epdb epdbVar18 = (epdb) epdaVar.instance;
            epdbVar18.b |= 1;
            epdbVar18.c = i6;
            epdaVar.copyOnWrite();
            epdb epdbVar19 = (epdb) epdaVar.instance;
            epdbVar19.d = 7;
            epdbVar19.b |= 2;
        }
        if (this.l.containsKey(str)) {
            int i7 = this.l.getInt(str);
            epdaVar.copyOnWrite();
            epdb epdbVar20 = (epdb) epdaVar.instance;
            epdbVar20.b |= 64;
            epdbVar20.i = i7;
            epdaVar.copyOnWrite();
            epdb epdbVar21 = (epdb) epdaVar.instance;
            epdbVar21.b |= 1;
            epdbVar21.c = i7;
            epdaVar.copyOnWrite();
            epdb epdbVar22 = (epdb) epdaVar.instance;
            epdbVar22.d = 5;
            epdbVar22.b |= 2;
        }
        return (epdb) epdaVar.build();
    }

    public final epkc c(String str) {
        if (!r.contains(str)) {
            throw new IllegalArgumentException(a.a(str, "Carrier config key: ", " does not refer to a String value"));
        }
        epkb epkbVar = (epkb) epkc.a.createBuilder();
        Optional d = d(this.s, str);
        if (d.isPresent()) {
            Object obj = d.get();
            epkbVar.copyOnWrite();
            epkc epkcVar = (epkc) epkbVar.instance;
            epkcVar.b |= 4;
            epkcVar.e = (String) obj;
            Object obj2 = d.get();
            epkbVar.copyOnWrite();
            epkc epkcVar2 = (epkc) epkbVar.instance;
            epkcVar2.b |= 1;
            epkcVar2.c = (String) obj2;
            epkbVar.copyOnWrite();
            epkc epkcVar3 = (epkc) epkbVar.instance;
            epkcVar3.d = 1;
            epkcVar3.b |= 2;
        }
        Optional d2 = d(this.i, str);
        if (d2.isPresent()) {
            Object obj3 = d2.get();
            epkbVar.copyOnWrite();
            epkc epkcVar4 = (epkc) epkbVar.instance;
            epkcVar4.b |= 8;
            epkcVar4.f = (String) obj3;
            Object obj4 = d2.get();
            epkbVar.copyOnWrite();
            epkc epkcVar5 = (epkc) epkbVar.instance;
            epkcVar5.b |= 1;
            epkcVar5.c = (String) obj4;
            epkbVar.copyOnWrite();
            epkc epkcVar6 = (epkc) epkbVar.instance;
            epkcVar6.d = 2;
            epkcVar6.b |= 2;
        }
        Optional d3 = d(this.j, str);
        if (d3.isPresent()) {
            Object obj5 = d3.get();
            epkbVar.copyOnWrite();
            epkc epkcVar7 = (epkc) epkbVar.instance;
            epkcVar7.b |= 16;
            epkcVar7.g = (String) obj5;
            Object obj6 = d3.get();
            epkbVar.copyOnWrite();
            epkc epkcVar8 = (epkc) epkbVar.instance;
            epkcVar8.b |= 1;
            epkcVar8.c = (String) obj6;
            epkbVar.copyOnWrite();
            epkc epkcVar9 = (epkc) epkbVar.instance;
            epkcVar9.d = 3;
            epkcVar9.b |= 2;
        }
        Optional d4 = d(this.k, str);
        if (d4.isPresent()) {
            Object obj7 = d4.get();
            epkbVar.copyOnWrite();
            epkc epkcVar10 = (epkc) epkbVar.instance;
            epkcVar10.b |= 32;
            epkcVar10.h = (String) obj7;
            Object obj8 = d4.get();
            epkbVar.copyOnWrite();
            epkc epkcVar11 = (epkc) epkbVar.instance;
            epkcVar11.b |= 1;
            epkcVar11.c = (String) obj8;
            epkbVar.copyOnWrite();
            epkc epkcVar12 = (epkc) epkbVar.instance;
            epkcVar12.d = 4;
            epkcVar12.b |= 2;
        }
        Optional d5 = d(this.m, str);
        if (d5.isPresent()) {
            Object obj9 = d5.get();
            epkbVar.copyOnWrite();
            epkc epkcVar13 = (epkc) epkbVar.instance;
            epkcVar13.b |= 128;
            epkcVar13.j = (String) obj9;
            Object obj10 = d5.get();
            epkbVar.copyOnWrite();
            epkc epkcVar14 = (epkc) epkbVar.instance;
            epkcVar14.b |= 1;
            epkcVar14.c = (String) obj10;
            if (this.h.a()) {
                epkbVar.copyOnWrite();
                epkc epkcVar15 = (epkc) epkbVar.instance;
                epkcVar15.d = 8;
                epkcVar15.b |= 2;
            } else {
                epkbVar.copyOnWrite();
                epkc epkcVar16 = (epkc) epkbVar.instance;
                epkcVar16.d = 6;
                epkcVar16.b |= 2;
            }
        }
        Optional d6 = d(this.n, str);
        if (d6.isPresent()) {
            Object obj11 = d6.get();
            epkbVar.copyOnWrite();
            epkc epkcVar17 = (epkc) epkbVar.instance;
            epkcVar17.b |= 256;
            epkcVar17.k = (String) obj11;
            Object obj12 = d6.get();
            epkbVar.copyOnWrite();
            epkc epkcVar18 = (epkc) epkbVar.instance;
            epkcVar18.b |= 1;
            epkcVar18.c = (String) obj12;
            epkbVar.copyOnWrite();
            epkc epkcVar19 = (epkc) epkbVar.instance;
            epkcVar19.d = 7;
            epkcVar19.b |= 2;
        }
        Optional d7 = d(this.l, str);
        if (d7.isPresent()) {
            Object obj13 = d7.get();
            epkbVar.copyOnWrite();
            epkc epkcVar20 = (epkc) epkbVar.instance;
            epkcVar20.b |= 64;
            epkcVar20.i = (String) obj13;
            Object obj14 = d7.get();
            epkbVar.copyOnWrite();
            epkc epkcVar21 = (epkc) epkbVar.instance;
            epkcVar21.b |= 1;
            epkcVar21.c = (String) obj14;
            epkbVar.copyOnWrite();
            epkc epkcVar22 = (epkc) epkbVar.instance;
            epkcVar22.d = 5;
            epkcVar22.b |= 2;
        }
        return (epkc) epkbVar.build();
    }
}
