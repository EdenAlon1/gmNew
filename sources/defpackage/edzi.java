package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.android.vcard.VCardBuilder;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class edzi {
    public static final diyy a = dizd.a(184631359);
    private static int d = 1;
    public byte[] c;
    private final SortedMap e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final SortedMap b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final SortedMap f = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final Map g = new HashMap();

    public edzi(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str = str + "; charset=" + str2;
        }
        k(fhpi.a, str);
    }

    public static edzi b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        final edzi edziVar = new edzi("unknown", "");
        edzm.a(byteArrayInputStream, new Consumer() { // from class: edzl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Pair pair = (Pair) obj;
                boolean equals = "NS".equals(pair.first);
                edzi edziVar2 = edzi.this;
                if (!equals) {
                    edziVar2.m((String) pair.first, (String) pair.second);
                    return;
                }
                String str = (String) pair.second;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String[] split = str.split(" ");
                int length = split.length;
                if (length == 1) {
                    dkty.c("Setting default name space binding to: %s", str);
                    edziVar2.o("", str);
                } else {
                    if (length != 2) {
                        dkty.q("Ignoring invalid name space binding: %s", str);
                        return;
                    }
                    String str2 = split[0];
                    String str3 = split[1];
                    if (str3.length() < 3) {
                        dkty.q("Ignoring invalid name space binding: %s", str);
                    } else {
                        edziVar2.o(str2, str3.substring(1, str3.length() - 1));
                    }
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        edzm.a(byteArrayInputStream, new Consumer() { // from class: edzk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Pair pair = (Pair) obj;
                edzi.this.k((String) pair.first, (String) pair.second);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String d2 = edziVar.d("Content-Length");
        int i = 0;
        if (TextUtils.isEmpty(d2) || !TextUtils.isDigitsOnly(d2)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            byte[] bArr2 = new byte[1024];
            for (int read = byteArrayInputStream.read(bArr2); read >= 0; read = byteArrayInputStream.read(bArr2)) {
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            edziVar.j(byteArrayOutputStream.toByteArray());
            return edziVar;
        }
        int parseInt = Integer.parseInt(d2);
        byte[] bArr3 = new byte[parseInt];
        do {
            int read2 = byteArrayInputStream.read(bArr3, i, parseInt - i);
            if (read2 < 0) {
                throw new dktg(a.f(parseInt, "Stream closed before receiving ", " bytes!"));
            }
            i += read2;
        } while (i < parseInt);
        edziVar.j(bArr3);
        return edziVar;
    }

    private static void u(Writer writer, String str, String str2) {
        writer.write(str);
        if (TextUtils.isEmpty(str) || !str.contains(";lang")) {
            writer.write(":");
        }
        writer.write(" ");
        writer.write(str2);
        writer.write(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final long a() {
        long currentTimeMillis = System.currentTimeMillis();
        String t = t();
        return t != null ? dktc.c(t).a : currentTimeMillis;
    }

    public final fayv c() {
        fayt faytVar = (fayt) fayv.a.createBuilder();
        for (Map.Entry entry : this.g.entrySet()) {
            String str = (String) entry.getKey();
            if (!emuz.e(str, "urn:ietf:params:imdn") && (((Boolean) a.a()).booleanValue() || !emuz.e(str, "http://id.messages.google.com"))) {
                String valueOf = String.valueOf((String) entry.getValue());
                fayx fayxVar = (fayx) fayz.a.createBuilder();
                for (Map.Entry entry2 : this.b.entrySet()) {
                    String concat = valueOf.concat(".");
                    String str2 = (String) entry2.getKey();
                    if (str2.startsWith(concat)) {
                        fayxVar.b(str2.substring(concat.length()), (String) entry2.getValue());
                    }
                }
                if (DesugarCollections.unmodifiableMap(((fayz) fayxVar.instance).b).size() > 0) {
                    faytVar.a((String) entry.getKey(), (fayz) fayxVar.build());
                }
            }
        }
        return (fayv) faytVar.build();
    }

    public final String d(String str) {
        return (String) this.f.get(str);
    }

    public final String e() {
        String d2 = d(fhpi.a);
        if (Objects.isNull(d2) || TextUtils.isEmpty(d2)) {
            return null;
        }
        int indexOf = d2.indexOf(";");
        return indexOf != -1 ? d2.substring(0, indexOf).trim() : d2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof edzi)) {
            return false;
        }
        edzi edziVar = (edzi) obj;
        byte[] bArr = this.c;
        if (bArr != null || edziVar.c == null) {
            return (bArr == null || edziVar.c != null) && Arrays.equals(bArr, edziVar.c) && this.g.equals(edziVar.g) && this.f.equals(edziVar.f) && this.b.equals(edziVar.b) && this.e.equals(edziVar.e);
        }
        return false;
    }

    public final String f() {
        return (String) this.b.get("From");
    }

    public final String g(String str, String str2) {
        String str3 = (String) this.g.get(str);
        return (Objects.isNull(str3) || "".equals(str3)) ? (String) this.b.get(str2) : (String) this.b.get(a.w(str2, str3, "."));
    }

    public final String h() {
        if (!"multipart/mixed".equals(e())) {
            return null;
        }
        String d2 = d(fhpi.a);
        if (Objects.isNull(d2)) {
            return null;
        }
        return djay.a(d2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.g, this.f, this.b, this.e});
    }

    public final String i() {
        return (String) this.b.get("To");
    }

    public final void j(byte[] bArr) {
        this.c = bArr;
        this.f.put("Content-Length", Integer.toString(bArr.length));
    }

    public final void k(String str, String str2) {
        this.f.put(str, str2);
    }

    public final void l(String str) {
        this.b.put("From", edzj.a(str).toString());
    }

    public final void m(String str, String str2) {
        this.b.put(str, str2);
    }

    public final void n(String str, String str2, String str3) {
        String str4 = (String) this.g.get(str);
        if (Objects.isNull(str4) || "".equals(str4)) {
            int i = d;
            d = i + 1;
            str4 = "n" + i;
            o(str4, str);
        }
    }

    public final void o(String str, String str2) {
        this.g.put(str2, str);
    }

    public final void p(String str) {
        this.b.put("To", edzj.a(str).toString());
    }

    public final void q(OutputStream outputStream) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "utf-8");
        if (!this.e.isEmpty()) {
            for (Map.Entry entry : this.e.entrySet()) {
                u(outputStreamWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            String str = (String) entry2.getKey();
            u(outputStreamWriter, "NS", ((String) entry2.getValue()) + " <" + str + ">");
        }
        for (Map.Entry entry3 : this.b.entrySet()) {
            u(outputStreamWriter, (String) entry3.getKey(), (String) entry3.getValue());
        }
        outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        for (Map.Entry entry4 : this.f.entrySet()) {
            u(outputStreamWriter, (String) entry4.getKey(), (String) entry4.getValue());
        }
        outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        outputStreamWriter.flush();
        outputStream.write(this.c);
    }

    public final boolean r() {
        String e = e();
        if (Objects.isNull(e)) {
            return false;
        }
        return dktk.e(e, "multipart/mixed");
    }

    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            q(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public final String t() {
        return (String) this.b.get("DateTime");
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            q(byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
