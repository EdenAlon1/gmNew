package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apes extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apeu b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apes(ffgu ffguVar, apeu apeuVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.b = apeuVar;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apes) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            String[] strArr = btvy.a;
            btvo btvoVar = new btvo();
            btvoVar.c(new apet(this.c));
            engw a = btvoVar.b().a();
            int size = a.size();
            if (size != 1) {
                ((enrr) apeu.a.j().h("com/google/android/apps/messaging/shared/api/messaging/message/classification/ClassificationControllerImpl$removeClassification$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 90, "ClassificationControllerImpl.kt")).r("%d classifications deleted when attempting to delete single classification", size);
                return ffcu.a;
            }
            ctjh ctjhVar = (ctjh) this.b.b.b();
            MessageIdType messageIdType = this.c;
            apeu apeuVar = this.b;
            fbwv k = ((btus) a.get(0)).k();
            k.getClass();
            eopx eopxVar = eopx.DISMISS;
            this.a = 1;
            if (ctjhVar.i(messageIdType, apeuVar.c.a, k, eopxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        apes apesVar = new apes(ffguVar, this.b, this.c);
        apesVar.d = obj;
        return apesVar;
    }
}
