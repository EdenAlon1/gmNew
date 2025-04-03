package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekn extends eeku implements Cloneable {
    public int a;

    public eekn() {
        super("Content-Length");
    }

    @Override // defpackage.eeku
    public final String a() {
        return String.valueOf(this.a);
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("parameter is <0");
        }
        this.a = i;
        this.d = String.valueOf(i);
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        eekn eeknVar = new eekn();
        eeknVar.a = this.a;
        return eeknVar;
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return null;
    }
}
