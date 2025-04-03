package defpackage;

import j$.util.DesugarCollections;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etip implements etfk {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = new byte[0];
    private static final Set c;
    private final String d;
    private final etgf e;
    private final etfk f;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        c = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public etip(etzp etzpVar, etfk etfkVar) {
        if (!c.contains(etzpVar.b)) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + etzpVar.b + ". Only Tink AEAD key types are supported.");
        }
        this.d = etzpVar.b;
        etzo etzoVar = (etzo) etzp.a.createBuilder(etzpVar);
        euag euagVar = euag.RAW;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar.a();
        this.e = etgm.a(((etzp) etzoVar.build()).toByteArray());
        this.f = etfkVar;
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((etfk) etse.a.a(etsh.a.a(ettd.a(this.d, eyee.x(this.f.a(bArr3, b)), 3, euag.RAW, null), etgk.a), etfk.class)).a(bArr4, null);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        etfs a2 = etry.a.a(this.e, null);
        byte[] b2 = this.f.b(((ettd) etsh.a.c(a2, ettd.class, etgk.a)).c.I(), b);
        int length = b2.length;
        if (length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] b3 = ((etfk) etse.a.a(a2, etfk.class)).b(bArr, null);
        return ByteBuffer.allocate(length + 4 + b3.length).putInt(length).put(b2).put(b3).array();
    }
}
