package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uku extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ukv b;
    final /* synthetic */ ffji c;
    final /* synthetic */ MessagePartCoreData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uku(ukv ukvVar, ffji ffjiVar, MessagePartCoreData messagePartCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ukvVar;
        this.c = ffjiVar;
        this.d = messagePartCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uku) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqlx dqlxVar = this.b.h().b;
            doxs doxsVar = (doxs) this.c.invoke(this.d);
            this.a = 1;
            if (dqlxVar.a(doxsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new uku(this.b, this.c, this.d, ffguVar);
    }
}
