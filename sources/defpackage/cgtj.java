package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgtj {
    private static final cskc d = cskc.g("Bugle", "PduComposer");
    private static final cpn e = new cpn();
    public int b;
    private final lh f;
    private final ContentResolver g;
    private final lq h;
    public final cgtg c = new cgtg(this);
    public ByteArrayOutputStream a = new ByteArrayOutputStream();

    static {
        int i = 0;
        while (true) {
            String[] strArr = lo.a;
            if (i >= 83) {
                return;
            }
            e.put(lo.a[i], Integer.valueOf(i));
            i++;
        }
    }

    public cgtj(Context context, lh lhVar) {
        this.b = 0;
        this.f = lhVar;
        this.g = context.getContentResolver();
        this.h = lhVar.a;
        this.b = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0145 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int d(int r9) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgtj.d(int):int");
    }

    private final int e() {
        int i;
        this.c.c();
        lq lqVar = this.h;
        cgti a = this.c.a();
        byte[] k = lqVar.k(132);
        Integer num = (Integer) e.get(k == null ? "" : new String(k));
        int i2 = 1;
        if (num == null) {
            return 1;
        }
        j(num.intValue());
        ln lnVar = ((lk) this.f).b;
        if (lnVar == null || lnVar.a() == 0) {
            l(0L);
            this.c.d();
            this.c.b();
            return 0;
        }
        byte b = 62;
        try {
            lt b2 = lnVar.b(0);
            byte[] l = b2.l();
            if (l != null) {
                a(138);
                if (l[0] == 60 && l[l.length - 1] == 62) {
                    k(l);
                } else {
                    k(("<" + new String(l) + ">").getBytes());
                }
            }
            a(137);
            k(b2.n());
        } catch (ArrayIndexOutOfBoundsException e2) {
            d.o("cannot make message body", e2);
        }
        int a2 = a.a();
        this.c.d();
        m(a2);
        this.c.b();
        int a3 = lnVar.a();
        l(a3);
        int i3 = 0;
        while (i3 < a3) {
            lt b3 = lnVar.b(i3);
            this.c.c();
            cgtg cgtgVar = this.c;
            cgti a4 = cgtgVar.a();
            cgtgVar.c();
            cgti a5 = this.c.a();
            byte[] n = b3.n();
            if (n == null) {
                return i2;
            }
            int i4 = i2;
            Integer num2 = (Integer) e.get(new String(n));
            if (num2 == null) {
                k(n);
            } else {
                j(num2.intValue());
            }
            byte[] p = b3.p();
            if (p == null && (p = b3.o()) == null && (p = b3.m()) == null) {
                p = "smil.xml".getBytes();
            }
            a(133);
            k(p);
            int a6 = b3.a();
            if (a6 != 0) {
                a(129);
                j(a6);
            }
            int a7 = a5.a();
            this.c.d();
            m(a7);
            this.c.b();
            byte[] l2 = b3.l();
            if (l2 != null) {
                a(192);
                if (l2[0] == 60 && l2[l2.length - 1] == b) {
                    i(l2);
                } else {
                    i(("<" + new String(l2) + ">").getBytes());
                }
            }
            byte[] m = b3.m();
            if (m != null) {
                a(142);
                k(m);
            }
            int a8 = a4.a();
            eyee eyeeVar = b3.f;
            if (eyeeVar != null) {
                try {
                    eyeeVar.q(this.a);
                    this.b += eyeeVar.d();
                    i = eyeeVar.d();
                } catch (IOException e3) {
                    throw new IllegalStateException("ByteArrayOutputStream shouldn't throw IOException when written to.", e3);
                }
            } else {
                InputStream inputStream = null;
                try {
                    byte[] bArr = new byte[1024];
                    Uri uri = b3.e;
                    if (uri == null) {
                        return i4;
                    }
                    InputStream openInputStream = this.g.openInputStream(uri);
                    if (openInputStream == null) {
                        return i4;
                    }
                    i = 0;
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read != -1) {
                            this.a.write(bArr, 0, read);
                            this.b += read;
                            i += read;
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    openInputStream.close();
                } catch (IOException | RuntimeException unused2) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return i4;
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
            if (i != a4.a() - a8) {
                throw new RuntimeException("BUG: Length sanity check failed");
            }
            this.c.d();
            l(a8);
            l(i);
            this.c.b();
            i3++;
            i2 = i4;
            b = 62;
        }
        return 0;
    }

    private static lg f(lg lgVar) {
        String b = lgVar.b();
        char c = b.matches("[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}") ? (char) 3 : b.matches("\\+?[0-9|\\.|\\-]+") ? (char) 1 : b.matches("[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}") ? (char) 2 : b.matches("[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}") ? (char) 4 : (char) 5;
        lg lgVar2 = new lg(lgVar.a, lgVar.b);
        if (c == 1) {
            lgVar2.c("/TYPE=PLMN".getBytes());
            return lgVar2;
        }
        if (c == 3) {
            lgVar2.c("/TYPE=IPV4".getBytes());
            return lgVar2;
        }
        if (c == 4) {
            lgVar2.c("/TYPE=IPV6".getBytes());
        }
        return lgVar2;
    }

    private final void g(lg lgVar) {
        byte[] e2 = lgVar.e();
        if (e2 == null) {
            return;
        }
        int i = lgVar.a;
        this.c.c();
        cgti a = this.c.a();
        j(i);
        k(e2);
        int a2 = a.a();
        this.c.d();
        m(a2);
        this.c.b();
    }

    private final void h(long j) {
        int i = 0;
        long j2 = j;
        int i2 = 0;
        while (j2 != 0 && i2 < 8) {
            j2 >>>= 8;
            i2++;
        }
        a(i2);
        int i3 = (i2 - 1) * 8;
        while (i < i2) {
            a((int) ((j >>> i3) & 255));
            i++;
            i3 -= 8;
        }
    }

    private final void i(byte[] bArr) {
        a(34);
        c(bArr, bArr.length);
        a(0);
    }

    private final void j(int i) {
        a((i | 128) & PrivateKeyType.INVALID);
    }

    private final void k(byte[] bArr) {
        if ((bArr[0] & 255) > 127) {
            a(127);
        }
        c(bArr, bArr.length);
        a(0);
    }

    private final void l(long j) {
        int i = 0;
        long j2 = 127;
        while (i < 5 && j >= j2) {
            j2 = (j2 << 7) | 127;
            i++;
        }
        while (i > 0) {
            a((int) (((j >>> (i * 7)) & 127) | 128));
            i--;
        }
        a((int) (j & 127));
    }

    private final void m(long j) {
        if (j < 31) {
            a((int) j);
        } else {
            a(31);
            l(j);
        }
    }

    protected final void a(int i) {
        this.a.write(i);
        this.b++;
    }

    public final byte[] b() {
        switch (this.f.a()) {
            case 128:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(128);
                a(152);
                byte[] k = this.h.k(152);
                if (k == null) {
                    throw new IllegalArgumentException("Transaction-ID is null.");
                }
                k(k);
                if (d(141) != 0) {
                    return null;
                }
                d(133);
                if (d(137) != 0) {
                    return null;
                }
                boolean z = d(151) != 1;
                boolean z2 = !(d(130) == 1);
                boolean z3 = !(d(129) == 1);
                if (d(186) == 1 && (!(z | z2) && !z3)) {
                    return null;
                }
                d(150);
                d(138);
                d(136);
                d(143);
                d(134);
                d(144);
                a(132);
                if (e() != 0) {
                    return null;
                }
                break;
            case 129:
            case 134:
            default:
                return null;
            case 130:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(130);
                if (d(152) != 0 || d(141) != 0 || d(137) != 0) {
                    return null;
                }
                d(150);
                if (d(138) != 0 || d(142) != 0 || d(136) != 0 || d(131) != 0) {
                    return null;
                }
                break;
            case 131:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(131);
                if (d(152) != 0 || d(141) != 0 || d(149) != 0) {
                    return null;
                }
                break;
            case 132:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(132);
                if (d(152) != 0 || d(141) != 0 || d(139) != 0 || d(133) != 0 || d(137) != 0) {
                    return null;
                }
                int d2 = d(186);
                if (d2 != 0 && d2 != 2) {
                    return null;
                }
                int d3 = d(151);
                if (d3 != 0 && d3 != 2) {
                    return null;
                }
                int d4 = d(153);
                if (d4 != 0 && d4 != 2) {
                    return null;
                }
                a(132);
                if (e() != 0) {
                    return null;
                }
                break;
            case 133:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(133);
                if (d(152) != 0 || d(141) != 0) {
                    return null;
                }
                d(145);
                break;
            case 135:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(135);
                if (d(141) != 0 || d(139) != 0 || d(151) != 0 || d(137) != 0) {
                    return null;
                }
                d(133);
                if (d(155) != 0) {
                    return null;
                }
                break;
        }
        return this.a.toByteArray();
    }

    protected final void c(byte[] bArr, int i) {
        this.a.write(bArr, 0, i);
        this.b += i;
    }
}
