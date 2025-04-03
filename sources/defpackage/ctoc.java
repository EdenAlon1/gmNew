package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctoc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctof b;
    final /* synthetic */ List c;
    final /* synthetic */ MessageCoreData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctoc(ctof ctofVar, List list, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctofVar;
        this.c = list;
        this.d = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctoc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ctof ctofVar = this.b;
        List list = this.c;
        MessageCoreData messageCoreData = this.d;
        this.a = 1;
        Object a = ffra.a(ekxi.a(ctofVar.c), new ctod(null, ctofVar, list, messageCoreData), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctoc(this.b, this.c, this.d, ffguVar);
    }
}
