package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zpz extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    final /* synthetic */ zqj f;
    final /* synthetic */ aaxk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpz(zqj zqjVar, aaxk aaxkVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = zqjVar;
        this.g = aaxkVar;
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        zpz zpzVar = new zpz(this.f, this.g, (ffgu) obj6);
        zpzVar.a = (engw) obj;
        zpzVar.b = booleanValue;
        zpzVar.c = (engw) obj3;
        zpzVar.d = (dtbv) obj4;
        zpzVar.e = booleanValue2;
        return zpzVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List aa;
        ffci.b(obj);
        ?? r11 = this.a;
        boolean z = this.b;
        ?? r1 = this.c;
        Object obj2 = this.d;
        if (this.e) {
            ensk e = zqj.a.e();
            e.Y(ente.a, "FooterUiAdapterImpl");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$2", "invokeSuspend", 151, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of penpal alert card");
            aa = ffel.a;
        } else if (z) {
            ensk e2 = zqj.a.e();
            e2.Y(ente.a, "FooterUiAdapterImpl");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$2", "invokeSuspend", 154, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of attachments");
            aa = ffel.a;
        } else {
            ArrayList arrayList = new ArrayList();
            if (!((Boolean) ctjd.bq.e()).booleanValue() || !r11.isEmpty() || (obj2 instanceof dtbu)) {
                aaxk aaxkVar = this.g;
                ArrayList arrayList2 = new ArrayList(ffdx.n(r1, 10));
                for (aoax aoaxVar : r1) {
                    aoaxVar.getClass();
                    arrayList2.add(aaxkVar.b(aoaxVar));
                }
                arrayList.addAll(arrayList2);
            }
            aaxk aaxkVar2 = this.g;
            ArrayList arrayList3 = new ArrayList(ffdx.n(r11, 10));
            for (aoax aoaxVar2 : r11) {
                aoaxVar2.getClass();
                arrayList3.add(aaxkVar2.b(aoaxVar2));
            }
            arrayList.addAll(arrayList3);
            aa = ffdx.aa(arrayList);
            ensk e3 = zqj.a.e();
            e3.Y(ente.a, "FooterUiAdapterImpl");
            ((enrr) e3.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$2", "invokeSuspend", 174, "MessageListFooterUiAdapterImpl.kt")).u("suggestionListUiDataFlow: allSuggestions=%s, filteredSuggestions=%s", arrayList.size(), aa.size());
        }
        return new dojh(aa, this.f.h);
    }
}
