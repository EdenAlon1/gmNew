package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eshe implements evbl {
    public final engw f;
    public final enip g;
    private final enhk j;
    public static final ecda a = new ecda("communication.messages.penpal.proto.penpalservice.v2.PenpalService.");
    private static final ecda h = new ecda("communication.messages.penpal.proto.penpalservice.v2.PenpalService/");
    public static final evbk b = new eshb();
    public static final evbk c = new eshc();
    public static final evbk d = new eshd();
    public static final eshe e = new eshe();
    private static final ecda i = new ecda("aratea-pa.googleapis.com");

    private eshe() {
        int i2 = engw.d;
        engr engrVar = new engr();
        engrVar.h("aratea-pa.mtls.googleapis.com");
        engrVar.h("autopush-aratea-pa.mtls.sandbox.googleapis.com");
        engrVar.h("autopush-aratea-pa.sandbox.googleapis.com");
        engrVar.h("staging-aratea-pa.mtls.sandbox.googleapis.com");
        engrVar.h("staging-aratea-pa.sandbox.googleapis.com");
        engrVar.h("aratea-pa.googleapis.com");
        this.f = engrVar.g();
        this.g = new enin().g();
        evbk evbkVar = b;
        evbk evbkVar2 = c;
        evbk evbkVar3 = d;
        enip.s(evbkVar, evbkVar2, evbkVar3);
        enhd enhdVar = new enhd();
        enhdVar.k("MagicRewriteMessage", evbkVar);
        enhdVar.k("SmarterReplies", evbkVar2);
        enhdVar.k("ApplyPhotoBooth", evbkVar3);
        this.j = enhdVar.c();
        new enhd().c();
    }

    @Override // defpackage.evbl
    public final ecda a() {
        return i;
    }

    @Override // defpackage.evbl
    public final evbk b(String str) {
        String str2 = h.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.j.containsKey(substring)) {
            return (evbk) this.j.get(substring);
        }
        return null;
    }
}
