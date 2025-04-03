package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djgf implements erqj {
    private final djge a;
    private final djgh b;

    public djgf(djge djgeVar, djgh djghVar) {
        this.a = djgeVar;
        this.b = djghVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        clqk clqkVar = (clqk) obj;
        clqf clqfVar = (clqf) clqg.a.createBuilder();
        clns clnsVar = this.b.b.e;
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
        clqkVar.getClass();
        clqgVar2.d = clqkVar;
        clqgVar2.c = 3;
        int i = this.b.b.h;
        clqfVar.copyOnWrite();
        clqg clqgVar3 = (clqg) clqfVar.instance;
        clqgVar3.b |= 4;
        clqgVar3.g = i;
        eyja b = eykj.b(this.a.b.f());
        clqfVar.copyOnWrite();
        clqg clqgVar4 = (clqg) clqfVar.instance;
        b.getClass();
        clqgVar4.f = b;
        clqgVar4.b |= 2;
        clqg clqgVar5 = (clqg) clqfVar.build();
        djgi.c(this.b, clqgVar5);
        clrh b2 = clrh.b(clqkVar.c);
        if (b2 == null) {
            b2 = clrh.RESPONSE_STATUS_UNKNOWN;
        }
        if (b2.equals(clrh.RESPONSE_STATUS_OK)) {
            this.b.b(clqgVar5);
            this.a.a();
        } else {
            if (this.a.c(this.b)) {
                return;
            }
            djgi.b(this.b, clqgVar5);
            this.b.b(clqgVar5);
            this.a.a();
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        clns clnsVar = this.b.b.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        dkty.i(th, "[conversationId:{%s}]: Notification failure for group: {%s}", clqsVar.c, th.getMessage());
        this.b.a(th);
        this.a.a();
    }
}
