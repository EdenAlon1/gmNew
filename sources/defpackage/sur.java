package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sur extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sus b;
    final /* synthetic */ aeki c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sur(sus susVar, aeki aekiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = susVar;
        this.c = aekiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sur) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            sus susVar = this.b;
            ConversationIdType w = this.c.w();
            this.a = 1;
            Object c = susVar.a.c(w, 4, axcl.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY, this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sur(this.b, this.c, ffguVar);
    }
}
