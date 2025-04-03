package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajtb b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajsy(ffgu ffguVar, ajtb ajtbVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.b = ajtbVar;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajsy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ajtb ajtbVar = this.b;
        MessageIdType messageIdType = this.c;
        this.a = 1;
        Object g = ajtbVar.g(messageIdType, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajsy ajsyVar = new ajsy(ffguVar, this.b, this.c);
        ajsyVar.d = obj;
        return ajsyVar;
    }
}
