package defpackage;

import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djtr {
    public static djtq D() {
        djtf djtfVar = new djtf();
        djtfVar.q("unknown");
        djtfVar.o("unknown");
        djtfVar.p("unknown");
        djtfVar.C("unknown");
        djtfVar.A("unknown");
        djtfVar.B("unknown");
        djtfVar.w(500);
        djtfVar.x(9500);
        djtfVar.y(10000);
        djtfVar.i(5762);
        djtfVar.n("");
        djtfVar.r("");
        djtfVar.z("");
        djtfVar.f("");
        djtfVar.s(0.0f);
        djtfVar.k("");
        djtfVar.l(-1);
        djtfVar.h(false);
        djtfVar.m("");
        djtfVar.e("");
        djtfVar.d("");
        djtfVar.b("");
        djtfVar.c("");
        djtfVar.u(1800);
        djtfVar.v(3600);
        djtfVar.j("sip");
        djtfVar.g("sip");
        djtfVar.t(false);
        return djtfVar;
    }

    public static djtq E(ImsConfiguration imsConfiguration) {
        djtq D = D();
        if (!Objects.isNull(imsConfiguration)) {
            if (Objects.nonNull(imsConfiguration.mPsSipTransport)) {
                D.q(imsConfiguration.mPsSipTransport);
            }
            if (Objects.nonNull(imsConfiguration.mPsMediaTransport)) {
                D.o(imsConfiguration.mPsMediaTransport);
            }
            if (Objects.nonNull(imsConfiguration.mPsRtpTransport)) {
                D.p(imsConfiguration.mPsRtpTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiSipTransport)) {
                D.C(imsConfiguration.mWifiSipTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiMediaTransport)) {
                D.A(imsConfiguration.mWifiMediaTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiRtpTransport)) {
                D.B(imsConfiguration.mWifiRtpTransport);
            }
            D.w(imsConfiguration.mT1);
            D.x(imsConfiguration.mT2);
            D.y(imsConfiguration.mT4);
            D.i(imsConfiguration.mLocalSipPort);
            if (Objects.nonNull(imsConfiguration.mPrivateIdentity)) {
                D.n(imsConfiguration.mPrivateIdentity);
            }
            if (Objects.nonNull(imsConfiguration.mPublicIdentity)) {
                D.r(imsConfiguration.mPublicIdentity);
            }
            if (Objects.nonNull(imsConfiguration.mUserName)) {
                D.z(imsConfiguration.mUserName);
            }
            if (Objects.nonNull(imsConfiguration.mDomain)) {
                D.f(imsConfiguration.mDomain);
            }
            D.s(imsConfiguration.mQ);
            if (Objects.nonNull(imsConfiguration.mPcscfAddress)) {
                D.k(imsConfiguration.mPcscfAddress);
            }
            D.l(imsConfiguration.mPcsfPort);
            D.h(imsConfiguration.mKeepAlive);
            if (Objects.nonNull(imsConfiguration.mPhoneContext)) {
                D.m(imsConfiguration.mPhoneContext);
            }
            if (Objects.nonNull(imsConfiguration.mAuthenticationScheme)) {
                D.e(imsConfiguration.mAuthenticationScheme);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestUsername)) {
                D.d(imsConfiguration.mAuthDigestUsername);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestPassword)) {
                D.b(imsConfiguration.mAuthDigestPassword);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestRealm)) {
                D.c(imsConfiguration.mAuthDigestRealm);
            }
            D.u(imsConfiguration.mRegRetryBaseTime);
            D.v(imsConfiguration.mRegRetryMaxTime);
            if (Objects.nonNull(imsConfiguration.mNatUrlFmt)) {
                D.j(imsConfiguration.mNatUrlFmt);
            }
            if (Objects.nonNull(imsConfiguration.mIntUrlFmt)) {
                D.g(imsConfiguration.mIntUrlFmt);
            }
            D.t(imsConfiguration.rcsVolteSingleRegistration);
        }
        return D;
    }

    public abstract String A();

    public abstract boolean B();

    public abstract boolean C();

    public abstract float a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract djtq i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract String q();

    public abstract String r();

    public abstract String s();

    public abstract String t();

    public abstract String u();

    public abstract String v();

    public abstract String w();

    public abstract String x();

    public abstract String y();

    public abstract String z();
}
