package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eell extends eekd {
    public eell() {
        super("To");
    }

    @Override // defpackage.eekd, defpackage.eeku
    public final String a() {
        eeio eeioVar = this.a;
        int i = eeioVar.c;
        String c = eeioVar.c();
        int i2 = this.a.c;
        String concat = (i != 1 ? "<" : "").concat(c);
        if (i2 != 1) {
            concat = concat.concat(">");
        }
        if (this.e.h()) {
            return concat;
        }
        return concat + ";" + this.e.c();
    }

    public final void e() {
        this.e.i("tag");
    }

    @Override // defpackage.eekd, defpackage.eekz, defpackage.eeku
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            return super.equals(obj);
        }
        return false;
    }

    public final void f(String str) {
        k("tag", str);
    }

    @Override // defpackage.eekd, defpackage.eekz, defpackage.eeku
    public final int hashCode() {
        return 89076;
    }
}
