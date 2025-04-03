package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgv implements dzdu {
    private static final String a = "dzgv";

    @Override // defpackage.dzdu
    public final dzqk a(dzja dzjaVar, fblh fblhVar) {
        dyhr.c(a, "link preview type is not associated with any LighterContentType");
        return dzky.b(eyee.b);
    }

    @Override // defpackage.dzdu
    public final fblf b(dzqs dzqsVar) {
        emxc emxcVar = emux.a;
        if (dzqsVar.h().a() == 3 && ((dznp) dzqsVar.h().b()).a.equals("link_preview")) {
            emxcVar = dzgl.a(dzqsVar);
        }
        if (!emxcVar.g()) {
            dyhr.c(a, "Attempted to convert non-link preview message");
            fblf fblfVar = (fblf) fblh.a.createBuilder();
            fbjt fbjtVar = fbjt.UNKNOWN;
            fblfVar.copyOnWrite();
            ((fblh) fblfVar.instance).n = fbjtVar.a();
            return fblfVar;
        }
        Object c = emxcVar.c();
        fblf fblfVar2 = (fblf) fblh.a.createBuilder();
        fbjt fbjtVar2 = fbjt.TEXT;
        fblfVar2.copyOnWrite();
        ((fblh) fblfVar2.instance).n = fbjtVar2.a();
        fbls fblsVar = (fbls) fblt.a.createBuilder();
        String str = ((dzgz) c).a;
        fblsVar.copyOnWrite();
        fblt fbltVar = (fblt) fblsVar.instance;
        str.getClass();
        fbltVar.b = str;
        fblfVar2.copyOnWrite();
        fblh fblhVar = (fblh) fblfVar2.instance;
        fblt fbltVar2 = (fblt) fblsVar.build();
        fbltVar2.getClass();
        fblhVar.f = fbltVar2;
        fblhVar.e = 102;
        return fblfVar2;
    }
}
