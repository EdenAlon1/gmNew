package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqa extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    final /* synthetic */ zqj f;
    final /* synthetic */ aaxk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqa(zqj zqjVar, aaxk aaxkVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = zqjVar;
        this.g = aaxkVar;
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        zqa zqaVar = new zqa(this.f, this.g, (ffgu) obj6);
        zqaVar.a = (engw) obj;
        zqaVar.b = booleanValue;
        zqaVar.c = (engw) obj3;
        zqaVar.d = (dtbv) obj4;
        zqaVar.e = booleanValue2;
        return zqaVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        ffci.b(obj);
        ?? r9 = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        if (this.e) {
            ensk e = zqj.a.e();
            e.Y(ente.a, "FooterUiAdapterImpl");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$4", "invokeSuspend", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of penpal alert card");
            list = ffel.a;
        } else if (z) {
            ensk e2 = zqj.a.e();
            e2.Y(ente.a, "FooterUiAdapterImpl");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$4", "invokeSuspend", 204, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of attachments");
            list = ffel.a;
        } else {
            ArrayList arrayList = new ArrayList();
            if (!((Boolean) ctjd.bq.e()).booleanValue() || !r9.isEmpty() || (obj3 instanceof dtbu)) {
                arrayList.addAll(obj2);
            }
            arrayList.addAll(r9);
            aaxk aaxkVar = this.g;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dokm a = aaxkVar.a((anzh) it.next());
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            ensk e3 = zqj.a.e();
            e3.Y(ente.a, "FooterUiAdapterImpl");
            ((enrr) e3.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$4", "invokeSuspend", 222, "MessageListFooterUiAdapterImpl.kt")).u("suggestionListUiDataFlow: allSuggestions=%s, filteredSuggestions=%s", arrayList.size(), arrayList2.size());
            list = arrayList2;
        }
        return new dojh(list, this.f.h);
    }
}
