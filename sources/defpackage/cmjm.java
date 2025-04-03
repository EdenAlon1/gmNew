package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjm extends ffhv implements ffjm {
    final /* synthetic */ MessageIdType a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmjm(ffgu ffguVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.a = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmjm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("getEarliestReceivedTimestampForEditedMessage");
        d.e(cmjn.a);
        d.h(new cmjo(this.a));
        d.x(1);
        dtsu o = d.b().o();
        try {
            buuo buuoVar = (buuo) o;
            if (!buuoVar.moveToFirst()) {
                ffig.a(o, null);
                return null;
            }
            Instant ofEpochMilli = Instant.ofEpochMilli(buuoVar.l());
            ffig.a(o, null);
            return ofEpochMilli;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmjm cmjmVar = new cmjm(ffguVar, this.a);
        cmjmVar.b = obj;
        return cmjmVar;
    }
}
