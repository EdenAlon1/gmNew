package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyik extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cyil b;
    final /* synthetic */ ResolvedRecipient c;
    final /* synthetic */ erfe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyik(cyil cyilVar, ResolvedRecipient resolvedRecipient, erfe erfeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyilVar;
        this.c = resolvedRecipient;
        this.d = erfeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyik) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        crsd a;
        Object c;
        crsd a2;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cyil cyilVar = this.b;
            ResolvedRecipient resolvedRecipient = this.c;
            erfe erfeVar = this.d;
            this.a = 1;
            boolean booleanValue = cubs.a().booleanValue();
            cyis cyisVar = cyilVar.d;
            if (booleanValue) {
                crrt crrtVar = (crrt) cyisVar.e.b();
                a2 = crsc.a(1 == (r26 & 1) ? null : null, (r26 & 2) != 0 ? null : false, (r26 & 4) != 0 ? cukx.b : null, (r26 & 8) != 0 ? null : null, (r26 & 16) != 0 ? null : cyisVar.a, null, (r26 & 64) != 0 ? null : resolvedRecipient, (!((r26 & 128) == 0)) | ((cubs.j().booleanValue() && erfeVar == erfe.DISMISSED_WARNING_BANNER) ? false : true), (r26 & 256) != 0 ? null : eoko.CONVERSATION_FROM_UNSPAM_ACTION, 3, 11, (r26 & 2048) != 0 ? 2 : 0, (r26 & 4096) != 0 ? null : erfeVar);
                c = crrtVar.c(a2, this);
                if (c != ffhh.a) {
                    c = ffcu.a;
                }
            } else {
                crrt crrtVar2 = (crrt) cyisVar.e.b();
                a = crsc.a(1 == (r26 & 1) ? null : null, (r26 & 2) != 0 ? null : false, (r26 & 4) != 0 ? cukx.b : null, (r26 & 8) != 0 ? null : cyisVar.f, (r26 & 16) != 0 ? null : null, null, (r26 & 64) != 0 ? null : resolvedRecipient, (!((r26 & 128) == 0)) | ((cubs.j().booleanValue() && erfeVar == erfe.DISMISSED_WARNING_BANNER) ? false : true), (r26 & 256) != 0 ? null : eoko.CONVERSATION_FROM_UNSPAM_ACTION, 3, 11, (r26 & 2048) != 0 ? 2 : 0, (r26 & 4096) != 0 ? null : erfeVar);
                c = crrtVar2.c(a, this);
                if (c != ffhh.a) {
                    c = ffcu.a;
                }
            }
            if (c == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyik(this.b, this.c, this.d, ffguVar);
    }
}
