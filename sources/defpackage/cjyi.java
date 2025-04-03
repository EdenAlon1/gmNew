package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjyi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjyq b;
    final /* synthetic */ ParticipantsTable.BindData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjyi(cjyq cjyqVar, ParticipantsTable.BindData bindData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjyqVar;
        this.c = bindData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjyi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl m = ((aqkp) this.b.e.b()).m(((aolr) this.b.g.b()).q(this.c));
            this.a = 1;
            obj = fgfz.c(m, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
        if (resolvedRecipient == null) {
            ensk h = cjyq.b.h();
            h.Y(ente.a, "BugleProfiles");
            ((enrr) h.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$revokeProfileInfoFromParticipant$1", "invokeSuspend", 183, "ProfileActionSenderImpl.kt")).t("Not revoking profile info for %s, unable to find recipient", this.c.S());
            return ffcu.a;
        }
        cjyq cjyqVar = this.b;
        engw r = engw.r(resolvedRecipient);
        r.getClass();
        cjyqVar.b(r, 1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjyi(this.b, this.c, ffguVar);
    }
}
