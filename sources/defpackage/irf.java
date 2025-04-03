package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irf {
    public final iri a;
    public ipa b;
    public final ffjm c;
    public final ffjm d;
    public final ffjm e;

    public irf(iri iriVar) {
        this.a = iriVar;
        this.c = new ire(this);
        this.d = new irc(this);
        this.e = new ird(this);
    }

    public final ipa a() {
        ipa ipaVar = this.b;
        if (ipaVar != null) {
            return ipaVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public irf() {
        this(ipw.a);
    }
}
