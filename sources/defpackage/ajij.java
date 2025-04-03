package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.popup.federatedlearning.FederatedLearningPopupView;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajij implements ajhy, ajin {
    public ajid a;
    public final Optional b;
    public final ffbr c;
    public final ffbr d;
    private crly e;
    private final errl f;

    public ajij(Optional optional, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.b = optional;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.f = errlVar;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        return elfo.g(new Callable() { // from class: ajii
            /* JADX WARN: Type inference failed for: r0v3, types: [ffbr, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ajij ajijVar = ajij.this;
                ajijVar.b.isPresent();
                boolean z = false;
                if (ajijVar.a.c() && ((ctiu) ajijVar.b.get().b()).i()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.a = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        crly crlyVar = this.e;
        if (crlyVar != null) {
            crlyVar.e();
        }
        this.a.b();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [ffbr, java.lang.Object] */
    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (this.b.isEmpty()) {
            return false;
        }
        crly crlyVar = new crly(LayoutInflater.from(context).inflate(R.layout.federated_learning_popup_stub, viewGroup, true), R.id.federated_learning_popup_stub, R.id.federated_learning_popup);
        this.e = crlyVar;
        ((FederatedLearningPopupView) crlyVar.b()).d = this;
        this.e.g(0);
        ((ctiu) this.b.get().b()).e();
        ((alef) this.d.b()).d(3);
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 11;
    }

    @Override // defpackage.ajhy
    public final int n() {
        return ajic.a(3);
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
