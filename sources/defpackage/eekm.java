package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekm extends eeku implements Cloneable {
    private final String a;

    public eekm(String str) {
        super("Content-ID");
        this.a = str;
    }

    @Override // defpackage.eeku
    public final String a() {
        return String.format("<%s>", this.a);
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        return new eekm(this.a);
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return new eejd();
    }
}
