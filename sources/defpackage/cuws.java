package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuws extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuwv b;
    final /* synthetic */ String c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ fbcx e;
    final /* synthetic */ culh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuws(cuwv cuwvVar, String str, ConversationIdType conversationIdType, fbcx fbcxVar, culh culhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cuwvVar;
        this.c = str;
        this.d = conversationIdType;
        this.e = fbcxVar;
        this.f = culhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuws) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
        } catch (Throwable th) {
            ensk j = cuwv.a.j();
            j.Y(ente.a, "BugleSpam");
            ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamReporter$sendActionEnforcedSignal$1", "invokeSuspend", 149, "TachyonSpamReporter.kt")).q("Failed to send enforcement signal to Tachyon");
        }
        if (this.a == 0) {
            ffci.b(obj);
            ParticipantsTable.BindData b = ((bdrr) this.b.b.b()).b(this.c);
            if (b != null) {
                cuwf cuwfVar = (cuwf) this.b.d.b();
                cuwr a = this.b.a(this.d, b);
                fbcx fbcxVar = this.e;
                culh culhVar = this.f;
                this.a = 1;
                if (cuwfVar.i(b, a, fbcxVar, culhVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        ffci.b(obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuws(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
