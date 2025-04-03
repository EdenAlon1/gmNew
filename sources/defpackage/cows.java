package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cows extends ffhv implements ffjm {
    int a;
    final /* synthetic */ coww b;
    final /* synthetic */ MessageCoreData c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cows(ffgu ffguVar, coww cowwVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.b = cowwVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cows) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        coww cowwVar = this.b;
        MessageCoreData messageCoreData = this.c;
        this.a = 1;
        Object b = cowwVar.b(messageCoreData, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cows cowsVar = new cows(ffguVar, this.b, this.c);
        cowsVar.d = obj;
        return cowsVar;
    }
}
