package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eimg extends eile {
    static final emwd a = new eilz();

    @Override // defpackage.eile
    public final void c(eifm eifmVar, clok clokVar) {
        clol clolVar = (clol) clom.a.createBuilder();
        String uri = eifmVar.a().toString();
        clolVar.copyOnWrite();
        clom clomVar = (clom) clolVar.instance;
        uri.getClass();
        clomVar.b |= 1;
        clomVar.c = uri;
        clokVar.copyOnWrite();
        clon clonVar = (clon) clokVar.instance;
        clom clomVar2 = (clom) clolVar.build();
        clon clonVar2 = clon.a;
        clomVar2.getClass();
        clonVar.d = clomVar2;
        clonVar.b |= 2;
    }

    @Override // defpackage.eile
    public final void d(clon clonVar, eifl eiflVar) {
        clom clomVar = clonVar.d;
        if (clomVar == null) {
            clomVar = clom.a;
        }
        Uri parse = Uri.parse(clomVar.c);
        if (parse == null) {
            throw new NullPointerException("Null contentUri");
        }
        ((eiee) eiflVar).b = parse;
    }
}
