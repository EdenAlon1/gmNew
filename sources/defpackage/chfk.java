package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.net.VerifyTachyonOtpWorker;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chfk extends cnjk {
    public static final cskc a = cskc.g("Bugle", "TachyonOtpPattern");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/net/TachyonOtpPattern");
    private static final cfup f = cfvl.h(cfvl.b, "tachyon_phone_registration_code_pattern", "^(\\d{6})\\sis\\syour\\sMessages\\sverification\\scode(?:$|\\s(?s).*$)");
    public final Context c;
    public final ffbr d;
    private final errl g;
    private final ffbr h;
    private final ffbr i;
    private final crne j;

    public chfk(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, crne crneVar) {
        this.c = context;
        this.h = ffbrVar;
        this.d = ffbrVar3;
        this.g = errlVar;
        this.j = crneVar;
        this.i = ffbrVar2;
    }

    @Override // defpackage.cnjk
    protected final String b() {
        return (String) f.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String c(CharSequence charSequence) {
        engw engwVar = (engw) this.e.get();
        if (engwVar.size() != 1) {
            throw new IllegalStateException("Invalid OTP pattern");
        }
        try {
            Matcher matcher = ((Pattern) engwVar.get(0)).matcher(charSequence);
            return matcher.find() ? matcher.group(1) : "";
        } catch (PatternSyntaxException unused) {
            csjb b2 = a.b();
            b2.I("Invalid pattern");
            b2.A("input", b());
            b2.r();
            return "";
        }
    }

    @Override // defpackage.cnjk, defpackage.cnjo
    public final elfl gf(CharSequence charSequence, final int i) {
        final String c = c(charSequence);
        if (TextUtils.isEmpty(c)) {
            csjb a2 = a.a();
            a2.I("Skip processing due to empty otp");
            a2.r();
            return elfo.e(false);
        }
        if (!((atre) this.h.b()).a()) {
            return elfl.g(this.j.a(i)).h(new emwl() { // from class: chfi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        chfk.a.m("Skip unnecessary tachyon otp processing.");
                        return false;
                    }
                    int i2 = i;
                    String str = c;
                    chfk chfkVar = chfk.this;
                    chfk.a.m("Scheduling otp verification");
                    pon ponVar = new pon();
                    ponVar.e("otpCode", str);
                    ponVar.e("msisdn", ((chco) chfkVar.d.b()).g(i2));
                    ppv ppvVar = new ppv(VerifyTachyonOtpWorker.class);
                    ppvVar.d("tachyon_otp_worker");
                    ppvVar.j(ponVar.a());
                    pqr.a(chfkVar.c).d((ppw) ppvVar.b());
                    return true;
                }
            }, this.g);
        }
        final elfl e = ((ckac) this.i.b()).e(i);
        final elfl g = elfl.g(this.j.a(i));
        return elfo.k(e, g).a(new Callable() { // from class: chfj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (!((Boolean) erqt.q(g)).booleanValue()) {
                    ensk h = chfk.b.h();
                    h.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/TachyonOtpPattern", "scheduleOtpVerification", 111, "TachyonOtpPattern.java")).q("Skip unnecessary tachyon otp processing.");
                    return false;
                }
                awui awuiVar = (awui) erqt.q(e);
                if (awuiVar == null) {
                    ensk j = chfk.b.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/TachyonOtpPattern", "scheduleOtpVerification", 116, "TachyonOtpPattern.java")).q("Could not get msisdn for subId, skipping otp verification.");
                    return false;
                }
                String str = c;
                chfk chfkVar = chfk.this;
                ensk h2 = chfk.b.h();
                h2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/TachyonOtpPattern", "scheduleOtpVerification", 121, "TachyonOtpPattern.java")).q("Scheduling otp verification");
                pon ponVar = new pon();
                ponVar.e("otpCode", str);
                ponVar.e("msisdn", awuiVar.d);
                ppv ppvVar = new ppv(VerifyTachyonOtpWorker.class);
                ppvVar.d("tachyon_otp_worker");
                ppvVar.j(ponVar.a());
                pqr.a(chfkVar.c).d((ppw) ppvVar.b());
                return true;
            }
        }, this.g);
    }
}
