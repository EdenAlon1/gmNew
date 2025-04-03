package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeis extends eeiw implements Cloneable {
    public boolean a;
    public String b;
    public eejd c = new eejd(null);

    @Override // defpackage.eeiw
    public final String c() {
        String str = true != this.a ? "" : "+";
        String valueOf = String.valueOf(this.b);
        boolean h = this.c.h();
        String concat = str.concat(valueOf);
        return !h ? concat.concat(";").concat(this.c.c()) : concat;
    }

    @Override // defpackage.eeiw
    public final Object clone() {
        eeis eeisVar = new eeis();
        eeisVar.a = this.a;
        eeisVar.b = this.b;
        eeisVar.c = (eejd) this.c.clone();
        return eeisVar;
    }
}
