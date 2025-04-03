package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctre extends ffhv implements ffjm {
    final /* synthetic */ engw a;
    final /* synthetic */ ctrg b;
    final /* synthetic */ fbri c;
    final /* synthetic */ ConversationIdType d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctre(ffgu ffguVar, engw engwVar, ctrg ctrgVar, fbri fbriVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = engwVar;
        this.b = ctrgVar;
        this.c = fbriVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctre) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        MessageIdType x = ((SuggestionData) this.a.get(0)).x();
        ctsv ctsvVar = this.b.a;
        ctst ctstVar = (ctst) ctsu.a.createBuilder();
        Integer num = this.c == fbri.SCREEN_EFFECTS ? new Integer(1) : (Integer) ctjd.c.e();
        num.getClass();
        int intValue = num.intValue();
        ctstVar.copyOnWrite();
        ((ctsu) ctstVar.instance).d = intValue;
        String b = x.b();
        ctstVar.copyOnWrite();
        ctsu ctsuVar = (ctsu) ctstVar.instance;
        b.getClass();
        ctsuVar.c = b;
        String a = this.d.a();
        ctstVar.copyOnWrite();
        ctsu ctsuVar2 = (ctsu) ctstVar.instance;
        a.getClass();
        ctsuVar2.b = a;
        ctstVar.copyOnWrite();
        ((ctsu) ctstVar.instance).e = true;
        ctsu ctsuVar3 = (ctsu) ctstVar.build();
        cetp cetpVar = new cetp();
        cetpVar.b = x.b();
        return ((cevh) ctsvVar.a.b()).a(ceyr.h("request_smart_suggestions", ctsuVar3, cetpVar.a()));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctre ctreVar = new ctre(ffguVar, this.a, this.b, this.c, this.d);
        ctreVar.e = obj;
        return ctreVar;
    }
}
