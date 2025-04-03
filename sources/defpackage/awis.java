package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awis implements awli {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventIconUrlConverter");
    private final ffbr b;

    public awis(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    @Override // defpackage.awli
    public final /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvt awvtVar = (awvt) obj;
        awvtVar.getClass();
        if (!((atzy) this.b.b()).a()) {
            awxc awxcVar = awxc.a;
            awxcVar.getClass();
            return awxcVar;
        }
        if (!ffkj.e(awvtVar.e, awkhVar.n())) {
            throw new IllegalArgumentException("Mismatch between the RCS conversation Id from the GroupEvent and ConversationsTable");
        }
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        awxbVar.getClass();
        awxd.b(awvtVar.e, awxbVar);
        awxc a2 = awxd.a(awxbVar);
        if (awvtVar.m) {
            ensk e = a.e();
            e.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, awkhVar.f());
            enrrVar.Y(csux.J, awkhVar.n());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventIconUrlConverter", "toGroupUpdate", 54, "GroupEventIconUrlConverter.kt")).q("Received a GroupEvent with icon URL deleted from the server.");
            awxb awxbVar2 = (awxb) a2.toBuilder();
            awxbVar2.getClass();
            awwb awwbVar = (awwb) awwc.a.createBuilder();
            awwbVar.getClass();
            awwd.d(true, awwbVar);
            awxf awxfVar = awvtVar.p;
            if (awxfVar == null) {
                awxfVar = awxf.a;
            }
            awwd.b(awxfVar, awwbVar);
            awxd.c(awwd.a(awwbVar), awxbVar2);
            return awxd.a(awxbVar2);
        }
        if ((awvtVar.d & 32) == 0) {
            return a2;
        }
        ensk e2 = a.e();
        e2.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar2 = (enrr) e2;
        enrrVar2.Y(csux.p, awkhVar.f());
        enrrVar2.Y(csux.J, awkhVar.n());
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventIconUrlConverter", "toGroupUpdate", 69, "GroupEventIconUrlConverter.kt")).t("Received a GroupEvent with an icon URL update from the server. Updated URL: %s", awvtVar.n);
        awxb awxbVar3 = (awxb) a2.toBuilder();
        awxbVar3.getClass();
        awwb awwbVar2 = (awwb) awwc.a.createBuilder();
        awwbVar2.getClass();
        awwd.c(awvtVar.n, awwbVar2);
        awxf awxfVar2 = awvtVar.p;
        if (awxfVar2 == null) {
            awxfVar2 = awxf.a;
        }
        awwd.b(awxfVar2, awwbVar2);
        awxd.c(awwd.a(awwbVar2), awxbVar3);
        return awxd.a(awxbVar3);
    }
}
