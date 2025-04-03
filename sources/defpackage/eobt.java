package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eobt extends eobu {
    public eobt(eobo eoboVar) {
        super(eoboVar);
    }

    @Override // defpackage.enbj
    protected final /* bridge */ /* synthetic */ Object a() {
        while (!this.d.hasNext()) {
            emxf.l(!this.d.hasNext());
            if (!((eobu) this).b.hasNext()) {
                b();
                return null;
            }
            this.c = ((eobu) this).b.next();
            this.d = ((eobu) this).a.e(this.c).iterator();
        }
        Object obj = this.c;
        obj.getClass();
        return new eobr(obj, this.d.next());
    }
}
