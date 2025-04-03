package defpackage;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public abstract class ljp extends lmu implements lms {
    private final owv a;
    private final lkk b;

    public ljp(owz owzVar) {
        owzVar.getClass();
        this.a = owzVar.U();
        this.b = owzVar.P();
    }

    private final lml f(String str, Class cls) {
        lkk lkkVar = this.b;
        lkkVar.getClass();
        llx a = lkg.a(this.a, lkkVar, str, null);
        lml e = e(cls, a.a);
        e.fB("androidx.lifecycle.savedstate.vm.tag", a);
        return e;
    }

    @Override // defpackage.lms
    public final lml a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.b != null) {
            return f(canonicalName, cls);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        String str = (String) lnxVar.a(lmt.d);
        if (str != null) {
            return f(str, cls);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }

    @Override // defpackage.lmu
    public final void d(lml lmlVar) {
        lkk lkkVar = this.b;
        lkkVar.getClass();
        lkg.b(lmlVar, this.a, lkkVar);
    }

    protected abstract lml e(Class cls, llv llvVar);
}
