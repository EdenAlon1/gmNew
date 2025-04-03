package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhl implements awli {
    private static final entd a = entd.c("BugleGroupManagement");

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvy awvyVar = (awvy) obj;
        emxf.b(awvyVar.d.equals(awkhVar.n()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        awuh awuhVar = awuh.GROUP;
        awui awuiVar = awvyVar.f;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        emxf.b(awuhVar.equals(b), "Group destination endpoint should always be of type GROUP");
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        String str = awvyVar.d;
        awxbVar.copyOnWrite();
        awxc awxcVar = (awxc) awxbVar.instance;
        str.getClass();
        awxcVar.b |= 1;
        awxcVar.c = str;
        String m = awkhVar.m();
        awui awuiVar2 = awvyVar.f;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        if (!m.equals(awuiVar2.d)) {
            ensk n = a.n();
            n.Y(csux.o, awkhVar.f().toString());
            n.Y(csux.J, awkhVar.n());
            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateEndpointConverter", "toGroupUpdate", 56, "GroupFullStateEndpointConverter.java")).q("Detected change of the RCS conference URI");
            awvi awviVar = (awvi) awvj.a.createBuilder();
            awui awuiVar3 = awvyVar.f;
            if (awuiVar3 == null) {
                awuiVar3 = awui.a;
            }
            awviVar.copyOnWrite();
            awvj awvjVar = (awvj) awviVar.instance;
            awuiVar3.getClass();
            awvjVar.c = awuiVar3;
            awvjVar.b |= 1;
            awxbVar.copyOnWrite();
            awxc awxcVar2 = (awxc) awxbVar.instance;
            awvj awvjVar2 = (awvj) awviVar.build();
            awvjVar2.getClass();
            awxcVar2.d = awvjVar2;
            awxcVar2.b |= 2;
        }
        return (awxc) awxbVar.build();
    }
}
