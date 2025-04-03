package com.google.android.ims.provisioning.config;

import defpackage.djtr;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ImsConfiguration implements Serializable {
    private static final long serialVersionUID = -746053072179571299L;
    public String mAuthDigestPassword;
    public String mAuthDigestRealm;
    public String mAuthDigestUsername;
    public String mAuthenticationScheme;
    public String mDomain;
    public String mPcscfAddress;
    public int mPcsfPort;
    public String mPrivateIdentity;
    public String mPsMediaTransport;
    public String mPsRtpTransport;
    public String mPsSipTransport;
    public String mPublicIdentity;
    public String mUserName;
    public String mWifiMediaTransport;
    public String mWifiRtpTransport;
    public String mWifiSipTransport;
    public int mT1 = 500;
    public int mT2 = 9500;
    public int mT4 = 10000;
    public int mLocalSipPort = 5762;
    public float mQ = 0.0f;
    public boolean mKeepAlive = false;
    public String mPhoneContext = "";
    public int mRegRetryBaseTime = 1800;
    public int mRegRetryMaxTime = 3600;
    public String mNatUrlFmt = "sip";
    public String mIntUrlFmt = "sip";
    public boolean rcsVolteSingleRegistration = false;

    public static ImsConfiguration a(djtr djtrVar) {
        ImsConfiguration imsConfiguration = new ImsConfiguration();
        imsConfiguration.e(djtrVar.v());
        imsConfiguration.c(djtrVar.t());
        imsConfiguration.d(djtrVar.u());
        imsConfiguration.i(djtrVar.A());
        imsConfiguration.g(djtrVar.y());
        imsConfiguration.h(djtrVar.z());
        imsConfiguration.mT1 = djtrVar.f();
        imsConfiguration.mT2 = djtrVar.g();
        imsConfiguration.mT4 = djtrVar.h();
        imsConfiguration.mPrivateIdentity = djtrVar.s();
        imsConfiguration.f(djtrVar.w(), djtrVar.x());
        imsConfiguration.mDomain = djtrVar.n();
        imsConfiguration.mQ = djtrVar.a();
        imsConfiguration.mPcscfAddress = djtrVar.q();
        imsConfiguration.mPcsfPort = djtrVar.c();
        imsConfiguration.mKeepAlive = djtrVar.B();
        imsConfiguration.mPhoneContext = djtrVar.r();
        imsConfiguration.mAuthenticationScheme = djtrVar.m();
        imsConfiguration.mAuthDigestUsername = djtrVar.l();
        imsConfiguration.mAuthDigestPassword = djtrVar.j();
        imsConfiguration.mAuthDigestRealm = djtrVar.k();
        imsConfiguration.mRegRetryBaseTime = djtrVar.d();
        imsConfiguration.mRegRetryMaxTime = djtrVar.e();
        imsConfiguration.mNatUrlFmt = djtrVar.p();
        imsConfiguration.mIntUrlFmt = djtrVar.o();
        imsConfiguration.rcsVolteSingleRegistration = djtrVar.C();
        return imsConfiguration;
    }

    public static String b(int i) {
        return i == 0 ? "tel" : "sip";
    }

    private static String j(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -169334160) {
            if (hashCode == 2376292 && str.equals("MSRP")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("MSRPoTLS")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? "unknown" : "MSRPoTLS" : "MSRP";
    }

    private static String k(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 81486) {
            if (hashCode == 2554139 && str.equals("SRTP")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("RTP")) {
                c = 0;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? "unknown" : "SRTP" : "RTP";
    }

    private static String l(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1479406420) {
            if (str.equals("SIPoTCP")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1479406138) {
            if (hashCode == -1479405428 && str.equals("SIPoUDP")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("SIPoTLS")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? "unknown" : "SIPoUDP" : "SIPoTLS" : "SIPoTCP";
    }

    public final void c(String str) {
        this.mPsMediaTransport = j(str);
    }

    public final void d(String str) {
        this.mPsRtpTransport = k(str);
    }

    public final void e(String str) {
        this.mPsSipTransport = l(str);
    }

    public final void f(String str, String str2) {
        this.mPublicIdentity = str;
        this.mUserName = str2;
    }

    public final void g(String str) {
        this.mWifiMediaTransport = j(str);
    }

    public final void h(String str) {
        this.mWifiRtpTransport = k(str);
    }

    public final void i(String str) {
        this.mWifiSipTransport = l(str);
    }
}
