package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eila extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ContentType contentType = (ContentType) obj;
        clnl clnlVar = (clnl) clnm.a.createBuilder();
        String c = contentType.c();
        clnlVar.copyOnWrite();
        clnm clnmVar = (clnm) clnlVar.instance;
        c.getClass();
        clnmVar.b |= 1;
        clnmVar.c = c;
        String b = contentType.b();
        clnlVar.copyOnWrite();
        clnm clnmVar2 = (clnm) clnlVar.instance;
        b.getClass();
        clnmVar2.b |= 2;
        clnmVar2.d = b;
        c(contentType, clnlVar);
        return (clnm) clnlVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clnm clnmVar = (clnm) obj;
        eifc d = ContentType.d();
        if ((clnmVar.b & 1) != 0) {
            d.f(clnmVar.c);
        }
        if ((clnmVar.b & 2) != 0) {
            d.e(clnmVar.d);
        }
        d(clnmVar, d);
        return d.g();
    }

    public abstract void c(ContentType contentType, clnl clnlVar);

    public abstract void d(clnm clnmVar, eifc eifcVar);
}
