package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eocs implements eodd {
    public void d(char c) {
        c((byte) c);
        c((byte) (c >>> '\b'));
    }

    @Override // defpackage.eodd
    public void f(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.eodd
    public void g(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.eodd
    public void h(int i) {
        throw null;
    }

    @Override // defpackage.eodd
    public void i(long j) {
        throw null;
    }

    @Override // defpackage.eodd
    public void j(byte[] bArr) {
        g(bArr, bArr.length);
    }

    @Override // defpackage.eodd
    public eodd k(CharSequence charSequence, Charset charset) {
        j(charSequence.toString().getBytes(charset));
        return this;
    }

    @Override // defpackage.eodd
    public final void l(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            d(charSequence.charAt(i));
        }
    }
}
