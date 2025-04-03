package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awin implements awli {
    private static final entd a = entd.c("BugleGroupManagement");

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvt awvtVar = (awvt) obj;
        emxf.b(awvtVar.e.equals(awkhVar.n()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        awve awveVar = (awve) awvf.a.createBuilder();
        for (awvh awvhVar : new eygk(awvtVar.i, awvt.a)) {
            ensk n = a.n();
            n.Y(csux.o, awkhVar.f().toString());
            n.Y(csux.J, awkhVar.n());
            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventCapabilitiesConverter", "toGroupUpdate", 53, "GroupEventCapabilitiesConverter.java")).t("Group capability from the server to add to the client: %s", awvhVar);
            awto awtoVar = (awto) awtp.a.createBuilder();
            awtoVar.copyOnWrite();
            awtp awtpVar = (awtp) awtoVar.instance;
            awtpVar.c = awvhVar.f;
            awtpVar.b |= 1;
            awveVar.a(awtoVar);
        }
        for (awvh awvhVar2 : new eygk(awvtVar.j, awvt.b)) {
            ensk n2 = a.n();
            n2.Y(csux.o, awkhVar.f().toString());
            n2.Y(csux.J, awkhVar.n());
            ((ensz) n2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventCapabilitiesConverter", "toGroupUpdate", 66, "GroupEventCapabilitiesConverter.java")).t("Group capability from the server to remove from he client: %s", awvhVar2);
            awye awyeVar = (awye) awyf.a.createBuilder();
            awyeVar.copyOnWrite();
            awyf awyfVar = (awyf) awyeVar.instance;
            awyfVar.c = awvhVar2.f;
            awyfVar.b |= 1;
            awveVar.b(awyeVar);
        }
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        String str = awvtVar.e;
        awxbVar.copyOnWrite();
        awxc awxcVar = (awxc) awxbVar.instance;
        str.getClass();
        awxcVar.b |= 1;
        awxcVar.c = str;
        awxbVar.copyOnWrite();
        awxc awxcVar2 = (awxc) awxbVar.instance;
        awvf awvfVar = (awvf) awveVar.build();
        awvfVar.getClass();
        awxcVar2.f = awvfVar;
        awxcVar2.b |= 8;
        return (awxc) awxbVar.build();
    }
}
