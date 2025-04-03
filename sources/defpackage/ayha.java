package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayha {
    public static final IncomingDraft a(alxr alxrVar, aygq aygqVar) {
        alxrVar.getClass();
        aygqVar.getClass();
        return alxrVar instanceof alyv ? IncomingDraft.a(b(alxrVar.g(), aygqVar), null, ((alyv) alxrVar).D(), null, 223) : b(alxrVar.g(), aygqVar);
    }

    private static final IncomingDraft b(appj appjVar, aygq aygqVar) {
        if (appjVar instanceof appo) {
            appo appoVar = (appo) appjVar;
            String c = appoVar.c();
            engw a = appoVar.a();
            ArrayList arrayList = new ArrayList(ffdx.n(a, 10));
            enqv it = a.iterator();
            while (it.hasNext()) {
                apmq apmqVar = (apmq) it.next();
                String b = apmqVar.b();
                b.getClass();
                Uri c2 = apmqVar.c();
                if (c2 == null) {
                    c2 = apmqVar.e();
                }
                arrayList.add(new IncomingDraft.Attachment(b, c2, null));
            }
            return new IncomingDraft(aygqVar, c, arrayList, null, false, null, null, false, 248, null);
        }
        if (appjVar instanceof appz) {
            appz appzVar = (appz) appjVar;
            return new IncomingDraft(aygqVar, appzVar.c(), null, appzVar.d(), appzVar.e(), null, null, false, 228, null);
        }
        if (appjVar instanceof appw) {
            return new IncomingDraft(aygqVar, ((appw) appjVar).c(), null, null, false, null, null, false, 252, null);
        }
        if (appjVar instanceof apqd) {
            apqd apqdVar = (apqd) appjVar;
            String k = apqdVar.k();
            String b2 = appjVar.b();
            b2.getClass();
            Uri c3 = apqdVar.c();
            if (c3 == null) {
                c3 = apqdVar.e();
            }
            return new IncomingDraft(aygqVar, k, ffdx.b(new IncomingDraft.Attachment(b2, c3, null)), null, false, null, null, false, 248, null);
        }
        if (!(appjVar instanceof apmq)) {
            return new IncomingDraft(aygqVar, null, null, null, false, null, null, false, 254, null);
        }
        String b3 = appjVar.b();
        b3.getClass();
        apmq apmqVar2 = (apmq) appjVar;
        Uri c4 = apmqVar2.c();
        if (c4 == null) {
            c4 = apmqVar2.e();
        }
        return new IncomingDraft(aygqVar, null, ffdx.b(new IncomingDraft.Attachment(b3, c4, null)), null, false, null, null, false, 250, null);
    }
}
