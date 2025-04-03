package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awjm implements awli {
    private static final entd a = entd.c("BugleGroupManagement");

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvt awvtVar = (awvt) obj;
        emxf.b(awvtVar.e.equals(awkhVar.n()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        String str = awvtVar.e;
        awxbVar.copyOnWrite();
        awxc awxcVar = (awxc) awxbVar.instance;
        str.getClass();
        awxcVar.b |= 1;
        awxcVar.c = str;
        if (awvtVar.k) {
            ensk n = a.n();
            n.Y(csux.o, awkhVar.f().toString());
            n.Y(csux.J, awkhVar.n());
            n.Y(csux.F, awkhVar.l());
            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSubjectConverter", "toGroupUpdate", 51, "GroupEventSubjectConverter.java")).q("Received a GroupEvent with subject deleted from the server.");
            awwz awwzVar = (awwz) awxa.a.createBuilder();
            awwzVar.copyOnWrite();
            awxa awxaVar = (awxa) awwzVar.instance;
            awxaVar.b |= 2;
            awxaVar.d = true;
            awxf awxfVar = awvtVar.p;
            if (awxfVar == null) {
                awxfVar = awxf.a;
            }
            awwzVar.copyOnWrite();
            awxa awxaVar2 = (awxa) awwzVar.instance;
            awxfVar.getClass();
            awxaVar2.e = awxfVar;
            awxaVar2.b |= 4;
            awxbVar.copyOnWrite();
            awxc awxcVar2 = (awxc) awxbVar.instance;
            awxa awxaVar3 = (awxa) awwzVar.build();
            awxaVar3.getClass();
            awxcVar2.g = awxaVar3;
            awxcVar2.b |= 16;
            return (awxc) awxbVar.build();
        }
        if ((awvtVar.d & 8) == 0) {
            return (awxc) awxbVar.build();
        }
        ensk n2 = a.n();
        n2.Y(csux.o, awkhVar.f().toString());
        n2.Y(csux.J, awkhVar.n());
        n2.Y(csux.F, awkhVar.l());
        ((ensz) n2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSubjectConverter", "toGroupUpdate", 69, "GroupEventSubjectConverter.java")).t("Received a GroupEvent with a Subject update from the server. Updated subject: %s", awvtVar.l);
        awwz awwzVar2 = (awwz) awxa.a.createBuilder();
        String str2 = awvtVar.l;
        awwzVar2.copyOnWrite();
        awxa awxaVar4 = (awxa) awwzVar2.instance;
        str2.getClass();
        awxaVar4.b |= 1;
        awxaVar4.c = str2;
        awxf awxfVar2 = awvtVar.p;
        if (awxfVar2 == null) {
            awxfVar2 = awxf.a;
        }
        awwzVar2.copyOnWrite();
        awxa awxaVar5 = (awxa) awwzVar2.instance;
        awxfVar2.getClass();
        awxaVar5.e = awxfVar2;
        awxaVar5.b |= 4;
        awxbVar.copyOnWrite();
        awxc awxcVar3 = (awxc) awxbVar.instance;
        awxa awxaVar6 = (awxa) awwzVar2.build();
        awxaVar6.getClass();
        awxcVar3.g = awxaVar6;
        awxcVar3.b |= 16;
        return (awxc) awxbVar.build();
    }
}
