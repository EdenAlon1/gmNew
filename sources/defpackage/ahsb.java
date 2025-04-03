package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahsb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahsc b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsb(ahsc ahscVar, MessageIdType messageIdType, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahscVar;
        this.c = messageIdType;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahsb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ahsc ahscVar = this.b;
        MessageIdType messageIdType = this.c;
        List list = this.d;
        this.a = 1;
        Object a = ffra.a(ekxi.a(ahscVar.a), new ahsa(null, ahscVar, messageIdType, list), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahsb(this.b, this.c, this.d, ffguVar);
    }
}
