package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dijm {
    public static final /* synthetic */ int a = 0;

    static {
        dizd.a(185025024);
    }

    public static dkjt a(dkkj dkkjVar, String str, String str2, byte[] bArr, fayv fayvVar) {
        eehr eehrVar = dkkjVar.l;
        if (!dkkjVar.E) {
            String str3 = eehrVar.g;
            dkkjVar.y();
            return c(str, str2, bArr, fayvVar, dkkjVar.ai());
        }
        String str4 = eehrVar.g;
        String str5 = dkkjVar.I;
        edzi b = b(str2, bArr, str, fayvVar, dkkjVar.ai());
        if (str4 != null) {
            b.l(str4);
        }
        b.p("sip:anonymous@anonymous.invalid");
        return d(b, str);
    }

    public static edzi b(String str, byte[] bArr, String str2, fayv fayvVar, boolean z) {
        edzi edziVar = new edzi(str, "utf-8");
        edziVar.m("DateTime", dktc.a().toString());
        edziVar.j(bArr);
        edziVar.o("imdn", "urn:ietf:params:imdn");
        edziVar.n("urn:ietf:params:imdn", "Disposition-Notification", (djak.v() && z) ? dkkj.D + ", " + edzn.INTERWORKING_SMS.p : dkkj.D);
        edziVar.n("urn:ietf:params:imdn", "Message-ID", str2);
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(fayvVar.b).entrySet()) {
            String str3 = (String) entry.getKey();
            for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((fayz) entry.getValue()).b).entrySet()) {
                edziVar.n(str3, (String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        return edziVar;
    }

    public static dkjt c(String str, String str2, byte[] bArr, fayv fayvVar, boolean z) {
        edzi b = b(str2, bArr, str, fayvVar, z);
        b.l("sip:anonymous@anonymous.invalid");
        b.p("sip:anonymous@anonymous.invalid");
        return d(b, str);
    }

    private static dkjt d(edzi edziVar, String str) {
        String i = edziVar.i();
        i.getClass();
        dkjt dkjtVar = new dkjt(i, edziVar);
        dkjtVar.k = str;
        String f = edziVar.f();
        f.getClass();
        dkjtVar.c = f;
        return dkjtVar;
    }
}
