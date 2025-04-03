package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awip implements awli {
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
        awui awuiVar = awui.a;
        awui awuiVar2 = awvtVar.o;
        if (awuiVar2 == null) {
            awuiVar2 = awuiVar;
        }
        if (awuiVar.equals(awuiVar2)) {
            return (awxc) awxbVar.build();
        }
        awuh awuhVar = awuh.GROUP;
        awui awuiVar3 = awvtVar.o;
        if (awuiVar3 == null) {
            awuiVar3 = awui.a;
        }
        awuh b = awuh.b(awuiVar3.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        emxf.b(awuhVar.equals(b), "When present the group destination endpoint should always be of type GROUP");
        String m = awkhVar.m();
        awui awuiVar4 = awvtVar.o;
        if (awuiVar4 == null) {
            awuiVar4 = awui.a;
        }
        if (!m.equals(awuiVar4.d)) {
            ensk n = a.n();
            n.Y(csux.o, awkhVar.f().toString());
            n.Y(csux.J, awkhVar.n());
            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventEndpointConverter", "toGroupUpdate", 59, "GroupEventEndpointConverter.java")).q("Detected change of the RCS conference URI");
            awvi awviVar = (awvi) awvj.a.createBuilder();
            awui awuiVar5 = awvtVar.o;
            if (awuiVar5 == null) {
                awuiVar5 = awui.a;
            }
            awviVar.copyOnWrite();
            awvj awvjVar = (awvj) awviVar.instance;
            awuiVar5.getClass();
            awvjVar.c = awuiVar5;
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
