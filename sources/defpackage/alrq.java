package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alrq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alrr b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ akzo d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrq(alrr alrrVar, MessageIdType messageIdType, int i, akzo akzoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alrrVar;
        this.c = messageIdType;
        this.e = i;
        this.d = akzoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alrq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            alrr alrrVar = this.b;
            MessageIdType messageIdType = this.c;
            int i2 = this.e;
            akzo akzoVar = this.d;
            this.a = 1;
            if (alrrVar.b(messageIdType, i2, akzoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alrq(this.b, this.c, this.e, this.d, ffguVar);
    }
}
