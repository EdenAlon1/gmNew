package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsiw extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsiw(Object obj, dsjf dsjfVar) {
        super(obj);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        jpo jpoVar = (jpo) obj2;
        dsjf dsjfVar = this.a;
        jzn b = dsjfVar.b();
        jpoVar.getClass();
        b.getClass();
        jse jseVar = this.a.b;
        jseVar.getClass();
        dsjfVar.setBackgroundColor(iby.b(jpoVar.e()));
        if (jpoVar.n() != null || jpoVar.o() != null || jpoVar.q() != null) {
            jsf n = jpoVar.n();
            jsy q = jpoVar.q();
            if (q == null) {
                q = jsy.e;
            }
            jss o = jpoVar.o();
            int i = o != null ? o.a : 0;
            jst p = jpoVar.p();
            Object a = jseVar.a(n, q, i, p != null ? p.a : 65535).a();
            a.getClass();
            dsjfVar.setTypeface((Typeface) a);
        }
        dsjfVar.setTextColor(iby.b(jpoVar.f()));
        if (kak.b(jpoVar.g()) != 0) {
            if (kam.b(kak.c(jpoVar.g()), 8589934592L)) {
                dsjfVar.setTextSize(dsjfVar.getTextSize() * kak.a(jpoVar.g()));
            } else {
                dsjfVar.setTextSize(0, b.el(jpoVar.g()));
            }
        }
        if (kak.b(jpoVar.i()) != 0) {
            kzd.e(dsjfVar, b.en(jpoVar.i()));
        }
        dsjfVar.setIncludeFontPadding(false);
        dsjfVar.setTextDirection(true != jyl.b(jpoVar.d(), 2) ? 3 : 4);
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
