package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsa extends ffhv implements ffjm {
    final /* synthetic */ ahsc a;
    final /* synthetic */ MessageIdType b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsa(ffgu ffguVar, ahsc ahscVar, MessageIdType messageIdType, List list) {
        super(2, ffguVar);
        this.a = ahscVar;
        this.b = messageIdType;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahsa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.e(this.b, this.c));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahsa ahsaVar = new ahsa(ffguVar, this.a, this.b, this.c);
        ahsaVar.d = obj;
        return ahsaVar;
    }
}
