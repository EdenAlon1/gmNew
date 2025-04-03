package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnh {
    private final emyl a;

    public dxnh(final dwqy dwqyVar) {
        this.a = emys.a(new emyl() { // from class: dxng
            @Override // defpackage.emyl
            public final Object get() {
                dwrx y = dwqy.this.y();
                return y == dwrx.UNDEFINED ? dwrx.SHARED_PREFERENCES_ONLY : y;
            }
        });
    }

    public final dwrx a() {
        return (dwrx) this.a.get();
    }
}
