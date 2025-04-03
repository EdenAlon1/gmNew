package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alro extends ffhv implements ffjm {
    final /* synthetic */ alrr a;
    final /* synthetic */ MessageIdType b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alro(ffgu ffguVar, alrr alrrVar, MessageIdType messageIdType, int i) {
        super(2, ffguVar);
        this.a = alrrVar;
        this.b = messageIdType;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alro) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        MessageCoreData z = ((bdmq) this.a.c.b()).z(this.b);
        if (z == null) {
            return null;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.BUGLE_MESSAGE, eoluVar);
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.getClass();
        eohm.c(z.t(), eoopVar);
        eohm.g(this.c, eoopVar);
        eohm.h(altl.d(z.d()), eoopVar);
        eohm.b(((akvz) this.a.b.b()).b(z.z()), eoopVar);
        eohm.e(z.E().f(), eoopVar);
        eogy.d(eohm.a(eoopVar), eoluVar);
        return eogy.a(eoluVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        alro alroVar = new alro(ffguVar, this.a, this.b, this.c);
        alroVar.d = obj;
        return alroVar;
    }
}
