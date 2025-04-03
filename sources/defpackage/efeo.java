package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efeo implements efel {
    private static boolean c = false;
    private final Context e;
    private final efcu f;
    private volatile boolean g = false;
    private etgl h = null;
    public static final byte[] a = new byte[0];
    private static final Object d = new Object();
    public static final efcu b = efcu.a();

    public efeo(Context context, efcu efcuVar) {
        this.e = context;
        this.f = efcuVar;
    }

    private static byte[] h(String str) {
        return Base64.decode(str, 2);
    }

    @Override // defpackage.efel
    public final InputStream a(Uri uri, final InputStream inputStream) {
        efcm b2 = efco.b(uri);
        g();
        try {
            if (b2.a().isEmpty()) {
                return this.h.a(inputStream, a);
            }
            efcn efcnVar = (efcn) b2.a().get(0);
            if (Objects.equals(efcnVar.a, "aes_gcm_key")) {
                final byte[] h = h(efcnVar.b);
                return new efdf(new Callable() { // from class: efen
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        byte[] bArr = efeo.a;
                        byte[] bArr2 = h;
                        InputStream inputStream2 = inputStream;
                        try {
                            return new euhp(bArr2).a(eoej.b(inputStream2), efeo.a);
                        } finally {
                            inputStream2.close();
                        }
                    }
                });
            }
            if (!Objects.equals(efcnVar.a, "aes_gcm_hkdf_key")) {
                throw new efcy(a.t(efcnVar.a, "Unsupported decryption mode: "));
            }
            try {
                return ((etgl) etfm.a(etfl.a(h(efcnVar.b))).f(eugn.a(), etgl.class)).a(inputStream, a);
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to decrypt stream", e);
        }
    }

    @Override // defpackage.efel
    public final OutputStream b(Uri uri, OutputStream outputStream) {
        efcm b2 = efco.b(uri);
        g();
        try {
            if (b2.a().isEmpty()) {
                return this.h.b(outputStream, a);
            }
            throw new efcy(a.t(((efcn) b2.a().get(0)).a, "Unsupported encryption mode: "));
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to encrypt stream", e);
        }
    }

    @Override // defpackage.efel
    public final String c() {
        return "encrypt";
    }

    @Override // defpackage.efel
    public final /* synthetic */ OutputStream d(OutputStream outputStream) {
        return efek.a(this, outputStream);
    }

    public final void g() {
        if (this.g) {
            return;
        }
        synchronized (d) {
            if (!this.g) {
                try {
                    Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
                    int i = engw.d;
                    engr engrVar = new engr();
                    efcb.b(efbq.b(this.e), path);
                    path.appendPath("mobstore_encrypt");
                    Closeable closeable = (Closeable) new efbm(Arrays.asList(new efce(this.f))).c(efcb.a(path, engrVar), new efdr(false, false));
                    try {
                        if (!c) {
                            eugk.a();
                            c = true;
                        }
                        Context context = this.e;
                        etqk etqkVar = new etqk();
                        etqkVar.c(context.getApplicationContext(), "aes128_gcm_hkdf_4kb", "mobstore_encrypt");
                        etsv etsvVar = eufw.a;
                        etqkVar.d = (etfv) etto.a(new ettn() { // from class: eufv
                            @Override // defpackage.ettn
                            public final Object a() {
                                etsv etsvVar2 = eufw.a;
                                eufx eufxVar = new eufx();
                                eufxVar.d(16);
                                eufxVar.c(16);
                                eufxVar.b(4096);
                                eufxVar.a = eufy.b;
                                return new etfv(eufxVar.a());
                            }
                        });
                        etqkVar.b("android-keystore://mobstore_encrypt");
                        this.h = (etgl) etqkVar.a().a().f(eugn.a(), etgl.class);
                        if (closeable != null) {
                            closeable.close();
                        }
                        this.g = true;
                    } catch (Throwable th) {
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (GeneralSecurityException e) {
                    throw new IOException("Failed to initialize encryption", e);
                }
            }
        }
    }

    @Override // defpackage.efel
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.efel
    public final /* synthetic */ void f() {
    }
}
