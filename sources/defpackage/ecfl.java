package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecfl implements ecfm {
    private final fgri a;
    private final ecfk b;

    public ecfl(fgri fgriVar, ecfk ecfkVar) {
        this.a = fgriVar;
        this.b = ecfkVar;
    }

    @Override // defpackage.ecfm
    public final long b() {
        return this.a.getSerializedSize();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((ecfl) obj).b);
    }

    @Override // defpackage.ecfm
    public final /* synthetic */ Object d() {
        return this.a;
    }
}
