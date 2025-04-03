package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenh {
    private static final byte[] f = new byte[0];
    public byte[] a;
    public String b;
    public String c;
    public String d;
    public String e;

    public eenh() {
        this.a = f;
    }

    public static eenh[] d(String str, String str2) {
        return str == null ? new eenh[0] : e(str.getBytes("utf-8"), str2);
    }

    public static eenh[] e(byte[] bArr, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Content-Type MUST not be null");
        }
        if (bArr == null || bArr.length == 0) {
            return new eenh[0];
        }
        if (!str.startsWith("multipart/")) {
            return new eenh[]{new eenh(bArr, str)};
        }
        ArrayList arrayList = new ArrayList();
        String a = djay.a(str);
        if (a == null) {
            throw new IllegalArgumentException("No boundary specified in content type header");
        }
        try {
            djay.b(new ByteArrayInputStream(bArr), a, new eeng(arrayList));
            return (eenh[]) arrayList.toArray(new eenh[arrayList.size()]);
        } catch (djaz e) {
            throw new IOException(e.getMessage());
        }
    }

    public final InputStream a() {
        byte[] bArr = this.a;
        return bArr == null ? new ByteArrayInputStream(f) : new ByteArrayInputStream(bArr);
    }

    public final String b() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public final String c() {
        String str;
        int i;
        byte[] bArr = this.a;
        if (bArr != null) {
            boolean equalsIgnoreCase = this.b.equalsIgnoreCase("application/sdp");
            i = bArr.length;
            if (equalsIgnoreCase) {
                Scanner scanner = new Scanner(new String(this.a));
                StringBuilder sb = new StringBuilder();
                while (scanner.hasNextLine()) {
                    String nextLine = scanner.nextLine();
                    if (nextLine.startsWith("o=") || nextLine.startsWith("c=") || nextLine.startsWith("a=path")) {
                        nextLine = "(redacted)";
                    }
                    sb.append(nextLine);
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                scanner.close();
                str = sb.toString();
            } else {
                str = this.e;
                if (str == null) {
                    str = dktx.GENERIC.c(new String(this.a));
                }
            }
        } else {
            str = "Null";
            i = 0;
        }
        return "Content ID: " + this.d + "\r\nContent disposition: " + this.c + "\r\nContent type: " + this.b + "\r\nContent length " + i + "\r\nContent: " + str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eenh)) {
            return false;
        }
        eenh eenhVar = (eenh) obj;
        return TextUtils.equals(this.c, eenhVar.c) && TextUtils.equals(this.d, eenhVar.d) && TextUtils.equals(this.b, eenhVar.b) && Arrays.equals(this.a, eenhVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.b, this.a});
    }

    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr != null ? bArr.length : 0;
        return "Content ID: " + this.d + ", content disposition: " + this.c + ", content type: " + this.b + ", content length " + length;
    }

    public eenh(byte[] bArr) {
        this.a = bArr;
        this.b = "application/resource-lists+xml";
        this.c = "recipient-list";
    }

    public eenh(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    public eenh(String str, String str2) {
        this.a = f;
        try {
            this.a = str.getBytes("utf-8");
            this.b = str2;
        } catch (UnsupportedEncodingException unused) {
        }
    }
}
