package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djhf {
    public static MessagingResult a(int i) {
        return i == 200 ? MessagingResult.d : i != 403 ? i != 404 ? i != 488 ? (i < 400 || i > 499) ? (i < 500 || i > 599) ? MessagingResult.f : MessagingResult.g : MessagingResult.h : MessagingResult.k : MessagingResult.i : MessagingResult.j;
    }

    public static MessagingResult b(djgw djgwVar) {
        djgwVar.b().isPresent();
        return djgwVar.c().isPresent() ? new djfw().apply((dkjw) djgwVar.c().get()) : a(djgwVar.a());
    }

    public static Conversation c(dkjt dkjtVar) {
        if (dkjtVar.o) {
            throw new IllegalArgumentException("Group message was not sent/received with a session!");
        }
        String uuid = UUID.randomUUID().toString();
        eiea eieaVar = new eiea();
        eieaVar.d(1);
        eieaVar.c(uuid);
        eieaVar.b(e(dkjtVar.c));
        return eieaVar.a();
    }

    public static Conversation d(dkkj dkkjVar) {
        String str = dkkjVar.ai() ? dkkjVar.z : dkkjVar.y;
        if (str == null) {
            throw new IllegalArgumentException(true != dkkjVar.ai() ? "contributionId is null in SIMPLE-IM session" : "conversationId is null in CPM session");
        }
        eiea eieaVar = new eiea();
        eieaVar.c(str);
        eieaVar.d(true == dkkjVar.E ? 2 : 1);
        eieaVar.b(dkkjVar.E ? g(dkkjVar.I) : e(dkkjVar.y()));
        return eieaVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.rcs.client.messaging.data.RcsDestinationId e(java.lang.String r4) {
        /*
            java.lang.String r0 = "+"
            r1 = 0
            eenb r2 = new eenb     // Catch: defpackage.eeje -> L58
            r2.<init>(r4)     // Catch: defpackage.eeje -> L58
            eeit r2 = r2.e()     // Catch: defpackage.eeje -> L58
            boolean r3 = r2.l()     // Catch: defpackage.eeje -> L58
            if (r3 == 0) goto L37
            eeiq r2 = (defpackage.eeiq) r2     // Catch: defpackage.eeje -> L58
            java.lang.String r0 = r2.e()     // Catch: defpackage.eeje -> L58
            if (r0 == 0) goto L2f
            java.lang.String r3 = "phone"
            java.lang.String r2 = r2.m()     // Catch: defpackage.eeje -> L58
            boolean r2 = r3.equals(r2)     // Catch: defpackage.eeje -> L58
            if (r2 == 0) goto L27
            goto L2d
        L27:
            boolean r2 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r0)     // Catch: defpackage.eeje -> L58
            if (r2 == 0) goto L58
        L2d:
            r1 = r0
            goto L58
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: defpackage.eeje -> L58
            java.lang.String r2 = "User is null"
            r0.<init>(r2)     // Catch: defpackage.eeje -> L58
            throw r0     // Catch: defpackage.eeje -> L58
        L37:
            boolean r3 = r2 instanceof defpackage.eeir     // Catch: defpackage.eeje -> L58
            if (r3 == 0) goto L58
            eeir r2 = (defpackage.eeir) r2     // Catch: defpackage.eeje -> L58
            boolean r3 = r2.e()     // Catch: defpackage.eeje -> L58
            if (r3 == 0) goto L54
            java.lang.String r2 = r2.a()     // Catch: defpackage.eeje -> L58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: defpackage.eeje -> L58
            r3.<init>(r0)     // Catch: defpackage.eeje -> L58
            r3.append(r2)     // Catch: defpackage.eeje -> L58
            java.lang.String r1 = r3.toString()     // Catch: defpackage.eeje -> L58
            goto L58
        L54:
            java.lang.String r1 = r2.a()     // Catch: defpackage.eeje -> L58
        L58:
            if (r1 == 0) goto L6b
            eieu r4 = new eieu
            r4.<init>()
            r4.b(r1)
            r0 = 1
            r4.c(r0)
            com.google.android.rcs.client.messaging.data.RcsDestinationId r4 = r4.a()
            return r4
        L6b:
            com.google.android.rcs.client.messaging.data.RcsDestinationId r4 = g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djhf.e(java.lang.String):com.google.android.rcs.client.messaging.data.RcsDestinationId");
    }

    public static String f(RcsDestinationId rcsDestinationId) {
        int b = rcsDestinationId.b() - 1;
        String a = rcsDestinationId.a();
        return b != 0 ? a : "tel:".concat(a);
    }

    private static RcsDestinationId g(String str) {
        if (!str.startsWith("sip:")) {
            throw new IllegalArgumentException("URI format not supported");
        }
        eieu eieuVar = new eieu();
        eieuVar.b(str);
        eieuVar.c(2);
        return eieuVar.a();
    }
}
