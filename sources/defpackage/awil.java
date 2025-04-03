package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awil implements awli {
    private static final entd a = entd.c("BugleGroupManagement");
    private final ffbr b;

    public awil(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvy awvyVar = (awvy) obj;
        emxf.b(awvyVar.d.equals(awkhVar.n()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        String str = awvyVar.d;
        awxbVar.copyOnWrite();
        awxc awxcVar = (awxc) awxbVar.instance;
        str.getClass();
        awxcVar.b |= 1;
        awxcVar.c = str;
        if ((awvyVar.c & 8) == 0) {
            ensk n = a.n();
            n.Y(csux.o, awkhVar.f().toString());
            n.Y(csux.J, awkhVar.n());
            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSubjectConverter", "toGroupUpdate", 67, "GroupFullStateSubjectConverter.java")).q("Skipping group subject change because subject missing in group full state notification");
            return (awxc) awxbVar.build();
        }
        if (!((atzr) this.b.b()).a() && !awkhVar.h().d(ckng.NAME_CHANGE)) {
            ensk n2 = a.n();
            n2.Y(csux.o, awkhVar.f().toString());
            n2.Y(csux.J, awkhVar.n());
            ((ensz) n2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSubjectConverter", "toGroupUpdate", 83, "GroupFullStateSubjectConverter.java")).q("Skipping group subject change check because subject changes are not supported by conversation");
            return (awxc) awxbVar.build();
        }
        awwy awwyVar = awvyVar.i;
        if (awwyVar == null) {
            awwyVar = awwy.a;
        }
        String l = awkhVar.l();
        String str2 = awwyVar.c;
        if (ckrv.a(str2, l, awkhVar.g())) {
            ensk n3 = a.n();
            n3.Y(csux.o, awkhVar.f().toString());
            n3.Y(csux.J, awkhVar.n());
            ((ensz) n3.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSubjectConverter", "toGroupUpdate", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "GroupFullStateSubjectConverter.java")).D("Server subject (%s) and client subject (%s) do not match. Generating subject update GroupEvent.", str2, l);
            awwz awwzVar = (awwz) awxa.a.createBuilder();
            awwzVar.copyOnWrite();
            awxa awxaVar = (awxa) awwzVar.instance;
            str2.getClass();
            awxaVar.b |= 1;
            awxaVar.c = str2;
            boolean isEmpty = str2.isEmpty();
            awwzVar.copyOnWrite();
            awxa awxaVar2 = (awxa) awwzVar.instance;
            awxaVar2.b |= 2;
            awxaVar2.d = isEmpty;
            awxf awxfVar = awwyVar.d;
            if (awxfVar == null) {
                awxfVar = awxf.a;
            }
            awwzVar.copyOnWrite();
            awxa awxaVar3 = (awxa) awwzVar.instance;
            awxfVar.getClass();
            awxaVar3.e = awxfVar;
            awxaVar3.b |= 4;
            awxbVar.copyOnWrite();
            awxc awxcVar2 = (awxc) awxbVar.instance;
            awxa awxaVar4 = (awxa) awwzVar.build();
            awxaVar4.getClass();
            awxcVar2.g = awxaVar4;
            awxcVar2.b |= 16;
        }
        return (awxc) awxbVar.build();
    }
}
