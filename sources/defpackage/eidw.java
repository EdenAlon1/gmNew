package defpackage;

import android.util.Pair;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidw {
    public static eido a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            final eidn f = eido.f();
            c(byteArrayInputStream, new Consumer() { // from class: eidu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Pair pair = (Pair) obj;
                    boolean equals = "NS".equals(pair.first);
                    eidn eidnVar = eidn.this;
                    if (equals) {
                        String str = (String) pair.second;
                        if (emxe.c(str)) {
                            return;
                        }
                        List i = emye.b(' ').f().i(str);
                        if (i.size() == 1) {
                            eidnVar.g("", str);
                            return;
                        }
                        if (i.size() == 2) {
                            String str2 = (String) i.get(0);
                            String str3 = (String) i.get(1);
                            if (str3.length() >= 3) {
                                eidnVar.g(str2, str3.substring(1, str3.length() - 1));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    String str4 = (String) pair.first;
                    int indexOf = str4.indexOf(46);
                    if (indexOf <= 0) {
                        eids d = eidt.d();
                        d.b(str4);
                        d.d((String) pair.second);
                        eidnVar.d(d.a());
                        return;
                    }
                    String str5 = (String) eidnVar.b().c().get(str4.substring(0, indexOf));
                    if (str5 == null) {
                        str5 = "urn:ietf:params:cpim-headers:";
                    }
                    String substring = str4.substring(indexOf + 1);
                    eids d2 = eidt.d();
                    d2.c(str5);
                    d2.b(substring);
                    d2.d((String) pair.second);
                    eidnVar.d(d2.a());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final eidq d = eidr.d();
            c(byteArrayInputStream, new Consumer() { // from class: eidv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Pair pair = (Pair) obj;
                    boolean equals = ((String) pair.first).equals("Content-Length");
                    eidq eidqVar = eidq.this;
                    if (equals) {
                        eidqVar.a = Integer.parseInt((String) pair.second);
                    }
                    eidqVar.f((String) pair.first, (String) pair.second);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            int i = d.a;
            if (i > 0) {
                byte[] bArr2 = new byte[i];
                eoej.d(byteArrayInputStream, bArr2, i);
                d.c(eyee.x(bArr2));
            } else {
                d.c(eyee.B(byteArrayInputStream));
            }
            ((eide) f).a = d.e();
            return f.a();
        } finally {
            byteArrayInputStream.close();
        }
    }

    private static String b(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        int read = inputStream.read();
        do {
            if (read == 13) {
                read = inputStream.read();
            } else {
                if (read == 10) {
                    String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    byteArrayOutputStream.reset();
                    return str;
                }
                byteArrayOutputStream.write(read);
                read = inputStream.read();
            }
        } while (read > 0);
        throw new IOException("No data read from socket. EOF.");
    }

    private static void c(InputStream inputStream, Consumer consumer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String b = b(inputStream, byteArrayOutputStream);
        while (!emxe.c(b)) {
            Pair pair = null;
            if (!emxe.c(b)) {
                List i = emye.d(": ").i(b);
                if (i.size() == 2) {
                    pair = Pair.create((String) i.get(0), (String) i.get(1));
                }
            }
            if (!Objects.isNull(pair)) {
                consumer.o(pair);
            }
            b = b(inputStream, byteArrayOutputStream);
        }
    }
}
