package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvz extends lox {
    public final emwl a;
    public final Uri j;
    final Uri k;
    final String[] l;
    final String m;
    final String[] n;
    final String o;
    final String p;
    final String q;
    public boolean r;
    final /* synthetic */ dywa s;
    private final dyvy t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyvz(dywa dywaVar, Context context, emwl emwlVar, Uri uri) {
        super(context);
        this.s = dywaVar;
        this.r = false;
        this.a = emwlVar;
        this.j = uri;
        dyvt dyvtVar = (dyvt) dywaVar.b;
        engw engwVar = dyvtVar.b;
        engw engwVar2 = dyvtVar.d;
        this.k = dyvtVar.a;
        this.l = engwVar == null ? null : (String[]) engwVar.toArray(new String[((enou) engwVar).c]);
        this.m = ((dyvt) dywaVar.b).c;
        this.n = engwVar2 == null ? null : (String[]) engwVar2.toArray(new String[((enou) engwVar2).c]);
        dyvt dyvtVar2 = (dyvt) dywaVar.b;
        this.o = dyvtVar2.e;
        this.p = null;
        int i = dyvtVar2.f;
        this.q = a.t(i >= 0 ? String.valueOf(i) : "2147483647", "0, ");
        dyvy dyvyVar = new dyvy(this);
        this.t = dyvyVar;
        dywe.a().c(uri, dyvyVar);
    }

    @Override // defpackage.lox
    protected final void f() {
        if (this.r) {
            return;
        }
        this.r = true;
        new dyvx(this).executeOnExecutor(this.s.a, new Void[0]);
    }

    @Override // defpackage.lox
    protected final void m() {
        if (q() || !this.s.e().g()) {
            f();
        }
    }
}
