package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdok extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bdol b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdok(bdol bdolVar, MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bdolVar;
        this.c = messageCoreData;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdok) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bdol bdolVar = this.b;
        MessageCoreData messageCoreData = this.c;
        List list = this.d;
        this.a = 1;
        Object a = ffra.a(ekxi.a(bdolVar.c), new bdoj(null, bdolVar, messageCoreData, list), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bdok(this.b, this.c, this.d, ffguVar);
    }
}
