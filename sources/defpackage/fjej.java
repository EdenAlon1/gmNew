package defpackage;

import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjej implements fjbl {
    private final Type a;

    public fjej(Type type) {
        this.a = type;
    }

    @Override // defpackage.fjbl
    public final /* bridge */ /* synthetic */ Object adapt(fjbj fjbjVar) {
        fjeh fjehVar = new fjeh(fjbjVar);
        fjbjVar.d(new fjei(fjehVar));
        return fjehVar;
    }

    @Override // defpackage.fjbl
    public final Type responseType() {
        return this.a;
    }
}
