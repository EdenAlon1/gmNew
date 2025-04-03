package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctkb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ eooi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkb(ctko ctkoVar, MessageCoreData messageCoreData, eooi eooiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = messageCoreData;
        this.d = eooiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        ctko ctkoVar = this.b;
        MessageCoreData messageCoreData = this.c;
        this.a = 1;
        if (ctkoVar.n(messageCoreData, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctkb(this.b, this.c, this.d, ffguVar);
    }
}
