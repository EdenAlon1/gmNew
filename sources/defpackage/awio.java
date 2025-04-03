package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awio implements awli {
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
        if ((awvtVar.d & 2048) != 0) {
            awvv awvvVar = awvtVar.t;
            if (awvvVar == null) {
                awvvVar = awvv.a;
            }
            if (!awvvVar.equals(awvv.a)) {
                ensk n = a.n();
                n.Y(csux.p, awkhVar.f());
                n.Y(csux.J, awkhVar.n());
                ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventEncryptionStatusConverter", "toGroupUpdate", 54, "GroupEventEncryptionStatusConverter.java")).q("Received a GroupEvent with opaque data, creating GroupUpdate");
                awvv awvvVar2 = awvtVar.t;
                if (awvvVar2 == null) {
                    awvvVar2 = awvv.a;
                }
                awxbVar.copyOnWrite();
                awxc awxcVar2 = (awxc) awxbVar.instance;
                awvvVar2.getClass();
                awxcVar2.m = awvvVar2;
                awxcVar2.b |= 1024;
                return (awxc) awxbVar.build();
            }
        }
        return (awxc) awxbVar.build();
    }
}
