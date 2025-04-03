package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffht extends ffhp {
    public ffht(ffgu ffguVar) {
        super(ffguVar);
        if (ffguVar != null && ffguVar.u() != ffhe.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return ffhe.a;
    }
}
