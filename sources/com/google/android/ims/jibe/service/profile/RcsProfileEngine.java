package com.google.android.ims.jibe.service.profile;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.profile.RcsProfileServiceResult;
import defpackage.ctvb;
import defpackage.djaq;
import defpackage.djtp;
import defpackage.dkcp;
import defpackage.dked;
import defpackage.dkqd;
import defpackage.dkrx;
import defpackage.dkty;
import defpackage.dkut;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsProfileEngine extends IRcsProfile.Stub {
    private final Context a;
    private final dkrx b;
    private final ctvb c;
    private final dked d;
    private final dkcp e;

    public RcsProfileEngine(Context context, dkrx dkrxVar, ctvb ctvbVar, dked dkedVar, dkcp dkcpVar) {
        if (ctvbVar == null) {
            throw new IllegalArgumentException("buglePhoneNumberUtils must not be null or getMsisdn() will throw NPE");
        }
        this.a = context;
        this.b = dkrxVar;
        this.c = ctvbVar;
        this.d = dkedVar;
        this.e = dkcpVar;
    }

    protected int getDefaultSharingMethod(djtp djtpVar) {
        if (djaq.n()) {
            return 1;
        }
        if (djaq.d()) {
            return djtpVar.o().mDefaultSharingMethod;
        }
        return -1;
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    @Deprecated
    public Bundle getRcsConfig() {
        dkqd.d(this.a, Binder.getCallingUid());
        djtp djtpVar = (djtp) this.e.j().orElse(null);
        Bundle bundle = new Bundle(1);
        if (djtpVar instanceof Configuration) {
            bundle.putSerializable("Configuration", (Configuration) djtpVar);
        }
        return bundle;
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    public RcsProfileServiceResult getValue(int i) {
        String str;
        String k;
        try {
            dkqd.d(this.a, Binder.getCallingUid());
            if (i == 1000) {
                return new RcsProfileServiceResult(1000, (String) this.d.c().orElse(null));
            }
            if (i == 1001) {
                return new RcsProfileServiceResult(1001, null);
            }
            djtp djtpVar = (djtp) this.e.j().orElse(null);
            if (djtpVar != null && !djtpVar.S()) {
                if (i == 4) {
                    ImsConfiguration n = djtpVar.n();
                    String str2 = "";
                    if (n != null && (str = n.mPublicIdentity) != null && (k = dkut.k(str, this.c)) != null) {
                        str2 = k;
                    }
                    return new RcsProfileServiceResult(i, str2);
                }
                if (i == 5) {
                    return new RcsProfileServiceResult(i, this.b.g());
                }
                if (i == 136) {
                    return new RcsProfileServiceResult(i, "false");
                }
                switch (i) {
                    case VCardConstants.DEFAULT_PREF /* 100 */:
                        return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mImCapAlwaysOn));
                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                        return new RcsProfileServiceResult(i, String.valueOf(djtpVar.r().mGroupChatAuth));
                    case 102:
                        return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mMaxAdhocGroupSize));
                    case 103:
                        return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mImSessionStart));
                    default:
                        switch (i) {
                            case 120:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mMaxSizeFileTransfer));
                            case 121:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mWarnSizeFileTransfer));
                            case 122:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mMaxSize1to1));
                            case 123:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mMaxSize1toM));
                            case 124:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mAutoAccept));
                            case 125:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mAutoAcceptGroupChat));
                            case 126:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mFileTransferAutoAcceptSupported));
                            case 127:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.p().mUsePresence));
                            case 128:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mFtHttpCapAlwaysOn));
                            case 129:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mFtCapAlwaysOn));
                            case 130:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.r().mChatAuth));
                            case 131:
                                return new RcsProfileServiceResult(i, String.valueOf(!TextUtils.isEmpty(djtpVar.o().mFtHttpContentServerUri)));
                            case 132:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.r().mFtAuth));
                            case 133:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.r().mGeoLocPushAuth));
                            case 134:
                                return new RcsProfileServiceResult(i, String.valueOf(djtpVar.r().mGeoLocPullAuth != 0));
                            default:
                                switch (i) {
                                    case 139:
                                        return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mImWarnSF));
                                    case 140:
                                        return new RcsProfileServiceResult(i, String.valueOf(!djtpVar.o().mFullGroupSandFSupported));
                                    case 141:
                                        return new RcsProfileServiceResult(i, String.valueOf(djtpVar.o().mDeliveryReportTimeout));
                                    case 142:
                                        return new RcsProfileServiceResult(i, String.valueOf(getDefaultSharingMethod(djtpVar)));
                                    default:
                                        return new RcsProfileServiceResult(16, "Not supported", i, null);
                                }
                        }
                }
            }
            return new RcsProfileServiceResult(18, "Configuration not set", i, null);
        } catch (NullPointerException e) {
            dkty.i(e, "RcsProfileEngine: NPE while getting value for id: %d", Integer.valueOf(i));
            return new RcsProfileServiceResult(18, "Unable to retrieve value", i, null);
        }
    }
}
