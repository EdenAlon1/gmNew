package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhp implements awli {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleGroupManagement");
    private static final awvp c;
    private static final awvp d;
    private static final awvp e;
    private static final awvp f;

    static {
        awvo awvoVar = (awvo) awvp.a.createBuilder();
        awvoVar.copyOnWrite();
        awvp awvpVar = (awvp) awvoVar.instance;
        awvpVar.b |= 1;
        awvpVar.c = false;
        c = (awvp) awvoVar.build();
        awvo awvoVar2 = (awvo) awvp.a.createBuilder();
        awvoVar2.copyOnWrite();
        awvp awvpVar2 = (awvp) awvoVar2.instance;
        awvpVar2.b |= 1;
        awvpVar2.c = true;
        ayhd ayhdVar = ayhd.NONE;
        awvoVar2.copyOnWrite();
        awvp awvpVar3 = (awvp) awvoVar2.instance;
        awvpVar3.d = ayhdVar.a();
        awvpVar3.b |= 2;
        d = (awvp) awvoVar2.build();
        awvo awvoVar3 = (awvo) awvp.a.createBuilder();
        awvoVar3.copyOnWrite();
        awvp awvpVar4 = (awvp) awvoVar3.instance;
        awvpVar4.b |= 1;
        awvpVar4.c = true;
        ayhd ayhdVar2 = ayhd.RCS_GROUP_SELF_ONLY;
        awvoVar3.copyOnWrite();
        awvp awvpVar5 = (awvp) awvoVar3.instance;
        awvpVar5.d = ayhdVar2.a();
        awvpVar5.b |= 2;
        e = (awvp) awvoVar3.build();
        awvo awvoVar4 = (awvo) awvp.a.createBuilder();
        awvoVar4.copyOnWrite();
        awvp awvpVar6 = (awvp) awvoVar4.instance;
        awvpVar6.b |= 1;
        awvpVar6.c = true;
        ayhd ayhdVar3 = ayhd.RCS_GROUP_NOT_FOUND;
        awvoVar4.copyOnWrite();
        awvp awvpVar7 = (awvp) awvoVar4.instance;
        awvpVar7.d = ayhdVar3.a();
        awvpVar7.b |= 2;
        f = (awvp) awvoVar4.build();
    }

    private static void b(String str, awkh awkhVar) {
        ensk n = b.n();
        n.Y(csux.o, awkhVar.f().toString());
        n.Y(csux.J, awkhVar.n());
        ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateErrorStateConverter", "logExistingErrorState", 242, "GroupFullStateErrorStateConverter.java")).D("#%s existing error state %s", str, awkhVar.d().name());
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b4, code lost:
    
        if (j$.util.Collection.EL.stream(r10).filter(new defpackage.awhm()).map(new defpackage.awhn()).anyMatch(new defpackage.awho(r0)) != false) goto L63;
     */
    @Override // defpackage.awli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.awxc a(java.lang.Object r9, defpackage.awkh r10) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awhp.a(java.lang.Object, awkh):awxc");
    }
}
