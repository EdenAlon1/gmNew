package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqb extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    final /* synthetic */ zqj d;
    final /* synthetic */ aaxk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqb(zqj zqjVar, aaxk aaxkVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = zqjVar;
        this.e = aaxkVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        zqb zqbVar = new zqb(this.d, this.e, (ffgu) obj4);
        zqbVar.a = (engw) obj;
        zqbVar.b = booleanValue;
        zqbVar.c = booleanValue2;
        return zqbVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        ffci.b(obj);
        ?? r7 = this.a;
        boolean z = this.b;
        if (this.c) {
            ensk e = zqj.a.e();
            e.Y(ente.a, "FooterUiAdapterImpl");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$6", "invokeSuspend", 245, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of penpal alert card");
            list = ffel.a;
        } else if (z) {
            ensk e2 = zqj.a.e();
            e2.Y(ente.a, "FooterUiAdapterImpl");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl$suggestionListUiDataFlow$6", "invokeSuspend", 248, "MessageListFooterUiAdapterImpl.kt")).q("Suggestions are suppressed because of attachments");
            list = ffel.a;
        } else {
            aaxk aaxkVar = this.e;
            ArrayList arrayList = new ArrayList();
            for (aoax aoaxVar : r7) {
                aoaxVar.getClass();
                arrayList.add(aaxkVar.b(aoaxVar));
            }
            list = arrayList;
        }
        return new dojh(list, this.d.h);
    }
}
