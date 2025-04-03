package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fawa implements favp {
    private final String a;
    private final favp b;
    private fawi c;
    private fawi d;
    private fawi e;
    private final long h;
    private boolean i;
    private int j = 1;
    private long f = 0;
    private long g = 0;

    public fawa(String str, String str2, favs favsVar, favp favpVar) {
        this.a = str;
        this.b = favpVar;
        this.c = new fawi("--" + str + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + VCardBuilder.VCARD_END_OF_LINE);
        StringBuilder sb = new StringBuilder("--");
        sb.append(str);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        for (String str3 : favsVar.c()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(favsVar.a(str3));
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        if (this.b.e() >= 0 && favsVar.b("content-length").isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.b.e());
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        this.d = new fawi(sb.toString());
        if (favpVar.e() == -1) {
            this.h = -1L;
        } else {
            this.e = j();
            this.h = this.c.e() + this.d.e() + favpVar.e() + this.e.e();
        }
    }

    private final fawi j() {
        StringBuilder sb = new StringBuilder("\r\n--");
        sb.append(this.a);
        fawr.a();
        sb.append("--");
        return new fawi(sb.toString());
    }

    @Override // defpackage.favp
    public final int a(byte[] bArr, int i, int i2) {
        if (this.i) {
            throw new IOException("Trying to read from an already-closed stream.");
        }
        emxf.b(65536 - i >= i2, "Buffer length must be greater than or equal to desired number of bytes.");
        if (i2 != 0) {
            long j = this.f;
            while (true) {
                long j2 = this.f;
                if (j2 != j) {
                    return (int) (j2 - j);
                }
                int i3 = this.j;
                int i4 = i3 - 1;
                favp favpVar = null;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    favpVar = this.c;
                    i3 = 2;
                } else if (i4 == 1) {
                    favpVar = this.d;
                    i3 = 3;
                } else if (i4 == 2) {
                    favpVar = this.b;
                    i3 = 4;
                } else if (i4 == 3) {
                    if (this.e == null) {
                        this.e = j();
                    }
                    favpVar = this.e;
                    i3 = 5;
                } else if (i4 == 4) {
                    break;
                }
                this.f += favpVar.a(bArr, i, i2);
                if (favpVar.c() < Long.MAX_VALUE) {
                    favpVar.g();
                }
                if (!favpVar.i()) {
                    this.j = i3;
                }
            }
        }
        return 0;
    }

    @Override // defpackage.favp
    public final long b() {
        return this.g;
    }

    @Override // defpackage.favp
    public final long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.favp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
        this.b.close();
    }

    @Override // defpackage.favp
    public final long d() {
        return this.f;
    }

    @Override // defpackage.favp
    public final long e() {
        return this.h;
    }

    @Override // defpackage.favp
    public final long f(long j) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }

    @Override // defpackage.favp
    public final void g() {
        this.g = this.f;
    }

    @Override // defpackage.favp
    public final void h() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }

    @Override // defpackage.favp
    public final boolean i() {
        return this.j != 5;
    }
}
