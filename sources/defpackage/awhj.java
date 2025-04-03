package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhj implements awli {
    private static final entd a = entd.c("BugleGroupManagement");
    private final ckni b;

    public awhj(ckni ckniVar) {
        this.b = ckniVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvy awvyVar = (awvy) obj;
        emxf.b(awvyVar.d.equals(awkhVar.n()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        awve awveVar = (awve) awvf.a.createBuilder();
        enin eninVar = new enin();
        engw c = awkhVar.h().c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            eninVar.c((awvh) this.b.m().fP((ckng) c.get(i)));
        }
        enip g = eninVar.g();
        enip o = enip.o(new eygk(awvyVar.g, awvy.a));
        enqu it = enpw.b(o, g).iterator();
        while (it.hasNext()) {
            awvh awvhVar = (awvh) it.next();
            ensk n = a.n();
            n.Y(csux.o, awkhVar.f().toString());
            n.Y(csux.J, awkhVar.n());
            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateCapabilitiesConverter", "toGroupUpdate", 68, "GroupFullStateCapabilitiesConverter.java")).t("Found a server capability not present on the client. Generating add capability GroupOperation: %s", awvhVar);
            awto awtoVar = (awto) awtp.a.createBuilder();
            awtoVar.copyOnWrite();
            awtp awtpVar = (awtp) awtoVar.instance;
            awtpVar.c = awvhVar.f;
            awtpVar.b |= 1;
            awveVar.a(awtoVar);
        }
        enqu it2 = enpw.b(g, o).iterator();
        while (it2.hasNext()) {
            awvh awvhVar2 = (awvh) it2.next();
            ensk n2 = a.n();
            n2.Y(csux.o, awkhVar.f().toString());
            n2.Y(csux.J, awkhVar.n());
            ((ensz) n2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateCapabilitiesConverter", "toGroupUpdate", 84, "GroupFullStateCapabilitiesConverter.java")).t("Found a client capability not present on the server. Generating remove capability GroupOperation: %s", awvhVar2);
            awye awyeVar = (awye) awyf.a.createBuilder();
            awyeVar.copyOnWrite();
            awyf awyfVar = (awyf) awyeVar.instance;
            awyfVar.c = awvhVar2.f;
            awyfVar.b |= 1;
            awveVar.b(awyeVar);
        }
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        String str = awvyVar.d;
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
