package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum eebf implements eeop {
    INIT,
    ACCEPTING,
    ACCEPTED,
    CONNECTING,
    CONNECTED,
    AUTHENTICATING,
    AUTHENTICATED,
    ACTIVE,
    CLOSING,
    CLOSED,
    FAILED;

    public static final eeoo l;
    public static final eeoo m;
    public static final eeoo n;
    public static final eeoo o;
    private static final eeoq q;

    static {
        eebf eebfVar = INIT;
        eebf eebfVar2 = ACCEPTING;
        eebf eebfVar3 = ACCEPTED;
        eebf eebfVar4 = CONNECTING;
        eebf eebfVar5 = CONNECTED;
        eebf eebfVar6 = AUTHENTICATING;
        eebf eebfVar7 = AUTHENTICATED;
        eebf eebfVar8 = ACTIVE;
        eebf eebfVar9 = CLOSING;
        eebf eebfVar10 = CLOSED;
        eebf eebfVar11 = FAILED;
        eeoq eeoqVar = new eeoq(enhk.j(enhk.l(SocketTimeoutException.class, eebfVar8)));
        q = eeoqVar;
        eniq eniqVar = new eniq();
        eniqVar.n(eebfVar, eebfVar4);
        eniqVar.n(eebfVar4, eebfVar5, eebfVar9);
        eniqVar.n(eebfVar5, eebfVar8, eebfVar9);
        eniqVar.n(eebfVar8, eebfVar8, eebfVar9);
        eniqVar.n(eebfVar9, eebfVar9, eebfVar10);
        l = new eeoo(eebfVar, eebfVar11, eniqVar.a(), enhk.l(eebfVar8, eeoqVar));
        eniq eniqVar2 = new eniq();
        eniqVar2.n(eebfVar, eebfVar2);
        eniqVar2.n(eebfVar2, eebfVar2, eebfVar5, eebfVar9);
        eniqVar2.n(eebfVar5, eebfVar8, eebfVar9);
        eniqVar2.n(eebfVar8, eebfVar8, eebfVar9);
        eniqVar2.n(eebfVar9, eebfVar9, eebfVar10);
        m = new eeoo(eebfVar, eebfVar11, eniqVar2.a(), enhk.l(eebfVar8, eeoqVar));
        eniq eniqVar3 = new eniq();
        eniqVar3.n(eebfVar, eebfVar3);
        eniqVar3.n(eebfVar3, eebfVar8, eebfVar9);
        eniqVar3.n(eebfVar8, eebfVar8, eebfVar9);
        eniqVar3.n(eebfVar9, eebfVar9, eebfVar10);
        n = new eeoo(eebfVar, eebfVar11, eniqVar3.a(), enhk.l(eebfVar8, eeoqVar));
        eniq eniqVar4 = new eniq();
        eniqVar4.n(eebfVar, eebfVar4);
        eniqVar4.n(eebfVar4, eebfVar5, eebfVar9);
        eniqVar4.n(eebfVar5, eebfVar6, eebfVar9);
        eniqVar4.n(eebfVar6, eebfVar7, eebfVar9);
        eniqVar4.n(eebfVar7, eebfVar8, eebfVar9);
        eniqVar4.n(eebfVar8, eebfVar8, eebfVar9);
        eniqVar4.n(eebfVar9, eebfVar9, eebfVar10);
        o = new eeoo(eebfVar, eebfVar11, eniqVar4.a(), enhk.l(eebfVar8, eeoqVar));
        eniq eniqVar5 = new eniq();
        eniqVar5.n(eebfVar, eebfVar2);
        eniqVar5.n(eebfVar2, eebfVar2, eebfVar5, eebfVar9);
        eniqVar5.n(eebfVar5, eebfVar6, eebfVar9);
        eniqVar5.n(eebfVar6, eebfVar7, eebfVar9);
        eniqVar5.n(eebfVar7, eebfVar8, eebfVar9);
        eniqVar5.n(eebfVar8, eebfVar8, eebfVar9);
        eniqVar5.n(eebfVar9, eebfVar9, eebfVar10);
        new eeoo(eebfVar, eebfVar11, eniqVar5.a(), enhk.l(eebfVar8, eeoqVar));
        eniq eniqVar6 = new eniq();
        eniqVar6.n(eebfVar, eebfVar3);
        eniqVar6.n(eebfVar3, eebfVar8, eebfVar9);
        eniqVar6.n(eebfVar8, eebfVar8, eebfVar9);
        eniqVar6.n(eebfVar9, eebfVar9, eebfVar10);
        new eeoo(eebfVar, eebfVar11, eniqVar6.a(), enhk.l(eebfVar8, eeoqVar));
    }
}
