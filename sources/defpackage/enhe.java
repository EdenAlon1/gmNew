package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enhe extends enhm {
    final /* synthetic */ enhf a;

    public enhe(enhf enhfVar) {
        this.a = enhfVar;
    }

    @Override // defpackage.enhm
    public final enhk a() {
        return this.a;
    }

    @Override // defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return this.a.a();
    }

    @Override // defpackage.enhm, defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
