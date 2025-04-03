package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cubw b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cubv(cubw cubwVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cubwVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cubv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cubw cubwVar = this.b;
        MessageCoreData messageCoreData = this.c;
        this.a = 1;
        Object b = cubwVar.b(messageCoreData, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cubv(this.b, this.c, ffguVar);
    }
}
