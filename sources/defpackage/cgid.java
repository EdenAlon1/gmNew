package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.RequestContext;
import com.google.android.gms.kids.TrustedContactsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgid extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgie b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgid(ffgu ffguVar, cgie cgieVar, String str) {
        super(2, ffguVar);
        this.b = cgieVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgid) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ecri ecriVar;
        ecri ecriVar2;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i == 0) {
            ffci.b(obj);
            ecri d = ((ecrj) this.b.e.b()).d();
            String str = this.c;
            cgie cgieVar = this.b;
            ConversationIdType b = bdgq.b(str);
            this.d = d;
            this.a = 1;
            Object b2 = cgieVar.b.b();
            b2.getClass();
            Object a = ffra.a(ekxi.a((ffhd) b2), new cgia(null, cgieVar, b), this);
            if (a != ffhhVar) {
                ecriVar = d;
                obj = a;
            }
            return ffhhVar;
        }
        if (i != 1) {
            ecriVar2 = (ecri) this.d;
            ffci.b(obj);
            PendingIntent pendingIntent = (PendingIntent) obj;
            ((ecrj) this.b.e.b()).f(ecriVar2, cggm.b, null, ecrh.SUCCESS);
            return pendingIntent;
        }
        ecriVar = (ecri) this.d;
        ffci.b(obj);
        cghz cghzVar = (cghz) obj;
        Set set = cghzVar.a;
        Set set2 = cghzVar.b;
        ArrayList arrayList = new ArrayList(ffdx.n(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(cgie.c((String) it.next()));
        }
        if (arrayList.isEmpty()) {
            ensk j = cgie.a.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(csux.O, "TrustedContactsIntents");
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/kids/intents/TrustedContactsIntents$getApprovalDialogIntentForConversation$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 105, "TrustedContactsIntents.kt")).q("Try to create an approval dialog with no contacts");
            ((ecrj) this.b.e.b()).f(ecriVar, cggm.b, null, ecrh.CANCEL);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(cgie.b((String) it2.next()));
        }
        Uri[] uriArr = (Uri[]) arrayList2.toArray(new Uri[0]);
        dgsq dgsqVar = (dgsq) this.b.d.b();
        TrustedContactsRequest trustedContactsRequest = new TrustedContactsRequest();
        trustedContactsRequest.a = (IndividualContactRequest[]) arrayList.toArray(new IndividualContactRequest[0]);
        RequestContext requestContext = new RequestContext();
        requestContext.b = 1;
        requestContext.c = uriArr;
        trustedContactsRequest.b = requestContext;
        dhre d2 = dgsqVar.d(trustedContactsRequest);
        this.d = ecriVar;
        this.a = 2;
        obj = fgju.a(d2, this);
        if (obj != ffhhVar) {
            ecriVar2 = ecriVar;
            PendingIntent pendingIntent2 = (PendingIntent) obj;
            ((ecrj) this.b.e.b()).f(ecriVar2, cggm.b, null, ecrh.SUCCESS);
            return pendingIntent2;
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cgid cgidVar = new cgid(ffguVar, this.b, this.c);
        cgidVar.d = obj;
        return cgidVar;
    }
}
