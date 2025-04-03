package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmlb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmle b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmlb(cmle cmleVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmleVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmlb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cmle cmleVar = this.b;
            MessageCoreData messageCoreData = this.c;
            this.a = 1;
            if (cmleVar.a(messageCoreData, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmlb(this.b, this.c, ffguVar);
    }
}
