package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cphy extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        fcek fcekVar = (fcek) obj;
        awuf awufVar = (awuf) awui.a.createBuilder();
        c(fcekVar, awufVar);
        String str = fcekVar.c;
        awufVar.copyOnWrite();
        awui awuiVar = (awui) awufVar.instance;
        str.getClass();
        awuiVar.b |= 2;
        awuiVar.d = str;
        return (awui) awufVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awui awuiVar = (awui) obj;
        fcej e = e();
        if ((awuiVar.b & 1) != 0) {
            d(awuiVar, e);
        }
        if ((awuiVar.b & 2) != 0) {
            String str = awuiVar.d;
            e.copyOnWrite();
            fcek fcekVar = (fcek) e.instance;
            fcek fcekVar2 = fcek.a;
            str.getClass();
            fcekVar.c = str;
        }
        return (fcek) e.build();
    }

    public abstract void c(fcek fcekVar, awuf awufVar);

    public abstract void d(awui awuiVar, fcej fcejVar);

    public fcej e() {
        throw null;
    }
}
