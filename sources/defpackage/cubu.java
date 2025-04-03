package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cubw b;
    final /* synthetic */ MessageCoreData c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cubu(ffgu ffguVar, cubw cubwVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.b = cubwVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cubu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cubw cubwVar = this.b;
        MessageCoreData messageCoreData = this.c;
        if (((bczy) cubwVar.d.b()).r(messageCoreData.z()) == null && (messageCoreData = ((bdmq) cubwVar.b.b()).v(messageCoreData.B())) == null) {
            ensk h = cubw.a.h();
            h.Y(ente.a, "BugleSpam");
            ((enrr) h.h("com/google/android/apps/messaging/shared/util/spam/SpamPrechecker", "getUpdatedMessage", 83, "SpamPrechecker.kt")).q("Message deleted during spam precheck");
        }
        if (messageCoreData == null) {
            return null;
        }
        ParticipantsTable.BindData b = ((bdrr) this.b.c.b()).b(messageCoreData.aA());
        if (b == null) {
            ensk j = cubw.a.j();
            j.Y(ente.a, "BugleSpam");
            ((enrr) j.h("com/google/android/apps/messaging/shared/util/spam/SpamPrechecker", "getSuspectedSpammer", 94, "SpamPrechecker.kt")).t("Failed to get existing participant with ID %s", cskt.b(messageCoreData.aA()));
        }
        if (b == null) {
            return null;
        }
        cubw cubwVar2 = this.b;
        this.a = 1;
        Object a = cubwVar2.a(messageCoreData, b, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cubu cubuVar = new cubu(ffguVar, this.b, this.c);
        cubuVar.d = obj;
        return cubuVar;
    }
}
