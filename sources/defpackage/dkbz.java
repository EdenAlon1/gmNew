package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbz extends dkce {
    public static final /* synthetic */ int a = 0;
    private static final dktn d = new dktn("RcsOtpSmsHandler");
    private Pattern e;
    private final dikl f;
    private final Context g;
    private final dked h;
    private final cguo i;
    private final Optional j;
    private final cmot k;

    public dkbz(Context context, cmot cmotVar, dikl diklVar, dked dkedVar, cguo cguoVar, Optional optional) {
        this.g = context;
        this.k = cmotVar;
        this.f = diklVar;
        this.h = dkedVar;
        this.i = cguoVar;
        this.j = optional;
    }

    private final Pattern e() {
        String str = (djai.z() && djai.ab()) ? this.j.isPresent() ? this.i.c((String) this.j.get()).j : null : (String) dimn.E().p().a();
        if (TextUtils.isEmpty(str)) {
            dkty.c("Otp pattern not set", new Object[0]);
            return null;
        }
        try {
            return Pattern.compile(str);
        } catch (PatternSyntaxException e) {
            dkty.i(e, "Error parsing otp pattern [%s]", str);
            return null;
        }
    }

    @Deprecated
    public final synchronized void a() {
        b(this.h.a());
    }

    @Override // defpackage.dkce
    public final synchronized void b(int i) {
        this.e = e();
        super.b(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b6  */
    @Override // defpackage.dkce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean c(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r13 != 0) goto L8
        L5:
            r13 = r1
            goto Laf
        L8:
            boolean r3 = r12.c
            if (r3 == 0) goto L39
            java.lang.String[] r3 = defpackage.dkbz.b
            r4 = r2
        Lf:
            r5 = 2
            if (r4 >= r5) goto L27
            r5 = r3[r4]
            boolean r5 = r13.endsWith(r5)
            if (r5 == 0) goto L24
            dktn r13 = defpackage.dkbz.d
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "ignoring SMS ends with reconfiguration suffix"
            defpackage.dkty.d(r13, r4, r3)
            goto L5
        L24:
            int r4 = r4 + 1
            goto Lf
        L27:
            dikl r5 = r12.f
            android.content.Context r6 = r12.g
            dkbv r7 = new dkbv
            r7.<init>()
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 4
            r5.t(r6, r7, r8, r9, r10, r11)
            goto Laf
        L39:
            java.util.regex.Pattern r3 = r12.e
            if (r3 != 0) goto L5d
            java.util.regex.Pattern r3 = r12.e()
            r12.e = r3
            if (r3 != 0) goto L5d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.String r3 = "otp_pattern is null. Unable to search for OTP"
            defpackage.dkty.q(r3, r13)
            dikl r4 = r12.f
            android.content.Context r5 = r12.g
            dkbw r6 = new dkbw
            r6.<init>()
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 3
            r4.t(r5, r6, r7, r8, r9, r10)
            goto L5
        L5d:
            if (r3 == 0) goto L9d
            java.util.regex.Matcher r13 = r3.matcher(r13)
            boolean r3 = r13.find()
            if (r3 != 0) goto L71
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.String r3 = "otp_pattern didn't find an OTP"
            defpackage.dkty.c(r3, r13)
            goto L9d
        L71:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "Found otp_pattern match"
            defpackage.dkty.c(r4, r3)
            r10 = r0
        L79:
            int r3 = r13.groupCount()
            if (r10 > r3) goto L9d
            java.lang.String r3 = r13.group(r10)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L9a
            dikl r5 = r12.f
            android.content.Context r6 = r12.g
            dkbx r7 = new dkbx
            r7.<init>()
            r9 = 6
            r11 = 0
            r8 = 0
            r5.t(r6, r7, r8, r9, r10, r11)
            r13 = r3
            goto Laf
        L9a:
            int r10 = r10 + 1
            goto L79
        L9d:
            dikl r3 = r12.f
            android.content.Context r4 = r12.g
            dkby r5 = new dkby
            r5.<init>()
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 5
            r3.t(r4, r5, r6, r7, r8, r9)
            goto L5
        Laf:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto Lb6
            return r2
        Lb6:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Received OTP SMS"
            defpackage.dkty.q(r2, r1)
            cmot r1 = r12.k
            cmpn r1 = r1.a
            r1.t(r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkbz.c(java.lang.String, int, int):boolean");
    }
}
