package com.google.android.ims.provisioning.config;

import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import defpackage.dizg;
import defpackage.djai;
import defpackage.djtp;
import defpackage.djtr;
import defpackage.dkvj;
import defpackage.emuz;
import defpackage.emyl;
import defpackage.emys;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import j$.util.Optional;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Configuration implements Serializable, djtp {
    private static final long serialVersionUID = -426160916861745022L;
    public String mDeviceId;
    public ServerMessage mServerMessage;
    public String mTachyonAuthToken;
    public String mVerifiedSmsToken;
    private MlsConfiguration mlsConfiguration;
    public boolean tachygramEnabled;
    public String tachyonUrl;
    public WelcomeMessage welcomeMessage;
    private static final enru b = enru.c("com/google/android/ims/provisioning/config/Configuration");
    public static final Token a = new Token("", 0);
    private int mConfigState = 0;
    private Token mToken = a;
    public int mType = 0;
    public ImsConfiguration mImsConfiguration = new ImsConfiguration();
    public InstantMessageConfiguration mInstantMessageConfiguration = new InstantMessageConfiguration();
    public MediaConfiguration mMediaConfiguration = new MediaConfiguration();
    public CapabilityConfiguration mCapabilityDiscoveryConfiguration = new CapabilityConfiguration();
    public final ConfirmationConfiguration mConfirmationConfiguration = new ConfirmationConfiguration();
    public SecondaryDeviceConfiguration mSecondaryDeviceConfiguration = new SecondaryDeviceConfiguration();
    public PresenceConfiguration mPresenceConfiguration = new PresenceConfiguration();
    public XdmsConfiguration mXdmsConfiguration = new XdmsConfiguration();
    public UserExperienceConfiguration mUserExperienceConfig = new UserExperienceConfiguration();
    public ServicesConfiguration mServicesConfiguration = new ServicesConfiguration();
    public ChatbotConfiguration mChatbotConfiguration = new ChatbotConfiguration();
    public InvalidConfigReason invalidConfigReason = InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED;
    private boolean mReconfigRequested = false;
    private final int mMessageTech = 0;
    private int rcsState = 0;
    public String iccids = "";
    public int mValiditySecs = 0;
    private long mLastUpdateSecs = 0;
    public int mVersion = 0;
    private transient emyl c = emys.a(new emyl() { // from class: djtj
        @Override // defpackage.emyl
        public final Object get() {
            ImsConfiguration imsConfiguration = Configuration.this.mImsConfiguration;
            return imsConfiguration != null ? djtr.E(imsConfiguration).a() : djtr.D().a();
        }
    });

    /* compiled from: PG */
    public enum InvalidConfigReason {
        INVALID_CONFIG_REASON_UNSPECIFIED,
        CARRIER_INELIGIBLE,
        UPI_INELIGIBLE,
        UNSUPPORTED_CLIENT_VENDOR,
        UNSUPPORTED_CLIENT_VERSION,
        FROZEN_REGION,
        ATTESTATION_FAILURE
    }

    /* compiled from: PG */
    public static class Token implements Serializable {
        private static final long serialVersionUID = 1;
        public final long mExpirationTime;
        public final String mValue;

        public Token(String str, long j) {
            this.mValue = str;
            this.mExpirationTime = dkvj.a().longValue() + TimeUnit.SECONDS.toMillis(j);
        }
    }

    @Override // defpackage.djtp
    public final String A() {
        return this.mVerifiedSmsToken;
    }

    @Override // defpackage.djtp
    public final void B() {
        this.mToken = a;
    }

    @Override // defpackage.djtp
    public final void C(final ImsConfiguration imsConfiguration) {
        this.mImsConfiguration = imsConfiguration;
        this.c = emys.a(new emyl() { // from class: djtk
            @Override // defpackage.emyl
            public final Object get() {
                Configuration.Token token = Configuration.a;
                return djtr.E(ImsConfiguration.this).a();
            }
        });
    }

    @Override // defpackage.djtp
    public final void D() {
        this.mValiditySecs = 0;
        this.mVersion = 0;
    }

    @Override // defpackage.djtp
    public final void E(long j) {
        this.mLastUpdateSecs = j;
    }

    @Override // defpackage.djtp
    public final void F(int i) {
        this.rcsState = i;
    }

    @Override // defpackage.djtp
    public final void G(boolean z) {
        this.mReconfigRequested = z;
    }

    @Override // defpackage.djtp
    public final void H(ServerMessage serverMessage) {
        this.mServerMessage = serverMessage;
    }

    @Override // defpackage.djtp
    public final void I(Token token) {
        if (token == null) {
            this.mToken = a;
        } else {
            this.mToken = token;
        }
    }

    @Override // defpackage.djtp
    public final void J() {
        ac();
    }

    @Override // defpackage.djtp
    public final void K(int i) {
        this.mValiditySecs = i;
    }

    @Override // defpackage.djtp
    public final void L(int i) {
        this.mVersion = i;
    }

    @Override // defpackage.djtp
    public final void M(WelcomeMessage welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override // defpackage.djtp
    public final boolean N() {
        return this.tachygramEnabled;
    }

    @Override // defpackage.djtp
    public final boolean O() {
        return z() != null;
    }

    @Override // defpackage.djtp
    public final boolean P() {
        return this.mValiditySecs == -2 && this.mVersion == -2;
    }

    @Override // defpackage.djtp
    public final boolean Q() {
        return this.mValiditySecs == 0 && this.mVersion == 0 && this.mLastUpdateSecs == 0;
    }

    @Override // defpackage.djtp
    public final boolean R() {
        return this.mVersion > 0;
    }

    @Override // defpackage.djtp
    public final boolean S() {
        return this.mValiditySecs == 0 && this.mVersion == 0;
    }

    @Override // defpackage.djtp
    public final boolean T() {
        return this.mValiditySecs == -1 && this.mVersion == -1;
    }

    @Override // defpackage.djtp
    public final boolean U() {
        return this.mValiditySecs > 0 && this.mVersion == 0;
    }

    @Override // defpackage.djtp
    public final boolean V() {
        return this.mReconfigRequested;
    }

    @Override // defpackage.djtp
    public final boolean W() {
        return this.mVersion == 0 && this.mValiditySecs == 0;
    }

    @Override // defpackage.djtp
    public final boolean X() {
        return this.mValiditySecs >= 0 || this.mVersion >= 0 || this.mReconfigRequested;
    }

    @Override // defpackage.djtp
    public final boolean Y() {
        return R() && this.mConfigState == 1 && g() > 0 && !this.mReconfigRequested;
    }

    @Override // defpackage.djtp
    public final boolean Z() {
        return R() && !aa() && this.mConfigState == 1 && g() > 0;
    }

    @Override // defpackage.djtp
    public final int a() {
        return this.mConfigState;
    }

    @Override // defpackage.djtp
    public final boolean aa() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(dkvj.a().longValue());
        int i = this.mValiditySecs;
        int i2 = i / 10;
        if (i > 25200) {
            i2 = Math.max(i2, 25200);
        }
        int i3 = this.mValiditySecs;
        return i3 == 0 || seconds - this.mLastUpdateSecs >= ((long) (i3 - i2)) || this.mReconfigRequested;
    }

    @Override // defpackage.djtp
    public final boolean ab() {
        return this.mConfigState == 3;
    }

    @Override // defpackage.djtp
    public final void ac() {
        this.mConfigState = 1;
    }

    @Override // defpackage.djtp
    public final int b() {
        return this.rcsState;
    }

    @Override // defpackage.djtp
    public final int c() {
        return this.mType;
    }

    @Override // defpackage.djtp
    public final int d() {
        return this.mValiditySecs;
    }

    @Override // defpackage.djtp
    public final int e() {
        return this.mVersion;
    }

    @Override // defpackage.djtp
    @Deprecated
    public final long f() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(dkvj.a().longValue());
        int i = this.mValiditySecs;
        int i2 = i / 10;
        if (i > 25200) {
            i2 = Math.max(i2, 25200);
        }
        return Math.max(0L, (this.mValiditySecs - i2) - (seconds - this.mLastUpdateSecs));
    }

    @Override // defpackage.djtp
    public final long g() {
        return Math.max(0L, this.mValiditySecs - (TimeUnit.MILLISECONDS.toSeconds(dkvj.a().longValue()) - this.mLastUpdateSecs));
    }

    @Override // defpackage.djtp
    public final CapabilityConfiguration h() {
        return this.mCapabilityDiscoveryConfiguration;
    }

    @Override // defpackage.djtp
    public final ChatbotConfiguration i() {
        return this.mChatbotConfiguration;
    }

    @Override // defpackage.djtp
    public final InvalidConfigReason j() {
        InvalidConfigReason invalidConfigReason = this.invalidConfigReason;
        return invalidConfigReason == null ? InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED : invalidConfigReason;
    }

    @Override // defpackage.djtp
    public final Token k() {
        return this.mToken;
    }

    @Override // defpackage.djtp
    public final ConfirmationConfiguration l() {
        return this.mConfirmationConfiguration;
    }

    @Override // defpackage.djtp
    public final djtr m() {
        return (djtr) this.c.get();
    }

    @Override // defpackage.djtp
    @Deprecated
    public final ImsConfiguration n() {
        return this.mImsConfiguration;
    }

    @Override // defpackage.djtp
    public final InstantMessageConfiguration o() {
        return this.mInstantMessageConfiguration;
    }

    @Override // defpackage.djtp
    public final PresenceConfiguration p() {
        return this.mPresenceConfiguration;
    }

    @Override // defpackage.djtp
    public final ServerMessage q() {
        return this.mServerMessage;
    }

    @Override // defpackage.djtp
    public final ServicesConfiguration r() {
        return this.mServicesConfiguration;
    }

    @Override // defpackage.djtp
    public final UserExperienceConfiguration s() {
        return this.mUserExperienceConfig;
    }

    @Override // defpackage.djtp
    public final WelcomeMessage t() {
        return this.welcomeMessage;
    }

    @Override // defpackage.djtp
    public final Optional u() {
        String str = (String) dizg.o().a.aG.a();
        if (str.isEmpty()) {
            return Optional.ofNullable(this.tachyonUrl);
        }
        ensk h = b.h();
        h.Y(ente.a, "BugleRcsEngine");
        ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/config/Configuration", "getTachyonPhoneChannelUrl", 734, "Configuration.java")).t("Using Tachyon URL override for testing: %s", str);
        return Optional.of(str);
    }

    @Override // defpackage.djtp
    public final String v() {
        return this.mDeviceId;
    }

    @Override // defpackage.djtp
    public final String w() {
        return this.iccids;
    }

    @Override // defpackage.djtp
    public final String x() {
        StringBuilder sb = new StringBuilder("Type: ");
        sb.append(this.mType);
        sb.append(", Version: ");
        sb.append(this.mVersion);
        sb.append(", Validity: ");
        sb.append(this.mValiditySecs);
        sb.append(", Last updated: ");
        sb.append(this.mLastUpdateSecs);
        sb.append(", Remaining validity: ");
        sb.append(g());
        sb.append(", Reconfiguration requested: ");
        sb.append(this.mReconfigRequested);
        sb.append(", Messaging technology: ");
        sb.append(this.mInstantMessageConfiguration.mMessageTech == 0 ? "SIMPLE_IM" : "CPM");
        sb.append(", rcsVolteSingleRegistration: ");
        sb.append(m().C());
        if (djai.E()) {
            sb.append("Invalid configreason: ".concat(String.valueOf(String.valueOf(j()))));
        }
        return sb.toString();
    }

    @Override // defpackage.djtp
    public final String y() {
        return this.mTachyonAuthToken;
    }

    @Override // defpackage.djtp
    public final String z() {
        Token token = this.mToken;
        String str = token.mValue;
        if (token == a || str == null || emuz.e("", str)) {
            return null;
        }
        return str;
    }
}
