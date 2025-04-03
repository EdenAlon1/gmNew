package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ensp extends enss {
    final /* synthetic */ enss a;
    final /* synthetic */ enss b;

    public ensp(enss enssVar, enss enssVar2) {
        this.a = enssVar;
        this.b = enssVar2;
    }

    @Override // defpackage.enss
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
