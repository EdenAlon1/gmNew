package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwk implements ctwj {
    private final ctwv a;
    private final ctxf b;
    private final ctxj c;
    private final ctxl d;
    private final ctxp e;

    public ctwk(ctwv ctwvVar, ctxf ctxfVar, ctxj ctxjVar, ctxl ctxlVar, ctxp ctxpVar) {
        this.a = ctwvVar;
        this.b = ctxfVar;
        this.c = ctxjVar;
        this.d = ctxlVar;
        this.e = ctxpVar;
    }

    @Override // defpackage.ctwj
    public final ctwi a(ctuy ctuyVar, int i) {
        ctwy a;
        if (ctid.f) {
            ctxp ctxpVar = this.e;
            ctxn ctxnVar = (ctxn) ctxpVar.a.b();
            ctxnVar.getClass();
            Context context = (Context) ctxpVar.b.b();
            context.getClass();
            a = new ctxo(ctxnVar, context, i);
        } else {
            a = ctid.d ? this.d.a(i) : ctid.c ? this.c.a(i) : this.b.a(i);
        }
        ctxs ctxsVar = new ctxs(a);
        ctwv ctwvVar = this.a;
        ctwb ctwbVar = (ctwb) ctwvVar.a.b();
        ctwbVar.getClass();
        aobh aobhVar = (aobh) ctwvVar.b.b();
        aobhVar.getClass();
        ctvi ctviVar = (ctvi) ctwvVar.c.b();
        ctviVar.getClass();
        ((ctvw) ctwvVar.e.b()).getClass();
        ctuyVar.getClass();
        return new ctwu(ctwbVar, aobhVar, ctviVar, ctwvVar.d, ctuyVar, ctxsVar, i);
    }
}
