package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lg implements Cloneable {
    private static final enru c = enru.c("android/support/v7/mms/pdu/EncodedStringValue");
    public final int a;
    public byte[] b;

    public lg(int i, eyee eyeeVar) {
        this(i, eyeeVar.I());
    }

    public static lg[] f(String[] strArr) {
        int length = strArr.length;
        if (length <= 0) {
            return null;
        }
        lg[] lgVarArr = new lg[length];
        for (int i = 0; i < length; i++) {
            lgVarArr[i] = new lg(strArr[i]);
        }
        return lgVarArr;
    }

    public final int a() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public final String b() {
        int i = this.a;
        if (i != 0) {
            try {
                return new String(this.b, ld.a(i));
            } catch (UnsupportedEncodingException e) {
                ensk e2 = c.e();
                e2.Y(ente.a, "PduParser");
                ((enrr) ((enrr) ((enrr) e2).g(e)).h("android/support/v7/mms/pdu/EncodedStringValue", "getString", (char) 152, "EncodedStringValue.java")).q("EncodedStringValue: Unsupported encoding at getString");
                try {
                    return new String(this.b, "iso-8859-1");
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return new String(this.b);
    }

    public final void c(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Text-string is null.");
        }
        if (this.b == null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.b);
            byteArrayOutputStream.write(bArr);
            this.b = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new NullPointerException("appendTextString: failed when write a new Text-string ".concat(e.toString()));
        }
    }

    public final Object clone() {
        byte[] bArr = this.b;
        try {
            return new lg(this.a, Arrays.copyOf(bArr, bArr.length));
        } catch (Exception e) {
            ensk e2 = c.e();
            e2.Y(ente.a, "PduParser");
            ((enrr) ((enrr) ((enrr) e2).g(e)).h("android/support/v7/mms/pdu/EncodedStringValue", "clone", 204, "EncodedStringValue.java")).t("EncodedStringValue: failed to clone an EncodedStringValue: %s", this);
            throw new CloneNotSupportedException(e.getMessage());
        }
    }

    public final void d(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public final byte[] e() {
        return (byte[]) this.b.clone();
    }

    public lg(int i, String str) {
        if (str == null) {
            throw new NullPointerException("EncodedStringValue: Text-string is null");
        }
        this.a = i;
        try {
            this.b = str.getBytes(ld.a(i));
        } catch (UnsupportedEncodingException e) {
            ensk i2 = c.i();
            i2.Y(ente.a, "PduParser");
            ((enrr) ((enrr) ((enrr) i2).g(e)).h("android/support/v7/mms/pdu/EncodedStringValue", "<init>", 99, "EncodedStringValue.java")).r("EncodedStringValue: Input encoding %d must be supported.", i);
            this.b = str.getBytes();
        }
    }

    public lg(int i, byte[] bArr) {
        if (bArr != null) {
            this.a = i;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        throw new NullPointerException("EncodedStringValue: Text-string is null.");
    }

    public lg(String str) {
        this(106, str);
    }

    public lg(byte[] bArr) {
        this(106, bArr);
    }
}
