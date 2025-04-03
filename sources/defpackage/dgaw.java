package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dgaw extends dgbi {
    public final dgcb a;

    public dgaw(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        super(str, droidGuardResultsRequest);
        this.a = new dgcb();
    }

    public abstract Object a(String str, Throwable th);

    public abstract Object b(dgau dgauVar);

    @Override // defpackage.dgbi
    protected final void c(dgau dgauVar) {
        try {
            this.a.b(b(dgauVar));
        } catch (RuntimeException e) {
            this.a.b(a("deliverHandle", e));
        }
    }
}
