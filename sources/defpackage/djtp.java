package defpackage;

import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import com.google.android.ims.provisioning.config.ChatbotConfiguration;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ConfirmationConfiguration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.provisioning.config.PresenceConfiguration;
import com.google.android.ims.provisioning.config.ServerMessage;
import com.google.android.ims.provisioning.config.ServicesConfiguration;
import com.google.android.ims.provisioning.config.UserExperienceConfiguration;
import com.google.android.ims.provisioning.config.WelcomeMessage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface djtp {
    String A();

    void B();

    void C(ImsConfiguration imsConfiguration);

    void D();

    void E(long j);

    void F(int i);

    void G(boolean z);

    void H(ServerMessage serverMessage);

    void I(Configuration.Token token);

    void J();

    void K(int i);

    void L(int i);

    void M(WelcomeMessage welcomeMessage);

    boolean N();

    boolean O();

    boolean P();

    boolean Q();

    boolean R();

    boolean S();

    boolean T();

    boolean U();

    boolean V();

    boolean W();

    boolean X();

    boolean Y();

    boolean Z();

    int a();

    boolean aa();

    boolean ab();

    void ac();

    int b();

    int c();

    int d();

    int e();

    long f();

    long g();

    CapabilityConfiguration h();

    ChatbotConfiguration i();

    Configuration.InvalidConfigReason j();

    Configuration.Token k();

    ConfirmationConfiguration l();

    djtr m();

    @Deprecated
    ImsConfiguration n();

    InstantMessageConfiguration o();

    PresenceConfiguration p();

    ServerMessage q();

    ServicesConfiguration r();

    UserExperienceConfiguration s();

    WelcomeMessage t();

    Optional u();

    String v();

    String w();

    String x();

    String y();

    String z();
}
