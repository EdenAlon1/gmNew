package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeko extends eekz implements Cloneable {
    protected eekx a;

    public eeko() {
        super(fhpi.a);
    }

    @Override // defpackage.eeku
    public final String a() {
        eekx eekxVar = this.a;
        if (eekxVar == null) {
            throw new IllegalStateException("Media range is null.");
        }
        String c = eekxVar.c();
        if (!m()) {
            return c;
        }
        return c + ";" + this.e.c();
    }

    public final String b() {
        eekx eekxVar = this.a;
        if (eekxVar == null) {
            return null;
        }
        return eekxVar.b;
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        if (this.a == null) {
            throw new IllegalStateException("MediaRange is null.");
        }
        eeko eekoVar = new eeko();
        eekoVar.e = (eejd) this.e.clone();
        eekoVar.a = (eekx) this.a.clone();
        return eekoVar;
    }

    public final String e() {
        eekx eekxVar = this.a;
        if (eekxVar == null) {
            return null;
        }
        return eekxVar.a;
    }

    public final void f(String str) {
        if (this.a == null) {
            this.a = new eekx();
        }
        this.a.b = str;
    }

    public final void g(String str) {
        if (this.a == null) {
            this.a = new eekx();
        }
        if (str.indexOf(47) < 0) {
            this.a.a = str;
            return;
        }
        String[] split = str.split("/");
        eekx eekxVar = this.a;
        eekxVar.a = split[0];
        eekxVar.b = split[1];
    }
}
