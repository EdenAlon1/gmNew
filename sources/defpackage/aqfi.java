package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqfi extends ffhv implements ffjm {
    final /* synthetic */ aqfj a;
    final /* synthetic */ MessageIdType b;
    final /* synthetic */ eqkt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqfi(aqfj aqfjVar, MessageIdType messageIdType, eqkt eqktVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqfjVar;
        this.b = messageIdType;
        this.c = eqktVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aqfi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        axnw.h(this.a.b.b(this.b));
        this.a.c.a(this.c);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqfi(this.a, this.b, this.c, ffguVar);
    }
}
