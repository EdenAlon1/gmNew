package defpackage;

import android.os.Bundle;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbh {
    public static final Bundle a(eymw eymwVar) {
        eymwVar.getClass();
        Bundle bundle = new Bundle();
        if ((eymwVar.b & 1) != 0) {
            bundle.putBoolean("enabledMMS", eymwVar.d);
        }
        if ((eymwVar.b & 2) != 0) {
            bundle.putBoolean("enableGroupMms", eymwVar.e);
        }
        if ((eymwVar.b & 4) != 0) {
            bundle.putBoolean("groupChatDefaultsToMMS", eymwVar.f);
        }
        if ((eymwVar.b & 8) != 0) {
            bundle.putBoolean("supportMmsContentDisposition", eymwVar.g);
        }
        if ((eymwVar.b & 16) != 0) {
            bundle.putBoolean("supportHttpCharsetHeader", eymwVar.h);
        }
        if ((eymwVar.b & 32) != 0) {
            bundle.putInt("httpSocketTimeout", eymwVar.i);
        }
        if ((eymwVar.b & 64) != 0) {
            bundle.putInt("maxImageHeight", eymwVar.j);
        }
        if ((eymwVar.b & 128) != 0) {
            bundle.putInt("maxImageWidth", eymwVar.k);
        }
        if ((eymwVar.b & 512) != 0) {
            bundle.putBoolean("useCustomUserAgent", eymwVar.l);
        }
        if ((eymwVar.b & 1024) != 0) {
            bundle.putBoolean("supportMmsPriority", eymwVar.m);
        }
        if ((eymwVar.b & 2048) != 0) {
            bundle.putBoolean("enabledNotifyWapMMSC", eymwVar.n);
        }
        if ((eymwVar.b & 4096) != 0) {
            bundle.putInt("recipientLimit", eymwVar.o);
        }
        if ((eymwVar.b & 8192) != 0) {
            bundle.putString("uaProfTagName", eymwVar.p);
        }
        if ((eymwVar.b & 16384) != 0) {
            bundle.putString("httpParams", eymwVar.q);
        }
        if ((eymwVar.b & 32768) != 0) {
            bundle.putString("naiSuffix", eymwVar.r);
        }
        if ((eymwVar.b & 65536) != 0) {
            bundle.putString("spamForwardingNumber", eymwVar.s);
        }
        if ((eymwVar.b & 131072) != 0) {
            bundle.putBoolean("aliasEnabled", eymwVar.t);
        }
        if ((eymwVar.b & 262144) != 0) {
            bundle.putInt("aliasMinChars", eymwVar.u);
        }
        if ((eymwVar.b & 524288) != 0) {
            bundle.putInt("aliasMaxChars", eymwVar.v);
        }
        if ((eymwVar.b & 1048576) != 0) {
            bundle.putBoolean("enableMultipartSMS", eymwVar.w);
        }
        if ((eymwVar.b & 2097152) != 0) {
            bundle.putBoolean("sendMultipartSmsAsSeparateMessages", eymwVar.x);
        }
        if ((eymwVar.b & 4194304) != 0) {
            bundle.putBoolean("smsUsesSimpleCharactersOnly", eymwVar.y);
        }
        if ((eymwVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
            bundle.putBoolean("smsEncodingChangeable", eymwVar.z);
        }
        if ((eymwVar.b & 16777216) != 0) {
            bundle.putInt("maxMessageSize", eymwVar.A);
        }
        if ((eymwVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
            bundle.putInt("smsToMmsTextThreshold", eymwVar.B);
        }
        if ((eymwVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
            bundle.putInt("smsToMmsTextLengthThreshold", eymwVar.C);
        }
        if ((eymwVar.b & 1073741824) != 0) {
            bundle.putString("emailGatewayNumber", eymwVar.D);
        }
        if ((eymwVar.b & Integer.MIN_VALUE) != 0) {
            bundle.putBoolean("enabledTransID", eymwVar.E);
        }
        if ((eymwVar.c & 1) != 0) {
            bundle.putBoolean("enableWapPushSI", eymwVar.F);
        }
        if ((eymwVar.c & 2) != 0) {
            bundle.putBoolean("allowEnablingWapPushSI", eymwVar.G);
        }
        if ((eymwVar.c & 4) != 0) {
            bundle.putBoolean("mms_auto_retrieve_enabled_bool", eymwVar.H);
        }
        if ((eymwVar.c & 8) != 0) {
            bundle.putBoolean("allowChangingMmsRoamingAutoRetrieve", eymwVar.I);
        }
        if ((eymwVar.c & 16) != 0) {
            bundle.putBoolean("mmsRoamingAutoRetrieveByDefault", eymwVar.J);
        }
        if ((eymwVar.c & 32) != 0) {
            bundle.putBoolean("allowEditingSmscAddress", eymwVar.K);
        }
        if ((eymwVar.c & 64) != 0) {
            bundle.putBoolean("config_cellBroadcastAppLinks", eymwVar.L);
        }
        if ((eymwVar.c & 128) != 0) {
            bundle.putString("smsErrorDescMap", eymwVar.M);
        }
        if ((eymwVar.c & 256) != 0) {
            bundle.putString("hiddenContactsData", eymwVar.N);
        }
        if ((eymwVar.c & 512) != 0) {
            bundle.putBoolean("enableSMSDeliveryReports", eymwVar.O);
        }
        if ((eymwVar.c & 1024) != 0) {
            bundle.putBoolean("smsDeliveryReportSettingOnByDefault", eymwVar.P);
        }
        return bundle;
    }
}
