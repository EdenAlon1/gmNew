package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwkf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwkj b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwkf(cwkj cwkjVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwkjVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwkf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = (String) this.b.d.get(this.c);
        if (str == null) {
            return Optional.empty();
        }
        cwkj cwkjVar = this.b;
        ffhd a = ekxi.a(cwkjVar.a);
        cwke cwkeVar = new cwke(null, cwkjVar, str);
        this.a = 1;
        Object a2 = ffra.a(a, cwkeVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwkf(this.b, this.c, ffguVar);
    }
}
