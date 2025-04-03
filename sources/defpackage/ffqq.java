package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffqq extends ffuq implements ffud, ffgu, ffsk {
    public final ffhd a;

    public ffqq(ffhd ffhdVar, boolean z) {
        super(z);
        M((ffud) ffhdVar.get(ffud.c));
        this.a = ffhdVar.plus(this);
    }

    @Override // defpackage.ffuq
    protected final String g() {
        return String.valueOf(ffsp.a(this)).concat(" was cancelled");
    }

    @Override // defpackage.ffuq
    public String h() {
        String str = null;
        if (ffso.a) {
            ffhd ffhdVar = this.a;
            ffsh ffshVar = (ffsh) ffhdVar.get(ffsh.a);
            if (ffshVar != null) {
                ffsj ffsjVar = (ffsj) ffhdVar.get(ffsj.a);
                str = (ffsjVar != null ? ffsjVar.b : "coroutine") + "#" + ffshVar.b;
            }
        }
        if (str == null) {
            return ffsp.a(this);
        }
        return "\"" + str + "\":" + ffsp.a(this);
    }

    @Override // defpackage.ffsk
    public final ffhd hT() {
        return this.a;
    }

    protected void hV(Object obj) {
        hR(obj);
    }

    @Override // defpackage.ffuq
    public final void hW(Throwable th) {
        ffsf.b(this.a, th);
    }

    @Override // defpackage.ffuq
    protected final void hX(Object obj) {
        if (!(obj instanceof ffrt)) {
            l(obj);
        } else {
            ffrt ffrtVar = (ffrt) obj;
            k(ffrtVar.b, ffrtVar.c.a());
        }
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return this.a;
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        Object F = F(ffrv.b(obj));
        if (F == ffur.b) {
            return;
        }
        hV(F);
    }

    protected void l(Object obj) {
    }

    protected void k(Throwable th, boolean z) {
    }
}
