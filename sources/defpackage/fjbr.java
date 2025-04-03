package defpackage;

import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbr implements fjbl {
    private final Type a;

    public fjbr(Type type) {
        this.a = type;
    }

    @Override // defpackage.fjbl
    public final /* bridge */ /* synthetic */ Object adapt(fjbj fjbjVar) {
        fjbp fjbpVar = new fjbp(fjbjVar);
        fjbjVar.d(new fjbq(fjbpVar));
        return fjbpVar;
    }

    @Override // defpackage.fjbl
    public final Type responseType() {
        return this.a;
    }
}
