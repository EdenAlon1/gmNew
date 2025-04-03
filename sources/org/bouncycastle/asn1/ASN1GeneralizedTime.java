package org.bouncycastle.asn1;

import defpackage.a;
import defpackage.fics;
import defpackage.fidb;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1GeneralizedTime extends ASN1Primitive {
    final byte[] a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1GeneralizedTime$1, reason: invalid class name */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1GeneralizedTime(String str) {
        this.a = fidb.d(str);
        try {
            f();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    private final String j(String str) {
        String str2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (g()) {
                    str = q(str);
                }
                if (timeZone.inDaylightTime(m().parse(str + "GMT" + str2 + o(i) + ":" + o(i2)))) {
                    i += true != str2.equals("+") ? -1 : 1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + o(i) + ":" + o(i2);
    }

    private final SimpleDateFormat m() {
        SimpleDateFormat simpleDateFormat = g() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : i() ? new SimpleDateFormat("yyyyMMddHHmmssz") : h() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private final boolean n(int i) {
        byte b;
        byte[] bArr = this.a;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    private static final String o(int i) {
        return i < 10 ? a.h(i, "0") : Integer.toString(i);
    }

    private static final String q(String str) {
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && (charAt = substring.charAt(i)) >= '0' && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            return String.valueOf(str.substring(0, 14)).concat(String.valueOf(substring.substring(0, 4)).concat(String.valueOf(substring.substring(i))));
        }
        if (i2 == 1) {
            return String.valueOf(str.substring(0, 14)).concat(substring.substring(0, i) + "00" + substring.substring(i));
        }
        if (i2 != 2) {
            return str;
        }
        return String.valueOf(str.substring(0, 14)).concat(substring.substring(0, i) + "0" + substring.substring(i));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int a(boolean z) {
        return ASN1OutputStream.b(z, this.a.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 24, this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            return Arrays.equals(this.a, ((ASN1GeneralizedTime) aSN1Primitive).a);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final String e() {
        String a = fidb.a(this.a);
        if (a.charAt(a.length() - 1) == 'Z') {
            return String.valueOf(a.substring(0, a.length() - 1)).concat("GMT+00:00");
        }
        int length = a.length();
        char charAt = a.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && a.indexOf("GMT") == length - 9) {
            return a;
        }
        int length2 = a.length();
        int i = length2 - 5;
        char charAt2 = a.charAt(i);
        if (charAt2 == '-' || charAt2 == '+') {
            int i2 = length2 - 2;
            return a.substring(0, i) + "GMT" + a.substring(i, i2) + ":" + a.substring(i2);
        }
        int length3 = a.length() - 3;
        char charAt3 = a.charAt(length3);
        if (charAt3 != '-' && charAt3 != '+') {
            return a.concat(j(a));
        }
        return a.substring(0, length3) + "GMT" + a.substring(length3) + ":00";
    }

    public final Date f() {
        SimpleDateFormat m;
        String a = fidb.a(this.a);
        if (a.endsWith("Z")) {
            m = g() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", LocaleUtil.a) : i() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", LocaleUtil.a) : h() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", LocaleUtil.a) : new SimpleDateFormat("yyyyMMddHH'Z'", LocaleUtil.a);
            m.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (a.indexOf(45) > 0 || a.indexOf(43) > 0) {
            a = e();
            m = m();
        } else {
            m = g() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : i() ? new SimpleDateFormat("yyyyMMddHHmmss") : h() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            m.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (g()) {
            a = q(a);
        }
        return m.parse(a);
    }

    protected final boolean g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    protected final boolean h() {
        return n(10) && n(11);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return fics.a(this.a);
    }

    protected final boolean i() {
        return n(12) && n(13);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        return new DERGeneralizedTime(this.a);
    }

    public ASN1GeneralizedTime(byte[] bArr) {
        if (bArr.length >= 4) {
            this.a = bArr;
            if (!n(0) || !n(1) || !n(2) || !n(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }
}
