package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajgm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajgn b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajgm(ajgn ajgnVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajgnVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajgm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object i;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 == 0) {
            ajgn ajgnVar = this.b;
            MessageCoreData messageCoreData = this.c;
            this.a = 1;
            Optional a = clbh.a(messageCoreData.aa(), clbg.RCS_PENPAL_NAMESPACE, "PENPAL-CONVERSATION-ID");
            if (a.isEmpty()) {
                i = ffcu.a;
            } else {
                i = ((cjeo) ajgnVar.a.b()).i((String) a.get(), this);
                if (i != ffhh.a) {
                    i = ffcu.a;
                }
            }
            if (i == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajgm(this.b, this.c, ffguVar);
    }
}
