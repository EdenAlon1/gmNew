package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckwe extends ffhv implements ffjm {
    final /* synthetic */ ckwi a;
    final /* synthetic */ bseh b;
    final /* synthetic */ bseh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckwe(ckwi ckwiVar, bseh bsehVar, bseh bsehVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckwiVar;
        this.b = bsehVar;
        this.c = bsehVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckwe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final bseh bsehVar = this.c;
        final ckwi ckwiVar = this.a;
        final bseh bsehVar2 = this.b;
        ckwiVar.k.d("RepairForkedMmsGroupSynclet#mergeToTargetConversation", new Runnable() { // from class: ckwd
            @Override // java.lang.Runnable
            public final void run() {
                ensk h = ckwi.a.h();
                h.Y(ente.a, "BugleGroupManagement");
                enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$mergeToTargetConversation$2", "invokeSuspend$lambda$0", 357, "RepairForkedMmsGroupSynclet.kt");
                bseh bsehVar3 = bsehVar;
                bseh bsehVar4 = bseh.this;
                enrrVar.D("Repairing forked MMS group %d by merging to conversation %s", bsehVar4.C(), bsehVar3.C());
                final ConversationIdType C = bsehVar4.C();
                C.getClass();
                String[] strArr = MessagesTable.a;
                buxh buxhVar = new buxh();
                buxhVar.f("RepairForkedMmsGroupSynclet#deleteMmsGroupCreatedTombstone");
                buxhVar.c(new Function() { // from class: ckvc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar = (buxz) obj2;
                        buxzVar.m(ConversationIdType.this);
                        buxzVar.af(204);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int d = buxhVar.d();
                ensk e = ckwi.a.e();
                e.Y(ente.a, "BugleGroupManagement");
                ((enrr) e.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet", "deleteMmsGroupCreatedTombstone", 451, "RepairForkedMmsGroupSynclet.kt")).r("Deleted %d MMS group created tombstones.", d);
                bdes bdesVar = (bdes) ckwiVar.g.b();
                ConversationIdType C2 = bsehVar4.C();
                ConversationIdType C3 = bsehVar3.C();
                byyt G = bsehVar3.G();
                if (G == null) {
                    G = byyt.UNARCHIVED;
                }
                bdesVar.a(C2, C3, G);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckwe(this.a, this.b, this.c, ffguVar);
    }
}
