package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osw extends orn {
    public final orp a;
    public final ote b;
    public final List c;
    public oxi d;
    public final ova e;

    public osw(orp orpVar, ote oteVar) {
        this.a = orpVar;
        this.b = oteVar;
        this.c = orpVar.e;
        this.e = new ova(new ovb(orpVar.c.a(oxk.a(orpVar.a, orpVar.b, new osu(this, oteVar.a), false, false))));
        d();
    }

    private final void d() {
        oxn c = c();
        if (c != null) {
            boolean z = this.a.p == 3;
            oyc oycVar = (oyc) c;
            if (oycVar.f.b()) {
                oycVar.a().setWriteAheadLoggingEnabled(z);
            }
            oycVar.g = z;
        }
    }

    @Override // defpackage.orn
    protected final ote a() {
        return this.b;
    }

    public final oxn c() {
        ova ovaVar = this.e;
        if (true != (ovaVar instanceof ova)) {
            ovaVar = null;
        }
        if (ovaVar != null) {
            return ovaVar.a.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, oxn] */
    public osw(orp orpVar, ffji ffjiVar) {
        this.a = orpVar;
        this.b = new ost();
        this.c = orpVar.e;
        this.e = new ova(new ovb(ffjiVar.invoke(new orp(orpVar.a, orpVar.b, orpVar.c, orpVar.d, ffdx.ae(orpVar.e, new osv(new ffji() { // from class: oss
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                oxi oxiVar = (oxi) obj;
                oxiVar.getClass();
                osw.this.d = oxiVar;
                return ffcu.a;
            }
        })), orpVar.f, orpVar.p, orpVar.g, orpVar.h, orpVar.i, orpVar.j, orpVar.k, orpVar.l, orpVar.m, orpVar.n))));
        d();
    }
}
