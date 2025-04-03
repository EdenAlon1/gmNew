package defpackage;

import android.os.Bundle;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpck b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpcj(cpck cpckVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpckVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpcj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Bundle bundle;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cpck cpckVar = this.b;
            int i2 = this.c;
            this.a = 1;
            obj = cpckVar.a(i2, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ewhh ewhhVar = (ewhh) obj;
        int i3 = cpck.d;
        if (ewhhVar == null) {
            bundle = Bundle.EMPTY;
            bundle.getClass();
        } else {
            Bundle bundle2 = new Bundle();
            if ((ewhhVar.b & 1) != 0) {
                bundle2.putBoolean("enabledMMS", ewhhVar.d);
            }
            if ((ewhhVar.b & 2) != 0) {
                bundle2.putBoolean("enableGroupMms", ewhhVar.e);
            }
            if ((ewhhVar.b & 4) != 0) {
                bundle2.putBoolean("groupChatDefaultsToMMS", ewhhVar.f);
            }
            if ((ewhhVar.b & 8) != 0) {
                bundle2.putString("httpParams", ewhhVar.g);
            }
            if ((ewhhVar.b & 16) != 0) {
                bundle2.putString("spamForwardingNumber", ewhhVar.h);
            }
            if ((ewhhVar.b & 32) != 0) {
                bundle2.putBoolean("enableMultipartSMS", ewhhVar.i);
            }
            if ((ewhhVar.b & 64) != 0) {
                bundle2.putInt("smsToMmsTextThreshold", ewhhVar.j);
            }
            if ((ewhhVar.b & 128) != 0) {
                bundle2.putBoolean("enabledTransID", ewhhVar.k);
            }
            if ((ewhhVar.b & 256) != 0) {
                bundle2.putBoolean("allowEditingSmscAddress", ewhhVar.l);
            }
            if ((ewhhVar.b & 512) != 0) {
                bundle2.putInt("maxMessageSize", ewhhVar.m);
            }
            if ((ewhhVar.b & 1024) != 0) {
                bundle2.putInt("maxImageHeight", ewhhVar.n);
            }
            if ((ewhhVar.b & 2048) != 0) {
                bundle2.putInt("maxImageWidth", ewhhVar.o);
            }
            if ((ewhhVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
                bundle2.putString("uaProfTagName", ewhhVar.F);
            }
            if ((ewhhVar.b & 536870912) != 0) {
                bundle2.putBoolean("supportMmsContentDisposition", ewhhVar.G);
            }
            if ((ewhhVar.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
                bundle2.putBoolean("supportHttpCharsetHeader", ewhhVar.E);
            }
            if ((ewhhVar.b & 4194304) != 0) {
                eyev eyevVar = ewhhVar.z;
                if (eyevVar == null) {
                    eyevVar = eyev.a;
                }
                bundle2.putInt("httpSocketTimeout", (int) eyevVar.b);
            }
            if ((ewhhVar.c & 512) != 0) {
                bundle2.putBoolean("useCustomUserAgent", ewhhVar.S);
            }
            if ((ewhhVar.b & 1073741824) != 0) {
                bundle2.putBoolean("supportMmsPriority", ewhhVar.H);
            }
            if ((ewhhVar.b & 2097152) != 0) {
                bundle2.putBoolean("enabledNotifyWapMMSC", ewhhVar.y);
            }
            if ((ewhhVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
                bundle2.putInt("recipientLimit", ewhhVar.C);
            }
            if ((ewhhVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
                bundle2.putString("uaProfTagName", ewhhVar.F);
            }
            if ((ewhhVar.b & 16777216) != 0) {
                bundle2.putString("naiSuffix", ewhhVar.B);
            }
            if ((ewhhVar.b & 16384) != 0) {
                bundle2.putBoolean("aliasEnabled", ewhhVar.r);
            }
            if ((ewhhVar.b & 32768) != 0) {
                bundle2.putInt("aliasMinChars", ewhhVar.s);
            }
            if ((ewhhVar.b & 65536) != 0) {
                bundle2.putInt("aliasMaxChars", ewhhVar.t);
            }
            if ((ewhhVar.c & 4) != 0) {
                bundle2.putBoolean("sendMultipartSmsAsSeparateMessages", ewhhVar.L);
            }
            if ((ewhhVar.c & 256) != 0) {
                bundle2.putBoolean("smsUsesSimpleCharactersOnly", ewhhVar.R);
            }
            if ((ewhhVar.c & 32) != 0) {
                bundle2.putBoolean("smsEncodingChangeable", ewhhVar.O);
            }
            if ((ewhhVar.c & 128) != 0) {
                bundle2.putInt("smsToMmsTextLengthThreshold", ewhhVar.Q);
            }
            if ((ewhhVar.b & 1048576) != 0) {
                bundle2.putString("emailGatewayNumber", String.valueOf(ewhhVar.x));
            }
            if ((ewhhVar.b & 4096) != 0) {
                bundle2.putBoolean("enableWapPushSI", ewhhVar.p);
            }
            if ((ewhhVar.b & 8192) != 0) {
                bundle2.putBoolean("allowEnablingWapPushSI", ewhhVar.q);
            }
            if ((ewhhVar.b & 262144) != 0) {
                bundle2.putBoolean("mms_auto_retrieve_enabled_bool", ewhhVar.v);
            }
            if ((ewhhVar.b & 131072) != 0) {
                bundle2.putBoolean("allowChangingMmsRoamingAutoRetrieve", ewhhVar.u);
            }
            if ((ewhhVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                bundle2.putBoolean("mmsRoamingAutoRetrieveByDefault", ewhhVar.D);
            }
            if ((ewhhVar.c & 64) != 0) {
                bundle2.putString("smsErrorDescMap", String.valueOf(ewhhVar.P));
            }
            if ((ewhhVar.b & 524288) != 0) {
                bundle2.putBoolean("config_cellBroadcastAppLinks", ewhhVar.w);
            }
            if ((ewhhVar.c & 1) != 0) {
                bundle2.putString("hiddenContactsData", ewhhVar.J);
            }
            if ((ewhhVar.c & 8) != 0) {
                bundle2.putBoolean("enableSMSDeliveryReports", ewhhVar.M);
            }
            if ((ewhhVar.c & 16) != 0) {
                bundle2.putBoolean("smsDeliveryReportSettingOnByDefault", ewhhVar.N);
            }
            if ((ewhhVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
                bundle2.putInt("maxSubjectLength", ewhhVar.A);
            }
            if ((ewhhVar.b & Integer.MIN_VALUE) != 0) {
                bundle2.putInt("emailGatewaySmsToMmsTextThreshold", ewhhVar.I);
            }
            if ((ewhhVar.c & 2) != 0) {
                bundle2.putInt("maxMessageTextSize", ewhhVar.K);
            }
            bundle = bundle2;
        }
        cpck cpckVar2 = this.b;
        cpbn cpbnVar = new cpbn(this.c, bundle);
        int i4 = cpbnVar.a;
        cpbu cpbuVar = cpckVar2.b;
        cpbuVar.b.lock();
        try {
            cpbuVar.e.put(i4, cpbnVar);
            cpbuVar.b.unlock();
            return ffcu.a;
        } catch (Throwable th) {
            cpbuVar.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpcj(this.b, this.c, ffguVar);
    }
}
