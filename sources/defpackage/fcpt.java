package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcpt implements evbl {
    public final engw p;
    public final enip q;
    private final enhk t;
    public static final ecda a = new ecda("google.internal.communications.instantmessaging.v1.Messaging.");
    private static final ecda r = new ecda("google.internal.communications.instantmessaging.v1.Messaging/");
    public static final evbk b = new fcpk();
    public static final evbk c = new fcpl();
    public static final evbk d = new fcpm();
    public static final evbk e = new fcpn();
    public static final evbk f = new fcpo();
    public static final evbk g = new fcpp();
    public static final evbk h = new fcpq();
    public static final evbk i = new fcpr();
    public static final evbk j = new fcps();
    public static final evbk k = new fcpg();
    public static final evbk l = new fcph();
    public static final evbk m = new fcpi();
    public static final evbk n = new fcpj();
    public static final fcpt o = new fcpt();
    private static final ecda s = new ecda("instantmessaging-pa.googleapis.com");

    private fcpt() {
        int i2 = engw.d;
        engr engrVar = new engr();
        engrVar.h("autopush-asan-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("autopush-asan-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("autopush-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("autopush-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("autopush-rcs-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("autopush-rcs-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-autopush-asan-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-autopush-asan-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-autopush-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-autopush-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-autopush-rcs-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-autopush-rcs-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-pa.mtls.googleapis.com");
        engrVar.h("instantmessaging-preprod-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-preprod-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-preprod-rcs-ap-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-preprod-rcs-ap-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-preprod-rcs-eu-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-preprod-rcs-eu-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-preprod-rcs-us-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-preprod-rcs-us-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-hawk-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-hawk-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-heron-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-heron-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-rcs-ap-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-rcs-ap-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-rcs-eu-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-rcs-eu-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-rcs-us-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-rcs-us-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-sparrow-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-prod-sparrow-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-rcs-ap-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-rcs-ap-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-rcs-eu-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-rcs-eu-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-rcs-us-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-rcs-us-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-users-rcs-ap-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-users-rcs-ap-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-users-rcs-eu-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-users-rcs-eu-pa.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-users-rcs-us-pa.mtls.sandbox.googleapis.com");
        engrVar.h("instantmessaging-staging-users-rcs-us-pa.sandbox.googleapis.com");
        engrVar.h("preprod-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("preprod-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("preprod-rcs-ap-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("preprod-rcs-ap-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("preprod-rcs-eu-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("preprod-rcs-eu-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("preprod-rcs-us-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("preprod-rcs-us-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("prod-hawk-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("prod-hawk-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("prod-heron-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("prod-heron-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("prod-rcs-ap-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("prod-rcs-ap-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("prod-rcs-eu-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("prod-rcs-eu-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("prod-rcs-us-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("prod-rcs-us-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("prod-sparrow-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("prod-sparrow-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("staging-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("staging-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("staging-rcs-ap-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("staging-rcs-ap-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("staging-rcs-eu-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("staging-rcs-eu-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("staging-rcs-us-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("staging-rcs-us-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("staging-users-rcs-ap-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("staging-users-rcs-ap-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("staging-users-rcs-eu-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("staging-users-rcs-eu-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("staging-users-rcs-us-instantmessaging-pa.mtls.sandbox.googleapis.com");
        engrVar.h("staging-users-rcs-us-instantmessaging-pa.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-autopush-asan-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-autopush-asan-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-autopush-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-autopush-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-autopush-rcs-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-autopush-rcs-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-preprod-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-preprod-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-preprod-rcs-ap-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-preprod-rcs-ap-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-preprod-rcs-eu-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-preprod-rcs-eu-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-preprod-rcs-us-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-preprod-rcs-us-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-hawk-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-hawk-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-heron-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-heron-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-rcs-ap-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-rcs-ap-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-rcs-eu-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-rcs-eu-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-rcs-us-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-rcs-us-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-sparrow-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-prod-sparrow-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-rcs-ap-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-rcs-ap-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-rcs-eu-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-rcs-eu-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-rcs-us-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-rcs-us-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-users-rcs-ap-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-users-rcs-ap-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-users-rcs-eu-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-users-rcs-eu-grpc.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-users-rcs-us-grpc.mtls.sandbox.googleapis.com");
        engrVar.h("tachyon-playground-staging-users-rcs-us-grpc.sandbox.googleapis.com");
        engrVar.h("zero-instantmessaging-pa.googleapis.com");
        engrVar.h("zero-instantmessaging-pa.mtls.googleapis.com");
        engrVar.h("instantmessaging-pa.googleapis.com");
        this.p = engrVar.g();
        this.q = new enin().g();
        evbk evbkVar = b;
        evbk evbkVar2 = c;
        evbk evbkVar3 = d;
        evbk evbkVar4 = e;
        evbk evbkVar5 = f;
        evbk evbkVar6 = g;
        evbk evbkVar7 = h;
        evbk evbkVar8 = i;
        evbk evbkVar9 = j;
        evbk evbkVar10 = k;
        evbk evbkVar11 = l;
        evbk evbkVar12 = m;
        evbk evbkVar13 = n;
        enip.v(evbkVar, evbkVar2, evbkVar3, evbkVar4, evbkVar5, evbkVar6, evbkVar7, evbkVar8, evbkVar9, evbkVar10, evbkVar11, evbkVar12, evbkVar13);
        enhd enhdVar = new enhd();
        enhdVar.k("SendMessage", evbkVar);
        enhdVar.k("SendMessageExpress", evbkVar2);
        enhdVar.k("Bind", evbkVar3);
        enhdVar.k("ReceiveMessages", evbkVar4);
        enhdVar.k("ReceiveMessagesExpress", evbkVar5);
        enhdVar.k("PullMessages", evbkVar6);
        enhdVar.k("AckMessages", evbkVar7);
        enhdVar.k("BatchAckMessages", evbkVar8);
        enhdVar.k("RevokeMessagesById", evbkVar9);
        enhdVar.k("RevokeMessagesBySender", evbkVar10);
        enhdVar.k("PrewarmReceiver", evbkVar11);
        enhdVar.k("Echo", evbkVar12);
        enhdVar.k("CreateMlsConversation", evbkVar13);
        this.t = enhdVar.c();
        new enhd().c();
    }

    @Override // defpackage.evbl
    public final ecda a() {
        return s;
    }

    @Override // defpackage.evbl
    public final evbk b(String str) {
        String str2 = r.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.t.containsKey(substring)) {
            return (evbk) this.t.get(substring);
        }
        return null;
    }
}
