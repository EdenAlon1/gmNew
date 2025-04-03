package defpackage;

import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbo implements fjbl {
    private final Type a;

    public fjbo(Type type) {
        this.a = type;
    }

    @Override // defpackage.fjbl
    public final /* bridge */ /* synthetic */ Object adapt(fjbj fjbjVar) {
        fjbp fjbpVar = new fjbp(fjbjVar);
        fjbjVar.d(new fjbn(fjbpVar));
        return fjbpVar;
    }

    @Override // defpackage.fjbl
    public final Type responseType() {
        return this.a;
    }
}
