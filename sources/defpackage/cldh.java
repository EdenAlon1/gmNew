package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cldh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cldk b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ awui d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cldh(ffgu ffguVar, cldk cldkVar, ConversationIdType conversationIdType, awui awuiVar) {
        super(2, ffguVar);
        this.b = cldkVar;
        this.c = conversationIdType;
        this.d = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cldh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bdfp bdfpVar = (bdfp) this.b.a.b();
        ConversationIdType conversationIdType = this.c;
        awui awuiVar = this.d;
        this.a = 1;
        Object d = bdfpVar.d(conversationIdType, awuiVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cldh cldhVar = new cldh(ffguVar, this.b, this.c, this.d);
        cldhVar.e = obj;
        return cldhVar;
    }
}
