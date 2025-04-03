package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eniw extends enhm {
    final /* synthetic */ eniz a;

    public eniw(eniz enizVar) {
        this.a = enizVar;
    }

    @Override // defpackage.enhm
    public final enhk a() {
        return this.a;
    }

    @Override // defpackage.enip
    public final engw h() {
        return new eniv(this);
    }

    @Override // defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return g().iterator();
    }

    @Override // defpackage.enhm, defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
