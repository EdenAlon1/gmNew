package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class avtp extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ContentType contentType = (ContentType) obj;
        awun awunVar = (awun) awup.a.createBuilder();
        String c = contentType.c();
        awunVar.copyOnWrite();
        awup awupVar = (awup) awunVar.instance;
        c.getClass();
        awupVar.b |= 1;
        awupVar.c = c;
        String b = contentType.b();
        awunVar.copyOnWrite();
        awup awupVar2 = (awup) awunVar.instance;
        b.getClass();
        awupVar2.b |= 2;
        awupVar2.d = b;
        c(contentType, awunVar);
        return (awup) awunVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awup awupVar = (awup) obj;
        eifc d = ContentType.d();
        if ((awupVar.b & 1) != 0) {
            d.f(awupVar.c);
        }
        if ((awupVar.b & 2) != 0) {
            d.e(awupVar.d);
        }
        d(awupVar, d);
        return d.g();
    }

    public void c(ContentType contentType, awun awunVar) {
        throw null;
    }

    public abstract void d(awup awupVar, eifc eifcVar);
}
