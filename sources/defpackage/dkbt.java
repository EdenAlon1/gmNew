package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.provisioning.config.ServerMessage;
import com.google.android.ims.provisioning.config.WelcomeMessage;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbt {
    private final dkux f;
    private final ctvb g;
    private final ffbr h;
    private static final dktn b = new dktn("OMACPRcsConfigParser");
    private static final String[] c = {BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, "validity"};
    private static final String[] d = {"imSessionStart", "ftWarnSize", "MaxSizeFileTr"};
    public static final diyy a = diyv.b("override_config_validity_for_debug");
    private static final diyy e = diyv.b("log_warning_on_invalid_public_user_identity");

    public dkbt(ctvb ctvbVar, ffbr ffbrVar) {
        this.g = ctvbVar;
        this.h = ffbrVar;
        this.f = new dkux(ctvbVar);
    }

    static final void b(djtq djtqVar, djti djtiVar) {
        if (djtiVar == null) {
            throw new dkbs("Unable to parse transportProto, source characteristic is null", 1);
        }
        djti c2 = djtiVar.c("transportProto");
        djtqVar.q(dkbr.a(c2, "psSignalling"));
        djtqVar.p(dkbr.a(c2, "psRTMedia"));
        djtqVar.o(dkbr.a(c2, "psMedia"));
        djtqVar.C(dkbr.a(c2, "wifiSignalling"));
        djtqVar.B(dkbr.a(c2, "wifiRTMedia"));
        djtqVar.A(dkbr.a(c2, "wifiMedia"));
    }

    private static djti c(djti djtiVar) {
        djti c2 = djtiVar.c("SERVICEPROVIDEREXT");
        if (c2 == null) {
            return null;
        }
        return c2.c("joyn");
    }

    private static djti d(dkbu dkbuVar) {
        djti d2 = dkbuVar.d("AppId", "ap2002");
        if (d2 == null) {
            d2 = dkbuVar.d("Name", "RCS-e settings");
        }
        return d2 == null ? dkbuVar.d("Name", "RCS settings") : d2;
    }

    private static djti e(djti djtiVar) {
        return djtiVar.c("UX");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.dkbu f(java.io.InputStream r9) {
        /*
            dkbu r0 = new dkbu
            r0.<init>()
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.String r2 = "utf-8"
            r1.setInput(r9, r2)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            r1.nextTag()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.String r9 = r1.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            java.util.Stack r2 = new java.util.Stack     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            r2.<init>()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            int r3 = r1.nextTag()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            r4 = 0
            r5 = r4
        L24:
            java.lang.String r6 = r1.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            boolean r6 = r6.equals(r9)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r6 != 0) goto Lb0
            java.lang.String r6 = r1.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            r7 = 2
            java.lang.String r8 = "characteristic"
            if (r3 != r7) goto L8f
            java.lang.String r3 = "param"
            boolean r3 = r6.equals(r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r3 != 0) goto L6d
            java.lang.String r3 = "parm"
            boolean r3 = r6.equals(r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r3 == 0) goto L48
            goto L6d
        L48:
            boolean r3 = r6.equals(r8)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r3 == 0) goto Laa
            java.lang.String r3 = "type"
            java.lang.String r3 = r1.getAttributeValue(r4, r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r3 == 0) goto L66
            if (r5 != 0) goto L5d
            djti r3 = r0.b(r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            goto L61
        L5d:
            djti r3 = r5.b(r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
        L61:
            r5 = r3
            r2.push(r5)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            goto Laa
        L66:
            dkbs r9 = new dkbs     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            r0 = 1
            r9.<init>(r4, r0)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            throw r9     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
        L6d:
            if (r5 != 0) goto L71
            r5 = r4
            goto L8b
        L71:
            java.lang.String r3 = "name"
            java.lang.String r3 = r1.getAttributeValue(r4, r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.String r6 = "value"
            java.lang.String r6 = r1.getAttributeValue(r4, r6)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r3 == 0) goto L8b
            if (r6 == 0) goto L8b
            djth r7 = new djth     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            r7.<init>(r3, r6)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            java.util.List r3 = r5.a     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            r3.add(r7)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
        L8b:
            r1.nextTag()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            goto Laa
        L8f:
            r7 = 3
            if (r3 != r7) goto Laa
            boolean r3 = r6.equals(r8)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r3 == 0) goto Laa
            r2.pop()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            boolean r3 = r2.isEmpty()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r3 == 0) goto La3
            r5 = r4
            goto Laa
        La3:
            java.lang.Object r3 = r2.peek()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            r5 = r3
            djti r5 = (defpackage.djti) r5     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
        Laa:
            int r3 = r1.nextTag()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb1
            goto L24
        Lb0:
            return r0
        Lb1:
            r9 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r9.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Error while parsing document: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.Throwable r9 = r9.getCause()
            r0.<init>(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkbt.f(java.io.InputStream):dkbu");
    }

    private static void g(djti djtiVar, djtp djtpVar) {
        djti c2 = djtiVar.c("CAPDISCOVERY");
        if (c2 != null) {
            CapabilityConfiguration capabilityConfiguration = new CapabilityConfiguration();
            capabilityConfiguration.mPollingPeriod = c2.a("pollingPeriod", 0);
            capabilityConfiguration.mCapInfoExpiry = c2.a("capInfoExpiry", 0);
            capabilityConfiguration.mNonRcsCapInfoExpiry = c2.a("nonRCScapInfoExpiry", 0);
            int a2 = c2.a("defaultDisc", 0);
            if (a2 == 0) {
                capabilityConfiguration.mPresenceDiscovery = false;
            } else if (a2 == 1) {
                capabilityConfiguration.mPresenceDiscovery = true;
            } else {
                dkty.r(b, "Invalid parameter value defaultDisc:%d", Integer.valueOf(a2));
                capabilityConfiguration.mPresenceDiscovery = false;
            }
            capabilityConfiguration.disableInitialAddressBookScan = c2.a("disableInitialAddressBookScan", 0) == 1;
            djti c3 = c2.c("Ext");
            djti c4 = c3 == null ? null : c3.c("joyn");
            if (c4 != null) {
                capabilityConfiguration.msgCapValidity = c4.a("msgCapValidity", 5);
            }
            ((Configuration) djtpVar).mCapabilityDiscoveryConfiguration = capabilityConfiguration;
        }
    }

    private static void h(djti djtiVar, djtp djtpVar) {
        djti c2 = djtiVar.c("IM");
        dkbr.b(c2, d);
        if (c2 != null) {
            InstantMessageConfiguration instantMessageConfiguration = new InstantMessageConfiguration();
            instantMessageConfiguration.mImCapAlwaysOn = c2.a("imCapAlwaysON", 0) == 1;
            instantMessageConfiguration.mFullGroupSandFSupported = c2.a("GroupChatFullStandFwd", 0) == 1;
            instantMessageConfiguration.mImWarnSF = c2.a("imWarnSF", 0) == 1;
            instantMessageConfiguration.mImSessionStart = c2.a("imSessionStart", 0);
            instantMessageConfiguration.mChatAuth = c2.a("ChatAuth", 0) == 1;
            instantMessageConfiguration.mSmsFallBackAuth = c2.a("SmsFallBackAuth", 0) == 1;
            instantMessageConfiguration.mAutoAccept = c2.a("AutAccept", 0) == 1;
            instantMessageConfiguration.mAutoAcceptGroupChat = c2.a("AutAcceptGroupChat", 1) == 1;
            int a2 = c2.a("MaxSize", Alert.DURATION_SHOW_INDEFINITELY);
            instantMessageConfiguration.mMaxSize1to1 = c2.a("MaxSize1to1", a2);
            instantMessageConfiguration.mMaxSize1toM = c2.a("MaxSize1toM", a2);
            int a3 = c2.a("TimerIdle", 120);
            instantMessageConfiguration.mTimerIdleSecs = a3;
            dktn dktnVar = b;
            dkty.d(dktnVar, "Instant Message Session TimerIdle: %d", Integer.valueOf(a3));
            instantMessageConfiguration.mPublishPresenceCap = c2.a("pres-srv-cap", 0) == 1;
            instantMessageConfiguration.mMaxAdhocGroupSize = c2.a("max_adhoc_group_size", Alert.DURATION_SHOW_INDEFINITELY);
            String e2 = c2.e("deferred-msg-func-uri");
            if (e2 == null || e2.trim().length() == 0) {
                instantMessageConfiguration.mDeferredMessageFunctionUri = null;
            } else {
                if (!e2.startsWith("sip:") && !e2.startsWith("sips:")) {
                    e2 = "sip:".concat(e2);
                }
                instantMessageConfiguration.mDeferredMessageFunctionUri = e2;
            }
            String e3 = c2.e("conf-fcty-uri");
            if (e3 == null) {
                throw new dkbs("conferenceFactoryUri cannot be set to null.", 1);
            }
            instantMessageConfiguration.mConferenceFactoryUri = e3;
            instantMessageConfiguration.mExploderUri = c2.e("exploder-uri");
            instantMessageConfiguration.mFileTransferAutoAcceptSupported = c2.a("ftAutAccept", 1) == 1;
            instantMessageConfiguration.mMaxSizeFileTransfer = c2.a("MaxSizeFileTr", 0) * 1024;
            instantMessageConfiguration.mWarnSizeFileTransfer = c2.a("ftWarnSize", 0) * 1024;
            instantMessageConfiguration.mFtCapAlwaysOn = c2.a("ftCapAlwaysON", 0) == 1;
            String e4 = c2.e("ftDefaultMech");
            String str = "http";
            if (!"http".equalsIgnoreCase(e4)) {
                if ("msrp".equalsIgnoreCase(e4)) {
                    str = "msrp";
                } else {
                    dkty.q("Invalid parameter ftDefaultMech:%s. Falling back to HTTP.", String.valueOf(e4));
                }
            }
            instantMessageConfiguration.mFtDefaultMechanism = str;
            instantMessageConfiguration.mDefaultSharingMethod = c2.a("ftHTTPFallback", -1);
            instantMessageConfiguration.mFtStoreAndForwardEnabled = c2.a("ftStAndFwEnabled", 0) == 1;
            instantMessageConfiguration.mFtThumbnailSupported = c2.a("ftThumb", 0) == 1;
            instantMessageConfiguration.mMaxConcurrentSession = c2.a("MaxConcurrentSession", -1);
            String e5 = c2.e("ftHTTPCSURI");
            if (e5 != null) {
                instantMessageConfiguration.mFtHttpContentServerUri = e5;
            }
            String e6 = c2.e("ftHTTPCSUser");
            if (e6 != null) {
                instantMessageConfiguration.mFtHttpContentServerUser = e6;
            }
            String e7 = c2.e("ftHTTPCSPwd");
            if (e7 != null) {
                instantMessageConfiguration.mFtHttpContentServerPassword = e7;
            }
            instantMessageConfiguration.mChatRevokeTimer = c2.a("ChatRevokeTimer", 0);
            int a4 = c2.a("imMsgTech", 0);
            if (a4 == 0) {
                instantMessageConfiguration.mMessageTech = 0;
            } else if (a4 == 1) {
                instantMessageConfiguration.mMessageTech = 1;
            } else {
                dkty.r(dktnVar, "Invalid parameter value imMsgTech:%d", Integer.valueOf(a4));
                instantMessageConfiguration.mMessageTech = 0;
            }
            ((Configuration) djtpVar).mInstantMessageConfiguration = instantMessageConfiguration;
        }
    }

    private static void i(dkbu dkbuVar, djtp djtpVar) {
        djti c2;
        djti c3;
        if (!djai.E() || (c2 = dkbuVar.c("XGOOGLE")) == null || (c3 = c2.c("InvalidConfigDetails")) == null) {
            return;
        }
        String e2 = c3.e("InvalidConfigReason");
        if (TextUtils.isEmpty(e2)) {
            return;
        }
        try {
            Configuration.InvalidConfigReason invalidConfigReason = Configuration.InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED;
            ((Configuration) djtpVar).invalidConfigReason = (Configuration.InvalidConfigReason) Enum.valueOf(Configuration.InvalidConfigReason.class, e2);
        } catch (IllegalArgumentException unused) {
            dkty.r(b, "InvalidConfigReason is not a valid enum value: %s", e2);
            ((Configuration) djtpVar).invalidConfigReason = Configuration.InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    private static void j(djtp djtpVar, djti djtiVar) {
        ?? r1;
        boolean z;
        ?? r15;
        String e2 = djtiVar.e("message");
        if (e2 == null) {
            throw new dkbs("message field cannot be null.", 3);
        }
        String e3 = djtiVar.e(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
        if (e3 == null) {
            throw new dkbs("title field cannot be null.", 3);
        }
        boolean z2 = false;
        boolean z3 = true;
        if (djtiVar.a("Reject_btn", 0) != 0) {
            r1 = 1;
        } else {
            r1 = 1;
            z3 = false;
        }
        if (djtiVar.a("Accept_btn", 0) != 0) {
            z = false;
            z2 = r1;
        } else {
            z = false;
        }
        if (z2 == z3) {
            ?? r152 = z ? 1 : 0;
            dktn dktnVar = b;
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean valueOf2 = Boolean.valueOf(z3);
            Object[] objArr = new Object[4];
            objArr[r152] = e2;
            objArr[r1] = e3;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            dkty.d(dktnVar, "msg: %s, title: %s, accept: %s, reject: %s", objArr);
            ((Configuration) djtpVar).mServerMessage = new ServerMessage(e2, e3, z2, z3);
            return;
        }
        if (djtiVar.a("Settings_btn", z ? 1 : 0) != 0) {
            r15 = z ? 1 : 0;
            z = r1;
        } else {
            r15 = z ? 1 : 0;
        }
        dktn dktnVar2 = b;
        Boolean valueOf3 = Boolean.valueOf(z2);
        Boolean valueOf4 = Boolean.valueOf(z3);
        Boolean valueOf5 = Boolean.valueOf(z);
        Object[] objArr2 = new Object[5];
        objArr2[r15] = e2;
        objArr2[r1] = e3;
        objArr2[2] = valueOf3;
        objArr2[3] = valueOf4;
        objArr2[4] = valueOf5;
        dkty.d(dktnVar2, "welcome msg: %s, title: %s, accept: %s, reject: %s, settings: %s", objArr2);
        ((Configuration) djtpVar).welcomeMessage = new WelcomeMessage(e2, e3, z2, z3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.io.InputStream r20, defpackage.djtp r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 2081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkbt.a(java.io.InputStream, djtp, boolean):void");
    }
}
