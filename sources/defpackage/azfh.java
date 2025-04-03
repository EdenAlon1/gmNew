package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfh {
    public final azhq a;
    public final azfs b;
    public final azga c;
    public final azfn d;

    public azfh(azhq azhqVar, azfs azfsVar, azga azgaVar, azfn azfnVar) {
        azhqVar.getClass();
        azfsVar.getClass();
        azgaVar.getClass();
        azfnVar.getClass();
        this.a = azhqVar;
        this.b = azfsVar;
        this.c = azgaVar;
        this.d = azfnVar;
    }

    public final awwf a() {
        if (((azfl) this.d).b == null) {
            throw new IllegalStateException("RCS Group is not created yet, and does not have a conference URI");
        }
        awwe awweVar = (awwe) awwf.a.createBuilder();
        awweVar.getClass();
        String str = (String) this.b.b;
        str.getClass();
        awweVar.copyOnWrite();
        awwf awwfVar = (awwf) awweVar.instance;
        awwfVar.b |= 1;
        awwfVar.c = str;
        awuf awufVar = (awuf) awui.a.createBuilder();
        awufVar.getClass();
        awuj.b((String) ((azfl) this.d).b.b, awufVar);
        awuj.c(awuh.GROUP, awufVar);
        awui a = awuj.a(awufVar);
        awweVar.copyOnWrite();
        awwf awwfVar2 = (awwf) awweVar.instance;
        awwfVar2.d = a;
        awwfVar2.b |= 2;
        eyfy build = awweVar.build();
        build.getClass();
        return (awwf) build;
    }

    public final boolean b() {
        return ffkj.e(this.c, azga.a) && ffkj.e(this.d, azfl.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azfh)) {
            return false;
        }
        azfh azfhVar = (azfh) obj;
        return ffkj.e(this.a, azfhVar.a) && ffkj.e(this.b, azfhVar.b) && ffkj.e(this.c, azfhVar.c) && ffkj.e(this.d, azfhVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Group(token=" + this.a + ", groupId=" + this.b + ", members=" + this.c + ", details=" + this.d + ")";
    }
}
