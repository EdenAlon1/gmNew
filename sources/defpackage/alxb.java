package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alxb implements ffbr {
    private final ffbr a;
    private final ffbr b;
    private final fazb c;

    public alxb(ffbr ffbrVar, final ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        ffbrVar2.getClass();
        final emyl a = emys.a(new emyl() { // from class: alwz
            @Override // defpackage.emyl
            public final Object get() {
                return ffbr.this.b();
            }
        });
        a.getClass();
        this.c = new fazb() { // from class: alxa
            @Override // defpackage.fazb
            public final Object b() {
                return emyl.this.get();
            }
        };
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        return ((Boolean) this.a.b()).booleanValue() ? this.c.b() : this.b.b();
    }
}
