package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djgg implements erqj {
    private final djgh a;
    private final djge b;

    public djgg(djge djgeVar, djgh djghVar) {
        this.b = djgeVar;
        this.a = djghVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        clqo clqoVar = (clqo) obj;
        clqf clqfVar = (clqf) clqg.a.createBuilder();
        clns clnsVar = this.a.b.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqfVar.copyOnWrite();
        clqg clqgVar = (clqg) clqfVar.instance;
        clnsVar.getClass();
        clqgVar.e = clnsVar;
        clqgVar.b |= 1;
        clqfVar.copyOnWrite();
        clqg clqgVar2 = (clqg) clqfVar.instance;
        clqoVar.getClass();
        clqgVar2.d = clqoVar;
        clqgVar2.c = 2;
        int i = this.a.b.h;
        clqfVar.copyOnWrite();
        clqg clqgVar3 = (clqg) clqfVar.instance;
        clqgVar3.b |= 4;
        clqgVar3.g = i;
        eyja b = eykj.b(this.b.b.f());
        clqfVar.copyOnWrite();
        clqg clqgVar4 = (clqg) clqfVar.instance;
        b.getClass();
        clqgVar4.f = b;
        clqgVar4.b |= 2;
        clqg clqgVar5 = (clqg) clqfVar.build();
        djgi.c(this.a, clqgVar5);
        clrh b2 = clrh.b(clqoVar.c);
        if (b2 == null) {
            b2 = clrh.RESPONSE_STATUS_UNKNOWN;
        }
        if (b2.equals(clrh.RESPONSE_STATUS_OK)) {
            this.a.b(clqgVar5);
            this.b.a();
        } else {
            if (this.b.c(this.a)) {
                return;
            }
            djgi.b(this.a, clqgVar5);
            this.a.b(clqgVar5);
            this.b.a();
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        djgh djghVar = this.a;
        clns clnsVar = djghVar.b.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        clqe clqeVar = djghVar.b;
        int i = clqeVar.c;
        if (i == 2) {
            clpc clpcVar = ((clqm) clqeVar.d).e;
            if (clpcVar == null) {
                clpcVar = clpc.b;
            }
            clqx clqxVar = clpcVar.d;
            if (clqxVar == null) {
                clqxVar = clqx.a;
            }
            dkty.i(th, "[conversationId:%s, messageId: %s]: Notification failure for message: %s", str, clqxVar.c, th.getMessage());
        } else if (i == 3) {
            dkty.i(th, "[conversationId:%s]: Notification failure for group: %s", str, th.getMessage());
        }
        this.a.a(th);
        this.b.a();
    }
}
