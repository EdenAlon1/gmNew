package defpackage;

import android.telephony.ims.SipMessage;
import android.telephony.ims.stub.DelegateConnectionMessageCallback;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djlt implements DelegateConnectionMessageCallback {
    private final djmm a;
    private final djmt b;
    private final String c;

    public djlt(djmm djmmVar, djmt djmtVar, String str) {
        this.a = djmmVar;
        this.b = djmtVar;
        this.c = str;
    }

    public final void onMessageReceived(SipMessage sipMessage) {
        try {
            dkty.l(this.a.i, "Message received. Actual content length:%d [%s]", Integer.valueOf(sipMessage.getContent().length), dktx.MESSAGE_CONTENT.c("\n" + sipMessage.getStartLine() + sipMessage.getHeaderSection() + VCardBuilder.VCARD_END_OF_LINE + new String(sipMessage.getContent(), "UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            dkty.h(this.a.i, "Failed to decode SipMessage.", new Object[0]);
        }
        if (this.a.I.isPresent()) {
            this.a.I.get();
            String startLine = sipMessage.getStartLine();
            String headerSection = sipMessage.getHeaderSection();
            if (sipMessage.getStartLine().startsWith("NOTIFY") && (sipMessage.getHeaderSection().contains("Event: conference") || sipMessage.getHeaderSection().contains("o: conference"))) {
                Integer num = (Integer) DesugarArrays.stream(headerSection.split("[\\r\\n]")).filter(new Predicate() { // from class: djlc
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((String) obj).startsWith("Content-Length");
                    }
                }).findFirst().map(new Function() { // from class: djld
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        List i = emye.e("\\s*:\\s").i((String) obj);
                        return Integer.valueOf(i.size() < 2 ? 0 : Integer.parseInt((String) i.get(1)));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(0);
                int intValue = num.intValue();
                dkty.c("Content length: %d", num);
                if (sipMessage.getContent().length >= intValue) {
                    dkty.c("Content is same or longer than content length", new Object[0]);
                } else {
                    String str = (String) DesugarArrays.stream(headerSection.split("[\\r\\n]")).filter(new Predicate() { // from class: djle
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((String) obj).startsWith(fhpi.a);
                        }
                    }).findFirst().map(new Function() { // from class: djlf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String a = djay.a((String) obj);
                            dkty.c("Boundary - %s", a);
                            return a.a(a, "\r\n--", "--\r\n");
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse("");
                    dkty.c("Boundary: %s", str);
                    if (str.isEmpty()) {
                        dkty.q("No boundary is found in Content-Type header.", new Object[0]);
                    } else {
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        dkty.q("Adding %d padding bytes to SipMessage's content.", Integer.valueOf(intValue - sipMessage.getContent().length));
                        ByteBuffer wrap = ByteBuffer.wrap(new byte[intValue]);
                        wrap.put(sipMessage.getContent());
                        wrap.put(new byte[Math.max(0, (intValue - sipMessage.getContent().length) - bytes.length)]);
                        wrap.put(bytes);
                        sipMessage = new SipMessage(startLine, headerSection, wrap.array());
                    }
                }
            } else {
                dkty.o("No conference event. No need to fix.", new Object[0]);
            }
        }
        djmv djmvVar = this.a.F;
        djmvVar.getClass();
        try {
            byte[] b = erme.b((sipMessage.getStartLine() + sipMessage.getHeaderSection() + VCardBuilder.VCARD_END_OF_LINE).getBytes(StandardCharsets.UTF_8), sipMessage.getContent());
            int i = eemz.a;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
            try {
                eelv a = eemz.a(byteArrayInputStream);
                byteArrayInputStream.close();
                djmvVar.g(a, false);
                eenz eenzVar = djmvVar.b;
                if (eenzVar != null) {
                    dkty.d(djmv.a, ">>>>>>>>>> SIP message[%s] received (%d bytes) [Call-ID: %s]", eelu.a(a.l), Integer.valueOf(a.a().length()), a.h());
                    eenzVar.c(a);
                }
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (eeje e) {
            dkty.j(e, this.a.i, "Can't parse received message. %s", e.getMessage());
            this.a.C.s(djmvVar.d(), 7);
        } catch (Throwable th2) {
            dkty.j(th2, this.a.i, "Can't process received message. %s", th2.getMessage());
            this.a.C.s(djmvVar.d(), 6);
        }
    }

    public final void onMessageSendFailure(String str, int i) {
        if (((Boolean) djmm.d.a()).booleanValue()) {
            djmt djmtVar = this.b;
            djmm djmmVar = this.a;
            String str2 = this.c;
            String A = djmmVar.A();
            eywg eywgVar = (eywg) eywh.a.createBuilder();
            eywgVar.copyOnWrite();
            eywh eywhVar = (eywh) eywgVar.instance;
            A.getClass();
            eywhVar.b |= 2;
            eywhVar.d = A;
            eywgVar.copyOnWrite();
            eywh eywhVar2 = (eywh) eywgVar.instance;
            str2.getClass();
            eywhVar2.b |= 1;
            eywhVar2.c = str2;
            eywi eywiVar = (eywi) eywj.a.createBuilder();
            eywiVar.copyOnWrite();
            eywj eywjVar = (eywj) eywiVar.instance;
            str.getClass();
            eywjVar.b |= 1;
            eywjVar.c = str;
            eywiVar.copyOnWrite();
            eywj eywjVar2 = (eywj) eywiVar.instance;
            eywjVar2.b |= 2;
            eywjVar2.d = i;
            eywgVar.copyOnWrite();
            eywh eywhVar3 = (eywh) eywgVar.instance;
            eywj eywjVar3 = (eywj) eywiVar.build();
            eywjVar3.getClass();
            eywhVar3.h = eywjVar3;
            eywhVar3.b |= 32;
            djmtVar.b((eywh) eywgVar.build());
        }
        djmv djmvVar = this.a.F;
        djmvVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        djmvVar.g((eelv) djmvVar.d.get(str), true);
        eelv eelvVar = (eelv) djmvVar.d.remove(str);
        if (eelvVar == null) {
            dkty.h(djmv.a, "<<<<<<<<<< SIP message failed: reason code: %s", Integer.valueOf(i));
            return;
        }
        String u = eelvVar.u(2);
        dkty.h(djmv.a, "<<<<<<<<<< SIP message[%s] failed [%s]: %s", eelu.a(eelvVar.l), u, a.h(i, "reason code: "));
        eenz eenzVar = djmvVar.b;
        if (!eelvVar.s() || u == null || eenzVar == null) {
            return;
        }
        eenzVar.a(u);
    }

    public final void onMessageSent(String str) {
        djmv djmvVar = this.a.F;
        djmvVar.getClass();
        eelv eelvVar = (eelv) djmvVar.d.remove(str);
        djmvVar.g(eelvVar, false);
        eenz eenzVar = djmvVar.b;
        if (eenzVar == null || eelvVar == null) {
            return;
        }
        eenzVar.b(eelvVar);
    }
}
