package defpackage;

import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ls {
    private static final enru a = enru.c("android/support/v7/mms/pdu/PduParser");
    private static final String[] b = {"/type=plmn@tmomail.net", "/type=plmn@mmsc1.mtel.ba", "/type=plmn@mmsc1.hteronet.ba"};
    private static byte[] c = null;
    private static byte[] d = null;
    private ByteArrayInputStream e;
    private lq f = null;
    private ln g = null;
    private final boolean h;

    public ls(byte[] bArr, boolean z) {
        this.e = null;
        this.e = new ByteArrayInputStream(bArr);
        this.h = z;
    }

    private static int b(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & PrivateKeyType.INVALID;
    }

    private static int c(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 127;
    }

    private static int d(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read != -1) {
            int i = 0;
            do {
                i = (i << 7) | (read & 127);
                if ((read & 128) == 0) {
                    return i;
                }
                read = byteArrayInputStream.read();
            } while (read != -1);
        }
        return -1;
    }

    private static int e(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & PrivateKeyType.INVALID;
        if (read <= 30) {
            return read;
        }
        if (read == 31) {
            return d(byteArrayInputStream);
        }
        throw new lr();
    }

    private static int f(ByteArrayInputStream byteArrayInputStream, int i) {
        int read = byteArrayInputStream.read(new byte[i], 0, i);
        if (read < i) {
            return -1;
        }
        return read;
    }

    private static long g(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        return read > 127 ? c(byteArrayInputStream) : h(byteArrayInputStream);
    }

    private static long h(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & PrivateKeyType.INVALID;
        if (read > 8) {
            throw new RuntimeException("Octet count greater than 8 and I can't represent that!");
        }
        long j = 0;
        for (int i = 0; i < read; i++) {
            j = (j << 8) + (byteArrayInputStream.read() & PrivateKeyType.INVALID);
        }
        return j;
    }

    private static lg i(ByteArrayInputStream byteArrayInputStream) {
        int i;
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read() & PrivateKeyType.INVALID;
        if (read == 0) {
            return new lg("");
        }
        byteArrayInputStream.reset();
        if (read < 32) {
            e(byteArrayInputStream);
            i = c(byteArrayInputStream);
        } else {
            i = 0;
        }
        byte[] m = m(byteArrayInputStream, 0);
        try {
            return i != 0 ? new lg(i, m) : new lg(m);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0213, code lost:
    
        return r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ln j(java.io.ByteArrayInputStream r23) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.j(java.io.ByteArrayInputStream):ln");
    }

    private static lq k(ByteArrayInputStream byteArrayInputStream) {
        lq lqVar;
        lg lgVar;
        byte[] e;
        String[] strArr;
        int i;
        lq lqVar2 = new lq();
        int i2 = 1;
        boolean z = true;
        while (z && byteArrayInputStream.available() > 0) {
            byteArrayInputStream.mark(i2);
            int b2 = b(byteArrayInputStream);
            if (b2 < 32 || b2 > 127) {
                lq lqVar3 = null;
                switch (b2) {
                    case 129:
                    case 130:
                    case 151:
                        lg i3 = i(byteArrayInputStream);
                        if (i3 != null) {
                            byte[] e2 = i3.e();
                            if (e2 != null) {
                                String str = new String(e2);
                                ensk g = a.g();
                                g.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) g).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 425, "PduParser.java")).u("parseHeaders: (to/cc/bcc) address: %d redacted-pii[%d-chars]", b2, str.length());
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(0, indexOf);
                                }
                                try {
                                    i3.d(str.getBytes());
                                } catch (NullPointerException e3) {
                                    ensk i4 = a.i();
                                    i4.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i4).g(e3)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 435, "PduParser.java")).r("Null pointer error parsing address for header field: %d", b2);
                                    return null;
                                }
                            }
                            try {
                                lqVar2.f(i3, b2);
                            } catch (NullPointerException e4) {
                                ensk i5 = a.i();
                                i5.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i5).g(e4)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 444, "PduParser.java")).u("Null pointer error while appending string value to headers, redacted-pii[%d-chars], header field: %d", i3.a(), b2);
                            } catch (RuntimeException e5) {
                                ensk i6 = a.i();
                                i6.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i6).g(e5)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 449, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                                return null;
                            }
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 131:
                    case 139:
                    case 152:
                    case 158:
                    case 183:
                    case 184:
                    case 185:
                    case 189:
                    case 190:
                        byte[] m = m(byteArrayInputStream, 0);
                        if (m != null) {
                            try {
                                ensk g2 = a.g();
                                g2.Y(ente.a, "PduParser");
                                enrr enrrVar = (enrr) ((enrr) g2).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 370, "PduParser.java");
                                Integer valueOf = Integer.valueOf(b2);
                                enrrVar.J("parseHeaders: headerField: %d (%02x) CONTENT_LOCATION redacted-pii[%d-chars]", valueOf, valueOf, Integer.valueOf(m.length));
                                lqVar2.j(m, b2);
                            } catch (NullPointerException e6) {
                                ensk i7 = a.i();
                                i7.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i7).g(e6)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 375, "PduParser.java")).q("Null pointer error while parsing content location");
                            } catch (RuntimeException e7) {
                                ensk i8 = a.i();
                                i8.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i8).g(e7)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 378, "PduParser.java")).r("%d is not Text-String header field!", b2);
                                return null;
                            }
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 132:
                        SparseArray sparseArray = new SparseArray();
                        byte[] l = l(byteArrayInputStream, sparseArray);
                        if (l != null) {
                            try {
                                ensk g3 = a.g();
                                g3.Y(ente.a, "PduParser");
                                enrr enrrVar2 = (enrr) ((enrr) g3).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 766, "PduParser.java");
                                Integer valueOf2 = Integer.valueOf(b2);
                                enrrVar2.J("parseHeaders: headerField: %d (%02x) CONTENT_TYPE %s", valueOf2, valueOf2, new String(l));
                                lqVar2.j(l, 132);
                            } catch (NullPointerException e8) {
                                ensk i9 = a.i();
                                i9.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i9).g(e8)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 771, "PduParser.java")).q("Null pointer error while setting the content type");
                            } catch (RuntimeException e9) {
                                ensk i10 = a.i();
                                i10.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i10).g(e9)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 774, "PduParser.java")).r("%d is not Text-String header field!", b2);
                                return null;
                            }
                        }
                        d = (byte[]) sparseArray.get(153);
                        c = (byte[]) sparseArray.get(131);
                        z = false;
                        i2 = 1;
                        break;
                    case 133:
                    case 142:
                    case 159:
                        try {
                            long h = h(byteArrayInputStream);
                            ensk g4 = a.g();
                            g4.Y(ente.a, "PduParser");
                            enrr enrrVar3 = (enrr) ((enrr) g4).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 317, "PduParser.java");
                            Integer valueOf3 = Integer.valueOf(b2);
                            enrrVar3.J("parseHeaders: headerField: %d (%02x) Octet value %d", valueOf3, valueOf3, Long.valueOf(h));
                            lqVar2.h(h, b2);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e10) {
                            ensk i11 = a.i();
                            i11.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i11).g(e10)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 322, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                            return null;
                        }
                    case 134:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 148:
                    case 149:
                    case 153:
                    case 155:
                    case 156:
                    case 162:
                    case 163:
                    case 165:
                    case 167:
                    case 169:
                    case 171:
                    case 177:
                    case 180:
                    case 186:
                    case 187:
                    case 188:
                    case 191:
                        int b3 = b(byteArrayInputStream);
                        ensk g5 = a.g();
                        g5.Y(ente.a, "PduParser");
                        enrr enrrVar4 = (enrr) ((enrr) g5).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 293, "PduParser.java");
                        Integer valueOf4 = Integer.valueOf(b2);
                        enrrVar4.J("parseHeaders: headerField: %d (%02x) Octet value %d", valueOf4, valueOf4, Integer.valueOf(b3));
                        try {
                            lqVar2.i(b3, b2);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e11) {
                            ensk i12 = a.i();
                            i12.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i12).g(e11)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 304, "PduParser.java")).r("%d is not Octet header field!", b2);
                            return null;
                        } catch (li e12) {
                            ensk i13 = a.i();
                            i13.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i13).g(e12)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 300, "PduParser.java")).u("Set invalid Octet value: %d into the header filed: %d", b3, b2);
                            return null;
                        }
                    case 135:
                    case 136:
                    case 157:
                        e(byteArrayInputStream);
                        int b4 = b(byteArrayInputStream);
                        try {
                            long h2 = h(byteArrayInputStream);
                            if (b4 == 129) {
                                h2 += System.currentTimeMillis() / 1000;
                            }
                            try {
                                ensk g6 = a.g();
                                g6.Y(ente.a, "PduParser");
                                enrr enrrVar5 = (enrr) ((enrr) g6).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 485, "PduParser.java");
                                Integer valueOf5 = Integer.valueOf(b2);
                                enrrVar5.J("parseHeaders: headerField: %d (%02x) time value %d", valueOf5, valueOf5, Long.valueOf(h2));
                                lqVar2.h(h2, b2);
                                z = true;
                                i2 = 1;
                                break;
                            } catch (RuntimeException e13) {
                                ensk i14 = a.i();
                                i14.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i14).g(e13)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 490, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                                return null;
                            }
                        } catch (RuntimeException e14) {
                            ensk i15 = a.i();
                            i15.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i15).g(e14)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 474, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                            return null;
                        }
                    case 137:
                        e(byteArrayInputStream);
                        if (b(byteArrayInputStream) == 128) {
                            lgVar = i(byteArrayInputStream);
                            if (lgVar == null || (e = lgVar.e()) == null) {
                                lqVar = null;
                            } else {
                                String str2 = new String(e);
                                String[] strArr2 = b;
                                int i16 = 0;
                                while (true) {
                                    if (i16 < 3) {
                                        String str3 = strArr2[i16];
                                        lqVar = lqVar3;
                                        int indexOf2 = str2.toLowerCase(Locale.US).indexOf(str3);
                                        if (indexOf2 > 0) {
                                            strArr = strArr2;
                                            if (str2.length() == indexOf2 + str3.length()) {
                                                ensk h3 = a.h();
                                                h3.Y(ente.a, "PduParser");
                                                ((enrr) ((enrr) h3).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 811, "PduParser.java")).t("Irregular addressing indicator found, removing %s", str3);
                                                str2 = str2.substring(0, indexOf2);
                                            }
                                        } else {
                                            strArr = strArr2;
                                        }
                                        i16++;
                                        lqVar3 = lqVar;
                                        strArr2 = strArr;
                                    } else {
                                        lqVar = lqVar3;
                                        int indexOf3 = str2.indexOf("/TYPE=");
                                        int lastIndexOf = str2.lastIndexOf(64);
                                        if (indexOf3 <= 0 || lastIndexOf >= 0) {
                                            ensk h4 = a.h();
                                            h4.Y(ente.a, "PduParser");
                                            ((enrr) ((enrr) h4).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 827, "PduParser.java")).q("No addressing indicator found, using phone number as is.");
                                        } else {
                                            ensk h5 = a.h();
                                            h5.Y(ente.a, "PduParser");
                                            ((enrr) ((enrr) h5).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 823, "PduParser.java")).q("Phone number addressing indicator found, removing");
                                            str2 = str2.substring(0, indexOf3);
                                        }
                                    }
                                }
                                try {
                                    lgVar.d(str2.getBytes());
                                } catch (NullPointerException e15) {
                                    ensk i17 = a.i();
                                    i17.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i17).g(e15)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 521, "PduParser.java")).q("Null pointer error while parsing From: address.");
                                    return lqVar;
                                }
                            }
                        } else {
                            lqVar = null;
                            try {
                                lgVar = new lg("insert-address-token".getBytes());
                            } catch (NullPointerException e16) {
                                ensk i18 = a.i();
                                i18.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i18).g(e16)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 531, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                                return null;
                            }
                        }
                        lg lgVar2 = lgVar;
                        try {
                            ensk g7 = a.g();
                            g7.Y(ente.a, "PduParser");
                            enrr enrrVar6 = (enrr) ((enrr) g7).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 538, "PduParser.java");
                            Integer valueOf6 = Integer.valueOf(b2);
                            enrrVar6.J("parseHeaders: headerField: %d (%02x) from address redacted-pii[%d-chars]", valueOf6, valueOf6, Integer.valueOf(lgVar2.a()));
                            lqVar2.g(lgVar2, 137);
                        } catch (NullPointerException e17) {
                            ensk i19 = a.i();
                            i19.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i19).g(e17)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 543, "PduParser.java")).r("Null pointer error while setting encoded string value for headers, from redacted-pii[%d-chars]", lgVar2.a());
                        } catch (RuntimeException e18) {
                            ensk i20 = a.i();
                            i20.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i20).g(e18)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 548, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                            return lqVar;
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 138:
                        byteArrayInputStream.mark(1);
                        int b5 = b(byteArrayInputStream);
                        ensk g8 = a.g();
                        g8.Y(ente.a, "PduParser");
                        enrr enrrVar7 = (enrr) ((enrr) g8).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 560, "PduParser.java");
                        Integer valueOf7 = Integer.valueOf(b2);
                        enrrVar7.J("parseHeaders: headerField: %d (%02x) MESSAGE_CLASS %d", valueOf7, valueOf7, Integer.valueOf(b5));
                        if (b5 < 128) {
                            byteArrayInputStream.reset();
                            byte[] m2 = m(byteArrayInputStream, 0);
                            if (m2 != null) {
                                try {
                                    lqVar2.j(m2, 138);
                                } catch (NullPointerException e19) {
                                    ensk i21 = a.i();
                                    i21.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i21).g(e19)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 599, "PduParser.java")).q("Null pointer error while setting non-personal message class");
                                } catch (RuntimeException e20) {
                                    ensk i22 = a.i();
                                    i22.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i22).g(e20)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 602, "PduParser.java")).r("%d is not Text-String header field!", b2);
                                    return null;
                                }
                            }
                        } else if (b5 == 128) {
                            try {
                                try {
                                    lqVar2.j("personal".getBytes(), 138);
                                } catch (RuntimeException e21) {
                                    ensk i23 = a.i();
                                    i23.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i23).g(e21)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 587, "PduParser.java")).r("%d is not Text-String header field!", b2);
                                    return null;
                                }
                            } catch (NullPointerException e22) {
                                e = e22;
                                i = b5;
                                ensk i24 = a.i();
                                i24.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i24).g(e)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 583, "PduParser.java")).r("Null pointer error while setting message class, message class: %d", i);
                                z = true;
                                i2 = 1;
                            }
                        } else if (b5 == 129) {
                            lqVar2.j("advertisement".getBytes(), 138);
                        } else if (b5 == 130) {
                            lqVar2.j("informational".getBytes(), 138);
                        } else if (b5 == 131) {
                            try {
                                lqVar2.j("auto".getBytes(), 138);
                            } catch (NullPointerException e23) {
                                e = e23;
                                i = 131;
                                ensk i242 = a.i();
                                i242.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i242).g(e)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 583, "PduParser.java")).r("Null pointer error while setting message class, message class: %d", i);
                                z = true;
                                i2 = 1;
                            }
                        }
                        z = true;
                        i2 = 1;
                    case 140:
                        int b6 = b(byteArrayInputStream);
                        ensk g9 = a.g();
                        g9.Y(ente.a, "PduParser");
                        ((enrr) ((enrr) g9).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 229, "PduParser.java")).u("parseHeaders: messageType: %d headerField (%02x)", b6, b2);
                        switch (b6) {
                            case 137:
                            case 138:
                            case 139:
                            case 140:
                            case 141:
                            case 142:
                            case 143:
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            case 151:
                                break;
                            default:
                                try {
                                    lqVar2.i(b6, b2);
                                    break;
                                } catch (RuntimeException e24) {
                                    ensk i25 = a.i();
                                    i25.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i25).g(e24)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 259, "PduParser.java")).r("%d is not Octet header field!", b2);
                                    return null;
                                } catch (li e25) {
                                    ensk i26 = a.i();
                                    i26.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i26).g(e25)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 254, "PduParser.java")).u("Set invalid Octet value: %d into the header filed: %d", b6, b2);
                                    return null;
                                }
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 141:
                        int c2 = c(byteArrayInputStream);
                        try {
                            ensk g10 = a.g();
                            g10.Y(ente.a, "PduParser");
                            enrr enrrVar8 = (enrr) ((enrr) g10).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 616, "PduParser.java");
                            Integer valueOf8 = Integer.valueOf(b2);
                            enrrVar8.J("parseHeaders: headerField: %d (%02x) MMS_VERSION %d", valueOf8, valueOf8, Integer.valueOf(c2));
                            lqVar2.i(c2, 141);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e26) {
                            ensk i27 = a.i();
                            i27.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i27).g(e26)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 625, "PduParser.java")).r("%d is not Octet header field!", b2);
                            return null;
                        } catch (li e27) {
                            ensk i28 = a.i();
                            i28.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i28).g(e27)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 621, "PduParser.java")).u("Set invalid Octet value: %d into the header field: %d", c2, b2);
                            return null;
                        }
                    case 147:
                    case 150:
                    case 154:
                    case 166:
                    case 181:
                    case 182:
                        lg i29 = i(byteArrayInputStream);
                        if (i29 != null) {
                            try {
                                ensk g11 = a.g();
                                g11.Y(ente.a, "PduParser");
                                enrr enrrVar9 = (enrr) ((enrr) g11).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 399, "PduParser.java");
                                Integer valueOf9 = Integer.valueOf(b2);
                                enrrVar9.J("parseHeaders: headerField: %d (%02x) encoded string %s", valueOf9, valueOf9, i29.b());
                                lqVar2.g(i29, b2);
                            } catch (NullPointerException e28) {
                                ensk i30 = a.i();
                                i30.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i30).g(e28)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 404, "PduParser.java")).q("Null pointer error while parsing response text.");
                            } catch (RuntimeException e29) {
                                ensk i31 = a.i();
                                i31.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i31).g(e29)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 407, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                                return null;
                            }
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 160:
                        e(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            lg i32 = i(byteArrayInputStream);
                            if (i32 != null) {
                                try {
                                    ensk g12 = a.g();
                                    g12.Y(ente.a, "PduParser");
                                    enrr enrrVar10 = (enrr) ((enrr) g12).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 650, "PduParser.java");
                                    Integer valueOf10 = Integer.valueOf(b2);
                                    enrrVar10.J("parseHeaders: headerField: %d (%02x) PREVIOUSLY_SENT_BY: %s", valueOf10, valueOf10, i32.b());
                                    lqVar2.g(i32, 160);
                                } catch (NullPointerException e30) {
                                    ensk i33 = a.i();
                                    i33.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i33).g(e30)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 655, "PduParser.java")).q("Null pointer error while setting previously_sent_by value");
                                } catch (RuntimeException e31) {
                                    ensk i34 = a.i();
                                    i34.Y(ente.a, "PduParser");
                                    ((enrr) ((enrr) ((enrr) i34).g(e31)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 658, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                                    return null;
                                }
                            }
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e32) {
                            ensk i35 = a.i();
                            i35.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i35).g(e32)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 642, "PduParser.java")).r("%d is not Integer-Value", b2);
                            return null;
                        }
                    case 161:
                        e(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            try {
                                long h6 = h(byteArrayInputStream);
                                ensk g13 = a.g();
                                g13.Y(ente.a, "PduParser");
                                enrr enrrVar11 = (enrr) ((enrr) g13).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 684, "PduParser.java");
                                Integer valueOf11 = Integer.valueOf(b2);
                                enrrVar11.J("parseHeaders: headerField: %d (%02x) PREVIOUSLY_SENT_DATE %d", valueOf11, valueOf11, Long.valueOf(h6));
                                lqVar2.h(h6, 161);
                                z = true;
                                i2 = 1;
                                break;
                            } catch (RuntimeException e33) {
                                ensk i36 = a.i();
                                i36.Y(ente.a, "PduParser");
                                ((enrr) ((enrr) ((enrr) i36).g(e33)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 689, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                                return null;
                            }
                        } catch (RuntimeException e34) {
                            ensk i37 = a.i();
                            i37.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i37).g(e34)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 677, "PduParser.java")).r("%d is not Integer-Value", b2);
                            return null;
                        }
                    case 164:
                        ensk g14 = a.g();
                        g14.Y(ente.a, "PduParser");
                        ((enrr) ((enrr) g14).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 703, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) MM_FLAGS NOT REALLY SUPPORTED", b2, b2);
                        e(byteArrayInputStream);
                        b(byteArrayInputStream);
                        i(byteArrayInputStream);
                        z = true;
                        i2 = 1;
                        break;
                    case 168:
                    case 174:
                    case 176:
                    default:
                        ensk i38 = a.i();
                        i38.Y(ente.a, "PduParser");
                        ((enrr) ((enrr) i38).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 795, "PduParser.java")).u("parseHeaders: Unknown header: %d (%02x)", b2, b2);
                        z = true;
                        i2 = 1;
                        break;
                    case 170:
                    case 172:
                        ensk g15 = a.g();
                        g15.Y(ente.a, "PduParser");
                        ((enrr) ((enrr) g15).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 726, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) MBOX_", b2, b2);
                        e(byteArrayInputStream);
                        b(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e35) {
                            ensk i39 = a.i();
                            i39.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i39).g(e35)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 738, "PduParser.java")).r("%d is not Integer-Value", b2);
                            return null;
                        }
                    case 173:
                    case 175:
                    case 179:
                        try {
                            long g16 = g(byteArrayInputStream);
                            ensk g17 = a.g();
                            g17.Y(ente.a, "PduParser");
                            enrr enrrVar12 = (enrr) ((enrr) g17).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 336, "PduParser.java");
                            Integer valueOf12 = Integer.valueOf(b2);
                            enrrVar12.J("parseHeaders: headerField: %d (%02x) Octet value %d", valueOf12, valueOf12, Long.valueOf(g16));
                            lqVar2.h(g16, b2);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e36) {
                            ensk i40 = a.i();
                            i40.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i40).g(e36)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 341, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                            return null;
                        }
                    case 178:
                        ensk g18 = a.g();
                        g18.Y(ente.a, "PduParser");
                        ((enrr) ((enrr) g18).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 749, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) ELEMENT_DESCRIPTOR", b2, b2);
                        l(byteArrayInputStream, null);
                        z = true;
                        i2 = 1;
                        break;
                }
                return null;
            }
            byteArrayInputStream.reset();
            byte[] m3 = m(byteArrayInputStream, 0);
            ensk g19 = a.g();
            g19.Y(ente.a, "PduParser");
            ((enrr) ((enrr) g19).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 221, "PduParser.java")).t("TextHeader: %s", new String(m3));
        }
        return lqVar2;
    }

    private static byte[] l(ByteArrayInputStream byteArrayInputStream, SparseArray sparseArray) {
        byte[] m;
        int available;
        char c2;
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        int i = read & PrivateKeyType.INVALID;
        if (i >= 32) {
            return i <= 127 ? m(byteArrayInputStream, 0) : lo.a[c(byteArrayInputStream)].getBytes();
        }
        int e = e(byteArrayInputStream);
        int available2 = byteArrayInputStream.available();
        byteArrayInputStream.mark(1);
        int read2 = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        int i2 = read2 & PrivateKeyType.INVALID;
        if (i2 >= 32 && i2 <= 127) {
            m = m(byteArrayInputStream, 0);
        } else {
            if (i2 <= 127) {
                ensk i3 = a.i();
                i3.Y(ente.a, "PduParser");
                ((enrr) ((enrr) i3).h("android/support/v7/mms/pdu/PduParser", "parseContentType", 1522, "PduParser.java")).q("Corrupt content-type");
                return lo.a[0].getBytes();
            }
            int c3 = c(byteArrayInputStream);
            String[] strArr = lo.a;
            if (c3 < 83) {
                m = lo.a[c3].getBytes();
            } else {
                byteArrayInputStream.reset();
                m = m(byteArrayInputStream, 0);
            }
        }
        int available3 = e - (available2 - byteArrayInputStream.available());
        if (available3 > 0) {
            Integer valueOf = Integer.valueOf(available3);
            int available4 = byteArrayInputStream.available();
            valueOf.getClass();
            int i4 = available3;
            while (i4 > 0) {
                int read3 = byteArrayInputStream.read();
                i4--;
                if (read3 != 129) {
                    if (read3 != 131) {
                        if (read3 == 133 || read3 == 151) {
                            byte[] m2 = m(byteArrayInputStream, 0);
                            if (m2 != null && sparseArray != null) {
                                sparseArray.put(151, m2);
                            }
                            available = byteArrayInputStream.available();
                            valueOf.getClass();
                        } else {
                            if (read3 != 153) {
                                if (read3 != 137) {
                                    if (read3 != 138) {
                                        enru enruVar = a;
                                        ensk i5 = enruVar.i();
                                        i5.Y(ente.a, "PduParser");
                                        ((enrr) ((enrr) i5).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1461, "PduParser.java")).q("Not supported Content-Type parameter");
                                        if (f(byteArrayInputStream, i4) == -1) {
                                            ensk i6 = enruVar.i();
                                            i6.Y(ente.a, "PduParser");
                                            ((enrr) ((enrr) i6).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1463, "PduParser.java")).q("Corrupt Content-Type");
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                }
                            }
                            byte[] m3 = m(byteArrayInputStream, 0);
                            if (m3 != null && sparseArray != null) {
                                sparseArray.put(153, m3);
                            }
                            available = byteArrayInputStream.available();
                            valueOf.getClass();
                        }
                    }
                    byteArrayInputStream.mark(1);
                    int b2 = b(byteArrayInputStream);
                    byteArrayInputStream.reset();
                    if (b2 > 127) {
                        int c4 = c(byteArrayInputStream);
                        String[] strArr2 = lo.a;
                        c2 = 'S';
                        if (c4 < 83) {
                            sparseArray.put(131, lo.a[c4].getBytes());
                        }
                    } else {
                        c2 = 'S';
                        byte[] m4 = m(byteArrayInputStream, 0);
                        if (m4 != null && sparseArray != null) {
                            sparseArray.put(131, m4);
                        }
                    }
                    int available5 = byteArrayInputStream.available();
                    valueOf.getClass();
                    i4 = available3 - (available4 - available5);
                } else {
                    byteArrayInputStream.mark(1);
                    int b3 = b(byteArrayInputStream);
                    byteArrayInputStream.reset();
                    if ((b3 <= 32 || b3 >= 127) && b3 != 0) {
                        int g = (int) g(byteArrayInputStream);
                        if (sparseArray != null) {
                            sparseArray.put(129, Integer.valueOf(g));
                        }
                    } else {
                        byte[] m5 = m(byteArrayInputStream, 0);
                        try {
                            Integer num = (Integer) ((enot) ld.a).d.get(new String(m5));
                            if (num == null) {
                                throw new UnsupportedEncodingException();
                            }
                            num.intValue();
                            sparseArray.put(129, num);
                        } catch (UnsupportedEncodingException e2) {
                            ensk i7 = a.i();
                            i7.Y(ente.a, "PduParser");
                            ((enrr) ((enrr) ((enrr) i7).g(e2)).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1428, "PduParser.java")).t("unsupported encoding: %s", Arrays.toString(m5));
                            sparseArray.put(129, 0);
                        }
                    }
                    available = byteArrayInputStream.available();
                    valueOf.getClass();
                }
                i4 = available3 - (available4 - available);
            }
            if (i4 != 0) {
                ensk i8 = a.i();
                i8.Y(ente.a, "PduParser");
                ((enrr) ((enrr) i8).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1472, "PduParser.java")).q("Corrupt Content-Type");
            }
        }
        if (available3 >= 0) {
            return m;
        }
        ensk i9 = a.i();
        i9.Y(ente.a, "PduParser");
        ((enrr) ((enrr) i9).h("android/support/v7/mms/pdu/PduParser", "parseContentType", 1533, "PduParser.java")).q("Corrupt MMS message");
        return lo.a[0].getBytes();
    }

    private static byte[] m(ByteArrayInputStream byteArrayInputStream, int i) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        if (i == 1) {
            if (read == 34) {
                byteArrayInputStream.mark(1);
            }
            byteArrayInputStream.reset();
        } else {
            if (read == 127) {
                byteArrayInputStream.mark(1);
            }
            byteArrayInputStream.reset();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read2 = byteArrayInputStream.read();
        while (read2 != -1 && read2 != 0) {
            if ((read2 >= 32 && read2 <= 126) || ((read2 >= 128 && read2 <= 255) || read2 == 9 || read2 == 10 || read2 == 13)) {
                byteArrayOutputStream.write(read2);
            }
            read2 = byteArrayInputStream.read();
        }
        if (byteArrayOutputStream.size() > 0) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x069b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lh a() {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.a():lh");
    }
}
