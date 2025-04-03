package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enhi extends enhf {
    final /* synthetic */ enhk a;

    public enhi(enhk enhkVar) {
        this.a = enhkVar;
    }

    @Override // defpackage.enhf
    public final enqu a() {
        return new enhh(this.a.entrySet().listIterator());
    }

    @Override // defpackage.enhk, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.enhk, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 == null) {
            return null;
        }
        return new enpx(obj2);
    }

    @Override // defpackage.enhf, defpackage.enhk
    public final enip hF() {
        return this.a.keySet();
    }

    @Override // defpackage.enhk
    public final boolean hH() {
        return this.a.hH();
    }

    @Override // defpackage.enhk, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.enhf, defpackage.enhk
    public Object writeReplace() {
        return super.writeReplace();
    }
}
