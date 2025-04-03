package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awir implements awli {
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
        ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventErrorStateConverter", "logExistingErrorState", 238, "GroupEventErrorStateConverter.java")).D("#%s existing error state %s", str, awkhVar.d().name());
    }

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvp awvpVar;
        awvt awvtVar = (awvt) obj;
        emxf.b(awvtVar.e.equals(awkhVar.n()), "GroupEvent conversation ID does not match database RCS group ID");
        awvn awvnVar = awvtVar.q;
        if (awvnVar == null) {
            awvnVar = awvn.a;
        }
        entd entdVar = b;
        ensk o = entdVar.o();
        o.Y(csux.o, awkhVar.f().toString());
        o.Y(csux.J, awkhVar.n());
        ensz enszVar = (ensz) o.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventErrorStateConverter", "createGroupErrorStateChange", 87, "GroupEventErrorStateConverter.java");
        awvm b2 = awvm.b(awvnVar.c);
        if (b2 == null) {
            b2 = awvm.CAUSE_UNSPECIFIED;
        }
        enszVar.t("GroupEventErrorStateConverter with cause %s", b2);
        awvm b3 = awvm.b(awvnVar.c);
        if (b3 == null) {
            b3 = awvm.CAUSE_UNSPECIFIED;
        }
        int ordinal = b3.ordinal();
        if (ordinal == 0) {
            awvn awvnVar2 = awvtVar.q;
            if (awvnVar2 == null) {
                awvnVar2 = awvn.a;
            }
            awvm b4 = awvm.b(awvnVar2.c);
            if (b4 == null) {
                b4 = awvm.CAUSE_UNSPECIFIED;
            }
            boolean equals = b4.equals(awvm.CAUSE_UNSPECIFIED);
            awvm b5 = awvm.b(awvnVar2.c);
            if (b5 == null) {
                b5 = awvm.CAUSE_UNSPECIFIED;
            }
            emxf.f(equals, "#handleCauseUnspecified with wrong cause %s", b5);
            int ordinal2 = awkhVar.d().ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    eygr eygrVar = awvtVar.g;
                    final awui awuiVar = awvtVar.r;
                    if (awuiVar == null) {
                        awuiVar = awui.a;
                    }
                    if (Collection.EL.stream(eygrVar).anyMatch(new Predicate() { // from class: awiq
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            int i = awir.a;
                            return !((awui) obj2).equals(awui.this);
                        }
                    })) {
                        awvpVar = d;
                    }
                } else if (ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                    ensz enszVar2 = (ensz) entdVar.j();
                    enszVar2.Y(csux.o, awkhVar.f().toString());
                    enszVar2.Y(csux.J, awkhVar.n());
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventErrorStateConverter", "handleCauseUnspecified", 155, "GroupEventErrorStateConverter.java")).r("#handleCauseUnspecified undefined existing error state %s", awkhVar.d().a());
                    awvpVar = c;
                }
            }
            awvpVar = c;
        } else if (ordinal == 1) {
            awvn awvnVar3 = awvtVar.q;
            if (awvnVar3 == null) {
                awvnVar3 = awvn.a;
            }
            awvm b6 = awvm.b(awvnVar3.c);
            if (b6 == null) {
                b6 = awvm.CAUSE_UNSPECIFIED;
            }
            boolean equals2 = b6.equals(awvm.CAUSE_ONLY_SELF_IN_GROUP);
            awvm b7 = awvm.b(awvnVar3.c);
            if (b7 == null) {
                b7 = awvm.CAUSE_UNSPECIFIED;
            }
            emxf.f(equals2, "#handleCauseOnlySelfInGroup with wrong cause %s", b7);
            b("handleCauseOnlySelfInGroup", awkhVar);
            awvpVar = ayhd.RCS_GROUP_SELF_ONLY.equals(awkhVar.d()) ? c : e;
        } else if (ordinal != 2) {
            ensz enszVar3 = (ensz) entdVar.j();
            enszVar3.Y(csux.o, awkhVar.f().toString());
            enszVar3.Y(csux.J, awkhVar.n());
            ensz enszVar4 = (ensz) enszVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventErrorStateConverter", "createGroupErrorStateChange", 104, "GroupEventErrorStateConverter.java");
            awvm b8 = awvm.b(awvnVar.c);
            if (b8 == null) {
                b8 = awvm.CAUSE_UNSPECIFIED;
            }
            enszVar4.r("GroupEventErrorStateConverter unrecognized cause %s", b8.d);
            awvpVar = c;
        } else {
            awvn awvnVar4 = awvtVar.q;
            if (awvnVar4 == null) {
                awvnVar4 = awvn.a;
            }
            awvm b9 = awvm.b(awvnVar4.c);
            if (b9 == null) {
                b9 = awvm.CAUSE_UNSPECIFIED;
            }
            boolean equals3 = b9.equals(awvm.CAUSE_GROUP_NOT_FOUND);
            awvm b10 = awvm.b(awvnVar4.c);
            if (b10 == null) {
                b10 = awvm.CAUSE_UNSPECIFIED;
            }
            emxf.f(equals3, "#handleCauseGroupNotFound with wrong cause %s", b10);
            b("handleCauseGroupNotFound", awkhVar);
            awvpVar = ayhd.RCS_GROUP_NOT_FOUND.equals(awkhVar.d()) ? c : f;
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
        awvpVar.getClass();
        awxcVar2.j = awvpVar;
        awxcVar2.b |= 128;
        return (awxc) awxbVar.build();
    }
}
