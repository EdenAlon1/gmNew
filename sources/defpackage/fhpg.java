package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhpg {
    private static final ByteArrayBuffer a = i(fhpi.f, ": ");
    private static final ByteArrayBuffer b = i(fhpi.f, VCardBuilder.VCARD_END_OF_LINE);
    private static final ByteArrayBuffer c = i(fhpi.f, "--");
    private final String d;
    private final Charset e;
    private final String f;
    private final List<fhpe> g;
    private final fhph h;

    /* compiled from: PG */
    /* renamed from: fhpg$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fhph.values().length];
            a = iArr;
            try {
                iArr[fhph.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[fhph.BROWSER_COMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public fhpg(String str, String str2) {
        this(str, null, str2);
    }

    private static ByteArrayBuffer i(Charset charset, String str) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(encode.remaining());
        byteArrayBuffer.append(encode.array(), encode.position(), encode.remaining());
        return byteArrayBuffer;
    }

    private void j(fhph fhphVar, OutputStream outputStream, boolean z) {
        ByteArrayBuffer i = i(this.e, b());
        for (fhpe fhpeVar : this.g) {
            l(c, outputStream);
            l(i, outputStream);
            l(b, outputStream);
            fhpf b2 = fhpeVar.b();
            int i2 = AnonymousClass1.a[fhphVar.ordinal()];
            if (i2 == 1) {
                Iterator<fhpj> it = b2.iterator();
                while (it.hasNext()) {
                    n(it.next(), outputStream);
                }
            } else if (i2 == 2) {
                o(fhpeVar.b().d(fhpi.c), this.e, outputStream);
                if (fhpeVar.c().f() != null) {
                    o(fhpeVar.b().d(fhpi.a), this.e, outputStream);
                }
            }
            ByteArrayBuffer byteArrayBuffer = b;
            l(byteArrayBuffer, outputStream);
            if (z) {
                fhpeVar.c().h(outputStream);
            }
            l(byteArrayBuffer, outputStream);
        }
        ByteArrayBuffer byteArrayBuffer2 = c;
        l(byteArrayBuffer2, outputStream);
        l(i, outputStream);
        l(byteArrayBuffer2, outputStream);
        l(b, outputStream);
    }

    private static void k(String str, OutputStream outputStream) {
        l(i(fhpi.f, str), outputStream);
    }

    private static void l(ByteArrayBuffer byteArrayBuffer, OutputStream outputStream) {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }

    private static void m(String str, Charset charset, OutputStream outputStream) {
        l(i(charset, str), outputStream);
    }

    private static void n(fhpj fhpjVar, OutputStream outputStream) {
        k(fhpjVar.b(), outputStream);
        l(a, outputStream);
        k(fhpjVar.a(), outputStream);
        l(b, outputStream);
    }

    private static void o(fhpj fhpjVar, Charset charset, OutputStream outputStream) {
        m(fhpjVar.b(), charset, outputStream);
        l(a, outputStream);
        m(fhpjVar.a(), charset, outputStream);
        l(b, outputStream);
    }

    public long a() {
        Iterator<fhpe> it = this.g.iterator();
        long j = 0;
        while (it.hasNext()) {
            long a2 = it.next().c().a();
            if (a2 < 0) {
                return -1L;
            }
            j += a2;
        }
        try {
            j(this.h, new ByteArrayOutputStream(), false);
            return j + r0.toByteArray().length;
        } catch (IOException unused) {
            return -1L;
        }
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.d;
    }

    public Charset d() {
        return this.e;
    }

    public List<fhpe> e() {
        return this.g;
    }

    public fhph f() {
        return this.h;
    }

    public void g(fhpe fhpeVar) {
        if (fhpeVar == null) {
            return;
        }
        this.g.add(fhpeVar);
    }

    public void h(OutputStream outputStream) {
        j(this.h, outputStream, true);
    }

    public fhpg(String str, Charset charset, String str2) {
        this(str, charset, str2, fhph.STRICT);
    }

    public fhpg(String str, Charset charset, String str2, fhph fhphVar) {
        if (str == null) {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        }
        if (str2 != null) {
            this.d = str;
            this.e = charset == null ? fhpi.f : charset;
            this.f = str2;
            this.g = new ArrayList();
            this.h = fhphVar;
            return;
        }
        throw new IllegalArgumentException("Multipart boundary may not be null");
    }
}
